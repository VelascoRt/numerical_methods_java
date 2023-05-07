
package vista;

import controlador.Operaciones;
import java.awt.Color;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Interfaz extends javax.swing.JFrame {

    int xMouse, yMouse;
    int nR = 0;
    DefaultListModel resultados = new DefaultListModel();
    public Interfaz() {
        initComponents();
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
        jLabel8 = new javax.swing.JLabel();
        txtc = new javax.swing.JTextField();
        Aceptar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        sldIteraciones = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();
        cbxDatos = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        txtd = new javax.swing.JTextField();
        txte = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listEc = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listResultados = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        txtIteraciones = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txta = new javax.swing.JTextField();
        txtb = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtmin = new javax.swing.JTextField();
        txtmax = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

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
            String[] strings = { "Bisección", "Falsa Posición", "Newton Raphson", "Método de la secante", "Método de raíces múltiples" };
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

        jLabel8.setFont(new java.awt.Font("Ebrima", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("c");

        txtc.setBackground(new java.awt.Color(51, 51, 51));
        txtc.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        txtc.setForeground(new java.awt.Color(255, 255, 255));
        txtc.setText("0");

        Aceptar.setBackground(java.awt.Color.darkGray);
        Aceptar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jLabel4.setFont(new java.awt.Font("Ebrima", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ACEPTAR");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });

        javax.swing.GroupLayout AceptarLayout = new javax.swing.GroupLayout(Aceptar);
        Aceptar.setLayout(AceptarLayout);
        AceptarLayout.setHorizontalGroup(
            AceptarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
        );
        AceptarLayout.setVerticalGroup(
            AceptarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        sldIteraciones.setBackground(java.awt.Color.darkGray);
        sldIteraciones.setForeground(new java.awt.Color(255, 255, 255));
        sldIteraciones.setMajorTickSpacing(50);
        sldIteraciones.setMaximum(150);
        sldIteraciones.setMinimum(50);
        sldIteraciones.setMinorTickSpacing(20);
        sldIteraciones.setPaintLabels(true);
        sldIteraciones.setPaintTicks(true);
        sldIteraciones.setSnapToTicks(true);

        jLabel2.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Número de resultados:");

        cbxDatos.setBackground(new java.awt.Color(51, 51, 51));
        cbxDatos.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        cbxDatos.setForeground(new java.awt.Color(255, 255, 255));
        cbxDatos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Un solo valor", "Cuadratica", "Cúbica", "Bicuadrada", "Seno, Coseno" }));

        jLabel14.setFont(new java.awt.Font("Ebrima", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("d");

        txtd.setBackground(new java.awt.Color(51, 51, 51));
        txtd.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        txtd.setForeground(new java.awt.Color(255, 255, 255));
        txtd.setText("0");

        txte.setBackground(new java.awt.Color(51, 51, 51));
        txte.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        txte.setForeground(new java.awt.Color(255, 255, 255));
        txte.setText("0");

        jLabel15.setFont(new java.awt.Font("Ebrima", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("e");

        javax.swing.GroupLayout DownPanelLayout = new javax.swing.GroupLayout(DownPanel);
        DownPanel.setLayout(DownPanelLayout);
        DownPanelLayout.setHorizontalGroup(
            DownPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DownPanelLayout.createSequentialGroup()
                .addGroup(DownPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DownPanelLayout.createSequentialGroup()
                        .addGap(332, 332, 332)
                        .addComponent(cbxDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DownPanelLayout.createSequentialGroup()
                        .addGap(301, 301, 301)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(249, Short.MAX_VALUE))
            .addGroup(DownPanelLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(DownPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(DownPanelLayout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtd, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DownPanelLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtc, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DownPanelLayout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txte, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sldIteraciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(Aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );
        DownPanelLayout.setVerticalGroup(
            DownPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DownPanelLayout.createSequentialGroup()
                .addGroup(DownPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sldIteraciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DownPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)))
                .addGap(9, 9, 9)
                .addGroup(DownPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addGroup(DownPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14)))
                .addGap(2, 2, 2)
                .addGroup(DownPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(DownPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txte, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15)))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        jPanel1.add(DownPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 780, 140));

        listEc.setBackground(new java.awt.Color(51, 51, 51));
        listEc.setFont(new java.awt.Font("Roboto Light", 0, 12)); // NOI18N
        listEc.setForeground(new java.awt.Color(255, 255, 255));
        listEc.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "a / (x+c)", "e^x + b - x", "x^3 + b*x^2 + c", "ax^2 + bx + c", "ax^3 + bx^2 + cx + d", "asen(x)", "x + a", "ax^2 + b", "ax^4 + bx^2 + c", "ax^4 + bx^3 + cx^2 + dx + e", "a^x + b", "logx (a + b)", "raiz(x + a)", "(ax^2 + bx + c)/dx", "(x/x-1) + (2x/x+1)" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listEc.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(listEc);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 190, 120));

        jLabel3.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Escoge el método númerico a utilizar:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, -1, -1));

        jLabel1.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Escoge la ecuación a utilizar:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

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

        jLabel7.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Escriba los valores a despejar:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 190, -1));

        jLabel9.setFont(new java.awt.Font("Ebrima", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("a");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 30, -1));

        jLabel10.setFont(new java.awt.Font("Ebrima", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("b");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 30, -1));

        txta.setBackground(new java.awt.Color(51, 51, 51));
        txta.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        txta.setForeground(new java.awt.Color(255, 255, 255));
        txta.setText("0");
        jPanel1.add(txta, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 140, 30));

        txtb.setBackground(new java.awt.Color(51, 51, 51));
        txtb.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        txtb.setForeground(new java.awt.Color(255, 255, 255));
        txtb.setText("0");
        txtb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbActionPerformed(evt);
            }
        });
        jPanel1.add(txtb, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 140, 30));

        jLabel13.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Número de iteraciones:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 230, -1));

        txtmin.setBackground(new java.awt.Color(51, 51, 51));
        txtmin.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        txtmin.setForeground(new java.awt.Color(255, 255, 255));
        txtmin.setText("0");
        jPanel1.add(txtmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, 140, 30));

        txtmax.setBackground(new java.awt.Color(51, 51, 51));
        txtmax.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        txtmax.setForeground(new java.awt.Color(255, 255, 255));
        txtmax.setText("0");
        jPanel1.add(txtmax, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 490, 140, 30));

        jLabel12.setFont(new java.awt.Font("Ebrima", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("max");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 55, -1));

        jLabel11.setFont(new java.awt.Font("Ebrima", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("min");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 55, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
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

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
       Aceptar.setBackground(Color.GRAY);
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        Aceptar.setBackground(Color.darkGray);
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        resultados.removeAllElements();
        nR = 0;
        int i = listEc.getSelectedIndex() + 1;
        int m = listMetodo.getSelectedIndex() + 1;
        int it = (Integer)sldIteraciones.getValue();
        double a = Double.parseDouble(txta.getText());
        double b = Double.parseDouble(txtb.getText());
        double c = Double.parseDouble(txtc.getText());
        double d = Double.parseDouble(txtd.getText());
        double e = Double.parseDouble(txte.getText());
        double min = Double.parseDouble(txtmin.getText());
        double max = Double.parseDouble(txtmax.getText());
        int datos = cbxDatos.getSelectedIndex() + 1;
        int mt = 0;
        double temp = 0;
        
        double resultado = 0;
        double temporal = 0;
        
        try {
            switch (datos) {
                
                case 1:
                    resultado = controlador.Operaciones.metodoNumerico(min, max, a, b, c, d, e, i, m, it, datos);
                    resultados.add(nR, resultado);
                    txtIteraciones.setText(String.valueOf(controlador.Operaciones.iteraciones));
                    nR++;
                    break;
                case 2:
                if((m == 3) && (m == 6)){
                    resultado = controlador.Operaciones.metodoNumerico(0, min, a, b, c, d, e, i, m, it, datos);
                    resultados.add(nR, resultado);
                    nR++;
                    temporal = resultado;
                    resultado = controlador.Operaciones.metodoNumerico(0, max, a, b, c, d, e, i, m, it, datos);
                    resultados.add(nR, resultado);
                    txtIteraciones.setText(String.valueOf(controlador.Operaciones.iteraciones));
                    nR++;
                } else {
                    resultado = controlador.Operaciones.metodoNumerico(min, 0, a, b, c, d, e, i, m, it, datos);
                    resultados.add(nR, resultado);
                    nR++;
                    resultado = controlador.Operaciones.metodoNumerico(0, max, a, b, c, d, e, i, m, it, datos);
                    resultados.add(nR, resultado);
                    txtIteraciones.setText(String.valueOf(controlador.Operaciones.iteraciones));
                    nR++;
                    txtIteraciones.setText(String.valueOf(controlador.Operaciones.iteraciones));
                }
                    break;
                case 3:
                    mt = m;
                    resultado = controlador.Operaciones.metodoNumerico(min, 0, a, b, c, d, e, i, m, it, datos);
                    resultados.add(nR, resultado);
                    nR++;
                    temp = resultado;
                    
                    while (nR ==1) {    
                        resultado = controlador.Operaciones.metodoNumerico(min, temp, a, b, c, d, e, i, m, it, datos);
                        if (resultado != temp) {
                            resultados.add(nR, resultado);
                            nR++;
                        }
                        resultado = controlador.Operaciones.metodoNumerico(temp, 0, a, b, c, d, e, i, m, it, datos);
                        if (resultado != temp) {
                            resultados.add(nR, resultado);
                            nR++;
                        }
                        m = 1;
                    }
                    
                    m = mt;
                    resultado = controlador.Operaciones.metodoNumerico(0, max, a, b, c, d, e, i, m, it, datos);
                    resultados.add(nR, resultado);
                    nR++;
                    temp = resultado;
                    
                    while (nR == 2) {    
                        resultado = controlador.Operaciones.metodoNumerico(0, temp, a, b, c, d, e, i, m, it, datos);
                        if (resultado != temp) {
                            resultados.add(nR, resultado);
                            nR++;
                        }
                        resultado = controlador.Operaciones.metodoNumerico(temp,  max, a, b, c, d, e, i, m, it, datos);
                        if (resultado != temp) {
                            resultados.add(nR, resultado);
                            nR++;
                        }
                        m = 1;
                    }
                    
                    txtIteraciones.setText(String.valueOf(controlador.Operaciones.iteraciones));
                    break;
                case 4:
                    resultado = controlador.Operaciones.metodoNumerico(min, 0, a, b, c, d, e, i, m, it, datos);
                    resultados.add(nR, resultado);
                    nR++;
                    temp = resultado;
                    
                    while (nR ==1) {    
                        resultado = controlador.Operaciones.metodoNumerico(min, temp, a, b, c, d, e, i, m, it, datos);
                        if (resultado != temp) {
                            resultados.add(nR, resultado);
                            nR++;
                        }
                        resultado = controlador.Operaciones.metodoNumerico(temp, 0, a, b, c, d, e, i, m, it, datos);
                        if (resultado != temp) {
                            resultados.add(nR, resultado);
                            nR++;
                        }
                    }
                    resultados.add(nR, Math.abs(resultado));
                    nR++;
                    resultados.add(nR, Math.abs(temp));
                    txtIteraciones.setText(String.valueOf(controlador.Operaciones.iteraciones));
                case 5:
                    if ((m == 3) && (m == 6)) {
                        resultado = controlador.Operaciones.metodoNumerico(0, min, a, b, c, d, e, i, m, it, datos);
                        resultados.add(nR, resultado);
                        nR++;
                        temporal = resultado;
                        resultado = controlador.Operaciones.metodoNumerico(0, max, a, b, c, d, e, i, m, it, datos);
                        resultados.add(nR, resultado);
                        txtIteraciones.setText(String.valueOf(controlador.Operaciones.iteraciones));
                        nR++;
                    } else {
                        resultado = controlador.Operaciones.metodoNumerico(min, 0, a, b, c, d, e, i, m, it, datos);
                        resultados.add(nR, resultado);
                        nR++;
                        resultado = controlador.Operaciones.metodoNumerico(0, max, a, b, c, d, e, i, m, it, datos);
                        resultados.add(nR, resultado);
                        txtIteraciones.setText(String.valueOf(controlador.Operaciones.iteraciones));
                        nR++;
                    }
                    double continuo = Math.abs((0-temporal)) + Math.abs(0-resultado);
                    resultados.add(nR, continuo);
                    txtIteraciones.setText(String.valueOf(controlador.Operaciones.iteraciones));
                    break;
                default:
                    throw new AssertionError();
            }
        } catch (Exception E) {
            JOptionPane.showMessageDialog(null, "Error", "Error de Insercion de datos", JOptionPane.ERROR_MESSAGE);
        }
        
        
        
    }//GEN-LAST:event_jLabel4MouseClicked

    private void txtbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbActionPerformed

 
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Aceptar;
    private javax.swing.JPanel DownPanel;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel Tools;
    private javax.swing.JComboBox<String> cbxDatos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblExit;
    private javax.swing.JList<String> listEc;
    private javax.swing.JList<String> listMetodo;
    private javax.swing.JList<String> listResultados;
    private javax.swing.JSlider sldIteraciones;
    private javax.swing.JTextField txtIteraciones;
    private javax.swing.JTextField txta;
    private javax.swing.JTextField txtb;
    private javax.swing.JTextField txtc;
    private javax.swing.JTextField txtd;
    private javax.swing.JTextField txte;
    private javax.swing.JTextField txtmax;
    private javax.swing.JTextField txtmin;
    // End of variables declaration//GEN-END:variables
}
