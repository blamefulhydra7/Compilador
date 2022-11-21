import javax.swing.*;
//EAX = 000, EBX = 011, ECX = 001, EDX = 010;
/* OpCode
    MOV = 100010dw oorrrmmm,
    SUB = 000101dw oorrrmmm,
    ADD = 00000011 oorrrmmm,
    MUL = 00001111 10101111 oorrrmmm,
    DIV = 1111011w oo111mmm,
    CMP = 11110111,
    JMP = 11101001,
    JGE = 01111101,
    CDQ = 11010100 00001010

    A investigar...
    .MODEL small, DW, DB, .CODE, Main PROC, .STARTUP, Etiquetas, Main ENDP, JNE, JE, JL, JG, JNL, JNG
*/

public class Main extends JFrame {
    public static void main(String[] args) {
        new Compilador();
        String numero = "1000";
        System.out.println(Integer.toBinaryString(Integer.parseInt(numero)));
    }
}