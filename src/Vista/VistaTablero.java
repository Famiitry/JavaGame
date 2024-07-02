/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author danie
 */
public class VistaTablero extends javax.swing.JFrame {
    
    private JComboBox <String> comboPiezas;
    private JTextField inicioFila;
    private JTextField inicioColumna;
    //private javax.swing.JButton jButton1;
    //private javax.swing.JButton jButton2;
    private JButton botonIniciar;
    private JButton botonReiniciar;
    //private javax.swing.JPanel jPanel1;
    //private javax.swing.JPanel jPanel2;
    private JuegoDeAjedrez ajedrez;
    private JLabel[][] etiquetasTablero = new JLabel[8][8];
    /**
     * Creates new form VistaTablero
     */
    public VistaTablero() {
        initComponents();
        configuracionAdicional();
        this.setSize(1190, 828);
        this.setLocationRelativeTo(null);
        this.setTitle("Ajedrez");
        //inicializarTablero();
        }
        private void configuracionAdicional(){
            inicializarTablero();
            configurarBotones();
            ajedrez = new JuegoDeAjedrez();
        }
        
        //Configura el actionListener para boton iniciar PILAS AQUI
                       
        private void configurarBotones(){
        botonIniciar = new JButton("Iniciar");
        botonIniciar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                ajedrez.iniciarJuego();
            }
        });
        //Configura el actionListener para boton reiniciar
        botonReiniciar = new JButton("Reiniciar");
        botonReiniciar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                ajedrez.reiniciarJuego();
            }
        });
        //Añadir mas codigo
    }
    private void inicializarTablero() {
        JPanel panelTablero = new JPanel(new GridLayout(8, 8));
        for (int i = 0; i < etiquetasTablero.length; i++) {
            for (int j = 0; j < etiquetasTablero[i].length; j++) {
                etiquetasTablero[i][j] = new JLabel();
                etiquetasTablero[i][j].setOpaque(true);
                etiquetasTablero[i][j].setBorder(BorderFactory.createLineBorder(Color.BLACK));
                panelTablero.add(etiquetasTablero[i][j]);
            }
        }
        this.add(panelTablero);
    }
    private void cargarIconoPieza(String piezaSeleccionada, int fila, int columna){
        try{
           BufferedImage img = ImageIO.read(getClass().getResource("Imagenes" + piezaSeleccionada + ".png"));
           ImageIcon iconoPieza = new ImageIcon(img);
           etiquetasTablero[fila][columna].setIcon(iconoPieza);
           etiquetasTablero[fila][columna].repaint();
        } catch(IOException e){
            JOptionPane.showMessageDialog(null,"Error al cargar el icono: " + e.getMessage());
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        jButton47 = new javax.swing.JButton();
        jButton48 = new javax.swing.JButton();
        jButton49 = new javax.swing.JButton();
        jButton50 = new javax.swing.JButton();
        jButton51 = new javax.swing.JButton();
        jButton52 = new javax.swing.JButton();
        jButton53 = new javax.swing.JButton();
        jButton54 = new javax.swing.JButton();
        jButton55 = new javax.swing.JButton();
        jButton56 = new javax.swing.JButton();
        jButton57 = new javax.swing.JButton();
        jButton58 = new javax.swing.JButton();
        jButton59 = new javax.swing.JButton();
        jButton60 = new javax.swing.JButton();
        jButton61 = new javax.swing.JButton();
        jButton62 = new javax.swing.JButton();
        jButton63 = new javax.swing.JButton();
        jButton64 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton65 = new javax.swing.JButton();
        jButton66 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout(8, 8));

        jButton1.setBackground(new java.awt.Color(255, 244, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton1.setToolTipText("");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton1);

        jButton2.setBackground(new java.awt.Color(83, 56, 3));
        jButton2.setToolTipText("");
        jButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton2);

        jButton4.setBackground(new java.awt.Color(255, 244, 204));
        jButton4.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton4.setToolTipText("");
        jButton4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton4);

        jButton5.setBackground(new java.awt.Color(83, 56, 3));
        jButton5.setToolTipText("");
        jButton5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton5);

        jButton6.setBackground(new java.awt.Color(255, 244, 204));
        jButton6.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton6.setToolTipText("");
        jButton6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton6);

        jButton3.setBackground(new java.awt.Color(83, 56, 3));
        jButton3.setToolTipText("");
        jButton3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton3);

        jButton7.setBackground(new java.awt.Color(255, 244, 204));
        jButton7.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton7.setToolTipText("");
        jButton7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton7);

        jButton8.setBackground(new java.awt.Color(83, 56, 3));
        jButton8.setToolTipText("");
        jButton8.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton8);

        jButton9.setBackground(new java.awt.Color(83, 56, 3));
        jButton9.setToolTipText("");
        jButton9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton9);

        jButton10.setBackground(new java.awt.Color(255, 244, 204));
        jButton10.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton10.setToolTipText("");
        jButton10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton10);

        jButton11.setBackground(new java.awt.Color(83, 56, 3));
        jButton11.setToolTipText("");
        jButton11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton11);

        jButton12.setBackground(new java.awt.Color(255, 244, 204));
        jButton12.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton12.setToolTipText("");
        jButton12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton12);

        jButton13.setBackground(new java.awt.Color(83, 56, 3));
        jButton13.setToolTipText("");
        jButton13.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton13);

        jButton14.setBackground(new java.awt.Color(255, 244, 204));
        jButton14.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton14.setToolTipText("");
        jButton14.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton14);

        jButton15.setBackground(new java.awt.Color(83, 56, 3));
        jButton15.setToolTipText("");
        jButton15.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton15);

        jButton16.setBackground(new java.awt.Color(255, 244, 204));
        jButton16.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton16.setToolTipText("");
        jButton16.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton16);

        jButton17.setBackground(new java.awt.Color(255, 244, 204));
        jButton17.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton17.setToolTipText("");
        jButton17.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton17);

        jButton18.setBackground(new java.awt.Color(83, 56, 3));
        jButton18.setToolTipText("");
        jButton18.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton18);

        jButton19.setBackground(new java.awt.Color(255, 244, 204));
        jButton19.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton19.setToolTipText("");
        jButton19.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton19);

        jButton20.setBackground(new java.awt.Color(83, 56, 3));
        jButton20.setToolTipText("");
        jButton20.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton20);

        jButton21.setBackground(new java.awt.Color(255, 244, 204));
        jButton21.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton21.setToolTipText("");
        jButton21.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton21);

        jButton22.setBackground(new java.awt.Color(83, 56, 3));
        jButton22.setToolTipText("");
        jButton22.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton22);

        jButton23.setBackground(new java.awt.Color(255, 244, 204));
        jButton23.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton23.setToolTipText("");
        jButton23.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton23);

        jButton24.setBackground(new java.awt.Color(82, 54, 0));
        jButton24.setToolTipText("");
        jButton24.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton24);

        jButton25.setBackground(new java.awt.Color(83, 56, 3));
        jButton25.setToolTipText("");
        jButton25.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton25);

        jButton26.setBackground(new java.awt.Color(255, 244, 204));
        jButton26.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton26.setToolTipText("");
        jButton26.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton26);

        jButton27.setBackground(new java.awt.Color(83, 56, 3));
        jButton27.setToolTipText("");
        jButton27.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton27);

        jButton28.setBackground(new java.awt.Color(255, 244, 204));
        jButton28.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton28.setToolTipText("");
        jButton28.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton28);

        jButton29.setBackground(new java.awt.Color(83, 56, 3));
        jButton29.setToolTipText("");
        jButton29.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton29);

        jButton30.setBackground(new java.awt.Color(255, 244, 204));
        jButton30.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton30.setToolTipText("");
        jButton30.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton30);

        jButton31.setBackground(new java.awt.Color(83, 56, 3));
        jButton31.setToolTipText("");
        jButton31.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton31);

        jButton32.setBackground(new java.awt.Color(255, 244, 204));
        jButton32.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton32.setToolTipText("");
        jButton32.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton32);

        jButton33.setBackground(new java.awt.Color(255, 244, 204));
        jButton33.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton33.setToolTipText("");
        jButton33.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton33);

        jButton34.setBackground(new java.awt.Color(83, 56, 3));
        jButton34.setToolTipText("");
        jButton34.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton34);

        jButton35.setBackground(new java.awt.Color(255, 244, 204));
        jButton35.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton35.setToolTipText("");
        jButton35.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton35);

        jButton36.setBackground(new java.awt.Color(83, 56, 3));
        jButton36.setToolTipText("");
        jButton36.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton36);

        jButton37.setBackground(new java.awt.Color(255, 244, 204));
        jButton37.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton37.setToolTipText("");
        jButton37.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton37);

        jButton38.setBackground(new java.awt.Color(83, 56, 3));
        jButton38.setToolTipText("");
        jButton38.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton38);

        jButton39.setBackground(new java.awt.Color(255, 244, 204));
        jButton39.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton39.setToolTipText("");
        jButton39.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton39);

        jButton40.setBackground(new java.awt.Color(83, 56, 3));
        jButton40.setToolTipText("");
        jButton40.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton40);

        jButton41.setBackground(new java.awt.Color(83, 56, 3));
        jButton41.setToolTipText("");
        jButton41.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton41);

        jButton42.setBackground(new java.awt.Color(255, 244, 204));
        jButton42.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton42.setToolTipText("");
        jButton42.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton42);

        jButton43.setBackground(new java.awt.Color(83, 56, 3));
        jButton43.setToolTipText("");
        jButton43.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton43);

        jButton44.setBackground(new java.awt.Color(255, 244, 204));
        jButton44.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton44.setToolTipText("");
        jButton44.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton44);

        jButton45.setBackground(new java.awt.Color(83, 56, 3));
        jButton45.setToolTipText("");
        jButton45.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton45);

        jButton46.setBackground(new java.awt.Color(255, 244, 204));
        jButton46.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton46.setToolTipText("");
        jButton46.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton46);

        jButton47.setBackground(new java.awt.Color(83, 56, 3));
        jButton47.setToolTipText("");
        jButton47.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton47);

        jButton48.setBackground(new java.awt.Color(255, 244, 204));
        jButton48.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton48.setToolTipText("");
        jButton48.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton48);

        jButton49.setBackground(new java.awt.Color(255, 244, 204));
        jButton49.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton49.setToolTipText("");
        jButton49.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton49);

        jButton50.setBackground(new java.awt.Color(83, 56, 3));
        jButton50.setToolTipText("");
        jButton50.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton50);

        jButton51.setBackground(new java.awt.Color(255, 244, 204));
        jButton51.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton51.setToolTipText("");
        jButton51.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton51);

        jButton52.setBackground(new java.awt.Color(83, 56, 3));
        jButton52.setToolTipText("");
        jButton52.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton52);

        jButton53.setBackground(new java.awt.Color(255, 244, 204));
        jButton53.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton53.setToolTipText("");
        jButton53.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton53);

        jButton54.setBackground(new java.awt.Color(83, 56, 3));
        jButton54.setToolTipText("");
        jButton54.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton54);

        jButton55.setBackground(new java.awt.Color(255, 244, 204));
        jButton55.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton55.setToolTipText("");
        jButton55.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton55);

        jButton56.setBackground(new java.awt.Color(83, 56, 3));
        jButton56.setToolTipText("");
        jButton56.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton56);

        jButton57.setBackground(new java.awt.Color(83, 56, 3));
        jButton57.setToolTipText("");
        jButton57.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton57);

        jButton58.setBackground(new java.awt.Color(255, 244, 204));
        jButton58.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton58.setToolTipText("");
        jButton58.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton58);

        jButton59.setBackground(new java.awt.Color(83, 56, 3));
        jButton59.setToolTipText("");
        jButton59.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton59);

        jButton60.setBackground(new java.awt.Color(255, 244, 204));
        jButton60.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton60.setToolTipText("");
        jButton60.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton60);

        jButton61.setBackground(new java.awt.Color(83, 56, 3));
        jButton61.setToolTipText("");
        jButton61.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton61);

        jButton62.setBackground(new java.awt.Color(255, 244, 204));
        jButton62.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton62.setToolTipText("");
        jButton62.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton62);

        jButton63.setBackground(new java.awt.Color(83, 56, 3));
        jButton63.setToolTipText("");
        jButton63.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton63);

        jButton64.setBackground(new java.awt.Color(255, 244, 204));
        jButton64.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jButton64.setToolTipText("");
        jButton64.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jButton64);

        jPanel2.setBackground(new java.awt.Color(204, 168, 126));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jButton65.setText("Iniciar");
        jButton65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton65ActionPerformed(evt);
            }
        });

        jButton66.setText("Reiniciar");
        jButton66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton66ActionPerformed(evt);
            }
        });

        jLabel1.setText("Inicio Fila");

        jLabel2.setText("Inicio Columna");

        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 204)));

        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 204)));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jComboBox1.setBackground(new java.awt.Color(231, 177, 99));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALFIL", "REINA", "CABALLO", "TORRE", "PEÓN" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1))
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton66, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton65, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(jButton65)
                .addGap(33, 33, 33)
                .addComponent(jButton66)
                .addContainerGap(231, Short.MAX_VALUE))
        );

        jMenu1.setText("Restart");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Exit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 874, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton65ActionPerformed
        // Configuracion del botón iniciar      
        ajedrez.iniciarJuego();       
    }//GEN-LAST:event_jButton65ActionPerformed

    private void jButton66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton66ActionPerformed
        // Configuración del botón reiniciar
        ajedrez.reiniciarJuego(); 
        
        //botonReiniciar.addActionListener(new ActionListener() {
    //@Override
    //public void actionPerformed(ActionEvent e) {
        //reiniciarJuego();
    //}
//});
    }//GEN-LAST:event_jButton66ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        inicioColumna = new JTextField();
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
    String[] piezas = {"Alfil", "Torre", "Reina", "Caballo", "Peón"};
    comboPiezas = new JComboBox<>(piezas);
    comboPiezas.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            String piezaSeleccionada = (String) comboPiezas.getSelectedItem();
            try {
                int fila = Integer.parseInt(inicioFila.getText());
                int columna = Integer.parseInt(inicioColumna.getText());
                List<String> movimientos;
                
                //ImageIcon iconoPieza = new ImageIcon("C:\\Users\\danie\\OneDrive\\Documentos\\NetBeansProjects\\JavaGame\\src\\Imagenes\\" + piezaSeleccionada + ".png");
                //Usando rutas relativas para cargar los iconos
                ImageIcon iconoPieza = new ImageIcon(getClass().getResource("/Imagenes/" + piezaSeleccionada + ".png"));
                switch (piezaSeleccionada) {
                    case "Alfil":
                        movimientos = Alfil.calcularMovimientos(fila, columna);
                        break;
                    case "Reina":
                        movimientos = Reina.calcularMovimientos(fila, columna);
                        break;
                    case "Torre":
                        movimientos = Torre.calcularMovimientos(fila, columna);
                        break;
                    case "Caballo":
                        movimientos = Caballo.calcularMovimientos(fila, columna);
                        break;
                    case "Peón":
                        movimientos = Peon.calcularMovimientos(fila, columna);
                        break;
                        
                    // Puedes agregar más casos para otras piezas aquí
                    default:
                        movimientos = new ArrayList<>();
                        break;
                }
                
                // Aquí puedes mostrar los movimientos posibles al usuario
                // Por ejemplo, podrías imprimirlos en la consola o mostrarlos en un componente de la interfaz
                System.out.println("Movimientos posibles para " + piezaSeleccionada + ": " + movimientos);
                
            } catch (NumberFormatException ex) {
                // Manejar la excepción si el texto ingresado no es un número válido
                System.out.println("Por favor, ingresa números válidos para la fila y columna.");
            }
        }
    });
        
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaTablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaTablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaTablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaTablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaTablero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton10;
    public javax.swing.JButton jButton11;
    public javax.swing.JButton jButton12;
    public javax.swing.JButton jButton13;
    public javax.swing.JButton jButton14;
    public javax.swing.JButton jButton15;
    public javax.swing.JButton jButton16;
    public javax.swing.JButton jButton17;
    public javax.swing.JButton jButton18;
    public javax.swing.JButton jButton19;
    public javax.swing.JButton jButton2;
    public javax.swing.JButton jButton20;
    public javax.swing.JButton jButton21;
    public javax.swing.JButton jButton22;
    public javax.swing.JButton jButton23;
    public javax.swing.JButton jButton24;
    public javax.swing.JButton jButton25;
    public javax.swing.JButton jButton26;
    public javax.swing.JButton jButton27;
    public javax.swing.JButton jButton28;
    public javax.swing.JButton jButton29;
    public javax.swing.JButton jButton3;
    public javax.swing.JButton jButton30;
    public javax.swing.JButton jButton31;
    public javax.swing.JButton jButton32;
    public javax.swing.JButton jButton33;
    public javax.swing.JButton jButton34;
    public javax.swing.JButton jButton35;
    public javax.swing.JButton jButton36;
    public javax.swing.JButton jButton37;
    public javax.swing.JButton jButton38;
    public javax.swing.JButton jButton39;
    public javax.swing.JButton jButton4;
    public javax.swing.JButton jButton40;
    public javax.swing.JButton jButton41;
    public javax.swing.JButton jButton42;
    public javax.swing.JButton jButton43;
    public javax.swing.JButton jButton44;
    public javax.swing.JButton jButton45;
    public javax.swing.JButton jButton46;
    public javax.swing.JButton jButton47;
    public javax.swing.JButton jButton48;
    public javax.swing.JButton jButton49;
    public javax.swing.JButton jButton5;
    public javax.swing.JButton jButton50;
    public javax.swing.JButton jButton51;
    public javax.swing.JButton jButton52;
    public javax.swing.JButton jButton53;
    public javax.swing.JButton jButton54;
    public javax.swing.JButton jButton55;
    public javax.swing.JButton jButton56;
    public javax.swing.JButton jButton57;
    public javax.swing.JButton jButton58;
    public javax.swing.JButton jButton59;
    public javax.swing.JButton jButton6;
    public javax.swing.JButton jButton60;
    public javax.swing.JButton jButton61;
    public javax.swing.JButton jButton62;
    public javax.swing.JButton jButton63;
    public javax.swing.JButton jButton64;
    private javax.swing.JButton jButton65;
    private javax.swing.JButton jButton66;
    public javax.swing.JButton jButton7;
    public javax.swing.JButton jButton8;
    public javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

    private void inicializarComponentes() {
    // Inicialización de JComboBox para las piezas de ajedrez
    comboPiezas = new JComboBox<>(new String[]{"Peón", "Torre", "Caballo", "Alfil", "Reina", "Rey"});
    comboPiezas.setBounds(10, 10, 80, 20); // Ajusta la posición y tamaño según sea necesario

    // Inicialización de JTextField para la fila
    inicioFila = new JTextField();
    inicioFila.setBounds(100, 10, 40, 20); // Ajusta la posición y tamaño según sea necesario
    inicioFila.setToolTipText("Ingrese la fila (1-8)");

    // Inicialización de JTextField para la columna
    inicioColumna = new JTextField();
    inicioColumna.setBounds(150, 10, 40, 20); // Ajusta la posición y tamaño según sea necesario
    inicioColumna.setToolTipText("Ingrese la columna (A-H)");

    // Agregar los componentes al JFrame o a un JPanel según corresponda
    this.add(comboPiezas);
    this.add(inicioFila);
    this.add(inicioColumna);
    }
    
    //private void initComponents() {
    //}
}
