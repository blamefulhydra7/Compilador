package recursos;

import java.util.ArrayList;
import java.util.HashMap;

public class Mapa {
    private HashMap<String, Simbolo> mapa;
    public String errores = "";

    public Mapa()
    {
        mapa = new HashMap<>();
    }

    public boolean agregarSimbolo(Simbolo sim)
    {
        if(!existe(sim.getNombre()))
        {
            mapa.put(sim.getNombre(), sim);
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean modificarSimbolo(Simbolo sim)
    {
        if(sim.getValor() > 0)
        {
            mapa.replace(sim.getNombre(), sim);
            return true;
        }
        else if (sim.getTipo() == 2)
        {
            mapa.replace(sim.getNombre(), sim);
            return true;
        }
        return false;
    }

    public boolean existe(String key)
    {
        return mapa.get(key) != null;
    }

    public Simbolo getSimbolo(String key)
    {
        if (existe(key))
            return mapa.get(key);
        return null;
    }

    public String imprimirMapa()
    {
        ArrayList<Simbolo> simbolos = new ArrayList<>(mapa.values());
        String tabla = "Tabla de símbolos\n";

        for (Simbolo simbolo : simbolos) {
            tabla = tabla + String.format("Nombre: %s\tValor: %s\tTipo: %s\n", simbolo.getNombre(), (simbolo.getTipo() == 1) ? simbolo.getValor() + "" : simbolo.isValorB() + "", (simbolo.getTipo() == 1) ? "Integer" : "Boolean");
        }
        return tabla;
    }

    public void addError(String error)
    {
        errores += "\n" + error;
    }
}