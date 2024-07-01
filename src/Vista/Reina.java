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
public class Reina {
    public static List<String> calcularMovimientos(int fila, int columna) {
        List<String> movimientos = new ArrayList<>();
        // Movimientos verticales y horizontales
        for (int i = 0; i < 8; i++) {
            if (i != fila) {
                movimientos.add(i + "," + columna);
            }
            if (i != columna) {
                movimientos.add(fila + "," + i);
            }
        }
        // Movimientos diagonales
        for (int i = 1; i < 8; i++) {
            if (fila - i >= 0 && columna - i >= 0) {
                movimientos.add((fila - i) + "," + (columna - i));
            }
            if (fila - i >= 0 && columna + i < 8) {
                movimientos.add((fila - i) + "," + (columna + i));
            }
            if (fila + i < 8 && columna - i >= 0) {
                movimientos.add((fila + i) + "," + (columna - i));
            }
            if (fila + i < 8 && columna + i < 8) {
                movimientos.add((fila + i) + "," + (columna + i));
            }
        }
        return movimientos;
    }
    
}
