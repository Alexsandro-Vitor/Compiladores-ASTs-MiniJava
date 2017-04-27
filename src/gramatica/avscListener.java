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
}