package victor.dijkstra;

import java.util.*;

public class Dijkstra{
    public Map<String, String> ejecutar (Grafo grafo, String nodoInicio, String nodoFin){

        // Crear la tabla del estado con su nodo y su fila
        Map<String, FilaEstado> tablaEstado = new LinkedHashMap<>();
        for (String nodo : grafo.vecinos.keySet()){
            tablaEstado.put(nodo, new FilaEstado(nodo));  // Con distancias 100 y no visitados
        }
        // A la primera fila poner distancia 0
        tablaEstado.get(nodoInicio).distancia = 0;

        for (String nodo: tablaEstado.keySet()){
            System.out.println("nodo: "+ nodo +" "+ tablaEstado.get(nodo).distancia + " "+ tablaEstado.get(nodo).visitado );
        }

        // Se prepara el mapa de resultados
        Map <String, String> previo = new LinkedHashMap<>();

        while (true){
            // buscar el nodo no visitado con la menor distancia
            String nodoActual = null;
            int menor = 100 +1;
            for (FilaEstado fila : tablaEstado.values()){
                if (!fila.visitado && fila.distancia < menor){
                    menor = estado.distancia;
                    nodoActual = fila.nodo;
                }
            }
            break;
        }

        return previo;
    }
}