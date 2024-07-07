

package Vista;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author danie
 */
public class Alfil {
    public static List<String> calcularMovimientos(int fila, int columna) {
        List<String> movimientos = new ArrayList<>();
        // Agrega aquí la lógica para calcular los movimientos
        // Movimientos diagonales hacia arriba a la izquierda
        for (int i = 1; i <= Math.min(fila, columna); i++) {
            movimientos.add((fila - i) + "," + (columna - i));
        }
        // Movimientos diagonales hacia arriba a la derecha
        for (int i = 1; i <= Math.min(fila, 7 - columna); i++) {
            movimientos.add((fila - i) + "," + (columna + i));
        }
        // Movimientos diagonales hacia abajo a la izquierda
        for (int i = 1; i <= Math.min(7 - fila, columna); i++) {
            movimientos.add((fila + i) + "," + (columna - i));
        }
        // Movimientos diagonales hacia abajo a la derecha
        for (int i = 1; i <= Math.min(7 - fila, 7 - columna); i++) {
            movimientos.add((fila + i) + "," + (columna + i));
        }
        return movimientos;
    }
}
