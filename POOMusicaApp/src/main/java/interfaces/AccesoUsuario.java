
package interfaces;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author soniasanchezhidalgo
 */
public class AccesoUsuario extends javax.swing.JFrame {

    /**
     * Creates new form AccesoUsuario
     */
    public AccesoUsuario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        background = new javax.swing.JPanel();
        bienvienido1 = new javax.swing.JLabel();
        tf_iniciaReg = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        tf_nombre = new javax.swing.JTextField();
        aPaterno = new javax.swing.JLabel();
        tf_aPaterno = new javax.swing.JTextField();
        aMaterno = new javax.swing.JLabel();
        tf_aMaterno = new javax.swing.JTextField();
        aMaterno1 = new javax.swing.JLabel();
        tf_aMaterno1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(238, 229, 242));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bienvienido1.setFont(new java.awt.Font("Fredoka", 1, 36)); // NOI18N
        bienvienido1.setForeground(new java.awt.Color(96, 39, 125));
        bienvienido1.setText("Bienvenido");
        bienvienido1.setMaximumSize(new java.awt.Dimension(128, 34));
        bienvienido1.setPreferredSize(new java.awt.Dimension(128, 17));
        background.add(bienvienido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 190, 30));

        tf_iniciaReg.setFont(new java.awt.Font("Fredoka", 1, 18)); // NOI18N
        tf_iniciaReg.setForeground(new java.awt.Color(96, 39, 125));
        tf_iniciaReg.setText("Inicia tu registro");
        background.add(tf_iniciaReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 140, 20));

        nombre.setFont(new java.awt.Font("Fredoka", 1, 13)); // NOI18N
        nombre.setForeground(new java.awt.Color(96, 39, 125));
        nombre.setText("Nombre");
        background.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 60, 30));

        tf_nombre.setForeground(new java.awt.Color(105, 58, 128));
        tf_nombre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(105, 58, 128), 1, true));
        tf_nombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tf_nombre.setDisabledTextColor(new java.awt.Color(105, 58, 128));
        tf_nombre.setSelectionColor(new java.awt.Color(105, 58, 128));
        tf_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nombreActionPerformed(evt);
            }
        });
        background.add(tf_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 290, 30));

        aPaterno.setFont(new java.awt.Font("Fredoka", 1, 13)); // NOI18N
        aPaterno.setForeground(new java.awt.Color(96, 39, 125));
        aPaterno.setText("Apellido Paterno");
        background.add(aPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 110, 30));

        tf_aPaterno.setForeground(new java.awt.Color(105, 58, 128));
        tf_aPaterno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(105, 58, 128)));
        background.add(tf_aPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 290, 30));

        aMaterno.setFont(new java.awt.Font("Fredoka", 1, 13)); // NOI18N
        aMaterno.setForeground(new java.awt.Color(96, 39, 125));
        aMaterno.setText("Apellido Materno");
        background.add(aMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 110, 30));

        tf_aMaterno.setForeground(new java.awt.Color(105, 58, 128));
        tf_aMaterno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(105, 58, 128)));
        background.add(tf_aMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 290, 30));

        aMaterno1.setFont(new java.awt.Font("Fredoka", 1, 13)); // NOI18N
        aMaterno1.setForeground(new java.awt.Color(96, 39, 125));
        aMaterno1.setText("Correo electronico");
        background.add(aMaterno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 120, 30));

        tf_aMaterno1.setForeground(new java.awt.Color(105, 58, 128));
        tf_aMaterno1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(105, 58, 128)));
        background.add(tf_aMaterno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 290, 30));

        jButton1.setBackground(new java.awt.Color(96, 39, 125));
        jButton1.setFont(new java.awt.Font("Fredoka", 1, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(238, 229, 242));
        jButton1.setText("Finalizar");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        background.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 480, 130, 40));
        background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 150, 140));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void tf_nombreActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

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
            java.util.logging.Logger.getLogger(AccesoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AccesoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AccesoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AccesoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AccesoUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel aMaterno;
    private javax.swing.JLabel aMaterno1;
    private javax.swing.JLabel aPaterno;
    private javax.swing.JPanel background;
    private javax.swing.JLabel bienvienido1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel nombre;
    private javax.swing.JTextField tf_aMaterno;
    private javax.swing.JTextField tf_aMaterno1;
    private javax.swing.JTextField tf_aPaterno;
    private javax.swing.JLabel tf_iniciaReg;
    private javax.swing.JTextField tf_nombre;
    // End of variables declaration                   
}
