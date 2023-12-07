package Interfacez;

import java.awt.Dimension;
import javax.swing.JInternalFrame;
import Modelo.EntidadVendedor;

public class Principal extends javax.swing.JFrame {
    
    EntidadVendedor ev=null;
    public Principal(EntidadVendedor ev) {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        this.ev=ev;
    }

VendedorForm v = new VendedorForm();
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        VentanaPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuCobro = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jmenuReportes = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        MenuVendedor = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        VentanaPrincipal.setBackground(new java.awt.Color(255, 255, 204));
        VentanaPrincipal.setForeground(new java.awt.Color(0, 51, 255));

        javax.swing.GroupLayout VentanaPrincipalLayout = new javax.swing.GroupLayout(VentanaPrincipal);
        VentanaPrincipal.setLayout(VentanaPrincipalLayout);
        VentanaPrincipalLayout.setHorizontalGroup(
            VentanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 614, Short.MAX_VALUE)
        );
        VentanaPrincipalLayout.setVerticalGroup(
            VentanaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 521, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/menu.png"))); // NOI18N
        jMenu1.setText("Menu");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/salir.png"))); // NOI18N
        jMenuItem2.setText("Cerrar sesion");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/logoventas.png"))); // NOI18N
        jMenu2.setText("Ventas");

        menuCobro.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuCobro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Cobrar.png"))); // NOI18N
        menuCobro.setText("Control de cobro");
        menuCobro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuCobroMousePressed(evt);
            }
        });
        menuCobro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCobroActionPerformed(evt);
            }
        });
        jMenu2.add(menuCobro);

        jMenuBar1.add(jMenu2);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/reportes.png"))); // NOI18N
        jMenu4.setText("Reportes");

        jmenuReportes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmenuReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/home.png"))); // NOI18N
        jmenuReportes.setText("Reporte de Ventas");
        jmenuReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenuReportesActionPerformed(evt);
            }
        });
        jMenu4.add(jmenuReportes);

        jMenuBar1.add(jMenu4);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/add.png"))); // NOI18N
        jMenu3.setText("Registros");

        MenuVendedor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_DOWN_MASK));
        MenuVendedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/vendedor_1.png"))); // NOI18N
        MenuVendedor.setText("Vendedor");
        MenuVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuVendedorActionPerformed(evt);
            }
        });
        jMenu3.add(MenuVendedor);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/producto.png"))); // NOI18N
        jMenuItem1.setText("Producto");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VentanaPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VentanaPrincipal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       // int r=JOptionPane.showConfirmDialog(null,"Esta seguro que desea cerrar sesion?");
       // if(r==0){
//           System.exit(0);
           this.setVisible(false);
            new LoginForm().setVisible(true);
      //  }
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    
    
    private void menuCobroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCobroActionPerformed

            VentasForm vf = new VentasForm(this.ev);
        CentrarVentana(vf);
    
        

      
    }//GEN-LAST:event_menuCobroActionPerformed

    private void MenuVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuVendedorActionPerformed
     VendedorForm v = new VendedorForm();
        CentrarVentana(v);
    }//GEN-LAST:event_MenuVendedorActionPerformed



    private void jmenuReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenuReportesActionPerformed
         ReporteVentas rp=new ReporteVentas();
        CentrarVentana(rp);
    }//GEN-LAST:event_jmenuReportesActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
         ProductoForm pf = new ProductoForm();
        CentrarVentana(pf);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void menuCobroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuCobroMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuCobroMousePressed
    
    public static void CentrarVentana(JInternalFrame frame) {
        VentanaPrincipal.add(frame);
        Dimension dimension = VentanaPrincipal.getSize();
        Dimension Dframe = frame.getSize();
        frame.setLocation((dimension.width - Dframe.width) / 2, (dimension.height - Dframe.height) / 2);
        frame.show();
        
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuVendedor;
    public static javax.swing.JDesktopPane VentanaPrincipal;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jmenuReportes;
    private javax.swing.JMenuItem menuCobro;
    // End of variables declaration//GEN-END:variables
}

