package main;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import ast.Program;
import gramatica.avscLexer;
import gramatica.avscParser;
import gramatica.avscParser.GoalContext;
import visitor.BuildSymbolTableVisitor;
import visitor.PrettyPrintVisitor;
import visitor.TypeCheckVisitor;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStream stream = new FileInputStream("QuickSort.java");
		ANTLRInputStream input = new ANTLRInputStream(stream);
		avscLexer lexer = new avscLexer(input);
		CommonTokenStream token = new CommonTokenStream(lexer);
		avscParser parser = new avscParser(token);
		GoalContext tree = parser.goal();
		System.out.println(tree.toStringTree(parser));
		avscVisitor visitor = new avscVisitor();
		Program program = visitor.visit(tree);
		program.accept(new PrettyPrintVisitor());
		
		//Projeto 3
		BuildSymbolTableVisitor buildSTVisitor = new BuildSymbolTableVisitor();
		program.accept(buildSTVisitor);
		program.accept(new TypeCheckVisitor(buildSTVisitor.getSymbolTable()));
	}

}
