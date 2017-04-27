package main;

import java.util.List;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import ast.And;
import ast.ArrayAssign;
import ast.ArrayLength;
import ast.ArrayLookup;
import ast.Assign;
import ast.BooleanType;
import ast.Call;
import ast.ClassDecl;
import ast.ClassDeclExtends;
import ast.ClassDeclList;
import ast.ClassDeclSimple;
import ast.Exp;
import ast.ExpList;
import ast.False;
import ast.Formal;
import ast.FormalList;
import ast.Identifier;
import ast.IdentifierType;
import ast.If;
import ast.IntArrayType;
import ast.IntegerLiteral;
import ast.IntegerType;
import ast.LessThan;
import ast.MainClass;
import ast.MethodDecl;
import ast.MethodDeclList;
import ast.Minus;
import ast.NewArray;
import ast.NewObject;
import ast.Not;
import ast.Plus;
import ast.Print;
import ast.Program;
import ast.Statement;
import ast.StatementList;
import ast.This;
import ast.Times;
import ast.True;
import ast.Type;
import ast.VarDecl;
import ast.VarDeclList;
import ast.While;
import gramatica.avscParser.*;

public class avscVisitor {
	public Object visit(ParseTree tree) {
		if (tree instanceof GoalContext) return visitGoal((GoalContext) tree);
		if (tree instanceof MainClassContext) return visitMainClass((MainClassContext) tree);
		if (tree instanceof ClassDeclarationContext) return visitClassDeclaration((ClassDeclarationContext) tree);
		if (tree instanceof VarDeclarationContext) return visitVarDeclaration((VarDeclarationContext) tree);
		if (tree instanceof MethodDeclarationContext) return visitMethodDeclaration((MethodDeclarationContext) tree);
		if (tree instanceof TypeContext) return visitType((TypeContext) tree);
		if (tree instanceof StatementContext) return visitStatement((StatementContext) tree);
		if (tree instanceof PrintContext) return visitPrint((PrintContext) tree);
		if (tree instanceof ExpressionContext) return visitExpression((ExpressionContext) tree);
		return null;
	}
	
	public Object visitGoal(GoalContext ctx) {
		System.out.println("Goal");
		MainClass main = (MainClass) this.visit(ctx.mainClass());
		ClassDeclList classes = getClassDeclList(ctx.classDeclaration());
		return new Program(main, classes);
	}
	
	public Object visitMainClass(MainClassContext ctx) {
		System.out.println("Main Class");
		Identifier id1 = new Identifier(ctx.IDENTIFIER(0).getText());
		Identifier id2 = new Identifier(ctx.IDENTIFIER(1).getText());
		Statement st = (Statement) this.visit(ctx.statement());
		return new MainClass(id1, id2, st);
	}
	
	public Object visitClassDeclaration(ClassDeclarationContext ctx) {
		System.out.println("Not a Main Class");
		Identifier id1 = new Identifier(ctx.IDENTIFIER(0).getText());
		VarDeclList var = getVarDeclList(ctx.varDeclaration());
		MethodDeclList method = getMethodDeclList(ctx.methodDeclaration());
		if (ctx.IDENTIFIER(1) == null) return new ClassDeclSimple(id1, var, method);
		Identifier id2 = new Identifier(ctx.IDENTIFIER(1).getText());
		return new ClassDeclExtends(id1, id2, var, method);
	}
	
	public Object visitVarDeclaration(VarDeclarationContext ctx) {
		System.out.println("Variable Declaration");
		Type type = (Type) this.visit(ctx.type());
		Identifier id =  new Identifier(ctx.IDENTIFIER().getText());
		return new VarDecl(type, id);
	}
	
	public Object visitMethodDeclaration(MethodDeclarationContext ctx) {
		System.out.println("Method Declaration");
		Type type = (Type) this.visit(ctx.type(0));
		Identifier id = new Identifier(ctx.IDENTIFIER(0).getText());
		FormalList formal = getFormalList(ctx.type(), ctx.IDENTIFIER());
		VarDeclList var = getVarDeclList(ctx.varDeclaration());
		StatementList statement = getStatementList(ctx.statement());
		Exp exp = (Exp) this.visit(ctx.expression());
		return new MethodDecl(type, id, formal, var, statement, exp);
	}
	
	public Object visitType(TypeContext ctx) {
		System.out.println("Type");
		String tipo = "";
		for (int i = 0; i < ctx.getChildCount(); i++) {
			tipo += ctx.getChild(i).getText();
		}
		if (tipo.equals("int[]")) return new IntArrayType();
		if (tipo.equals("int")) return new IntegerType();
		if (tipo.equals("boolean")) return new BooleanType();
		return new IdentifierType(tipo);
	}
	
	public Object visitStatement(StatementContext ctx) {
		System.out.println("Statement");
		Exp exp1 = (Exp) this.visit(ctx.expression(0));
		Exp exp2 = (Exp) this.visit(ctx.expression(1));
		Identifier id = (ctx.IDENTIFIER() != null) ? new Identifier(ctx.IDENTIFIER().getText()) : null;
		if (ctx.getChild(0).getText().equals("{")) return getStatementList(ctx.statement());
		if (ctx.ifElse() != null) return (If) this.visit(ctx.ifElse());
		if (ctx.whileLoop() != null) return (While) this.visit(ctx.whileLoop());
		if (ctx.print() != null) return (Print) this.visit(ctx.print());
		if (ctx.getChild(1).getText().equals("=")) return new Assign(id, exp1);
		return new ArrayAssign(id, exp1, exp2);
	}
	
	public Object visitIfElse(IfElseContext ctx) {
		Exp exp = (Exp) this.visit(ctx.expression());
		Statement st1 = (Statement) this.visit(ctx.statement(0));
		Statement st2 = (Statement) this.visit(ctx.statement(1));
		return new If(exp, st1, st2);
	}
	
	public Object visitWhile(WhileLoopContext ctx) {
		Exp exp = (Exp) this.visit(ctx.expression());
		Statement st = (Statement) this.visit(ctx.statement());
		return new While(exp, st);
	}
	
	public Object visitPrint(PrintContext ctx) {
		return new Print((Exp) this.visit(ctx.expression()));
	}
	
	public Object visitExpression(ExpressionContext ctx) {
		System.out.println("Expression");
		Exp exp1 = (Exp) this.visit(ctx.expression(0));
		Exp exp2 = (Exp) this.visit(ctx.expression(1));
		Identifier id = (ctx.IDENTIFIER() != null) ? new Identifier(ctx.IDENTIFIER().getText()) : null;
		IntegerLiteral int_lit = (ctx.INTEGER_LITERAL() != null) ? new IntegerLiteral(Integer.parseInt(ctx.INTEGER_LITERAL().getText())) : null;
		switch (ctx.getChild(0).getText()) {
		case "true":
			return new True();
		case "false":
			return new False();
		case "this":
			return new This();
		case "!":
			return new Not(exp1);
		case "(":
			return exp1;
		}
		if (ctx.getChildCount() == 1) {
			if (id != null) return id;
			return int_lit;
		}
		switch (ctx.getChild(1).getText()) {
		case "&&":
			return new And(exp1, exp2);
		case "<":
			return new LessThan(exp1, exp2);
		case "+":
			return new Plus(exp1, exp2);
		case "-":
			return new Minus(exp1, exp2);
		case "*":
			return new Times(exp1, exp2);
		case "[":
			return new ArrayLookup(exp1, exp2);
		case "int":
			return new NewArray(exp1);
		}
		switch (ctx.getChild(2).getText()) {
		case "length":
			return new ArrayLength(exp1);
		case "(":
			return new NewObject(id);
		}
		return new Call(exp1, id, getExpressionList(ctx.expression()));
	}

	private ClassDeclList getClassDeclList(List<ClassDeclarationContext> list) {
		ClassDeclList classe = new ClassDeclList();
		for (int i = 0; i < list.size(); i++) {
			classe.addElement((ClassDecl) this.visit(list.get(i)));
		}
		return classe;
	}
	
	private VarDeclList getVarDeclList(List<VarDeclarationContext> list) {
		VarDeclList var = new VarDeclList();
		for (int i = 0; i < list.size(); i++) {
			var.addElement((VarDecl) this.visit(list.get(i)));
		}
		return var;
	}
	
	private MethodDeclList getMethodDeclList(List<MethodDeclarationContext> list) {
		MethodDeclList method = new MethodDeclList();
		for (int i = 0; i < list.size(); i++) {
			method.addElement((MethodDecl) this.visit(list.get(i)));
		}
		return method;
	}
	
	private FormalList getFormalList(List<TypeContext> type, List<TerminalNode> identifier) {
		FormalList formal = new FormalList();
		for (int i = 1; i < type.size(); i++) {
			formal.addElement(new Formal((Type) this.visit(type.get(i)), (Identifier) this.visit(identifier.get(i))));
		}
		return formal;
	}
	
	private StatementList getStatementList(List<StatementContext> list) {
		StatementList statement = new StatementList();
		for (int i = 0; i < list.size(); i++) {
			statement.addElement((Statement) this.visit(list.get(i)));
		}
		return statement;
	}
	
	private ExpList getExpressionList(List<ExpressionContext> list) {
		ExpList exp = new ExpList();
		for (int i = 1; i < list.size(); i++) {
			exp.addElement((Exp) this.visit(list.get(i)));
		}
		return exp;
	}
}
