package recursos;

public class Conversor {
    public String convertBinario(String numero)
    {
        String result = Integer.toBinaryString(Integer.parseInt(numero));

        while(result.length() < 8)
        {
            result = "0" + result;
        }

        return result;
    }

    public String convertBinario(int numero)
    {
        String result = Integer.toBinaryString(numero);

        while(result.length() < 8)
        {
            result = "0" + result;
        }

        return result;
    }
}
