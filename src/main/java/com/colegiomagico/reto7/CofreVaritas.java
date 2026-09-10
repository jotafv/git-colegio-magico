/**
 
Retorna el número mayor dentro del arreglo de tamaños.*/
public class CofreVaritas {

    public static int varitaMasPoderosa(int[] tamanos) {
        if (tamanos == null || tamanos.length == 0) {
            return 0;
        }

        int maximo = tamanos[0];
        for (int tamanio : tamanos) {
            if (tamanio > maximo) {
                maximo = tamanio;
            }
        }
        return maximo;
    }

    public static void main(String[] args) {
        int[] varitas = {10, 15, 8};
        System.out.println("Poderosa: " + varitaMasPoderosa(varitas));
    }
}