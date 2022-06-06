
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author simon
 * @version 03/06/2022
 */
public class Interfaz extends javax.swing.JFrame {
    protected GrafoMAdy grafox = null;

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        TabbedPane = new javax.swing.JTabbedPane();
        MenuPanel = new javax.swing.JPanel();
        cargararchivo = new javax.swing.JButton();
        disponibilidad = new javax.swing.JButton();
        realizarpedido = new javax.swing.JButton();
        gestion = new javax.swing.JButton();
        grafo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        cargartxtpanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        archivotxt = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        select = new javax.swing.JButton();
        volverCarga = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        disponibilidadpanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        dispoOrigen = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        bRecorrer = new javax.swing.JButton();
        volverDispo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        outputAnchura = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        outputProfundidad = new javax.swing.JTextPane();
        jLabel15 = new javax.swing.JLabel();
        pedidopanel = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        Anchura = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        profundidad = new javax.swing.JTextPane();
        hacerPedido = new javax.swing.JButton();
        outputCantidad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        menosB = new javax.swing.JButton();
        masB = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        outputProductos = new javax.swing.JTextPane();
        Productos = new javax.swing.JComboBox<>();
        addProduct = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        verStock = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        gestionpanel = new javax.swing.JPanel();
        GrafoPanel = new javax.swing.JPanel();
        VerGrafo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 102));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MenuPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cargararchivo.setText("Cargar Archivo ");
        cargararchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargararchivoActionPerformed(evt);
            }
        });
        MenuPanel.add(cargararchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 200, 40));

        disponibilidad.setText("Disponibilidad de Productos ");
        disponibilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disponibilidadActionPerformed(evt);
            }
        });
        MenuPanel.add(disponibilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 200, 40));

        realizarpedido.setText("Realizar Pedido ");
        realizarpedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                realizarpedidoActionPerformed(evt);
            }
        });
        MenuPanel.add(realizarpedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 200, 40));

        gestion.setText("Gestion de Alamacenes");
        gestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestionActionPerformed(evt);
            }
        });
        MenuPanel.add(gestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 200, 40));

        grafo.setText("Grafo ");
        grafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grafoActionPerformed(evt);
            }
        });
        MenuPanel.add(grafo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 200, 40));

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        MenuPanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 290, 100, 40));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/JAVA.png"))); // NOI18N
        MenuPanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 350));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/WhatsApp Image 2022-06-05 at 3.25.06 PM.jpeg"))); // NOI18N
        jLabel17.setText("jLabel17");
        MenuPanel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, -60, 910, 550));

        TabbedPane.addTab("Menu", MenuPanel);

        cargartxtpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        archivotxt.setColumns(20);
        archivotxt.setRows(5);
        archivotxt.setFocusable(false);
        jScrollPane1.setViewportView(archivotxt);

        cargartxtpanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 71, 327, 194));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Seleccione el archivo de texto al cual le desea cargar los datos.");
        cargartxtpanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 16, -1, 43));

        select.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        select.setText("Seleccionar");
        select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectActionPerformed(evt);
            }
        });
        cargartxtpanel.add(select, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 120, 50));

        volverCarga.setText("Volver");
        volverCarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverCargaActionPerformed(evt);
            }
        });
        cargartxtpanel.add(volverCarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 290, -1, 30));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/morado.jpg"))); // NOI18N
        cargartxtpanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 350));

        TabbedPane.addTab("Cargar Archivo ", cargartxtpanel);

        disponibilidadpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ingrese el almacén de origen:");
        disponibilidadpanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));
        disponibilidadpanel.add(dispoOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 60, 40));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Recorrido de profundidad");
        disponibilidadpanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Recorrido en anchura");
        disponibilidadpanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        bRecorrer.setText("Recorrer almacenes");
        bRecorrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRecorrerActionPerformed(evt);
            }
        });
        disponibilidadpanel.add(bRecorrer, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 170, 80));

        volverDispo.setText("Volver");
        volverDispo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverDispoActionPerformed(evt);
            }
        });
        disponibilidadpanel.add(volverDispo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, 30));

        jScrollPane2.setViewportView(outputAnchura);

        disponibilidadpanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 170, 250));

        jScrollPane3.setViewportView(outputProfundidad);

        disponibilidadpanel.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, 170, 250));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/morado.jpg"))); // NOI18N
        disponibilidadpanel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 350));

        TabbedPane.addTab("Disponibilidad", disponibilidadpanel);

        pedidopanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Anchura.setFocusable(false);
        jScrollPane4.setViewportView(Anchura);

        pedidopanel.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 140, 210));

        profundidad.setFocusable(false);
        jScrollPane5.setViewportView(profundidad);

        pedidopanel.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 140, 210));

        hacerPedido.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        hacerPedido.setText("Realizar pedido");
        hacerPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hacerPedidoActionPerformed(evt);
            }
        });
        pedidopanel.add(hacerPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, 140, 50));

        outputCantidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        outputCantidad.setText("0");
        outputCantidad.setFocusable(false);
        pedidopanel.add(outputCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 70, 40));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Producto");
        pedidopanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 60, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Cantidad");
        pedidopanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, -1, -1));

        menosB.setText("-");
        menosB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menosBActionPerformed(evt);
            }
        });
        pedidopanel.add(menosB, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 50, 40));

        masB.setText("+");
        masB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masBActionPerformed(evt);
            }
        });
        pedidopanel.add(masB, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 50, 40));

        outputProductos.setFocusable(false);
        jScrollPane6.setViewportView(outputProductos);

        pedidopanel.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, 150, 180));

        Productos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        pedidopanel.add(Productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 90, 30));

        addProduct.setText("Añadir ");
        addProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProductActionPerformed(evt);
            }
        });
        pedidopanel.add(addProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, -1, 30));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Lista de productos");
        pedidopanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 50, 110, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Introduzca un producto y su respectiva cantidad");
        pedidopanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, -1, -1));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Stock");
        pedidopanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Anchura");
        pedidopanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, -1, -1));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Profundidad");
        pedidopanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, -1, -1));

        verStock.setText("Ver stock");
        verStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verStockActionPerformed(evt);
            }
        });
        pedidopanel.add(verStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 90, 30));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/morado.jpg"))); // NOI18N
        pedidopanel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 350));

        TabbedPane.addTab("Pedido", pedidopanel);

        gestionpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        TabbedPane.addTab("Gestion Almacenes ", gestionpanel);

        GrafoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        VerGrafo.setText("Ver Grafo");
        VerGrafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerGrafoActionPerformed(evt);
            }
        });
        GrafoPanel.add(VerGrafo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, -1));

        TabbedPane.addTab("Grafo", GrafoPanel);

        getContentPane().add(TabbedPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 750, 380));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EQUIPO SUR");
        jLabel1.setMaximumSize(new java.awt.Dimension(100, 100));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 90));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cargararchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargararchivoActionPerformed
        TabbedPane.setSelectedIndex(1);
    }//GEN-LAST:event_cargararchivoActionPerformed

    private void disponibilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disponibilidadActionPerformed

        TabbedPane.setSelectedIndex(2);
    }//GEN-LAST:event_disponibilidadActionPerformed

    private void realizarpedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_realizarpedidoActionPerformed
        TabbedPane.setSelectedIndex(3);
    }//GEN-LAST:event_realizarpedidoActionPerformed

    private void gestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestionActionPerformed
        TabbedPane.setSelectedIndex(4);
    }//GEN-LAST:event_gestionActionPerformed

    private void grafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grafoActionPerformed
        TabbedPane.setSelectedIndex(5);
    }//GEN-LAST:event_grafoActionPerformed

    private void selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectActionPerformed
         Archivo a = new Archivo();
        
        
        JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(null);
        File archivo = fc.getSelectedFile();
        
        if((archivo.getName()).contains(".txt")){
        String filename = archivo.getPath();     

        grafox = a.armarGrafo(filename);

            if(grafox != null){
            
                try{
                    FileReader fr = new FileReader (archivo);
                    BufferedReader br = new BufferedReader(fr);
                    String texto = "";
                    String linea = "";
                    while(((linea = br.readLine())!=null)){
                        texto+= linea+"\n";
                    }
                    archivotxt.setText(texto);
                    JOptionPane.showMessageDialog(null, "Archivo leido correctamente");
                    Productos.removeAllItems();
                    for(int i =1; i<grafox.ProductosTotal().length; i++)
                    {
                        Productos.addItem(grafox.ProductosTotal()[i]);
                        
                    }
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "No se pudo leer el archivo");
                    }
                }
            
            else{
                JOptionPane.showMessageDialog(null, "Ingrese un archivo válido");
            }
        }
        
        else{
            JOptionPane.showMessageDialog(null, "Error, no es archivo txt. Ingrese un archivo válido");
        }
        
    }//GEN-LAST:event_selectActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void volverDispoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverDispoActionPerformed
        TabbedPane.setSelectedIndex(0);
    }//GEN-LAST:event_volverDispoActionPerformed

    private void bRecorrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRecorrerActionPerformed
        String temp = "";
        
        if(grafox != null){
            try{
                String origen = dispoOrigen.getText();
                
                temp = Recorrido.recorrerAnchura(grafox, origen.toUpperCase());

                outputAnchura.setText(temp);


                temp = Recorrido.recorrerProfundidad(grafox, origen.toUpperCase());
                
                outputProfundidad.setText(temp);

            }catch(Exception e){

                JOptionPane.showMessageDialog(null, "Error, recorrido fallido");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Error, no ha cargado la información.");
        }
    }//GEN-LAST:event_bRecorrerActionPerformed

    private void volverCargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverCargaActionPerformed
        TabbedPane.setSelectedIndex(0);
    }//GEN-LAST:event_volverCargaActionPerformed

    private void menosBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menosBActionPerformed
        
        if(Integer.parseInt(outputCantidad.getText()) != 0){
            int cantidad = Integer.parseInt(outputCantidad.getText());
        
            int suma = cantidad - 1;

            outputCantidad.setText(Integer.toString(suma));
        }
        else{
            outputCantidad.setText("0");
        }
    }//GEN-LAST:event_menosBActionPerformed

    private void masBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masBActionPerformed
        int cantidad = Integer.parseInt(outputCantidad.getText());
        
        int suma = cantidad + 1;
        
        outputCantidad.setText(Integer.toString(suma));
        
    }//GEN-LAST:event_masBActionPerformed

    private void verStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verStockActionPerformed
        String temp = "";
        
        if(grafox != null){               

                temp = Recorrido.recorrerAnchura(grafox, "A");

                Anchura.setText(temp);

                temp = Recorrido.recorrerProfundidad(grafox, "A");
                
                profundidad.setText(temp);
            
        }
        else{
            JOptionPane.showMessageDialog(null, "Error, no ha cargado la información.");
        }
    }//GEN-LAST:event_verStockActionPerformed

    private void addProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProductActionPerformed
        Object producto = Productos.getSelectedItem();       
        String cantidad = outputCantidad.getText();
        String panel = outputProductos.getText();
        String lista = "";
        
                
        
        
        if(!producto.equals("") && !cantidad.equals("0")){
            lista += producto+ ":" + cantidad;
            
            if(!panel.equals("")){
                outputProductos.setText(panel + "\n" + lista );
                
                outputCantidad.setText("0");
              
            }
            else{
                outputProductos.setText(lista);
               
                outputCantidad.setText("0");
            }
        }
        else if(producto.equals("") && !cantidad.equals("0")){
            JOptionPane.showMessageDialog(null, "Error, campo producto vacío.");
        }
        else if(!producto.equals("") && cantidad.equals("0")){
            JOptionPane.showMessageDialog(null, "Error, campo cantidad vacío.");
        }
        else{
            JOptionPane.showMessageDialog(null, "Campo cantidad y campo producto vacío.");
        }
    }//GEN-LAST:event_addProductActionPerformed

    private void hacerPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hacerPedidoActionPerformed
        String productos = outputProductos.getText();
        String [] lista = productos.split("\n");
        Producto [] productlist = new Producto[lista.length];
        String [] productito= new String[1];
        String [] Alist=null;
        int x;
        String ruta = "";
        String str = "El Pedido es: \n";
        
        
        for (int i = 0; i < lista.length; i++) {
            productito = lista[i].split(":");
            productlist[i] = new Producto(productito[0], Integer.parseInt(productito[1]));
        }
        
        grafox.RestarProductos(productlist, grafox);
        Alist = grafox.pedidoAlmacenes(productlist, grafox);
        
        RutaMinima rout = new RutaMinima(grafox, grafox.getVerts()[0]);
        ruta = rout.conseguirRuta(grafox);
        
        for (int i = 0; i < productlist.length; i++) {
            str+=lista[i]+"\n";
        }
        
        JOptionPane.showMessageDialog(null, str);
        JOptionPane.showMessageDialog(null, ruta);
        
        
       
        
        
        
        
    }//GEN-LAST:event_hacerPedidoActionPerformed

    private void VerGrafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerGrafoActionPerformed
        // TODO add your handling code here:
        GraficarGrafo s = new GraficarGrafo(); 
        s.mostrar();
    }//GEN-LAST:event_VerGrafoActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane Anchura;
    private javax.swing.JPanel GrafoPanel;
    private javax.swing.JPanel MenuPanel;
    private javax.swing.JComboBox<String> Productos;
    private javax.swing.JTabbedPane TabbedPane;
    private javax.swing.JButton VerGrafo;
    private javax.swing.JButton addProduct;
    private javax.swing.JTextArea archivotxt;
    private javax.swing.JButton bRecorrer;
    private javax.swing.JButton cargararchivo;
    private javax.swing.JPanel cargartxtpanel;
    private javax.swing.JTextField dispoOrigen;
    private javax.swing.JButton disponibilidad;
    private javax.swing.JPanel disponibilidadpanel;
    private javax.swing.JButton gestion;
    private javax.swing.JPanel gestionpanel;
    private javax.swing.JButton grafo;
    private javax.swing.JButton hacerPedido;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JButton masB;
    private javax.swing.JButton menosB;
    private javax.swing.JTextPane outputAnchura;
    private javax.swing.JTextField outputCantidad;
    private javax.swing.JTextPane outputProductos;
    private javax.swing.JTextPane outputProfundidad;
    private javax.swing.JPanel pedidopanel;
    private javax.swing.JTextPane profundidad;
    private javax.swing.JButton realizarpedido;
    private javax.swing.JButton select;
    private javax.swing.JButton verStock;
    private javax.swing.JButton volverCarga;
    private javax.swing.JButton volverDispo;
    // End of variables declaration//GEN-END:variables
}
