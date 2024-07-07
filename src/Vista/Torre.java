
package Vista;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase para simular los movimientos de una torre en el ajedrez.
 */
public class Torre {
    /**
     * Calcula los movimientos posibles de una torre en el ajedrez.
     * @param fila La fila actual de la torre.
     * @param columna La columna actual de la torre.
     * @return Una lista de movimientos posibles en formato "fila,columna".
     */
    public static List<String> calcularMovimientos(int fila, int columna) {
        List<String> movimientos = new ArrayList<>();
        
        // Movimientos verticales: la torre puede moverse arriba y abajo en su columna actual.
        for (int i = 0; i < 8; i++) {
            if (i != fila) { // Evitar añadir la posición actual de la torre.
                movimientos.add(i + "," + columna);
            }
        }
        
        // Movimientos horizontales: la torre puede moverse a izquierda y derecha en su fila actual.
        for (int i = 0; i < 8; i++) {
            if (i != columna) { // Evitar añadir la posición actual de la torre.
                movimientos.add(fila + "," + i);
            }
        }
        
        return movimientos; // Devolver la lista de movimientos posibles.
    }
}
