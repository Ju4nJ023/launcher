
package poyecto.rino;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class _maniobras extends javax.swing.JFrame {
 ImageIcon Imagen[]=new ImageIcon[5];
 int contador=0;
    public _maniobras() {
        initComponents();
        this.setTitle("Visor de imagenes");
        for(int a=0;a<5;a++){
            Imagen[a]=new ImageIcon(getClass().getResource("/imagesGame/Extincion"+a+".png"));
            jLabel6.setIcon(Imagen[0]);
        }
        Texto.setText(Descripcion);
    }
    public String Descripcion = 
            "<html>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua<br>"
            + "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.<br><br>"
            + "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.<br>"
            + "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.<br><br>";


    public JPanel getPanelP1() {
    return p1; // Suponiendo que p1 es el JPanel que deseas devolver
}

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        circulos = new javax.swing.JPanel();
        boton1 = new javax.swing.JLabel();
        boton2 = new javax.swing.JLabel();
        boton3 = new javax.swing.JLabel();
        boton4 = new javax.swing.JLabel();
        boton5 = new javax.swing.JLabel();
        descripcion = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Texto = new javax.swing.JLabel();
        comenzar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        p1.setBackground(new java.awt.Color(0, 39, 75));
        p1.setPreferredSize(new java.awt.Dimension(1500, 800));
        p1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setBackground(new java.awt.Color(0, 39, 75));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesGame/Flecha derecha.png"))); // NOI18N
        jButton3.setBorderPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        p1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 140, 45, 43));

        jButton2.setBackground(new java.awt.Color(0, 39, 75));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesGame/Flecha izquierda.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        p1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 44, 42));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(170, 227, 252)));
        p1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 640, 290));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesGame/Cuadrado.png"))); // NOI18N
        p1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 790, 200));

        circulos.setOpaque(false);

        boton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesGame/PuntoCarruselFilled.png"))); // NOI18N
        boton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton1MouseClicked(evt);
            }
        });

        boton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesGame/PuntoCarruselEmpty.png"))); // NOI18N
        boton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton2MouseClicked(evt);
            }
        });

        boton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesGame/PuntoCarruselEmpty.png"))); // NOI18N
        boton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton3MouseClicked(evt);
            }
        });

        boton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesGame/PuntoCarruselEmpty.png"))); // NOI18N
        boton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton4MouseClicked(evt);
            }
        });

        boton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesGame/PuntoCarruselEmpty.png"))); // NOI18N
        boton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout circulosLayout = new javax.swing.GroupLayout(circulos);
        circulos.setLayout(circulosLayout);
        circulosLayout.setHorizontalGroup(
            circulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(circulosLayout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(boton1)
                .addGap(18, 18, 18)
                .addComponent(boton2)
                .addGap(18, 18, 18)
                .addComponent(boton3)
                .addGap(18, 18, 18)
                .addComponent(boton4)
                .addGap(18, 18, 18)
                .addComponent(boton5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        circulosLayout.setVerticalGroup(
            circulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(circulosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(circulosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boton5)
                    .addComponent(boton4)
                    .addComponent(boton3)
                    .addComponent(boton2)
                    .addComponent(boton1))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        p1.add(circulos, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, 490, 40));

        descripcion.setOpaque(false);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesGame/Barrita aislada descripci¢n.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Raleway", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Maniobra de extinción segun la instalacíon");

        Texto.setFont(new java.awt.Font("Raleway Medium", 0, 14)); // NOI18N
        Texto.setForeground(new java.awt.Color(255, 255, 255));
        Texto.setText("<html> Lorem ipsum dolor sit amet, g elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua Lorem ipsum dolor<br> st,sectetur adipiscing elit, sed do eiusmod .<br> Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea <br> <br> commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.<br> <br> Excepteur sint occaecat cupidatat non proident,<br> <br> sunt in culpa qui officia deserunt mollit<br> <br> anim id est laborum.<br> </html>");

        javax.swing.GroupLayout descripcionLayout = new javax.swing.GroupLayout(descripcion);
        descripcion.setLayout(descripcionLayout);
        descripcionLayout.setHorizontalGroup(
            descripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(descripcionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addContainerGap(444, Short.MAX_VALUE))
            .addComponent(Texto, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        descripcionLayout.setVerticalGroup(
            descripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(descripcionLayout.createSequentialGroup()
                .addGroup(descripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(Texto, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        p1.add(descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, -1, 330));

        comenzar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesGame/Comenzar.png"))); // NOI18N
        p1.add(comenzar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 700, 260, 50));

        getContentPane().add(p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 20, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         contador = (contador + 1) % 5;
    jLabel6.setIcon(Imagen[contador]);
    actualizarIndicadores();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        contador = (contador - 1 + 5) % 5;
    jLabel6.setIcon(Imagen[contador]);
    actualizarIndicadores();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void boton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton1MouseClicked
        contador = 0;
            jLabel6.setIcon(Imagen[contador]);
            actualizarIndicadores();
    }//GEN-LAST:event_boton1MouseClicked

    private void boton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton2MouseClicked
        contador = 1;
            jLabel6.setIcon(Imagen[contador]);
            actualizarIndicadores();
    }//GEN-LAST:event_boton2MouseClicked

    private void boton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton3MouseClicked
        contador = 2;
            jLabel6.setIcon(Imagen[contador]);
            actualizarIndicadores();
    }//GEN-LAST:event_boton3MouseClicked

    private void boton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton4MouseClicked
        contador = 3;
            jLabel6.setIcon(Imagen[contador]);
            actualizarIndicadores();
    }//GEN-LAST:event_boton4MouseClicked

    private void boton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton5MouseClicked
        contador = 4;
            jLabel6.setIcon(Imagen[contador]);
            actualizarIndicadores();
    }//GEN-LAST:event_boton5MouseClicked

    private void actualizarIndicadores() {
    int botonAnterior = contador == 0 ? 4 : contador - 1;
    switch (botonAnterior) {
        case 0:
            boton1.setIcon(new ImageIcon(getClass().getResource("/imagesGame/PuntoCarruselEmpty.png")));
            break;
        case 1:
            boton2.setIcon(new ImageIcon(getClass().getResource("/imagesGame/PuntoCarruselEmpty.png")));
            break;
        case 2:
            boton3.setIcon(new ImageIcon(getClass().getResource("/imagesGame/PuntoCarruselEmpty.png")));
            break;
        case 3:
            boton4.setIcon(new ImageIcon(getClass().getResource("/imagesGame/PuntoCarruselEmpty.png")));
            break;
        case 4:
            boton5.setIcon(new ImageIcon(getClass().getResource("/imagesGame/PuntoCarruselEmpty.png")));
            break;
    }

    boton1.setIcon(new ImageIcon(getClass().getResource("/imagesGame/PuntoCarrusel" + (contador == 0 ? "Filled" : "Empty") + ".png")));
    boton2.setIcon(new ImageIcon(getClass().getResource("/imagesGame/PuntoCarrusel" + (contador == 1 ? "Filled" : "Empty") + ".png")));
    boton3.setIcon(new ImageIcon(getClass().getResource("/imagesGame/PuntoCarrusel" + (contador == 2 ? "Filled" : "Empty") + ".png")));
    boton4.setIcon(new ImageIcon(getClass().getResource("/imagesGame/PuntoCarrusel" + (contador == 3 ? "Filled" : "Empty") + ".png")));
    boton5.setIcon(new ImageIcon(getClass().getResource("/imagesGame/PuntoCarrusel" + (contador == 4 ? "Filled" : "Empty") + ".png")));
}
   
    public static void main(String args[]) {
    

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new _maniobras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Texto;
    private javax.swing.JLabel boton1;
    private javax.swing.JLabel boton2;
    private javax.swing.JLabel boton3;
    private javax.swing.JLabel boton4;
    private javax.swing.JLabel boton5;
    private javax.swing.JPanel circulos;
    private javax.swing.JLabel comenzar;
    private javax.swing.JPanel descripcion;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel p1;
    // End of variables declaration//GEN-END:variables
}