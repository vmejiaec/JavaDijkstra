package victor.dijkstra;

import java.util.*;

public class App{
    public static void main(String[] args){
        // Cargar el grafo
        Grafo grafo = new Grafo();
        
        grafo.addNodo("A","B", 7);
        grafo.addNodo("A","C", 9);
        grafo.addNodo("A","D", 14);
        grafo.addNodo("B","D", 10);

        System.out.println("Vecinos: "+ grafo.vecinos);

        // Ejecutar el algoritmo de Dijkstra
        Dijkstra programa = new Dijkstra();
        Map<String, String> resultado = programa.ejecutar(grafo, "A", "F");

        System.out.println("Resultado: "+resultado);
    }
}