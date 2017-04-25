package main;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import gramatica.avscLexer;
import gramatica.avscParser;

public class Teste {

	public static void main(String[] args) throws IOException {
		InputStream stream = new FileInputStream("Teste.txt");
		ANTLRInputStream input = new ANTLRInputStream(stream);
		avscLexer lexer = new avscLexer(input);
		CommonTokenStream token = new CommonTokenStream(lexer);
		avscParser parser = new avscParser(token);
		parser.goal();
	}

}
