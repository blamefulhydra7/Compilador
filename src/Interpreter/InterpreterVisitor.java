// Generated from C:/Users/Leonardo/IdeaProjects/Analizador/src\Interpreter.g4 by ANTLR 4.10.1
package Interpreter;

	import recursos.Simbolo;
	import recursos.Mapa;
	import java.util.InputMismatchException;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link InterpreterParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface InterpreterVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#regla}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegla(InterpreterParser.ReglaContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#sentencias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencias(InterpreterParser.SentenciasContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(InterpreterParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#condicionIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionIf(InterpreterParser.CondicionIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#operacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacion(InterpreterParser.OperacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#operacionAritmetica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperacionAritmetica(InterpreterParser.OperacionAritmeticaContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#imprimir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImprimir(InterpreterParser.ImprimirContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#auxOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuxOp(InterpreterParser.AuxOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#auxOpB}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuxOpB(InterpreterParser.AuxOpBContext ctx);
}