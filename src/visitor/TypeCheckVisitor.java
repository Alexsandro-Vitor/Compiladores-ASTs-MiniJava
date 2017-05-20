package visitor;

import symboltable.Class;
import symboltable.Method;
import symboltable.SymbolTable;
import ast.And;
import ast.ArrayAssign;
import ast.ArrayLength;
import ast.ArrayLookup;
import ast.Assign;
import ast.Block;
import ast.BooleanType;
import ast.Call;
import ast.ClassDeclExtends;
import ast.ClassDeclSimple;
import ast.False;
import ast.Formal;
import ast.Identifier;
import ast.IdentifierExp;
import ast.IdentifierType;
import ast.If;
import ast.IntArrayType;
import ast.IntegerLiteral;
import ast.IntegerType;
import ast.LessThan;
import ast.MainClass;
import ast.MethodDecl;
import ast.Minus;
import ast.NewArray;
import ast.NewObject;
import ast.Not;
import ast.Plus;
import ast.Print;
import ast.Program;
import ast.This;
import ast.Times;
import ast.True;
import ast.Type;
import ast.VarDecl;
import ast.While;

public class TypeCheckVisitor implements TypeVisitor {
	private static class WrongTypeException extends Exception {
		public WrongTypeException() {
			super("O tipo está incorreto");
		}
	}
	
	private static class DiffTypeException extends Exception {
		public DiffTypeException() {
			super("Os tipos são diferentes");
		}
	}
	
	private SymbolTable symbolTable;
	private Class currClass;
	private Method currMethod;

	public TypeCheckVisitor(SymbolTable st) {
		symbolTable = st;
	}

	// MainClass m;
	// ClassDeclList cl;
	public Type visit(Program n) {
		n.m.accept(this);
		for (int i = 0; i < n.cl.size(); i++) {
			n.cl.elementAt(i).accept(this);
		}
		return null;
	}

	// Identifier i1,i2;
	// Statement s;
	public Type visit(MainClass n) {
		currClass = symbolTable.getClass(n.i1.s);
		n.i1.accept(this);
		n.i2.accept(this);
		n.s.accept(this);
		return null;
	}

	// Identifier i;
	// VarDeclList vl;
	// MethodDeclList ml;
	public Type visit(ClassDeclSimple n) {
		currClass = symbolTable.getClass(n.i.s);
		n.i.accept(this);
		for (int i = 0; i < n.vl.size(); i++) {
			n.vl.elementAt(i).accept(this);
		}
		for (int i = 0; i < n.ml.size(); i++) {
			n.ml.elementAt(i).accept(this);
		}
		return null;
	}

	// Identifier i;
	// Identifier j;
	// VarDeclList vl;
	// MethodDeclList ml;
	public Type visit(ClassDeclExtends n) {
		currClass = symbolTable.getClass(n.i.s);
		n.i.accept(this);
		n.j.accept(this);
		for (int i = 0; i < n.vl.size(); i++) {
			n.vl.elementAt(i).accept(this);
		}
		for (int i = 0; i < n.ml.size(); i++) {
			n.ml.elementAt(i).accept(this);
		}
		return null;
	}

	// Type t;
	// Identifier i;
	public Type visit(VarDecl n) {
		n.t.accept(this);
		n.i.accept(this);
		return null;
	}

	// Type t;
	// Identifier i;
	// FormalList fl;
	// VarDeclList vl;
	// StatementList sl;
	// Exp e;
	public Type visit(MethodDecl n) {
		currMethod = symbolTable.getMethod(n.i.s, currClass.getId());
		n.t.accept(this);
		n.i.accept(this);
		for (int i = 0; i < n.fl.size(); i++) {
			n.fl.elementAt(i).accept(this);
		}
		for (int i = 0; i < n.vl.size(); i++) {
			n.vl.elementAt(i).accept(this);
		}
		for (int i = 0; i < n.sl.size(); i++) {
			n.sl.elementAt(i).accept(this);
		}
		n.e.accept(this);
		return null;
	}

	// Type t;
	// Identifier i;
	public Type visit(Formal n) {
		n.t.accept(this);
		n.i.accept(this);
		return null;
	}

	public Type visit(IntArrayType n) {
		return n;
	}

	public Type visit(BooleanType n) {
		return n;
	}

	public Type visit(IntegerType n) {
		return n;
	}

	// String s;
	public Type visit(IdentifierType n) {
		return n;
	}

	// StatementList sl;
	public Type visit(Block n) {
		for (int i = 0; i < n.sl.size(); i++) {
			n.sl.elementAt(i).accept(this);
		}
		return null;
	}

	// Exp e;
	// Statement s1,s2;
	public Type visit(If n) {
		if (!(n.e.accept(this) instanceof BooleanType)) new DiffTypeException().printStackTrace();
		n.s1.accept(this);
		n.s2.accept(this);
		return null;
	}

	// Exp e;
	// Statement s;
	public Type visit(While n) {
		if (!(n.e.accept(this) instanceof BooleanType)) new DiffTypeException().printStackTrace();
		n.s.accept(this);
		return null;
	}

	// Exp e;
	public Type visit(Print n) {
		n.e.accept(this);
		return null;
	}

	// Identifier i;
	// Exp e;
	public Type visit(Assign n) {
		if (!symbolTable.compareTypes(n.i.accept(this), n.e.accept(this))) new DiffTypeException().printStackTrace();
		return null;
	}

	// Identifier i;
	// Exp e1,e2;
	public Type visit(ArrayAssign n) {
		if (!(n.i.accept(this) instanceof IntArrayType)) new WrongTypeException().printStackTrace();
		if (!(n.e1.accept(this) instanceof IntegerType)) new WrongTypeException().printStackTrace();
		if (!(n.e2.accept(this) instanceof IntegerType)) new WrongTypeException().printStackTrace();
		return null;
	}

	// Exp e1,e2;
	public Type visit(And n) {
		Type t1 = n.e1.accept(this);
		Type t2 = n.e2.accept(this);
		if (!symbolTable.compareTypes(t1, t2)) new DiffTypeException().printStackTrace();
		if (!(t1 instanceof BooleanType)) new WrongTypeException().printStackTrace();
		return new BooleanType();
	}

	// Exp e1,e2;
	public Type visit(LessThan n) {
		Type t1 = n.e1.accept(this);
		Type t2 = n.e2.accept(this);
		if (!symbolTable.compareTypes(t1, t2)) new DiffTypeException().printStackTrace();
		if (!(t1 instanceof IntegerType)) new WrongTypeException().printStackTrace();
		return new BooleanType();
	}

	// Exp e1,e2;
	public Type visit(Plus n) {
		Type t1 = n.e1.accept(this);
		Type t2 = n.e2.accept(this);
		if (!symbolTable.compareTypes(t1, t2)) new DiffTypeException().printStackTrace();
		if (!(t1 instanceof IntegerType)) new WrongTypeException().printStackTrace();
		return new IntegerType();
	}

	// Exp e1,e2;
	public Type visit(Minus n) {
		Type t1 = n.e1.accept(this);
		Type t2 = n.e2.accept(this);
		if (!symbolTable.compareTypes(t1, t2)) new DiffTypeException().printStackTrace();
		if (!(t1 instanceof IntegerType)) new WrongTypeException().printStackTrace();
		return new IntegerType();
	}

	// Exp e1,e2;
	public Type visit(Times n) {
		Type t1 = n.e1.accept(this);
		Type t2 = n.e2.accept(this);
		if (!symbolTable.compareTypes(t1, t2)) new DiffTypeException().printStackTrace();
		if (!(t1 instanceof IntegerType)) new WrongTypeException().printStackTrace();
		return new IntegerType();
	}

	// Exp e1,e2;
	public Type visit(ArrayLookup n) {
		if (!(n.e1.accept(this) instanceof IntArrayType)) new DiffTypeException().printStackTrace();
		if (!(n.e2.accept(this) instanceof IntegerType)) new DiffTypeException().printStackTrace();
		return new IntegerType();
	}

	// Exp e;
	public Type visit(ArrayLength n) {
		if (!(n.e.accept(this) instanceof IntArrayType)) new WrongTypeException().printStackTrace();
		return new IntegerType();
	}

	// Exp e;
	// Identifier i;
	// ExpList el;
	public Type visit(Call n) {
		//Falta fazer esse
		n.e.accept(this);
		n.i.accept(this);
		for (int i = 0; i < n.el.size(); i++) {
			n.el.elementAt(i).accept(this);
		}
		return null;
	}

	// int i;
	public Type visit(IntegerLiteral n) {
		return new IntegerType();
	}

	public Type visit(True n) {
		return new BooleanType();
	}

	public Type visit(False n) {
		return new BooleanType();
	}

	// String s;
	public Type visit(IdentifierExp n) {
		return symbolTable.getVarType(currMethod, currClass, n.s);
	}

	public Type visit(This n) {
		return currClass.type();
	}

	// Exp e;
	public Type visit(NewArray n) {
		if (!(n.e.accept(this) instanceof IntegerType)) new WrongTypeException().printStackTrace();
		return null;
	}

	// Identifier i;
	public Type visit(NewObject n) {
		return new IdentifierType(n.i.s);
	}

	// Exp e;
	public Type visit(Not n) {
		if (!(n.e.accept(this) instanceof BooleanType)) new WrongTypeException().printStackTrace();
		return new BooleanType();
	}

	// String s;
	public Type visit(Identifier n) {
		return new IdentifierType(n.s);
	}
}
