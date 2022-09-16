package recursos;

public class Simbolo {
    private int valor, tipo;
    private boolean valorB;
    private String nombre;

    public Simbolo(String nombre, int valor)
    {
        setNombre(nombre);
        setValor(valor);
        setTipo(1);
    }

    public Simbolo(String nombre, boolean valor)
    {
        setNombre(nombre);
        setValorB(valor);
        setTipo(2);
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public boolean isValorB() {
        return valorB;
    }

    public void setValorB(boolean valorB) {
        this.valorB = valorB;
    }
}
