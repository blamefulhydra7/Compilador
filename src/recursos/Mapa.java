package recursos;

import java.util.ArrayList;
import java.util.HashMap;

public class Mapa {
    private HashMap<String, Simbolo> mapa;

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
            System.err.println("Se intentó añadir un símbolo ya existente: " + sim.getNombre());
            return false;
        }
    }

    public boolean modificarSimbolo(Simbolo sim)
    {
        if(existe(sim.getNombre()) && sim.getValor() != -1)
        {
            mapa.replace(sim.getNombre(), sim);
            return true;
        }
        else if (!existe(sim.getNombre()))
        {
            System.err.println("Se intentó modificar un símbolo inexistente: " + sim.getNombre());
            return false;
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
        System.err.println("Se intentó recuperar un símbolo inexistente: " + key);
        return null;
    }

    public String imprimirMapa()
    {
        ArrayList<Simbolo> simbolos = new ArrayList<>(mapa.values());
        String tabla = "Tabla de símbolos\n";

        for (Simbolo simbolo : simbolos) {
            tabla = tabla + String.format("Nombre: %s\t\tValor: %d\n", simbolo.getNombre(), simbolo.getValor());
        }
        return tabla;
    }
}