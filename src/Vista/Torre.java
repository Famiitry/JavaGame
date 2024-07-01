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
public class Torre {
    public static List<String> calcularMovimientos(int fila, int columna) {
        List<String> movimientos = new ArrayList<>();
        // Movimientos verticales
        for (int i = 0; i < 8; i++) {
            if (i != fila) {
                movimientos.add(i + "," + columna);
            }
        }
        // Movimientos horizontales
        for (int i = 0; i < 8; i++) {
            if (i != columna) {
                movimientos.add(fila + "," + i);
            }
        }
        return movimientos;
    }
}
