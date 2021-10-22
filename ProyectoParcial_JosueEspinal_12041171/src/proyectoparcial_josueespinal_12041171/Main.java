/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoparcial_josueespinal_12041171;

import static com.sun.tools.attach.VirtualMachine.list;
import java.awt.Color;
import static java.awt.Color.green;
import static java.awt.Color.red;
import static java.awt.Color.white;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JColorChooser;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.TransferHandler;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.Document;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.nio.file.Files;
import static java.nio.file.Files.list;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import static java.util.Collections.list;
import java.util.Date;
import java.util.StringTokenizer;
import javax.imageio.ImageIO;

import javax.swing.ActionMap;
import javax.swing.DefaultCellEditor;
import javax.swing.InputMap;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTree;
import javax.swing.KeyStroke;
import javax.swing.ListSelectionModel;
import javax.swing.Timer;
import javax.swing.TransferHandler;
import javax.swing.border.LineBorder;
import javax.swing.table.TableColumn;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author josue
 */
public class Main extends javax.swing.JFrame {

    File archivoAbierto = null;
    ArrayList<File> recientes = new ArrayList<File>();
    ArrayList<Clase> clases = new ArrayList<Clase>();
    StyledDocument doc;
    Clase abierta = null;
    Style style;
    int x2 = 0;
    int y2 = 0;

    public Main() {
        initComponents();
        doc = codeBox.getStyledDocument();
        style = codeBox.addStyle("miEstilo", null);

        DefaultComboBoxModel modelo = (DefaultComboBoxModel) fontBox.getModel();
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String fontNames[] = ge.getAvailableFontFamilyNames();
        for (int i = 0; i < fontNames.length; i++) {
            modelo.addElement(fontNames[i]);
        }
        fontBox.setModel(modelo);
        
        DefaultComboBoxModel modeloColor = new DefaultComboBoxModel();
        modeloColor.addElement("Rojo");
        modeloColor.addElement("Verde");
        modeloColor.addElement("Azul");
        modeloColor.addElement("Morado");
        modeloColor.addElement("Amarillo");
        modeloColor.addElement("Celeste");
        modeloColor.addElement("Gris");
        cbcolor.setModel(modeloColor);
        
        jTextArea1.setText("Un Diagrama de Flujo representa la esquematización gráfica de un algoritmo, el cual muestra gráficamente los pasos o procesos a seguir para alcanzar la solución de un problema. Su correcta construcción es sumamente importante porque, a partir del mismo se escribe un programa en algún Lenguaje de Programación.");
        j2.setText("Los diagramas UML describen los límites, la estructura y el comportamiento del sistema y los objetos que contiene. UML no es un lenguaje de programación, pero existen herramientas como esta que se pueden usar para generar código en diversos lenguajes, en este caso, en C++");
        componentType.setTransferHandler(new TransferHandler("text"));
        MouseListener ml = new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                JComponent c = (JComponent) e.getSource();
                TransferHandler th = c.getTransferHandler();
                th.exportAsDrag(c, e, TransferHandler.COPY);
            }
        };
        componentType.addMouseListener(ml);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RecientesDialog = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        recientesTable = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        UMLCreation = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jtree = new javax.swing.JTree();
        jPanel2 = new javax.swing.JPanel();
        btnewclass = new javax.swing.JButton();
        btdeleteclass = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btaddclass = new javax.swing.JButton();
        addvar = new javax.swing.JButton();
        remvar = new javax.swing.JButton();
        clasenombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        clasescb = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        checkpadre = new javax.swing.JCheckBox();
        btupdateclass = new javax.swing.JButton();
        cbcolor = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        pan = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        UMLcode = new javax.swing.JTextPane();
        jButton10 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        FCCreation = new javax.swing.JDialog();
        jPanel7 = new javax.swing.JPanel();
        jToolBar2 = new javax.swing.JToolBar();
        boldButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        fontBox = new javax.swing.JComboBox<>();
        tamanioBox = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jButton3 = new javax.swing.JButton();
        panelColor = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        codeBox = new javax.swing.JTextPane();
        jButton6 = new javax.swing.JButton();
        loadBar = new javax.swing.JProgressBar();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        componentType = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pane = new javax.swing.JTextPane();
        jPanel1 = new javax.swing.JPanel();
        panel = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        btnewclass1 = new javax.swing.JButton();
        btdeleteclass1 = new javax.swing.JButton();
        btaddclass1 = new javax.swing.JButton();
        clasescb1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        checkpadre1 = new javax.swing.JCheckBox();
        btupdateclass1 = new javax.swing.JButton();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        j2 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        recientesTable.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        recientesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Ubicacion", "Fecha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(recientesTable);

        jButton4.setBackground(new java.awt.Color(0, 51, 204));
        jButton4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Abrir");
        jButton4.setBorderPainted(false);
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(153, 153, 153));
        jButton5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton5.setText("Cancelar");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RecientesDialogLayout = new javax.swing.GroupLayout(RecientesDialog.getContentPane());
        RecientesDialog.getContentPane().setLayout(RecientesDialogLayout);
        RecientesDialogLayout.setHorizontalGroup(
            RecientesDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RecientesDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RecientesDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RecientesDialogLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        RecientesDialogLayout.setVerticalGroup(
            RecientesDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RecientesDialogLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RecientesDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        UMLCreation.setBackground(new java.awt.Color(51, 51, 51));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setForeground(new java.awt.Color(51, 51, 51));
        jPanel3.setMaximumSize(new java.awt.Dimension(848, 569));

        jtree.setBorder(null);
        jtree.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        jtree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jtree.setLargeModel(true);
        jScrollPane6.setViewportView(jtree);

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));

        btnewclass.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnewclass.setText("Nueva Clase");
        btnewclass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnewclassMouseClicked(evt);
            }
        });
        btnewclass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnewclassActionPerformed(evt);
            }
        });

        btdeleteclass.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btdeleteclass.setText("Borrar Clase");
        btdeleteclass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btdeleteclassMouseClicked(evt);
            }
        });
        btdeleteclass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdeleteclassActionPerformed(evt);
            }
        });

        tabla.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo", "Nombre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tabla);

        btaddclass.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btaddclass.setText("AÑADIR");
        btaddclass.setToolTipText("");
        btaddclass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btaddclassMouseClicked(evt);
            }
        });
        btaddclass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btaddclassActionPerformed(evt);
            }
        });

        addvar.setBackground(new java.awt.Color(204, 204, 255));
        addvar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        addvar.setForeground(new java.awt.Color(0, 0, 0));
        addvar.setText("Añadir Variable");
        addvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addvarActionPerformed(evt);
            }
        });

        remvar.setBackground(new java.awt.Color(255, 204, 204));
        remvar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        remvar.setForeground(new java.awt.Color(0, 0, 0));
        remvar.setText("Remover Variable");
        remvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remvarActionPerformed(evt);
            }
        });

        clasenombre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        clasenombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clasenombreActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Titulo:");

        clasescb.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Padre:");

        checkpadre.setBackground(new java.awt.Color(0, 51, 102));
        checkpadre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        checkpadre.setForeground(new java.awt.Color(255, 255, 255));
        checkpadre.setText("Tiene Padre");
        checkpadre.setBorder(null);
        checkpadre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkpadreActionPerformed(evt);
            }
        });

        btupdateclass.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btupdateclass.setText("UPDATE");
        btupdateclass.setToolTipText("");
        btupdateclass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btupdateclassMouseClicked(evt);
            }
        });
        btupdateclass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btupdateclassActionPerformed(evt);
            }
        });

        cbcolor.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Color:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(remvar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnewclass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btdeleteclass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clasenombre))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clasescb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btupdateclass)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btaddclass, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(checkpadre)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbcolor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnewclass, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btdeleteclass, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clasenombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(remvar)
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbcolor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(checkpadre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clasescb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btaddclass, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btupdateclass, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(104, 104, 104))
        );

        jButton12.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton12.setText("Editar");
        jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton12MouseClicked(evt);
            }
        });

        pan.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout panLayout = new javax.swing.GroupLayout(pan);
        pan.setLayout(panLayout);
        panLayout.setHorizontalGroup(
            panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 815, Short.MAX_VALUE)
        );
        panLayout.setVerticalGroup(
            panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        jScrollPane7.setViewportView(UMLcode);

        jButton10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton10.setText("Generar Codigo");
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });

        jButton14.setText("Update Panel");
        jButton14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton14MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton10))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane7)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(pan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 28, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jMenuBar2.setForeground(new java.awt.Color(51, 51, 51));

        jMenu2.setBackground(new java.awt.Color(204, 204, 204));
        jMenu2.setText("File");

        jMenuItem1.setText("Nuevo Proyecto");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenu3.setText("Guardar Como");

        jMenuItem7.setText("Guardar como");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuItem5.setText("PNG del Diagrama");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem6.setText("Txt del codigo");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenu2.add(jMenu3);

        jMenuItem8.setText("Abrir");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuBar2.add(jMenu2);

        UMLCreation.setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout UMLCreationLayout = new javax.swing.GroupLayout(UMLCreation.getContentPane());
        UMLCreation.getContentPane().setLayout(UMLCreationLayout);
        UMLCreationLayout.setHorizontalGroup(
            UMLCreationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        UMLCreationLayout.setVerticalGroup(
            UMLCreationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jToolBar2.setRollover(true);

        boldButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoparcial_josueespinal_12041171/bold.png"))); // NOI18N
        boldButton.setFocusable(false);
        boldButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        boldButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        boldButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boldButtonMouseClicked(evt);
            }
        });
        jToolBar2.add(boldButton);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoparcial_josueespinal_12041171/italic1.png"))); // NOI18N
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jToolBar2.add(jButton1);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoparcial_josueespinal_12041171/underline1.png"))); // NOI18N
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jToolBar2.add(jButton2);
        jToolBar2.add(jSeparator1);

        fontBox.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        fontBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                fontBoxItemStateChanged(evt);
            }
        });
        fontBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fontBoxActionPerformed(evt);
            }
        });
        jToolBar2.add(fontBox);

        tamanioBox.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tamanioBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "12", "14", "18", "24", "36" }));
        tamanioBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tamanioBoxActionPerformed(evt);
            }
        });
        jToolBar2.add(tamanioBox);
        jToolBar2.add(jSeparator2);

        jLayeredPane3.setMaximumSize(new java.awt.Dimension(50, 50));
        jLayeredPane3.setMinimumSize(new java.awt.Dimension(32, 50));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoparcial_josueespinal_12041171/fontChooser2.png"))); // NOI18N
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setMaximumSize(new java.awt.Dimension(50, 50));
        jButton3.setMinimumSize(new java.awt.Dimension(24, 24));
        jButton3.setPreferredSize(new java.awt.Dimension(24, 24));
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        panelColor.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        panelColor.setMinimumSize(new java.awt.Dimension(0, 0));
        panelColor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelColorMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelColorLayout = new javax.swing.GroupLayout(panelColor);
        panelColor.setLayout(panelColorLayout);
        panelColorLayout.setHorizontalGroup(
            panelColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelColorLayout.setVerticalGroup(
            panelColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        jLayeredPane3.setLayer(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(panelColor, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jToolBar2.add(jLayeredPane3);

        codeBox.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jScrollPane4.setViewportView(codeBox);

        jButton6.setText("Covertir a Codigo");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        loadBar.setForeground(new java.awt.Color(51, 153, 255));

        jButton7.setText("Borrar Codigo");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(0, 51, 153));
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Guardar");
        jButton8.setBorderPainted(false);
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(204, 0, 0));
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Borrar");
        jButton9.setBorderPainted(false);
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        componentType.setText("Prueba");

        jScrollPane1.setViewportView(pane);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 107, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        panel.setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 664, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jButton13.setText("jButton13");
        jButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton13MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(loadBar, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGap(0, 6, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addComponent(componentType)
                                .addGap(60, 60, 60)
                                .addComponent(jButton13)
                                .addGap(64, 64, 64)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
                    .addComponent(jScrollPane4)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jButton9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(componentType)
                                .addComponent(jButton13)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE)
                    .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton7)
                        .addComponent(jButton8)
                        .addComponent(jButton9))
                    .addComponent(loadBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(0, 51, 102));

        btnewclass1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnewclass1.setText("Nuevo Segmento");
        btnewclass1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnewclass1MouseClicked(evt);
            }
        });
        btnewclass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnewclass1ActionPerformed(evt);
            }
        });

        btdeleteclass1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btdeleteclass1.setText("Borrar Segmento");
        btdeleteclass1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btdeleteclass1MouseClicked(evt);
            }
        });
        btdeleteclass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdeleteclass1ActionPerformed(evt);
            }
        });

        btaddclass1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btaddclass1.setText("AÑADIR");
        btaddclass1.setToolTipText("");
        btaddclass1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btaddclass1MouseClicked(evt);
            }
        });
        btaddclass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btaddclass1ActionPerformed(evt);
            }
        });

        clasescb1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Padre:");

        checkpadre1.setBackground(new java.awt.Color(0, 51, 102));
        checkpadre1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        checkpadre1.setForeground(new java.awt.Color(255, 255, 255));
        checkpadre1.setText("Tiene Padre");
        checkpadre1.setBorder(null);
        checkpadre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkpadre1ActionPerformed(evt);
            }
        });

        btupdateclass1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btupdateclass1.setText("UPDATE");
        btupdateclass1.setToolTipText("");
        btupdateclass1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btupdateclass1MouseClicked(evt);
            }
        });
        btupdateclass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btupdateclass1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnewclass1, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                    .addComponent(btdeleteclass1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clasescb1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(checkpadre1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(btupdateclass1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btaddclass1, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(btnewclass1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btdeleteclass1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(324, 324, 324)
                .addComponent(checkpadre1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clasescb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(10, 10, 10)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btaddclass1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btupdateclass1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(98, 98, 98))
        );

        jMenu5.setText("File");

        jMenuItem9.setText("Nuevo Flujo Grama");
        jMenu5.add(jMenuItem9);

        jMenuItem4.setText("Guardar como");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem4);

        jMenu6.setText("Abrir");

        jMenuItem10.setText("Recientes");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem10);

        jMenuItem11.setText("Abrir Archivo");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem11);

        jMenu5.add(jMenu6);

        jMenuBar3.add(jMenu5);

        FCCreation.setJMenuBar(jMenuBar3);

        javax.swing.GroupLayout FCCreationLayout = new javax.swing.GroupLayout(FCCreation.getContentPane());
        FCCreation.getContentPane().setLayout(FCCreationLayout);
        FCCreationLayout.setHorizontalGroup(
            FCCreationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FCCreationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        FCCreationLayout.setVerticalGroup(
            FCCreationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FCCreationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FCCreationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(FCCreationLayout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(153, 153, 255));
        jPanel4.setForeground(new java.awt.Color(51, 0, 153));

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Flujo Gramas");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("INFORMACION:");

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("UML");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel5)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(36, 36, 36)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        jPanel9.setBackground(new java.awt.Color(0, 0, 102));

        jPanel10.setBackground(new java.awt.Color(102, 0, 102));

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(102, 0, 102));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        jScrollPane3.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                .addContainerGap())
        );

        j2.setEditable(false);
        j2.setBackground(new java.awt.Color(0, 0, 102));
        j2.setColumns(20);
        j2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        j2.setForeground(new java.awt.Color(255, 255, 255));
        j2.setLineWrap(true);
        j2.setRows(5);
        j2.setWrapStyleWord(true);
        j2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 102)));
        jScrollPane8.setViewportView(j2);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane8)
                .addGap(12, 12, 12))
        );

        jMenu1.setText("File");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoparcial_josueespinal_12041171/flujoGramaIcon3.png"))); // NOI18N
        jMenuItem2.setText("Diagrama de Flujo");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectoparcial_josueespinal_12041171/UMLIcon1.png"))); // NOI18N
        jMenuItem3.setText("UML de Clases");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked

        if (recientesTable.getSelectedRow() >= 0) {
            File fichero = null;
            FileInputStream entrada = null;
            ObjectInputStream objeto = null;
            try {
                fichero = recientes.get(recientesTable.getSelectedRow());
                archivoAbierto = fichero;
                entrada
                        = new FileInputStream(fichero);
                objeto
                        = new ObjectInputStream(entrada);
                abrirDocumento(objeto);
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                objeto.close();
                entrada.close();
            } catch (IOException ex) {
            }
            RecientesDialog.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(RecientesDialog, "Por favor eliga un archivo que abrir.");
        }


    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        RecientesDialog.setVisible(false);
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        archivoAbierto = null;
        String data = codeBox.getText().trim();
        String data2 = pane.getText().trim();
        boolean flag = true;
        if (!data.equals("") | !data2.equals("")) {
            int retorno = JOptionPane.showConfirmDialog(null, "Hay un projecto abierto actualmente. Desea Continuar:");
            if (retorno == 0) {
                flag = true;
            }
        } else {
            flag = true;
        }
        if (flag == true) {
            DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
            modelo.setRowCount(0);
            tabla.setModel(modelo);

            btaddclass.setEnabled(false);
            btupdateclass.setEnabled(false);
            btdeleteclass.setEnabled(false);
            addvar.setEnabled(false);
            remvar.setEnabled(false);

            btnewclass.setEnabled(true);
            UMLcode.setText("");
            clases.clear();
            mostrarUML();

        }

    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

        archivoAbierto = null;
        String data = codeBox.getText().trim();
        String data2 = pane.getText().trim();
        if (!data.equals("") | !data2.equals("")) {
            int retorno = JOptionPane.showConfirmDialog(null, "Hay un projecto abierto actualmente. Desea Continuar:");
            if (retorno == 0) {
                pane.setText("");
                codeBox.setText("");
            }
        }
        mostrarFC();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void btaddclassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btaddclassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btaddclassActionPerformed

    private void addvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addvarActionPerformed
        addTableRow();
    }//GEN-LAST:event_addvarActionPerformed

    private void remvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remvarActionPerformed
        if (tabla.getSelectedRow() >= 0) {
            DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
            modelo.removeRow(tabla.getSelectedRow());
            tabla.setModel(modelo);
        } else {
            JOptionPane.showMessageDialog(UMLCreation, "No ha seleccionado una variable que borrar.");
        }


    }//GEN-LAST:event_remvarActionPerformed

    private void btnewclassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnewclassActionPerformed

    }//GEN-LAST:event_btnewclassActionPerformed

    private void clasenombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clasenombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clasenombreActionPerformed

    private void checkpadreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkpadreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkpadreActionPerformed

    private void btaddclassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btaddclassMouseClicked
        boolean flagVar = true;
        for (int i = 0; i < tabla.getRowCount(); i++) {
            if (tabla.getValueAt(i, 0).toString().equals("Seleccione Tipo de Variable")) {
                flagVar = false;
            } else if (tabla.getValueAt(i, 1).toString().isBlank()) {
                flagVar = false;
            }
        }
        if (clasenombre.getText().isBlank()) {
            JOptionPane.showMessageDialog(UMLCreation, "La clase no tiene Nombre.");
        } else if (checkpadre.isSelected() && clases.isEmpty()) {
            JOptionPane.showMessageDialog(UMLCreation, "La clase no puede tener padre ya que no hay clases creadas anteriormente.");
        } else if (checkpadre.isSelected() && clasescb.getSelectedIndex() < 0) {
            JOptionPane.showMessageDialog(UMLCreation, "Porfavor seleccione la clase padre deseada.");
        } else if (flagVar == false) {
            JOptionPane.showMessageDialog(UMLCreation, "Asegurese de haber seleccionado el tipo de Variable y haberle asignado un nombre a todas las variable.");
        } else {
            Clase c = new Clase();
            c.setNombre(clasenombre.getText());
            for (int i = 0; i < tabla.getRowCount(); i++) {
                String var = tabla.getValueAt(i, 0).toString() + " " + tabla.getValueAt(i, 1).toString();
                c.addVar(var);
            }
            if (checkpadre.isSelected()) {//Add a padre correspondiente
                String nombrePa = (clasescb.getSelectedItem().toString());

                clases = addClase(clases, c, nombrePa);

            } else {
                clases.add(c);
            }
            //Update del JTree
            DefaultMutableTreeNode UML = new DefaultMutableTreeNode("UML");
            UML = updateTree(clases, UML);
            DefaultTreeModel treeModel = new DefaultTreeModel(UML);
            jtree.setModel(treeModel);

            //Update del ComboBox
            DefaultComboBoxModel cbUMLModelo = (DefaultComboBoxModel) clasescb.getModel();
            cbUMLModelo.removeAllElements();
            cbUMLModelo = llenarCB(clases, cbUMLModelo);
            clasescb.setModel(cbUMLModelo);

            //Reset Table
            resetTable();

            //Lock everything again
            btaddclass.setEnabled(false);
            addvar.setEnabled(false);
            remvar.setEnabled(false);
            DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
            modelo.setRowCount(0);
            tabla.setModel(modelo);

            //Panel
            panelwork();

        }
    }//GEN-LAST:event_btaddclassMouseClicked

    public void panelwork() {
        pan.removeAll();
        pan.revalidate();
        pan.repaint();
        Color col = new Color(255, 255, 255);
        String change = cbcolor.getSelectedItem().toString();
        int r = 0;
        int g = 0;
        int b = 0;
        switch (change) {
            case "Rojo": {
                r = 0;
                g = 30;
                b = 30;
            }
            break;
            case "Verde": {
                r = 30;
                g = 0;
                b = 30;
            }
            break;
            case "Azul": {
                r = 30;
                g = 30;
                b = 0;
            }
            break;
            case "Morado": {
                r = 0;
                g = 30;
                b = 0;
            }
            break;
            case "Amarillo": {
                r = 0;
                g = 0;
                b = 30;
            }
            break;
            case "Celeste": {
                r = 30;
                g = 0;
                b = 0;
            }
            break;
            case "Gris": {
                r = 25;
                g = 25;
                b = 25;
            }
            break;
            default: {
                r = 0;
                g = 30;
                b = 30;
            }

        }
        updatePanel(clases, pan.getWidth(), 10, 0, col, r, g, b);
        pan.revalidate();
        pan.repaint();
    }

    private void btnewclassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnewclassMouseClicked
        tabla.setEnabled(true);
        btaddclass.setEnabled(true);
        addvar.setEnabled(true);
        remvar.setEnabled(true);
        clasenombre.setEnabled(true);

        addTableRow();
    }//GEN-LAST:event_btnewclassMouseClicked

    private void btdeleteclassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btdeleteclassMouseClicked
        System.out.println(jtree.getSelectionPath().toString());
        StringTokenizer st = new StringTokenizer(jtree.getSelectionPath().toString().toString());
        String lastToken = null;
        while (st.hasMoreElements()) {
            lastToken = st.nextToken();
        }
        String loc = "";
        for (int i = 0; i < lastToken.length() - 1; i++) {
            loc += lastToken.charAt(i);
        }

        clases = deleteClase(clases, loc);

        //Update del JTree
        DefaultMutableTreeNode UML = new DefaultMutableTreeNode("UML");
        UML = updateTree(clases, UML);
        DefaultTreeModel treeModel = new DefaultTreeModel(UML);
        jtree.setModel(treeModel);

        //Update del ComboBox
        DefaultComboBoxModel cbUMLModelo = (DefaultComboBoxModel) clasescb.getModel();
        cbUMLModelo.removeAllElements();
        cbUMLModelo = llenarCB(clases, cbUMLModelo);
        clasescb.setModel(cbUMLModelo);

        //Reset Table
        resetTable();

        //Lock everything again
        btaddclass.setEnabled(false);
        addvar.setEnabled(false);
        remvar.setEnabled(false);
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        modelo.setRowCount(0);
        tabla.setModel(modelo);

        //Panel
        panelwork();
    }//GEN-LAST:event_btdeleteclassMouseClicked

    private void jButton12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseClicked
        try {
            DefaultMutableTreeNode selectedElement = (DefaultMutableTreeNode) jtree.getSelectionPath().getLastPathComponent();
            Clase c = bringClase(clases, selectedElement.getUserObject().toString());
            abierta = c;
            clasenombre.setText(c.getNombre());
            fillTable(c);
            btaddclass.setEnabled(false);
            btupdateclass.setEnabled(true);
            btdeleteclass.setEnabled(true);
            clasenombre.setEnabled(true);
            addvar.setEnabled(true);
            remvar.setEnabled(true);
            tabla.setEnabled(true);

        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(UMLCreation, "ERROR. Asegurese de seleccionar en el JTREE la clase a abrir.");
        }

    }//GEN-LAST:event_jButton12MouseClicked

    private void btupdateclassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btupdateclassMouseClicked
        Clase c = new Clase();
        c.setNombre(clasenombre.getText());
        for (int i = 0; i < tabla.getRowCount(); i++) {
            String var = tabla.getValueAt(i, 0).toString() + " " + tabla.getValueAt(i, 1).toString();
            c.addVar(var);
        }
        c.setHijos(abierta.getHijos());
        updateClase(clases, c, abierta.getNombre().toString());
        abierta = null;

        //Update del JTree
        DefaultMutableTreeNode UML = new DefaultMutableTreeNode("UML");
        UML = updateTree(clases, UML);
        DefaultTreeModel treeModel = new DefaultTreeModel(UML);
        jtree.setModel(treeModel);

        //Update del ComboBox
        DefaultComboBoxModel cbUMLModelo = (DefaultComboBoxModel) clasescb.getModel();
        cbUMLModelo.removeAllElements();
        cbUMLModelo = llenarCB(clases, cbUMLModelo);
        clasescb.setModel(cbUMLModelo);

        //Reset Table
        resetTable();

        btaddclass.setEnabled(true);
        btupdateclass.setEnabled(false);
        btdeleteclass.setEnabled(false);

        //Panel
        panelwork();
    }//GEN-LAST:event_btupdateclassMouseClicked

    private void btupdateclassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btupdateclassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btupdateclassActionPerformed

    private void btdeleteclassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdeleteclassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btdeleteclassActionPerformed

    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
        String code = generateCodeUML(clases, 0, "");
        System.out.println(code
        );
        UMLcode.setText(code);
    }//GEN-LAST:event_jButton10MouseClicked

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        JFileChooser jfc = new JFileChooser();
        FileNameExtensionFilter filtro
                = new FileNameExtensionFilter(
                        "Archivo UML", "uml");
        jfc.setFileFilter(filtro);
        int seleccion = jfc.showSaveDialog(this);

        FileOutputStream fw = null;
        ObjectOutputStream bw = null;

        FileOutputStream fw2 = null;
        ObjectOutputStream bw2 = null;

        FileWriter fw3 = null;
        BufferedWriter bw3 = null;

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            try {
                File fichero = null;
                File fichero2 = null;
                File fichero3 = null;
                if (jfc.getFileFilter().getDescription().equals(
                        "Archivo UML")) {
                    fichero = new File(jfc.getSelectedFile().getPath() + ".uml");
                    fichero2 = new File(jfc.getSelectedFile().getPath() + ".png");
                    fichero3 = new File(jfc.getSelectedFile().getPath() + ".txt");
                    archivoAbierto = fichero;
                    recientes.add(fichero);
                } else {
                    fichero = jfc.getSelectedFile();
                }
                //Save UML
                fw = new FileOutputStream(fichero);
                bw = new ObjectOutputStream(fw);
                Date Fecha = new Date();
                UML u = new UML(clases, UMLcode.getText(), Fecha);
                bw.writeObject(u);
                bw.flush();

                //Save PNG
                int ca = JOptionPane.showConfirmDialog(UMLCreation, "Desea guardar una foto del diagrama?");
                if (ca == 0) {
                    fw2 = new FileOutputStream(fichero2);
                    bw2 = new ObjectOutputStream(fw2);
                    BufferedImage im = new BufferedImage(pan.getWidth(), pan.getHeight(), BufferedImage.TYPE_INT_ARGB);
                    pan.paint(im.getGraphics());
                    ImageIO.write(im, "PNG", fichero2);
                    bw2.flush();
                }

                //Save TXT file
                int ca2 = JOptionPane.showConfirmDialog(UMLCreation, "Desea guardar un archivo de texto con el codigo?");
                if (ca2 == 0) {
                    fw3 = new FileWriter(fichero3);
                    bw3 = new BufferedWriter(fw3);
                    bw3.write(UMLcode.getText());
                    bw3.flush();
                }

                JOptionPane.showMessageDialog(UMLCreation, "Archivo guardado exitosamente");

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        try {
            bw.close();
            fw.close();
            bw2.close();
            fw2.close();
            bw3.close();
            fw3.close();
        } catch (IOException ex) {
        }
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed

        String data = UMLcode.getText().trim();

        String nombre = "";
        boolean flag = false;
        if (!data.equals("")) {
            int retorno = JOptionPane.showConfirmDialog(null, "Hay un projecto abierto actualmente. Desea Continuar:");
            if (retorno == 0) {
                flag = true;
            } else {
                flag = false;
            }
        } else {
            flag = true;
        }
        if (flag == true) {
            File fichero = null;
            FileInputStream entrada = null;
            ObjectInputStream objeto = null;
            try {
                JFileChooser jfc = new JFileChooser();
                FileNameExtensionFilter filtro
                        = new FileNameExtensionFilter(
                                "Archivo UML", "uml");
                jfc.setFileFilter(filtro);
                int seleccion = jfc.showOpenDialog(this);
                if (seleccion == JFileChooser.APPROVE_OPTION) {
                    fichero = jfc.getSelectedFile();
                    archivoAbierto = fichero;
                    entrada = new FileInputStream(fichero);
                    objeto = new ObjectInputStream(entrada);
                    abrirUML2(objeto);
                } //fin if

            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                objeto.close();
                entrada.close();
            } catch (IOException ex) {
            }
        }

    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        JFileChooser jfc = new JFileChooser();
        FileNameExtensionFilter filtro
                = new FileNameExtensionFilter(
                        "Diagramas de Flujo", "ddf");
        jfc.setFileFilter(filtro);
        int seleccion = jfc.showSaveDialog(this);

        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            try {
                File fichero = null;
                if (jfc.getFileFilter().getDescription().equals(
                        "Diagramas de Flujo")) {
                    fichero
                            = new File(jfc.getSelectedFile().getPath() + ".ddf");
                    archivoAbierto = fichero;
                    recientes.add(fichero);
                } else {
                    fichero = jfc.getSelectedFile();
                }

                fw = new FileOutputStream(fichero);
                bw = new ObjectOutputStream(fw);
                Date Fecha = new Date();
                Documento d = new Documento(codeBox, pane, doc, style, Fecha);
                bw.writeObject(d);
                bw.flush();

                JOptionPane.showMessageDialog(this,
                        "Archivo guardado exitosamente");

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        try {
            bw.close();
            fw.close();
        } catch (IOException ex) {
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        String data = codeBox.getText().trim();
        String data2 = pane.getText().trim();
        boolean flag = false;
        if (!data.equals("") | !data2.equals("")) {
            int retorno = JOptionPane.showConfirmDialog(null, "Hay un projecto abierto actualmente. Desea Continuar:");
            if (retorno == 0) {
                flag = true;
            } else {
                flag = false;
            }
        } else {
            flag = true;
        }
        if (flag == true) {
            File fichero = null;
            FileInputStream entrada = null;
            ObjectInputStream objeto = null;
            try {
                JFileChooser jfc = new JFileChooser();
                FileNameExtensionFilter filtro
                        = new FileNameExtensionFilter(
                                "Diagramas de Flujo", "ddf");
                jfc.setFileFilter(filtro);
                int seleccion = jfc.showOpenDialog(this);
                if (seleccion == JFileChooser.APPROVE_OPTION) {
                    fichero = jfc.getSelectedFile();
                    archivoAbierto = fichero;
                    entrada
                            = new FileInputStream(fichero);
                    objeto
                            = new ObjectInputStream(entrada);

                    abrirDocumento(objeto);

                } //fin if

            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                objeto.close();
                entrada.close();
            } catch (IOException ex) {
            }
        }
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        String data = codeBox.getText().trim();

        String data2 = pane.getText().trim();
        String nombre = "";
        boolean flag = false;
        if (!data.equals("") | !data2.equals("")) {
            int retorno = JOptionPane.showConfirmDialog(null, "Hay un projecto abierto actualmente. Desea Continuar:");
            if (retorno == 0) {
                flag = true;
            } else {
                flag = false;
            }
        } else {
            flag = true;
        }
        if (flag == true) {
            DefaultTableModel modelo = (DefaultTableModel) recientesTable.getModel();
            modelo.setRowCount(0);
            for (int i = 0; i < recientes.size(); i++) {
                File fichero = null;
                FileInputStream entrada = null;
                ObjectInputStream objeto = null;
                try {
                    fichero = recientes.get(i);

                    int idx = fichero.toString().replaceAll("\\\\", "/").lastIndexOf("/");
                    nombre = (idx >= 0 ? fichero.toString().substring(idx + 1) : fichero.toString());

                    entrada
                            = new FileInputStream(fichero);
                    objeto
                            = new ObjectInputStream(entrada);
                    Documento temp = (Documento) objeto.readObject();
                    SimpleDateFormat formatter = new SimpleDateFormat("EEE, MMM d, yyyy ' - ' HH:mm:ss");
                    String strDate = formatter.format(((Documento) temp).getFecha());

                    Object[] newrow = {nombre, fichero.toString(), strDate};
                    modelo.addRow(newrow);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                try {
                    objeto.close();
                    entrada.close();
                } catch (IOException ex) {
                }

            }
            recientesTable.setModel(modelo);
            mostrarRecientes();
        }

    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        pane.setText("");

        //Update del JTree
        DefaultMutableTreeNode UML = new DefaultMutableTreeNode("UML");
        DefaultTreeModel treeModel = new DefaultTreeModel(UML);
        jtree.setModel(treeModel);

        //Update del ComboBox
        DefaultComboBoxModel cbUMLModelo = new DefaultComboBoxModel();
        cbUMLModelo.removeAllElements();
        clasescb.setModel(cbUMLModelo);

        //Reset Table
        resetTable();

        //Lock everything again
        clasenombre.setEnabled(false);
        btaddclass.setEnabled(false);
        addvar.setEnabled(false);
        remvar.setEnabled(false);
        clasenombre.setEnabled(true);
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        modelo.setRowCount(0);
        tabla.setModel(modelo);

        //reset pane
        pan.removeAll();
        pan.revalidate();
        pan.repaint();

        UMLcode.setText("");
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MouseClicked
        /*panel.add(newArea(red));
        panel.revalidate();
        validate();*/
        JLabel lbl1 = new JLabel("label 1");
        JLabel lbl2 = new JLabel("label 2");
        JLabel lbl3 = new JLabel("label 3");
        JLabel lbl4 = new JLabel("label 4");
        JLabel lbl5 = new JLabel("label 5");
        System.out.println(panel.getWidth());
        System.out.println(panel.getHeight());

        panel.add(lbl1);
        panel.add(lbl2);
        panel.add(lbl3);
        panel.add(lbl4);
        panel.add(lbl5);

        lbl1.setLocation(27, 20);
        lbl2.setLocation(123, 20);
        lbl3.setLocation(273, 20);
        lbl4.setLocation(363, 20);
        lbl5.setLocation(453, 20);

        lbl1.setSize(86, 14);
        lbl2.setSize(140, 14);
        lbl3.setSize(80, 14);
        lbl4.setSize(80, 14);
        lbl5.setSize(130, 14);
    }//GEN-LAST:event_jButton13MouseClicked

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        if (archivoAbierto != null) {
            int retorno = JOptionPane.showConfirmDialog(null, "PRECAUCION:\nEsta seguro que desea borrar permanentemente este archivo de su computador?");
            if (retorno == 0) {
                boolean flag = archivoAbierto.delete();
                if (flag) {
                    JOptionPane.showMessageDialog(null, "El archivo fue borrado exitosamente.");
                    pane.setText("");
                    codeBox.setText("");
                    recientes.remove(archivoAbierto);

                    archivoAbierto = null;
                } else {
                    JOptionPane.showMessageDialog(null, "Ocurrio un error. No se pudo borrar el archivo.");
                }

            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay un archivo abierto actualmente.");
        }
    }//GEN-LAST:event_jButton9MouseClicked

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        if (archivoAbierto == null) {
            JFileChooser jfc = new JFileChooser();
            FileNameExtensionFilter filtro
                    = new FileNameExtensionFilter(
                            "Diagramas de Flujo", "ddf");
            jfc.setFileFilter(filtro);
            int seleccion = jfc.showSaveDialog(this);

            FileOutputStream fw = null;
            ObjectOutputStream bw = null;
            if (seleccion == JFileChooser.APPROVE_OPTION) {
                try {
                    File fichero = null;
                    if (jfc.getFileFilter().getDescription().equals(
                            "Diagramas de Flujo")) {
                        fichero
                                = new File(jfc.getSelectedFile().getPath() + ".ddf");
                        archivoAbierto = fichero;
                        recientes.add(fichero);
                    } else {
                        fichero = jfc.getSelectedFile();
                    }

                    fw = new FileOutputStream(fichero);
                    bw = new ObjectOutputStream(fw);
                    Date Fecha = new Date();
                    Documento d = new Documento(codeBox, pane, doc, style, Fecha);
                    bw.writeObject(d);
                    bw.flush();

                    JOptionPane.showMessageDialog(this,
                            "Archivo guardado exitosamente");

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
            try {
                bw.close();
                fw.close();
            } catch (IOException ex) {
            }
        } else {

            FileOutputStream fw = null;
            ObjectOutputStream bw = null;
            try {
                File fichero = null;
                fichero = archivoAbierto;
                archivoAbierto.delete();
                fw = new FileOutputStream(fichero);
                bw = new ObjectOutputStream(fw);
                Date Fecha = new Date();
                Documento d = new Documento(codeBox, pane, doc, style, Fecha);
                bw.writeObject(d);
                bw.flush();

                JOptionPane.showMessageDialog(this,
                        "Cambios guardados exitosamente");

            } catch (Exception e) {
                e.printStackTrace();
            }

            try {
                bw.close();
                fw.close();
            } catch (IOException ex) {
            }
        }
    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        codeBox.setText("");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        LoadingBar h = new LoadingBar(loadBar);
        Thread proceso1 = new Thread(h);
        proceso1.start();
    }//GEN-LAST:event_jButton6MouseClicked

    private void panelColorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelColorMouseClicked
        try {
            StyleConstants.setForeground(style, panelColor.getBackground());

            doc.setCharacterAttributes(codeBox.getSelectionStart(),
                    codeBox.getSelectionEnd() - codeBox.getSelectionStart(),
                    codeBox.getStyle("miEstilo"),
                    true);
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_panelColorMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        try {
            StyleConstants.setForeground(style,
                    JColorChooser.showDialog(this,
                            "Seleccione Color", Color.red)
            );

            doc.setCharacterAttributes(codeBox.getSelectionStart(),
                    codeBox.getSelectionEnd() - codeBox.getSelectionStart(),
                    codeBox.getStyle("miEstilo"),
                    true);
            panelColor.setBackground(StyleConstants.getForeground(style));

        } catch (Exception ex) {
        }

    }//GEN-LAST:event_jButton3MouseClicked

    private void tamanioBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tamanioBoxActionPerformed
        StyleConstants.setFontSize(style, Integer.parseInt(tamanioBox.getSelectedItem().toString()));
        doc.setCharacterAttributes(codeBox.getSelectionStart(),
                codeBox.getSelectionEnd() - codeBox.getSelectionStart(),
                codeBox.getStyle("miEstilo"),
                true);
    }//GEN-LAST:event_tamanioBoxActionPerformed

    private void fontBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fontBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fontBoxActionPerformed

    private void fontBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_fontBoxItemStateChanged
        StyleConstants.setFontFamily(style, fontBox.getSelectedItem().toString());
        //StyleConstants.setFontSize(estilo, Integer.parseInt(cb_tamaño.getSelectedItem().toString()));
        doc.setCharacterAttributes(codeBox.getSelectionStart(),
                codeBox.getSelectionEnd() - codeBox.getSelectionStart(),
                codeBox.getStyle("miEstilo"),
                true);
    }//GEN-LAST:event_fontBoxItemStateChanged

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        try {
            StyleConstants.setUnderline(style, true);

            doc.setCharacterAttributes(codeBox.getSelectionStart(),
                    codeBox.getSelectionEnd() - codeBox.getSelectionStart(),
                    codeBox.getStyle("miEstilo"),
                    true);
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        try {
            StyleConstants.setItalic(style, true);

            doc.setCharacterAttributes(codeBox.getSelectionStart(),
                    codeBox.getSelectionEnd() - codeBox.getSelectionStart(),
                    codeBox.getStyle("miEstilo"),
                    true);
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void boldButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boldButtonMouseClicked
        try {
            StyleConstants.setBold(style, true);
            doc.setCharacterAttributes(codeBox.getSelectionStart(),
                    codeBox.getSelectionEnd() - codeBox.getSelectionStart(),
                    codeBox.getStyle("miEstilo"),
                    true);
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_boldButtonMouseClicked

    private void btnewclass1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnewclass1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnewclass1MouseClicked

    private void btnewclass1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnewclass1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnewclass1ActionPerformed

    private void btdeleteclass1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btdeleteclass1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btdeleteclass1MouseClicked

    private void btdeleteclass1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btdeleteclass1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btdeleteclass1ActionPerformed

    private void btaddclass1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btaddclass1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btaddclass1MouseClicked

    private void btaddclass1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btaddclass1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btaddclass1ActionPerformed

    private void checkpadre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkpadre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkpadre1ActionPerformed

    private void btupdateclass1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btupdateclass1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btupdateclass1MouseClicked

    private void btupdateclass1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btupdateclass1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btupdateclass1ActionPerformed

    private void jButton14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton14MouseClicked
        panelwork();
    }//GEN-LAST:event_jButton14MouseClicked

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        JFileChooser jfc = new JFileChooser();
        FileNameExtensionFilter filtro
                = new FileNameExtensionFilter(
                        "Archivo PNG", "png");
        jfc.setFileFilter(filtro);
        int seleccion = jfc.showSaveDialog(this);

        FileOutputStream fw2 = null;
        ObjectOutputStream bw2 = null;

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            try {
                File fichero2 = null;

                if (jfc.getFileFilter().getDescription().equals(
                        "Archivo PNG")) {
                    fichero2 = new File(jfc.getSelectedFile().getPath() + ".png");
                }
                //Save PNG

                fw2 = new FileOutputStream(fichero2);
                bw2 = new ObjectOutputStream(fw2);
                BufferedImage im = new BufferedImage(pan.getWidth(), pan.getHeight(), BufferedImage.TYPE_INT_ARGB);
                pan.paint(im.getGraphics());
                ImageIO.write(im, "PNG", fichero2);
                bw2.flush();

                JOptionPane.showMessageDialog(UMLCreation, "Archivo guardado exitosamente");

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        try {
            bw2.close();
            fw2.close();
        } catch (IOException ex) {
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        JFileChooser jfc = new JFileChooser();
        FileNameExtensionFilter filtro
                = new FileNameExtensionFilter(
                        "Archivo de Texto", "txt");
        jfc.setFileFilter(filtro);
        int seleccion = jfc.showSaveDialog(this);

        FileWriter fw3 = null;
        BufferedWriter bw3 = null;

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            try {

                File fichero3 = null;
                if (jfc.getFileFilter().getDescription().equals(
                        "Archivo de Texto")) {;
                    fichero3 = new File(jfc.getSelectedFile().getPath() + ".txt");
                }
                //Save TXT file
                fw3 = new FileWriter(fichero3);
                bw3 = new BufferedWriter(fw3);
                bw3.write(UMLcode.getText());
                bw3.flush();

                JOptionPane.showMessageDialog(UMLCreation, "Archivo guardado exitosamente");

            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        try {
            bw3.close();
            fw3.close();
        } catch (IOException ex) {
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed
    public JList createList(Clase c) {
        DefaultListModel<String> l1 = new DefaultListModel<>();
        l1.addElement("CLASE: " + ((c.getNombre()).toUpperCase()));
        JList<String> list = new JList<>(l1);
        int height = 16;
        for (int i = 0; i < c.getVar().size(); i++) {
            height += 16;
            l1.addElement(c.getVar().get(i));
        }
        list.setSize(100, height);

        //each List row is 16 pixels
        return list;

    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    public void addTableRow() {
        DefaultTableModel modeloTabla1 = (DefaultTableModel) tabla.getModel();
        TableColumn columna = tabla.getColumnModel().getColumn(0);
        JComboBox<String> comboBox = new JComboBox<>();
        DefaultComboBoxModel modeloCBVariables = (DefaultComboBoxModel) comboBox.getModel();
        modeloCBVariables.addElement("string");
        modeloCBVariables.addElement("char");
        modeloCBVariables.addElement("int");
        modeloCBVariables.addElement("double");
        modeloCBVariables.addElement("bool");
        comboBox.setModel(modeloCBVariables);
        columna.setCellEditor(new DefaultCellEditor(comboBox));
        Object[] newrow = {"Seleccione Tipo de Variable", ""};
        modeloTabla1.addRow(newrow);
        tabla.setModel(modeloTabla1);
    }

    public void resetTable() {
        DefaultTableModel modeloTabla1 = (DefaultTableModel) tabla.getModel();
        modeloTabla1.setRowCount(0);
        TableColumn columna = tabla.getColumnModel().getColumn(0);
        JComboBox<String> comboBox = new JComboBox<>();
        DefaultComboBoxModel modeloCBVariables = (DefaultComboBoxModel) comboBox.getModel();
        modeloCBVariables.addElement("string");
        modeloCBVariables.addElement("char");
        modeloCBVariables.addElement("int");
        modeloCBVariables.addElement("double");
        modeloCBVariables.addElement("bool");
        comboBox.setModel(modeloCBVariables);
        columna.setCellEditor(new DefaultCellEditor(comboBox));
        Object[] newrow = {"Seleccione Tipo de Variable", ""};
        modeloTabla1.addRow(newrow);
        tabla.setModel(modeloTabla1);
        clasenombre.setText("");
    }

    public void fillTable(Clase clase) {
        DefaultTableModel modeloTabla1 = (DefaultTableModel) tabla.getModel();
        modeloTabla1.setRowCount(0);
        for (int i = 0; i < clase.getVar().size(); i++) {
            String type = "";
            String name = "";
            String variable = clase.getVar().get(i).toString();
            StringTokenizer token = new StringTokenizer(variable);
            type = token.nextToken();
            name = token.nextToken();

            TableColumn columna = tabla.getColumnModel().getColumn(0);
            JComboBox<String> comboBox = new JComboBox<>();
            DefaultComboBoxModel modeloCBVariables = (DefaultComboBoxModel) comboBox.getModel();
            modeloCBVariables.addElement("string");
            modeloCBVariables.addElement("char");
            modeloCBVariables.addElement("int");
            modeloCBVariables.addElement("double");
            modeloCBVariables.addElement("bool");
            comboBox.setModel(modeloCBVariables);

            switch (type) {
                case "string": {
                    comboBox.setSelectedIndex(0);
                }
                break;
                case "char": {
                    comboBox.setSelectedIndex(1);
                }
                break;
                case "int": {
                    comboBox.setSelectedIndex(2);
                }
                break;
                case "double": {
                    comboBox.setSelectedIndex(3);
                }
                break;
                case "bool": {
                    comboBox.setSelectedIndex(4);
                }
                break;

            }
            columna.setCellEditor(new DefaultCellEditor(comboBox));
            Object[] newrow = {comboBox.getSelectedItem().toString(), name};
            modeloTabla1.addRow(newrow);
        }
        tabla.setModel(modeloTabla1);

    }

    public void mostrarRecientes() {
        RecientesDialog.setModal(true);
        RecientesDialog.pack();
        RecientesDialog.setLocationRelativeTo(this);
        RecientesDialog.setVisible(true);
    }

    public void mostrarUML() {
        UMLCreation.setModal(true);
        UMLCreation.pack();
        UMLCreation.setLocationRelativeTo(this);
        UMLCreation.setVisible(true);
    }

    public void mostrarFC() {
        FCCreation.setModal(true);
        FCCreation.pack();
        FCCreation.setLocationRelativeTo(this);
        FCCreation.setVisible(true);
    }

    public void abrirDocumento(ObjectInputStream objeto) throws IOException, ClassNotFoundException {
        pane.setText("");
        codeBox.setText("");
        Documento temp = (Documento) objeto.readObject();
        pane.setText(((Documento) temp).getPanel().getText());
        codeBox.setText(((Documento) temp).getPanelCodigo().getText());
        codeBox.setDocument(((Documento) temp).getDoc());
    }

    public void abrirUML2(ObjectInputStream objeto) throws IOException, ClassNotFoundException {
        pane.setText("");
        abrirUML(objeto);
        //Update del JTree
        DefaultMutableTreeNode UML = new DefaultMutableTreeNode("UML");
        UML = updateTree(clases, UML);
        DefaultTreeModel treeModel = new DefaultTreeModel(UML);
        jtree.setModel(treeModel);

        //Update del ComboBox
        DefaultComboBoxModel cbUMLModelo = (DefaultComboBoxModel) clasescb.getModel();
        cbUMLModelo.removeAllElements();
        cbUMLModelo = llenarCB(clases, cbUMLModelo);
        clasescb.setModel(cbUMLModelo);

        //Reset Table
        resetTable();

        //Lock everything again
        clasenombre.setEnabled(false);
        btaddclass.setEnabled(false);
        addvar.setEnabled(false);
        remvar.setEnabled(false);
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        modelo.setRowCount(0);
        tabla.setModel(modelo);

        //Panel
        panelwork();
    }

    public void abrirUML(ObjectInputStream objeto) throws IOException, ClassNotFoundException {
        UML temp = (UML) objeto.readObject();
        clases = temp.getClases();
        UMLcode.setText(temp.getCodigo());
    }

    public DefaultMutableTreeNode updateTree(ArrayList<Clase> array, DefaultMutableTreeNode main) {
        for (int j = 0; j < array.size(); j++) {
            DefaultMutableTreeNode clase = new DefaultMutableTreeNode(array.get(j).getNombre());
            main.add(clase);
            for (int i = 0; i < array.get(j).getVar().size(); i++) {
                DefaultMutableTreeNode var = new DefaultMutableTreeNode(array.get(j).getVar().get(i).toString());
                clase.add(var);
            }
            if (array.get(j).getHijos().isEmpty() == false) {
                clase = (updateTree(array.get(j).getHijos(), clase));

            }
        }
        return main;
    }

    public DefaultComboBoxModel llenarCB(ArrayList<Clase> array, DefaultComboBoxModel main) {
        for (int j = 0; j < array.size(); j++) {
            main.addElement(array.get(j).getNombre());
            if (array.get(j).getHijos().isEmpty() == false) {
                main = llenarCB(array.get(j).getHijos(), main);
            }
        }
        return main;
    }

    public ArrayList<Clase> addClase(ArrayList<Clase> array, Clase clase, String name) {
        for (int j = 0; j < array.size(); j++) {
            if (array.get(j).getNombre().equals(name)) {
                array.get(j).addHijos(clase);
                return array;
            } else if (array.get(j).getHijos().isEmpty() == false) {
                array.get(j).setHijos(addClase(array.get(j).getHijos(), clase, name));
            }
        }
        return array;
    }

    public Clase bringClase(ArrayList<Clase> array, String name) {
        Clase cla = null;
        for (int j = 0; j < array.size(); j++) {
            if (array.get(j).getNombre().equals(name)) {
                cla = array.get(j);
                return cla;
            } else if (array.get(j).getHijos().isEmpty() == false) {
                cla = bringClase(array.get(j).getHijos(), name);
            }
        }
        return cla;
    }

    public ArrayList<Clase> deleteClase(ArrayList<Clase> array, String name) {
        for (int j = 0; j < array.size(); j++) {
            if (array.get(j).getNombre().equals(name)) {
                array.remove(j);

            } else if (array.get(j).getHijos().isEmpty() == false) {
                array.get(j).setHijos(deleteClase(array.get(j).getHijos(), name));
            }
        }
        return array;
    }

    public ArrayList<Clase> updateClase(ArrayList<Clase> array, Clase clase, String name) {
        for (int j = 0; j < array.size(); j++) {
            if (array.get(j).getNombre().equals(name)) {
                array.set(j, clase);
                return array;
            } else if (array.get(j).getHijos().isEmpty() == false) {
                array.get(j).setHijos(updateClase(array.get(j).getHijos(), clase, name));
            }
        }
        return array;
    }

    public void updatePanel(ArrayList<Clase> array, int x, int y, int space, Color c, int r, int g, int b) {
        int plus;
        x = (x / array.size());
        plus = x;
        for (int j = 0; j < array.size(); j++) {
            JList list = createList(array.get(j));
            list.setBackground(c);
            pan.add(list);
            list.setLocation((((x / 2) - 50) + (j * plus) + space), y);
            if (array.get(j).getHijos().isEmpty() == false) {
                Color c1 = new Color((c.getRed() - r), (c.getGreen() - g), (c.getBlue() - b));
                updatePanel(array.get(j).getHijos(), x, (y + 10 + list.getHeight()), ((j * plus) + space), c1, r, g, b);
            }
        }
    }

    public String generateCodeUML(ArrayList<Clase> array, int space, String padre) {
        String code = "";
        String blank = "    ";
        for (int j = 0; j < array.size(); j++) {
            if (space == 0) {
                code += "class " + array.get(j).getNombre().toString() + "\n{\n" + blank + "public:\n";
                for (int i = 0; i < array.get(j).getVar().size(); i++) {
                    code += blank + blank + array.get(j).getVar().get(i).toString() + ";\n";
                }
                code += "};\n";
            } else {
                for (int k = 0; k < space; k++) {
                    code += blank;
                }
                code += "class " + array.get(j).getNombre().toString() + " : public " + padre + "\n";
                for (int k = 0; k < space; k++) {
                    code += blank;
                }
                code += "{\n";
                for (int k = 0; k < space; k++) {
                    code += blank;
                }
                code += blank + "private:\n";
                for (int i = 0; i < array.get(j).getVar().size(); i++) {
                    for (int k = 0; k < space; k++) {
                        code += blank;
                    }
                    code += blank + blank + array.get(j).getVar().get(i).toString() + ";\n";
                }
                for (int k = 0; k < space; k++) {
                    code += blank;
                }
                code += "};\n";
            }
            if (array.get(j).getHijos().isEmpty() == false) {
                code += generateCodeUML(array.get(j).getHijos(), space + 1, array.get(j).getNombre());
            }
        }
        return code;
    }

    public JTextArea newArea(Color m) {
        JTextArea t = new JTextArea();
        t.setBackground(m);
        t.setForeground(white);
        t.setSize(200, 200);
        return t;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog FCCreation;
    private javax.swing.JDialog RecientesDialog;
    private javax.swing.JDialog UMLCreation;
    private javax.swing.JTextPane UMLcode;
    private javax.swing.JButton addvar;
    private javax.swing.JButton boldButton;
    private javax.swing.JButton btaddclass;
    private javax.swing.JButton btaddclass1;
    private javax.swing.JButton btdeleteclass;
    private javax.swing.JButton btdeleteclass1;
    private javax.swing.JButton btnewclass;
    private javax.swing.JButton btnewclass1;
    private javax.swing.JButton btupdateclass;
    private javax.swing.JButton btupdateclass1;
    private javax.swing.JComboBox<String> cbcolor;
    private javax.swing.JCheckBox checkpadre;
    private javax.swing.JCheckBox checkpadre1;
    private javax.swing.JTextField clasenombre;
    private javax.swing.JComboBox<String> clasescb;
    private javax.swing.JComboBox<String> clasescb1;
    private javax.swing.JTextPane codeBox;
    private javax.swing.JLabel componentType;
    private javax.swing.JComboBox<String> fontBox;
    private javax.swing.JTextArea j2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JTree jtree;
    private javax.swing.JProgressBar loadBar;
    private javax.swing.JPanel pan;
    private javax.swing.JTextPane pane;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panelColor;
    private javax.swing.JTable recientesTable;
    private javax.swing.JButton remvar;
    private javax.swing.JTable tabla;
    private javax.swing.JComboBox<String> tamanioBox;
    // End of variables declaration//GEN-END:variables
}
