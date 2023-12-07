package Interfacez;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import ModeloDAO.VentasDAO;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterJob;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.CentrarTextoTabla;
import utils.ImprimirObject;

public class Imprimir extends javax.swing.JInternalFrame implements Printable  {

 ImprimirObject io = null;

    public Imprimir() {
        initComponents();
        imprimir();
    }
  

//    private Imprimir(JFrame jFrame, boolean b) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    final void imprimir() {
       // DecimalFormat dfoFormat = new DecimalFormat("#,###.00");
        SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");
        DefaultTableModel model = (DefaultTableModel) jTableImprimir.getModel();
        io = VentasDAO.getDocumento(VentasDAO.IdVenta());

        txtSerie.setText("Nro Serie:  " + io.getNroSerie());
        txtDatosVendedor.setText("VENDEDOR:  " + io.getUserName());
        txtFecha.setText("FECHA: " + io.getFecha() +" ---- "+ " HORA: " + dateFormat.format(new Date().getTime()));
        io.getDetalle().forEach(object -> {
            model.addRow(object);
        });
        jTableImprimir.setModel(model);
        txtTotalPagar.setText("$"+io.getTotalPagar());
        CentrarTextoTabla.centrarText2(jTableImprimir);
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelImprimir = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableImprimir = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtSerie = new javax.swing.JLabel();
        txtDatosVendedor = new javax.swing.JLabel();
        txtTotalPagar = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtMensaje = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JLabel();
        txtFecha = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 204));
        setClosable(true);

        jPanelImprimir.setBackground(new java.awt.Color(255, 255, 255));
        jPanelImprimir.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelImprimir.setForeground(new java.awt.Color(153, 153, 153));

        jTableImprimir.setForeground(new java.awt.Color(102, 102, 102));
        jTableImprimir.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "PRODUCTO", "PRECIO", "CANT", "TOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableImprimir.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jTableImprimir);
        if (jTableImprimir.getColumnModel().getColumnCount() > 0) {
            jTableImprimir.getColumnModel().getColumn(0).setMinWidth(40);
            jTableImprimir.getColumnModel().getColumn(0).setPreferredWidth(40);
            jTableImprimir.getColumnModel().getColumn(0).setMaxWidth(40);
            jTableImprimir.getColumnModel().getColumn(2).setMinWidth(80);
            jTableImprimir.getColumnModel().getColumn(2).setPreferredWidth(80);
            jTableImprimir.getColumnModel().getColumn(2).setMaxWidth(80);
            jTableImprimir.getColumnModel().getColumn(3).setMinWidth(60);
            jTableImprimir.getColumnModel().getColumn(3).setPreferredWidth(60);
            jTableImprimir.getColumnModel().getColumn(3).setMaxWidth(60);
            jTableImprimir.getColumnModel().getColumn(4).setMinWidth(80);
            jTableImprimir.getColumnModel().getColumn(4).setPreferredWidth(80);
            jTableImprimir.getColumnModel().getColumn(4).setMaxWidth(80);
        }

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("HAWAIIAN PARADISE");

        txtSerie.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtSerie.setForeground(new java.awt.Color(153, 153, 153));
        txtSerie.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtSerie.setText("0000000001");

        txtDatosVendedor.setForeground(new java.awt.Color(153, 153, 153));
        txtDatosVendedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtDatosVendedor.setText("Datos del Vendedor..........................");

        txtTotalPagar.setForeground(new java.awt.Color(153, 153, 153));
        txtTotalPagar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtTotalPagar.setText("0.00");

        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("TOTAL A PAGAR :");

        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("______________________________________________________________________");

        txtMensaje.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtMensaje.setForeground(new java.awt.Color(153, 153, 153));
        txtMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtMensaje.setText("Gracias por su compra");

        txtDireccion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtDireccion.setForeground(new java.awt.Color(153, 153, 153));
        txtDireccion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtDireccion.setText("Tlapa de Comonfort, Gro.  Av.Lazaro Cardenaz. Col. Tepeyac. #115");

        txtFecha.setForeground(new java.awt.Color(153, 153, 153));
        txtFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtFecha.setText("Fecha y hora");

        javax.swing.GroupLayout jPanelImprimirLayout = new javax.swing.GroupLayout(jPanelImprimir);
        jPanelImprimir.setLayout(jPanelImprimirLayout);
        jPanelImprimirLayout.setHorizontalGroup(
            jPanelImprimirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelImprimirLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelImprimirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSerie, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
                    .addComponent(txtDatosVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelImprimirLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtMensaje, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelImprimirLayout.setVerticalGroup(
            jPanelImprimirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelImprimirLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(17, 17, 17)
                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(jPanelImprimirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotalPagar)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDatosVendedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFecha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/impresora2.png"))); // NOI18N
        jButton1.setText("Imprimir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelImprimir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         try {
  PrinterJob job = PrinterJob.getPrinterJob();
  job.setPrintable(this);
  job.printDialog();
  job.print();
} catch (PrinterException ex) {
  Logger.getLogger(Imprimir.class.getName()).log(Level.SEVERE, null, ex);
}  
     dispose();         
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelImprimir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableImprimir;
    private javax.swing.JLabel txtDatosVendedor;
    private javax.swing.JLabel txtDireccion;
    private javax.swing.JLabel txtFecha;
    private javax.swing.JLabel txtMensaje;
    private javax.swing.JLabel txtSerie;
    private javax.swing.JLabel txtTotalPagar;
    // End of variables declaration//GEN-END:variables

      


 @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
if (pageIndex > 0) { 
  return NO_SUCH_PAGE;
}

Graphics2D g2d = (Graphics2D)graphics;
g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());

jPanelImprimir.printAll(graphics);

return PAGE_EXISTS;

}
}


