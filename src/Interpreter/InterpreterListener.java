// Generated from C:/Users/Leonardo/IdeaProjects/Analizador/src\Interpreter.g4 by ANTLR 4.10.1
package Interpreter;

	import recursos.Simbolo;
	import recursos.Mapa;
	import java.util.InputMismatchException;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link InterpreterParser}.
 */
public interface InterpreterListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#regla}.
	 * @param ctx the parse tree
	 */
	void enterRegla(InterpreterParser.ReglaContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#regla}.
	 * @param ctx the parse tree
	 */
	void exitRegla(InterpreterParser.ReglaContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#sentencias}.
	 * @param ctx the parse tree
	 */
	void enterSentencias(InterpreterParser.SentenciasContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#sentencias}.
	 * @param ctx the parse tree
	 */
	void exitSentencias(InterpreterParser.SentenciasContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(InterpreterParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(InterpreterParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#condicionIf}.
	 * @param ctx the parse tree
	 */
	void enterCondicionIf(InterpreterParser.CondicionIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#condicionIf}.
	 * @param ctx the parse tree
	 */
	void exitCondicionIf(InterpreterParser.CondicionIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#operacion}.
	 * @param ctx the parse tree
	 */
	void enterOperacion(InterpreterParser.OperacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#operacion}.
	 * @param ctx the parse tree
	 */
	void exitOperacion(InterpreterParser.OperacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#operacionAritmetica}.
	 * @param ctx the parse tree
	 */
	void enterOperacionAritmetica(InterpreterParser.OperacionAritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#operacionAritmetica}.
	 * @param ctx the parse tree
	 */
	void exitOperacionAritmetica(InterpreterParser.OperacionAritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#imprimir}.
	 * @param ctx the parse tree
	 */
	void enterImprimir(InterpreterParser.ImprimirContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#imprimir}.
	 * @param ctx the parse tree
	 */
	void exitImprimir(InterpreterParser.ImprimirContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#auxOp}.
	 * @param ctx the parse tree
	 */
	void enterAuxOp(InterpreterParser.AuxOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#auxOp}.
	 * @param ctx the parse tree
	 */
	void exitAuxOp(InterpreterParser.AuxOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#auxOpB}.
	 * @param ctx the parse tree
	 */
	void enterAuxOpB(InterpreterParser.AuxOpBContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#auxOpB}.
	 * @param ctx the parse tree
	 */
	void exitAuxOpB(InterpreterParser.AuxOpBContext ctx);
}