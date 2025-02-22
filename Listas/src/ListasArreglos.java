import java.util.*;
public class ListasArreglos {    public static void main(String[] args) {
// Creación de un ArrayList
    List<String> listaColores = new ArrayList<>();

// Creación mediante la clase Arrays
    String[] nombres = {"Arturo", "Daniel", "Pamela"};
    List<String> listaNombres = Arrays.asList(nombres);

// Adición de elementos individuales
    listaColores.add("Verde");
    listaColores.add("Amarillo");

// Construir lista a partir de otra lista
    List<String> listaElementos = new ArrayList<>(listaColores);

// Adición de elementos a otra colección
    listaElementos.addAll(listaNombres);

// Desplegue de elementos de la lista
    System.out.println("Lista Nombre");
    listaNombres.forEach(System.out::println);
    System.out.println("Lista Cololes");
    listaColores.forEach(System.out::println);
    System.out.println("Lista Elementos");
    listaElementos.forEach(System.out::println);

// Iteración de elementos individuales
    ListIterator<String> iterador1 = listaColores.listIterator();
    ListIterator<String> iterador3 = listaNombres.listIterator();
// Devuelve todos los elementos de la lista
    System.out.println("Recorrido con Iterador hacia adelante");
    while(iterador1.hasNext()){
        System.out.println("Color : " + iterador1.next());
    }
    System.out.println("Recorrido con Iterador hacia atras");
    while(iterador1.hasPrevious()){
        System.out.println("Color : " + iterador1.previous());
    }
    System.out.println("Recorrido con Iterador eliminación dinámica");
    while(iterador1.hasNext()){
        if(iterador1.next().equals("Amarillo")){
            iterador1.remove();
        }
    }

    // Inicialización con un nuevo iterador con elemento amarillo eliminado
    //System.out.println("Lista de colores sin elemento eleminado");
    //ListIterator<String> iterador2 = listaColores.listIterator();
    //for(iterador2 = listaColores.listIterator(); iterador2.hasNext(); ){
        //System.out.println("Color Amarillo= " + iterador2.next());
    //}


    //Devuelve todos los elementos de la lista
        System.out.println("Recorrido con Iterador hacia adelante");
        while(iterador3.hasNext()){
            System.out.println("Elementos : " + iterador3.next());
        }
        System.out.println("Recorrido con Iterador hacia atras");
        while(iterador3.hasPrevious()){
            System.out.println("Elementos : " + iterador3.previous());
        }
        System.out.println("Recorrido con Iterador eliminación dinámica");
        while(iterador3.hasNext()){
            if(iterador3.next().equals("Pamela")){
                iterador3.remove();
            }
            // Inicialización con un nuevo iterador con elemento pamela eliminado
            //System.out.println("Lista de elementos sin elemento eliminado");
            //ListIterator<String> iterador4 = listaNombres.listIterator();
            //for(iterador4 = listaNombres.listIterator(); iterador4.hasNext(); ){
              //  System.out.println("Elemento = " + iterador4.next());
            //}
        }
    }
}