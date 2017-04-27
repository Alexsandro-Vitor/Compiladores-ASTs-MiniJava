// Generated from avsc.g4 by ANTLR 4.4
package gramatica;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link avscParser}.
 */
public interface avscListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link avscParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(@NotNull avscParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link avscParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(@NotNull avscParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link avscParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(@NotNull avscParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link avscParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(@NotNull avscParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link avscParser#goal}.
	 * @param ctx the parse tree
	 */
	void enterGoal(@NotNull avscParser.GoalContext ctx);
	/**
	 * Exit a parse tree produced by {@link avscParser#goal}.
	 * @param ctx the parse tree
	 */
	void exitGoal(@NotNull avscParser.GoalContext ctx);
	/**
	 * Enter a parse tree produced by {@link avscParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull avscParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link avscParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull avscParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link avscParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void enterMainClass(@NotNull avscParser.MainClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link avscParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void exitMainClass(@NotNull avscParser.MainClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link avscParser#arrayAssign}.
	 * @param ctx the parse tree
	 */
	void enterArrayAssign(@NotNull avscParser.ArrayAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link avscParser#arrayAssign}.
	 * @param ctx the parse tree
	 */
	void exitArrayAssign(@NotNull avscParser.ArrayAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link avscParser#newArray}.
	 * @param ctx the parse tree
	 */
	void enterNewArray(@NotNull avscParser.NewArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link avscParser#newArray}.
	 * @param ctx the parse tree
	 */
	void exitNewArray(@NotNull avscParser.NewArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link avscParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull avscParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link avscParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull avscParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link avscParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(@NotNull avscParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link avscParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(@NotNull avscParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link avscParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(@NotNull avscParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link avscParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(@NotNull avscParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link avscParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(@NotNull avscParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link avscParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(@NotNull avscParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link avscParser#not}.
	 * @param ctx the parse tree
	 */
	void enterNot(@NotNull avscParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by {@link avscParser#not}.
	 * @param ctx the parse tree
	 */
	void exitNot(@NotNull avscParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by {@link avscParser#newObject}.
	 * @param ctx the parse tree
	 */
	void enterNewObject(@NotNull avscParser.NewObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link avscParser#newObject}.
	 * @param ctx the parse tree
	 */
	void exitNewObject(@NotNull avscParser.NewObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link avscParser#statementList}.
	 * @param ctx the parse tree
	 */
	void enterStatementList(@NotNull avscParser.StatementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link avscParser#statementList}.
	 * @param ctx the parse tree
	 */
	void exitStatementList(@NotNull avscParser.StatementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link avscParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull avscParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link avscParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull avscParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link avscParser#ifElse}.
	 * @param ctx the parse tree
	 */
	void enterIfElse(@NotNull avscParser.IfElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link avscParser#ifElse}.
	 * @param ctx the parse tree
	 */
	void exitIfElse(@NotNull avscParser.IfElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link avscParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(@NotNull avscParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link avscParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(@NotNull avscParser.AssignContext ctx);
}