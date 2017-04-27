package main;

import java.util.List;

import org.antlr.v4.runtime.tree.TerminalNode;

import ast.ClassDecl;
import ast.ClassDeclExtends;
import ast.ClassDeclList;
import ast.ClassDeclSimple;
import ast.Exp;
import ast.Formal;
import ast.FormalList;
import ast.Identifier;
import ast.MainClass;
import ast.MethodDecl;
import ast.MethodDeclList;
import ast.Program;
import ast.Statement;
import ast.StatementList;
import ast.Type;
import ast.VarDecl;
import ast.VarDeclList;
import gramatica.avscParser.ClassDeclarationContext;
import gramatica.avscParser.GoalContext;
import gramatica.avscParser.MainClassContext;
import gramatica.avscParser.MethodDeclarationContext;
import gramatica.avscParser.StatementContext;
import gramatica.avscParser.TypeContext;
import gramatica.avscParser.VarDeclarationContext;

public class avscVisitor {
	public Object visitGoal(GoalContext ctx) {
		System.out.println("Goal");
		MainClass main = (MainClass) this.visit(ctx.mainClass());
		ClassDeclList classes = getClassDeclList(ctx.classDeclaration());
		return new Program(main, classes);
	}
	
	public Object visitMainClass(MainClassContext ctx) {
		System.out.println("Main Class");
		Identifier id1 = (Identifier) this.visit(ctx.IDENTIFIER(0).getText());
		Identifier id2 = (Identifier) this.visit(ctx.IDENTIFIER(1).getText());
		Statement st = (Statement) this.visit(ctx.statement());
		return new MainClass(id1, id2, st);
	}
	
	public Object visitClassDeclaration(ClassDeclarationContext ctx) {
		System.out.println("Not a Main Class");
		Identifier id1 = (Identifier) this.visit(ctx.IDENTIFIER(0).getText());
		Identifier id2 = (Identifier) this.visit(ctx.IDENTIFIER(1).getText());
		VarDeclList var = getVarDeclList(ctx.varDeclaration());
		MethodDeclList method = getMethodDeclList(ctx.methodDeclaration());
		if (id2 == null) return new ClassDeclSimple(id1, var, method);
		else return new ClassDeclExtends(id1, id2, var, method);
	}
	
	public Object visitVarDeclaration(VarDeclarationContext ctx) {
		System.out.println("Variable Declaration");
		Type type = (Type) this.visit(ctx.type());
		Identifier id = (Identifier) this.visit(ctx.IDENTIFIER());
		return new VarDecl(type, id);
	}
	
	public Object visitMethodDeclaration(MethodDeclarationContext ctx) {
		System.out.println("Method Declaration");
		Type type = (Type) this.visit(ctx.type(0));
		Identifier id = (Identifier) this.visit(ctx.IDENTIFIER(0).getText());
		FormalList formal = getFormalList(ctx.type(), ctx.IDENTIFIER());
		VarDeclList var = getVarDeclList(ctx.varDeclaration());
		StatementList statement = getStatementList(ctx.statement());
		Exp exp = (Exp) this.visit(ctx.expression());
		return new MethodDecl(type, id, formal, var, statement, exp);
	}

	public Object visit(Object obj) {
		return obj;
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
}
