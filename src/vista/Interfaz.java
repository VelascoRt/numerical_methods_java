
package vista;

import controlador.Funcion;
import controlador.Metodo;
import controlador.Operaciones;
import java.awt.Color;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import org.math.plot.Plot2DPanel;
import  vista.Grafica2D;

public class Interfaz extends javax.swing.JFrame {

    int xMouse, yMouse;
    int nR = 0;
    DefaultListModel resultados = new DefaultListModel();
    public Interfaz() {
        initComponents();
        /*
        grafica.setBounds(280, 520, 350, 270);
        add(grafica);*/
        resultados = new DefaultListModel();
        listResultados.setModel(resultados);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listMetodo = new javax.swing.JList<>();
        Tools = new javax.swing.JPanel();
        lblExit = new javax.swing.JLabel();
        Header = new javax.swing.JPanel();
        DownPanel = new javax.swing.JPanel();
        sldIteraciones = new javax.swing.JSlider();
        Graficar = new javax.swing.JPanel();
        btnGraficar = new javax.swing.JLabel();
        txterror = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listResultados = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        txtIteraciones = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtmin = new javax.swing.JTextField();
        txtmax = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtfuncion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(java.awt.Color.darkGray);
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Desarrollo de algoritmos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Ebrima", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        listMetodo.setBackground(new java.awt.Color(51, 51, 51));
        listMetodo.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        listMetodo.setForeground(new java.awt.Color(255, 255, 255));
        listMetodo.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Bisección", "Falsa Posición", "Newton Raphson", "Método de la secante", "Método de raíces múltiples", "Método de punto fijo" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listMetodo.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listMetodo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listMetodo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                listMetodoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                listMetodoMouseExited(evt);
            }
        });
        jScrollPane1.setViewportView(listMetodo);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 227, 136));

        Tools.setBackground(java.awt.Color.darkGray);
        Tools.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblExit.setBackground(java.awt.Color.darkGray);
        lblExit.setFont(new java.awt.Font("Ebrima", 0, 24)); // NOI18N
        lblExit.setForeground(new java.awt.Color(255, 255, 255));
        lblExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblExit.setText("X");
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblExitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ToolsLayout = new javax.swing.GroupLayout(Tools);
        Tools.setLayout(ToolsLayout);
        ToolsLayout.setHorizontalGroup(
            ToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblExit, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );
        ToolsLayout.setVerticalGroup(
            ToolsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblExit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel1.add(Tools, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 40, 70, 50));

        Header.setOpaque(false);
        Header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                HeaderMouseDragged(evt);
            }
        });
        Header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HeaderMousePressed(evt);
            }
        });

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel1.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 50));

        DownPanel.setOpaque(false);

        sldIteraciones.setBackground(java.awt.Color.darkGray);
        sldIteraciones.setForeground(new java.awt.Color(255, 255, 255));
        sldIteraciones.setMajorTickSpacing(50);
        sldIteraciones.setMaximum(150);
        sldIteraciones.setMinimum(50);
        sldIteraciones.setMinorTickSpacing(20);
        sldIteraciones.setPaintLabels(true);
        sldIteraciones.setPaintTicks(true);
        sldIteraciones.setSnapToTicks(true);

        Graficar.setBackground(new java.awt.Color(51, 51, 51));

        btnGraficar.setFont(new java.awt.Font("Ebrima", 0, 24)); // NOI18N
        btnGraficar.setForeground(new java.awt.Color(255, 255, 255));
        btnGraficar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnGraficar.setText("GRAFICAR");
        btnGraficar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btnGraficar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGraficarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGraficarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGraficarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout GraficarLayout = new javax.swing.GroupLayout(Graficar);
        Graficar.setLayout(GraficarLayout);
        GraficarLayout.setHorizontalGroup(
            GraficarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnGraficar, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
        );
        GraficarLayout.setVerticalGroup(
            GraficarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnGraficar, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        txterror.setEditable(false);
        txterror.setBackground(new java.awt.Color(51, 51, 51));
        txterror.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        txterror.setForeground(new java.awt.Color(255, 255, 255));
        txterror.setText("1e-6");

        jLabel1.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Error:");

        javax.swing.GroupLayout DownPanelLayout = new javax.swing.GroupLayout(DownPanel);
        DownPanel.setLayout(DownPanelLayout);
        DownPanelLayout.setHorizontalGroup(
            DownPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DownPanelLayout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(17, 17, 17)
                .addComponent(txterror, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(sldIteraciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(Graficar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        DownPanelLayout.setVerticalGroup(
            DownPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DownPanelLayout.createSequentialGroup()
                .addGroup(DownPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sldIteraciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(DownPanelLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(DownPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txterror, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Graficar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(105, 105, 105))
        );

        jPanel1.add(DownPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 780, 100));

        jLabel3.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Escoge el método númerico a utilizar:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, -1, -1));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel5.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Resultados:");

        jScrollPane3.setBackground(new java.awt.Color(51, 51, 51));
        jScrollPane3.setForeground(new java.awt.Color(51, 51, 51));

        listResultados.setBackground(new java.awt.Color(51, 51, 51));
        listResultados.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        listResultados.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setViewportView(listResultados);

        jLabel6.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Iteraciones");

        txtIteraciones.setEditable(false);
        txtIteraciones.setBackground(new java.awt.Color(51, 51, 51));
        txtIteraciones.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        txtIteraciones.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
            .addComponent(txtIteraciones)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtIteraciones, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, 140, 190));

        jLabel13.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Número de iteraciones:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 230, -1));

        txtmin.setBackground(new java.awt.Color(51, 51, 51));
        txtmin.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        txtmin.setForeground(new java.awt.Color(255, 255, 255));
        txtmin.setText("0");
        jPanel1.add(txtmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 140, 30));

        txtmax.setBackground(new java.awt.Color(51, 51, 51));
        txtmax.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        txtmax.setForeground(new java.awt.Color(255, 255, 255));
        txtmax.setText("0");
        jPanel1.add(txtmax, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 140, 30));

        jLabel11.setFont(new java.awt.Font("Ebrima", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("min");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 55, -1));

        jLabel17.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Escoge la función a utilizar:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        txtfuncion.setBackground(new java.awt.Color(51, 51, 51));
        txtfuncion.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        txtfuncion.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txtfuncion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 250, 30));

        jLabel7.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Escriba los valores a despejar:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 190, -1));

        jLabel14.setFont(new java.awt.Font("Ebrima", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("max");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 55, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_HeaderMousePressed

    private void HeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_HeaderMouseDragged

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblExitMouseClicked

    private void lblExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseEntered
        Tools.setBackground(new Color(206, 85, 73));
    }//GEN-LAST:event_lblExitMouseEntered

    private void lblExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseExited
        Tools.setBackground(Color.darkGray);
    }//GEN-LAST:event_lblExitMouseExited

    private void listMetodoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listMetodoMouseEntered
        listMetodo.setSelectionBackground(Color.lightGray);
    }//GEN-LAST:event_listMetodoMouseEntered

    private void listMetodoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listMetodoMouseExited
        listMetodo.setSelectionBackground(Color.GRAY);
    }//GEN-LAST:event_listMetodoMouseExited

    private void btnGraficarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGraficarMouseClicked
        
        //VALORES
        resultados.removeAllElements();
        nR = 0;
        int m = listMetodo.getSelectedIndex() + 1;
        int it = (Integer)sldIteraciones.getValue();
        double min = Double.parseDouble(txtmin.getText());
        double max = Double.parseDouble(txtmax.getText());
         
        //CONTENIDO DE LA ECUACION
        String def = txtfuncion.getText();
        double le = Double.parseDouble(txterror.getText());
        Funcion ff = new Funcion(def);
        Metodo s = new Metodo();
        
        //FUNCION RESULTADO.
        double r = s.metodoSecante(ff, max, min, it, le);
        resultados.add(nR, r);
        nR++;
        
        //PROCESO DE LA OPERACION
        double[] x = new double[it];
        double[] y = new double[it];
        double xi = max-10;
        for (int j = 0; j < it; j++) {
            x[j] = xi + j*0.1;
            y[j] = ff.evaluar(x[j]);
        }
        
        //FRAME PARA LA GRAFICA
        grafica2D.addLinePlot("Funciones",x, y);
        JFrame frame = new JFrame("Grafica de funciones");
        frame.setSize(500, 500);
        frame.setContentPane(grafica2D);
        frame.setVisible(true);
    }//GEN-LAST:event_btnGraficarMouseClicked

    private void btnGraficarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGraficarMouseEntered
        Graficar.setBackground(Color.GRAY);
    }//GEN-LAST:event_btnGraficarMouseEntered

    private void btnGraficarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGraficarMouseExited
        Graficar.setBackground(Color.darkGray);
    }//GEN-LAST:event_btnGraficarMouseExited

 
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DownPanel;
    private javax.swing.JPanel Graficar;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel Tools;
    private javax.swing.JLabel btnGraficar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblExit;
    private javax.swing.JList<String> listMetodo;
    private javax.swing.JList<String> listResultados;
    private javax.swing.JSlider sldIteraciones;
    private javax.swing.JTextField txtIteraciones;
    private javax.swing.JTextField txterror;
    private javax.swing.JTextField txtfuncion;
    private javax.swing.JTextField txtmax;
    private javax.swing.JTextField txtmin;
    // End of variables declaration//GEN-END:variables
Plot2DPanel grafica2D = new Plot2DPanel("SOUTH");
}
