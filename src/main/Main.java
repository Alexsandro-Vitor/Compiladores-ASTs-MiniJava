package main;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import ast.Program;
import gramatica.avscLexer;
import gramatica.avscParser;
import visitor.PrettyPrintVisitor;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStream stream = new FileInputStream("Teste.txt");
		ANTLRInputStream input = new ANTLRInputStream(stream);
		avscLexer lexer = new avscLexer(input);
		CommonTokenStream token = new CommonTokenStream(lexer);
		avscParser parser = new avscParser(token);
		ParseTree tree = parser.goal();
		System.out.println(tree.toStringTree(parser));
		avscVisitor visitor = new avscVisitor();
		Program program = (Program) visitor.visit(tree);
		program.accept(new PrettyPrintVisitor());
	}

}
