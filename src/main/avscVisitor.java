package main;

import java.util.List;

import org.antlr.v4.runtime.tree.TerminalNode;

import ast.*;
import gramatica.avscParser.*;

public class avscVisitor {

	public Program visit(GoalContext ctx) {
		MainClass main = this.visit(ctx.mainClass());
		ClassDeclList classes = getClassDeclList(ctx.classDeclaration());
		return new Program(main, classes);
	}

	public MainClass visit(MainClassContext ctx) {
		Identifier id1 = new Identifier(ctx.IDENTIFIER(0).getText());
		Identifier id2 = new Identifier(ctx.IDENTIFIER(1).getText());
		Statement st = this.visit(ctx.statement());
		return new MainClass(id1, id2, st);
	}

	public ClassDecl visit(ClassDeclarationContext ctx) {
		Identifier id1 = new Identifier(ctx.IDENTIFIER(0).getText());
		VarDeclList var = getVarDeclList(ctx.varDeclaration());
		MethodDeclList method = getMethodDeclList(ctx.methodDeclaration());
		if (ctx.IDENTIFIER(1) == null) return new ClassDeclSimple(id1, var, method);
		Identifier id2 = new Identifier(ctx.IDENTIFIER(1).getText());
		return new ClassDeclExtends(id1, id2, var, method);
	}

	public VarDecl visit(VarDeclarationContext ctx) {
		Type type = this.visit(ctx.type());
		Identifier id =  new Identifier(ctx.IDENTIFIER().getText());
		return new VarDecl(type, id);
	}

	public MethodDecl visit(MethodDeclarationContext ctx) {
		Type type = this.visit(ctx.type(0));
		Identifier id = new Identifier(ctx.IDENTIFIER(0).getText());
		FormalList formal = getFormalList(ctx.type(), ctx.IDENTIFIER());
		VarDeclList var = getVarDeclList(ctx.varDeclaration());
		StatementList statement = getStatementList(ctx.statement());
		Exp exp = this.visit(ctx.expression());
		return new MethodDecl(type, id, formal, var, statement, exp);
	}

	public Type visit(TypeContext ctx) {
		String tipo = "";
		for (int i = 0; i < ctx.getChildCount(); i++) {
			tipo += ctx.getChild(i).getText();
		}
		if (tipo.equals("int[]")) return new IntArrayType();
		if (tipo.equals("int")) return new IntegerType();
		if (tipo.equals("boolean")) return new BooleanType();
		return new IdentifierType(tipo);
	}

	public Statement visit(StatementContext ctx) {
		if (ctx.statementList() != null) return new Block((StatementList) this.visit(ctx.statementList()));
		if (ctx.ifElse() != null) return this.visit(ctx.ifElse());
		if (ctx.whileLoop() != null) return this.visit(ctx.whileLoop());
		if (ctx.print() != null) return this.visit(ctx.print());
		if (ctx.assign() != null) return this.visit(ctx.assign()); 
		if (ctx.arrayAssign() != null) return this.visit(ctx.arrayAssign());
		return null;
	}

	public StatementList visit(StatementListContext ctx) {
		return getStatementList(ctx.statement());
	}

	public If visit(IfElseContext ctx) {
		Exp exp = this.visit(ctx.expression());
		Statement st1 = this.visit(ctx.statement(0));
		Statement st2 = this.visit(ctx.statement(1));
		return new If(exp, st1, st2);
	}

	public While visit(WhileLoopContext ctx) {
		Exp exp = this.visit(ctx.expression());
		Statement st = this.visit(ctx.statement());
		return new While(exp, st);
	}

	public Print visit(PrintContext ctx) {
		return new Print(this.visit(ctx.expression()));
	}

	public Assign visit(AssignContext ctx) {
		Identifier id = new Identifier(ctx.IDENTIFIER().getText());
		Exp exp = this.visit(ctx.expression());
		return new Assign(id, exp);
	}

	public ArrayAssign visit(ArrayAssignContext ctx) {
		Identifier id = new Identifier(ctx.IDENTIFIER().getText());
		Exp exp1 = this.visit(ctx.expression(0));
		Exp exp2 = this.visit(ctx.expression(1));
		return new ArrayAssign(id, exp1, exp2);
	}

	public Exp visit(ExpressionContext ctx) {
		if (ctx == null) return null;
		Exp exp1 = this.visit(ctx.expression(0));
		Exp exp2 = this.visit(ctx.expression(1));
		IntegerLiteral int_lit = (ctx.INTEGER_LITERAL() != null) ? new IntegerLiteral(Integer.parseInt(ctx.INTEGER_LITERAL().getText())) : null;
		if (ctx.not() != null) return (Not) this.visit(ctx.not());
		if (ctx.newArray() != null) return (NewArray) this.visit(ctx.newArray());
		if (ctx.newObject() != null) return (NewObject) this.visit(ctx.newObject());
		if (ctx.getChildCount() == 1) {
			switch (ctx.getChild(0).getText()) {
			case "true": return new True();
			case "false": return new False();
			case "this": return new This();
			}
			if (ctx.IDENTIFIER() != null) return new IdentifierExp(ctx.IDENTIFIER().getText());
			return int_lit;
		}
		switch (ctx.getChild(1).getText()) {
		case "&&": return new And(exp1, exp2);
		case "<": return new LessThan(exp1, exp2);
		case "+": return new Plus(exp1, exp2);
		case "-": return new Minus(exp1, exp2);
		case "*": return new Times(exp1, exp2);
		case "[": return new ArrayLookup(exp1, exp2);
		}
		switch (ctx.getChild(2).getText()) {
			case "length": return new ArrayLength(exp1);
		}
		if (ctx.getChildCount() > 4) {
			if (exp1 == null) exp1 = new This();
			return new Call(exp1, new Identifier(ctx.IDENTIFIER().getText()), getExpList(ctx.expression()));
		}
		if (ctx.getChild(0).getText().equals("(")) return exp1;
		return null;
	}

	public Object visit(NotContext ctx) {
		return new Not(this.visit(ctx.expression()));
	}

	public Object visit(NewArrayContext ctx) {
		return new NewArray(this.visit(ctx.expression()));
	}

	public Object visit(NewObjectContext ctx) {
		return new NewObject(new Identifier(ctx.IDENTIFIER().getText()));
	}

	private ClassDeclList getClassDeclList(List<ClassDeclarationContext> list) {
		ClassDeclList classe = new ClassDeclList();
		for (int i = 0; i < list.size(); i++) {
			classe.addElement(this.visit(list.get(i)));
		}
		return classe;
	}

	private VarDeclList getVarDeclList(List<VarDeclarationContext> list) {
		VarDeclList var = new VarDeclList();
		for (int i = 0; i < list.size(); i++) {
			var.addElement(this.visit(list.get(i)));
		}
		return var;
	}

	private MethodDeclList getMethodDeclList(List<MethodDeclarationContext> list) {
		MethodDeclList method = new MethodDeclList();
		for (int i = 0; i < list.size(); i++) {
			method.addElement(this.visit(list.get(i)));
		}
		return method;
	}

	private FormalList getFormalList(List<TypeContext> type, List<TerminalNode> identifier) {
		FormalList formal = new FormalList();
		for (int i = 1; i < type.size(); i++) {
			formal.addElement(new Formal(this.visit(type.get(i)), new Identifier(identifier.get(i).getText())));
		}
		return formal;
	}

	private StatementList getStatementList(List<StatementContext> list) {
		StatementList statement = new StatementList();
		for (int i = 0; i < list.size(); i++) {
			statement.addElement(this.visit(list.get(i)));
		}
		return statement;
	}

	private ExpList getExpList(List<ExpressionContext> list) {
		ExpList exp = new ExpList();
		for (int i = 1; i < list.size(); i++) {
			exp.addElement(this.visit(list.get(i)));
		}
		return exp;
	}
}
