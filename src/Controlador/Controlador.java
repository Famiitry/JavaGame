package Controlador;
import Vista.JuegoDeAjedrez;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vista.VistaTablero;

/**
 *
 * @author danie
 */
public class Controlador implements ActionListener {
    
    public static String[][] tablero = new String[8][8];
    private Object posicion;
    private VistaTablero vista;
    private JuegoDeAjedrez ajedrez;
    
    public Controlador(VistaTablero vista, JuegoDeAjedrez ajedrez) {
        //iniciarTablero();
        //VistaTablero vista = new VistaTablero();
        this.vista = vista;
        this.ajedrez = ajedrez;
        vista.setVisible(true);      
    }   
    
    private void iniciarTablero() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tablero[i][j] = "";
            }
        }
         for (int i = 0; i < 8; i++) {
            tablero[1][i] = "B_peon";
            tablero[6][i] = "A_peon";
        }
         
        tablero[0][0] = "B_torre";
        tablero[0][1] = "B_caballo";
        tablero[0][2] = "B_alfil";
        tablero[0][3] = "B_reina";
        tablero[0][4] = "B_rey";
        tablero[0][5] = "B_alfil";
        tablero[0][6] = "B_caballo";
        tablero[0][7] = "B_torre";

        tablero[7][0] = "A_torre";
        tablero[7][1] = "A_caballo";
        tablero[7][2] = "A_alfil";
        tablero[7][3] = "A_reina";
        tablero[7][4] = "A_rey";
        tablero[7][5] = "A_alfil";
        tablero[7][6] = "A_caballo";
        tablero[7][7] = "A_torre";
    
    
}
    // Método para manejar los eventos de los botones y las casillas
    @Override
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == vista.botonIniciar) {ajedrez.iniciarJuego();
            vista.iniciarJuego(); // Llama al método de la vista para iniciar el juego
        } else if (ae.getSource() == vista.botonReiniciar) {
            ajedrez.reiniciarJuego();
            vista.reiniciarJuego(); // Llama al método de la vista para reiniciar el juego
        } else {
            // Obtiene la fila y columna de la casilla que se hizo click
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    if (ae.getSource() == vista.etiquetasTablero[i][j]) {
                        vista.realizarAccionEnCasilla(i, j);
                        ajedrez.realizarMovimiento(); // Llama al método de la vista para manejar la acción en la casilla
                        break;
                    }
                }
            }
        }
    }

    public void actionPerformed(ActionEvent e, int fila, int columna) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}