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
public class Peon {
    public static List<String> calcularMovimientos(int fila, int columna, boolean esPrimerMovimiento) {
        List<String> movimientos = new ArrayList<>();
        // Movimiento hacia adelante (una casilla)
        if (fila > 0) {
            movimientos.add((fila - 1) + "," + columna);
        }
        // Movimiento inicial (dos casillas)
        if (esPrimerMovimiento && fila == 6) {
            movimientos.add((fila - 2) + "," + columna);
        }
        // Captura diagonal izquierda
        if (fila > 0 && columna > 0) {
            movimientos.add((fila - 1) + "," + (columna - 1));
        }
        // Captura diagonal derecha
        if (fila > 0 && columna < 7) {
            movimientos.add((fila - 1) + "," + (columna + 1));
        }
        return movimientos;
    }

    static List<String> calcularMovimientos(int fila, int columna) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
