/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

/**
 *
 * @author danie
 */
public class JuegoDeAjedrez {
    private boolean juegoIniciado;
    // Otros atributos para el estado del juego, como el tablero, las piezas, etc.

    public JuegoDeAjedrez() {
        // Constructor que establece el estado inicial del juego
        juegoIniciado = false;
    }

    public void iniciarJuego() {
        // Método para iniciar el juego
        juegoIniciado = true;
        // Aquí puedes agregar la lógica para configurar el tablero y las piezas
        System.out.println("El juego de ajedrez ha comenzado.");
    }

    public void reiniciarJuego() {
        // Método para reiniciar el juego
        juegoIniciado = false;
        // Aquí puedes agregar la lógica para restablecer el tablero y las piezas a su estado inicial
        System.out.println("El juego de ajedrez ha sido reiniciado.");
    }

    public boolean estaJuegoIniciado() {
        // Método para verificar si el juego ya ha sido iniciado
        return juegoIniciado;
    }   
}
