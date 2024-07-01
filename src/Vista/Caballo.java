/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author danie
 */
public class Caballo {
    public static List<String> calcularMovimientos(int fila, int columna) {
        List<String> movimientos = new ArrayList<>();
        int[][] deltas = {
            {2, 1}, {1, 2}, {-1, 2}, {-2, 1},
            {-2, -1}, {-1, -2}, {1, -2}, {2, -1}
        };
        
        for (int[] delta : deltas) {
            int nuevaFila = fila + delta[0];
            int nuevaColumna = columna + delta[1];
            if (nuevaFila >= 0 && nuevaFila < 8 && nuevaColumna >= 0 && nuevaColumna < 8) {
                movimientos.add(nuevaFila + "," + nuevaColumna);
            }
        }
        
        return movimientos;
    }
    
}
