import java.util.Arrays;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        int[] numeros = new int[3];
        System.out.println(numeros[0]);
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = -1;
        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[numeros.length - 1];
        System.out.println("i= " + i);
        System.out.println("j= " + j);
        System.out.println("k= " + k);
        String[] productos = new String[]{"Memoria", "Samsung S-3", "MacBok Air"};
        System.out.println("SIN ORDENAR");

        int m;
        for(m = 0; m < 3; ++m) {
            System.out.println("Productos" + m + " = " + productos[m]);
        }

        System.out.println("ORDENADO");
        Arrays.sort(productos);

        for(m = 0; m < 3; ++m) {
            System.out.println("Productos" + m + " = " + productos[m]);
        }

    }
}
