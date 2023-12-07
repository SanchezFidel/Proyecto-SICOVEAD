package Interfacez;

import Config.Fecha;
import Config.GenerarSerie;
import java.awt.Component;
import java.awt.Event;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Modelo.DetalleVentas;
import Modelo.EntidadVendedor;
import Modelo.Producto;
import ModeloDAO.ProductoDAO;
import Modelo.Ventas;
import ModeloDAO.VentasDAO;
import java.util.List;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import utils.Activate;
import utils.CentrarTextoTabla;
import utils.Constans;
import utils.Utils;
import validaciones.Libreria;

public final class VentasForm extends javax.swing.JInternalFrame {
   // ProductoDAO dao = new ProductoDAO();
Libreria lib=new Libreria();
    VentasDAO vdao = new VentasDAO();
    ProductoDAO pdao = new ProductoDAO();

    Producto p = new Producto();
    Ventas v = new Ventas();
    DetalleVentas dv = new DetalleVentas();


    DefaultTableModel modelo = new DefaultTableModel();
    int idp;
    int cant;
    double pre;
    double tpagar;
    private final EntidadVendedor vendedor;
    public VentasForm(EntidadVendedor ev) {
        initComponents();
        listarProducto();
        this.vendedor=ev;
        generarSerie();
        fecha();
        txtCantidad.setValue(1);
        txtVendedor.setText(ev.getNom());
        txtCantidad.setModel(Constans.SPINNER);
        Activate.On(new Component[]{btnBuscarProducto, btnAgregar, txtCodProd, txtPrecio});
    }
    
       void listarProducto() {
        modelo = (DefaultTableModel) tablaProducto.getModel();
        List<Producto> lista = pdao.listarProducto();
        Object[] object = new Object[4];

        DefaultTableCellRenderer render = new DefaultTableCellRenderer();
        render.setHorizontalAlignment(SwingConstants.CENTER);
        tablaProducto.getColumnModel().getColumn(0).setCellRenderer(render);        
        tablaProducto.getColumnModel().getColumn(2).setCellRenderer(render);
        tablaProducto.getColumnModel().getColumn(3).setCellRenderer(render);

        for (int i = 0; i < lista.size(); i++) {
            object[0] = lista.get(i).getId();
            object[1] = lista.get(i).getNom();
            object[2] = lista.get(i).getPre();
            object[3] = lista.get(i).getEstado();
            modelo.addRow(object);
        }
        tablaProducto.setModel(modelo);
    }
    
         void LimpiarTabla() {
        for (int i = 0; i < tablaProducto.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }
    void fecha() {
        Fecha fe = new Fecha();
        txtFecha.setText(fe.Fecha());
    }

    void generarSerie() {
        String serie = vdao.NroSerieVentas();
        if (serie == null) {
            txtSerie.setText("000000001");
        } else {
            int increment = Integer.parseInt(serie);
            GenerarSerie gs = new GenerarSerie();
            serie = gs.NumeroSerie(increment);
            txtSerie.setText(serie);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField7 = new javax.swing.JTextField();
        jScrollBar1 = new javax.swing.JScrollBar();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDetalle = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtCodProd = new javax.swing.JTextField();
        btnBuscarProducto = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtProducto = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JSpinner();
        jLabel13 = new javax.swing.JLabel();
        txtVendedor = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtSerie = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lblFoto = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtTotalPagar = new javax.swing.JTextField();
        btnGenerar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaProducto = new javax.swing.JTable();

        jTextField7.setText("jTextField7");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setBackground(new java.awt.Color(255, 255, 204));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Modulo de Cobro");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        TablaDetalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "COD", "PRODUCTO", "CANT", "$ C/U", "TOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaDetalle.setRowHeight(25);
        TablaDetalle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaDetalleMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaDetalle);
        if (TablaDetalle.getColumnModel().getColumnCount() > 0) {
            TablaDetalle.getColumnModel().getColumn(0).setMinWidth(30);
            TablaDetalle.getColumnModel().getColumn(0).setPreferredWidth(30);
            TablaDetalle.getColumnModel().getColumn(0).setMaxWidth(30);
            TablaDetalle.getColumnModel().getColumn(1).setMinWidth(80);
            TablaDetalle.getColumnModel().getColumn(1).setPreferredWidth(80);
            TablaDetalle.getColumnModel().getColumn(1).setMaxWidth(80);
            TablaDetalle.getColumnModel().getColumn(3).setMinWidth(40);
            TablaDetalle.getColumnModel().getColumn(3).setPreferredWidth(40);
            TablaDetalle.getColumnModel().getColumn(3).setMaxWidth(40);
            TablaDetalle.getColumnModel().getColumn(4).setMinWidth(60);
            TablaDetalle.getColumnModel().getColumn(4).setPreferredWidth(60);
            TablaDetalle.getColumnModel().getColumn(4).setMaxWidth(60);
            TablaDetalle.getColumnModel().getColumn(5).setMinWidth(80);
            TablaDetalle.getColumnModel().getColumn(5).setPreferredWidth(80);
            TablaDetalle.getColumnModel().getColumn(5).setMaxWidth(80);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("PRODUCTO");

        txtCodProd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtCodProd.setForeground(new java.awt.Color(0, 0, 255));
        txtCodProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodProdActionPerformed(evt);
            }
        });
        txtCodProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodProdKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodProdKeyTyped(evt);
            }
        });

        btnBuscarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/buscar_1.png"))); // NOI18N
        btnBuscarProducto.setText("Buscar");
        btnBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProductoActionPerformed(evt);
            }
        });

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("PRODUCTO :");

        txtProducto.setEditable(false);
        txtProducto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtProducto.setForeground(new java.awt.Color(0, 51, 255));
        txtProducto.setCaretColor(new java.awt.Color(0, 51, 255));
        txtProducto.setDisabledTextColor(new java.awt.Color(0, 51, 204));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("PRECIO :");

        txtPrecio.setEditable(false);
        txtPrecio.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtPrecio.setForeground(new java.awt.Color(0, 0, 255));
        txtPrecio.setEnabled(false);
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPrecioKeyPressed(evt);
            }
        });

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/add.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        btnAgregar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnAgregarKeyPressed(evt);
            }
        });

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("CANTIDAD :");

        txtCantidad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtCantidad.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCantidadKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("VENDEDOR :");

        txtVendedor.setEditable(false);
        txtVendedor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtVendedor.setForeground(new java.awt.Color(0, 51, 255));
        txtVendedor.setCaretColor(new java.awt.Color(0, 51, 255));
        txtVendedor.setDisabledTextColor(new java.awt.Color(0, 51, 204));

        txtFecha.setEditable(false);
        txtFecha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(0, 51, 255));
        txtFecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFecha.setCaretColor(new java.awt.Color(0, 51, 255));
        txtFecha.setDisabledTextColor(new java.awt.Color(0, 51, 204));

        txtStock.setEditable(false);
        txtStock.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPrecio)
                    .addComponent(txtCodProd)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtFecha))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                        .addComponent(txtProducto))
                    .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarProducto)
                    .addComponent(jLabel9)
                    .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtCodProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(txtVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAgregar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("HAWAIIAN PARADISE");

        txtSerie.setEditable(false);
        txtSerie.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtSerie.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("NUMERO DE VENTA: ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFoto, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(26, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/descarga.png"))); // NOI18N
        lblImagen.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblImagen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel14.setText("TOTAL A PAGAR :");

        txtTotalPagar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTotalPagar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotalPagar.setEnabled(false);

        btnGenerar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Cobrar.png"))); // NOI18N
        btnGenerar.setText("GENERAR VENTA");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cancelar_1.png"))); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGenerar)
                .addGap(34, 34, 34)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotalPagar)
                    .addComponent(jLabel14)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGenerar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tablaProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "PRODUCTO", "PRECIO", "ESTADO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProductoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaProducto);
        if (tablaProducto.getColumnModel().getColumnCount() > 0) {
            tablaProducto.getColumnModel().getColumn(0).setMinWidth(30);
            tablaProducto.getColumnModel().getColumn(0).setPreferredWidth(30);
            tablaProducto.getColumnModel().getColumn(0).setMaxWidth(40);
            tablaProducto.getColumnModel().getColumn(1).setMinWidth(100);
            tablaProducto.getColumnModel().getColumn(1).setPreferredWidth(100);
            tablaProducto.getColumnModel().getColumn(1).setMaxWidth(200);
            tablaProducto.getColumnModel().getColumn(2).setMinWidth(50);
            tablaProducto.getColumnModel().getColumn(2).setPreferredWidth(50);
            tablaProducto.getColumnModel().getColumn(2).setMaxWidth(100);
            tablaProducto.getColumnModel().getColumn(3).setMinWidth(50);
            tablaProducto.getColumnModel().getColumn(3).setPreferredWidth(50);
            tablaProducto.getColumnModel().getColumn(3).setMaxWidth(100);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductoActionPerformed
  buscarProducto();
    }//GEN-LAST:event_btnBuscarProductoActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if( txtPrecio.getText().equals("") ){
     JOptionPane.showMessageDialog(this, "Debe ingresar los datos del producto");
}else{
        agregarProducto();
    }//GEN-LAST:event_btnAgregarActionPerformed
    }
           
  
    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        if (txtTotalPagar.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Debe ingresar Datos");
        } else {

            guardarVenta();
            guardarDetalle();
            imprimir();
            nuevo();
            generarSerie();
  
        }
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        nuevo();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtCodProdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodProdKeyPressed
//        if (evt.getKeyCode() == Event.ENTER) {
//            buscarProducto();
//            txtPrecio.requestFocus();
//        }
    }//GEN-LAST:event_txtCodProdKeyPressed

    private void txtPrecioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyPressed
//        if (evt.getKeyCode() == Event.ENTER) {
//            btnAgregar.requestFocus();
//        }
    }//GEN-LAST:event_txtPrecioKeyPressed

    private void txtCantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyPressed
//        if (evt.getKeyCode() == Event.ENTER) {
//            agregarProducto();
//        }
    }//GEN-LAST:event_txtCantidadKeyPressed

    private void btnAgregarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnAgregarKeyPressed
  
//        if (evt.getKeyCode() == Event.ENTER) {
//            agregarProducto();
//        }
//            
     
    }//GEN-LAST:event_btnAgregarKeyPressed

    private void txtCodProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodProdActionPerformed

    private void txtCodProdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodProdKeyTyped
       lib.esNumeroEntero(evt);
    }//GEN-LAST:event_txtCodProdKeyTyped

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
      
    }//GEN-LAST:event_txtCantidadKeyTyped

    private void tablaProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProductoMouseClicked
       int fila = tablaProducto.getSelectedRow();
        if (fila >= 0) {
            String id = tablaProducto.getValueAt(fila, 0).toString();
            String nom = tablaProducto.getValueAt(fila, 1).toString();
            String precio = tablaProducto.getValueAt(fila, 2).toString();
          String estado = tablaProducto.getValueAt(fila, 3).toString();
            txtCodProd.setText(id);
            txtProducto.setText(nom);
            txtPrecio.setText(precio);
            txtStock.setText(estado);
        }
    }//GEN-LAST:event_tablaProductoMouseClicked

    private void TablaDetalleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaDetalleMouseClicked
//           int fila = TablaDetalle.getSelectedRow();
//        if (fila >= 0) {
//            String cod = TablaDetalle.getValueAt(fila, 1).toString();
//            String prod = TablaDetalle.getValueAt(fila, 2).toString();
//            String cant = TablaDetalle.getValueAt(fila, 3).toString();
//          String pre = TablaDetalle.getValueAt(fila, 4).toString();
//            txtCodProd.setText(cod);
//            txtProducto.setText(prod);
//            txtPrecio.setText(pre);
//           txtCantidad.setValue(cant);
//        }
    }//GEN-LAST:event_TablaDetalleMouseClicked
    void imprimir() {
        Imprimir imprimir = new Imprimir();
        
        Principal.CentrarVentana(imprimir);

    }

    void nuevo() {
        
        limpiarTabla();
        txtCantidad.setValue(1);
        txtCodProd.setText("");
        txtPrecio.setText("");
        txtProducto.setText("");
        txtStock.setText("");
        txtTotalPagar.setText("");
       
         

        Activate.On(new Component[]{btnBuscarProducto, txtCodProd});
    }
    
                           

 void limpiarTabla() {
        for (int i = 0; i < TablaDetalle.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }
    void guardarVenta() {

        String serie = txtSerie.getText();
        String fecha = Fecha.FechaBD();
        double monto = tpagar;
        v.setIdVendedor(vendedor.getId());
        v.setSerie(serie);
        v.setFecha(fecha);
        v.setMonto(monto);
        vdao.GuardarVentas(v);

    }

    void guardarDetalle() {
        String idv = vdao.IdVentas();
        int idve = Integer.parseInt(idv);
        for (int i = 0; i < TablaDetalle.getRowCount(); i++) {
            int idProdDet = Integer.parseInt(TablaDetalle.getValueAt(i, 1).toString());
            int cantProdDet = Integer.parseInt(TablaDetalle.getValueAt(i, 3).toString());
            double preProdDet = Double.parseDouble(TablaDetalle.getValueAt(i, 4).toString());
            dv.setIdVentas(idve);
            dv.setIdProducto(idProdDet);
            dv.setCantidad(cantProdDet);
            dv.setPreVenta(preProdDet);
            vdao.GuardarDetalleVentas(dv);
        }
    }

    void agregarProducto() {

        double total;
        boolean isRegistry = false;
        modelo = (DefaultTableModel) TablaDetalle.getModel();
        int idProd = Integer.valueOf(txtCodProd.getText());
        String nomProd = txtProducto.getText();
        double preProd = Double.parseDouble(txtPrecio.getText());
        int cantProd = Integer.parseInt(txtCantidad.getValue().toString());
        String Estado = txtStock.getText();

        if(true){
        total = cantProd * preProd;
        ArrayList<Object[]> detalle = new ArrayList();
        for (int i = 0; i < TablaDetalle.getRowCount(); i++) {
            if (TablaDetalle.getValueAt(i, 1).toString().equalsIgnoreCase(String.valueOf(idProd))) {
                JOptionPane.showMessageDialog(null, "Producto ya esta registrado");
                isRegistry = true;
            }
        }
        if (Estado.equals("ACTIVO") && isRegistry == false) {
            Object[] ob = new Object[6];
            ob[0] = TablaDetalle.getRowCount()+1;
            ob[1] = idProd;
            ob[2] = nomProd;
            ob[3] = cantProd;
            ob[4] = preProd;
            ob[5] = total;
            detalle.add(ob);
            detalle.forEach(objects -> {
                modelo.addRow(objects);
            });
            CentrarTextoTabla.centrarText(TablaDetalle);
            TablaDetalle.setModel(modelo);
            calculatTotal();
        } else {
            if (Estado.equals("INACTIVO")) {
                JOptionPane.showMessageDialog(this, "Producto no disponible");
            }
        }
        Activate.On(new Component[]{txtCodProd, btnBuscarProducto});
        txtCodProd.setText("");
        txtPrecio.setText("");
         txtProducto.setText("");
         txtStock.setText("");
        txtCodProd.requestFocus();
        Activate.On(new Component[]{btnAgregar, txtPrecio});
        txtCantidad.setValue(1);
    }
      }
    void calculatTotal() {
        tpagar = 0;
        for (int i = 0; i < TablaDetalle.getRowCount(); i++) {
            cant = Integer.parseInt(TablaDetalle.getValueAt(i, 3).toString());
            pre = Double.parseDouble(TablaDetalle.getValueAt(i, 4).toString());
            tpagar = tpagar + (cant * pre);
        }
        txtTotalPagar.setText("" + tpagar + "0");
    }

    void buscarProducto() {
        int id;
        if (txtCodProd.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Debe ingresar codigo de algun Producto");
            txtCodProd.requestFocus();
        } else {
            id = Integer.parseInt(Utils.isNumeric(txtCodProd.getText()) ? txtCodProd.getText() : "0");
            p = ProductoDAO.listarID(id);
            if (p.getId() != 0) {
                txtProducto.setText(p.getNom());
                txtPrecio.setText("" + p.getPre());
                txtStock.setText("" + p.getEstado());
                Activate.On(new Component[]{btnBuscarProducto, txtCodProd});
                Activate.On(new Component[]{btnAgregar, txtPrecio});
            } else {
                int r = JOptionPane.showConfirmDialog(this, "El producto No Existe, ¿Desea Reagistrar?");
                if (r == 0) {
                    ProductoForm cf = new ProductoForm();
                    Principal.VentanaPrincipal.add(cf);
                    cf.setVisible(true);
                } else {
                    txtCodProd.requestFocus();
                }
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaDetalle;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscarProducto;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JTable tablaProducto;
    private javax.swing.JSpinner txtCantidad;
    private javax.swing.JTextField txtCodProd;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtProducto;
    private javax.swing.JTextField txtSerie;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtTotalPagar;
    private javax.swing.JTextField txtVendedor;
    // End of variables declaration//GEN-END:variables
}
