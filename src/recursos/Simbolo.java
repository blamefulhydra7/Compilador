package recursos;

public class Simbolo {
    private int valor;
    private String nombre;

    public Simbolo(String nombre, int valor)
    {
        setNombre(nombre);
        setValor(valor);
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
}
