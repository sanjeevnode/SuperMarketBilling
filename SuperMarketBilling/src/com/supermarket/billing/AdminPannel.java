package com.supermarket.billing;

import com.supermarket.billing.classes.*;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 20383
 */
public class AdminPannel extends javax.swing.JFrame {

    /**
     * Creates new form AdminPannel
     */
    private Connection con;
    private final DefaultTableModel sellerTableModel;
    private final DefaultTableModel categoryTableModel;
    private final DefaultTableModel productTableModel;
    private int selectedSellerTableRow;
    private int selectedCatTableRow;
    private int selectedProductTableRow;

    public AdminPannel() {
        initComponents();

        con = database.db();

        categoryLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 2));
        productLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 2));
        signoutLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 2));
        sellerLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);

         productTable.setDefaultRenderer(String.class, centerRenderer);
        productTable.setDefaultRenderer(Integer.class, centerRenderer);
        productTable.setDefaultRenderer(Double.class, centerRenderer);
        productTable.getTableHeader().setFont(new Font("Times New Roman", Font.BOLD, 18));
         productTable.getTableHeader().setDefaultRenderer(centerRenderer);
         
        sellerTable.setDefaultRenderer(String.class, centerRenderer);
        sellerTable.setDefaultRenderer(Integer.class, centerRenderer);
        sellerTable.getTableHeader().setFont(new Font("Times New Roman", Font.BOLD, 18));
        sellerTable.getTableHeader().setDefaultRenderer(centerRenderer);
       
        categoryTable.setDefaultRenderer(String.class, centerRenderer);
        categoryTable.setDefaultRenderer(Integer.class, centerRenderer);
        categoryTable.getTableHeader().setFont(new Font("Times New Roman", Font.BOLD, 18));
        categoryTable.getTableHeader().setDefaultRenderer(centerRenderer);
        
        sellerPannel.setVisible(true);
        productPannel.setVisible(false);
        categoryPannel.setVisible(false);

        selectedSellerTableRow = -1;
        selectedCatTableRow = -1;
        selectedProductTableRow = -1;

        this.sellerTableModel = (DefaultTableModel) sellerTable.getModel();
        this.categoryTableModel = (DefaultTableModel) categoryTable.getModel();
        this.productTableModel = (DefaultTableModel) productTable.getModel();

        try {
            Statement stm = con.createStatement();
            String querry = "select * from sellertable;";

            ResultSet rs = stm.executeQuery(querry);

            while (rs.next()) {
                int sellid = rs.getInt("SellerId");
                String sellusername = rs.getString("Username");
                String sellname = rs.getString("Name");
                String sellpassword = rs.getString("Password");
                String sellgender = rs.getString("Gender");
                String sellphone = rs.getString("Phone");

                sellerTableModel.addRow(new Object[]{sellid, sellusername, sellname, sellpassword, sellgender, sellphone});
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error !!", JOptionPane.ERROR_MESSAGE);
        }

        try {
            Statement stm = con.createStatement();
            String querry = "select * from categorytable;";

            ResultSet rs = stm.executeQuery(querry);

            while (rs.next()) {
                int catid = rs.getInt("CategoryId");
                String catname = rs.getString("CategoryName");
                String catdescription = rs.getString("Description");

                categoryTableModel.addRow(new Object[]{catid, catname, catdescription});
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error !!", JOptionPane.ERROR_MESSAGE);
        }
        try {
            Statement stm = con.createStatement();
            String querry = "select * from producttable;";

            ResultSet rs = stm.executeQuery(querry);

            while (rs.next()) {
                int productid = rs.getInt("ProductId");
                String productname = rs.getString("ProductName");
                int productquantity = rs.getInt("Quantity");
                double productprice = rs.getDouble("Price");
                String productcat = rs.getString("Category");

                productTableModel.addRow(new Object[]{productid, productname, productquantity, productprice, productcat});
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error !!", JOptionPane.ERROR_MESSAGE);
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
        headingLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        sellerLabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        productLabel = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        categoryLabel = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        signoutLabel = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        productPannel = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        productIdField = new javax.swing.JTextField();
        productQuantityField = new javax.swing.JTextField();
        productPriceField = new javax.swing.JTextField();
        productNameField = new javax.swing.JTextField();
        productAddButton = new javax.swing.JButton();
        productDeleteButton = new javax.swing.JButton();
        productClearButton = new javax.swing.JButton();
        productEditButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        categoryComboBox = new javax.swing.JComboBox<>();
        categoryPannel = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        categoryIdField = new javax.swing.JTextField();
        categoryNameField = new javax.swing.JTextField();
        categoryDescriptionField = new javax.swing.JTextField();
        categoryAddButton = new javax.swing.JButton();
        categoryDeleteButton = new javax.swing.JButton();
        categoryClearButton = new javax.swing.JButton();
        categoryEditButton = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        categoryTable = new javax.swing.JTable();
        jLabel21 = new javax.swing.JLabel();
        sellerPannel = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        sellerIdField = new javax.swing.JTextField();
        sellerPasswordField = new javax.swing.JTextField();
        sellerUsernameField = new javax.swing.JTextField();
        sellerGenderField = new javax.swing.JTextField();
        sellerNameField = new javax.swing.JTextField();
        sellerPhoneField = new javax.swing.JTextField();
        sellerAddButton = new javax.swing.JButton();
        sellerDeleteButton = new javax.swing.JButton();
        sellerClearButton = new javax.swing.JButton();
        sellerEditButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        sellerTable = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Pannel");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(23, 11, 103));
        jPanel1.setLayout(new java.awt.CardLayout());

        headingLabel.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        headingLabel.setForeground(new java.awt.Color(249, 76, 0));
        headingLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headingLabel.setText("Manage Seller");
        jPanel1.add(headingLabel, "card2");

        jPanel2.setBackground(new java.awt.Color(23, 11, 103));

        jPanel3.setBackground(new java.awt.Color(0, 0, 102));
        jPanel3.setLayout(new java.awt.CardLayout());

        sellerLabel.setFont(new java.awt.Font("Centaur", 1, 24)); // NOI18N
        sellerLabel.setForeground(new java.awt.Color(255, 102, 0));
        sellerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sellerLabel.setText("Seller");
        sellerLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sellerLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sellerLabelMouseEntered(evt);
            }
        });
        jPanel3.add(sellerLabel, "card2");

        jPanel4.setBackground(new java.awt.Color(0, 0, 102));
        jPanel4.setLayout(new java.awt.CardLayout());

        productLabel.setFont(new java.awt.Font("Centaur", 1, 24)); // NOI18N
        productLabel.setForeground(new java.awt.Color(255, 102, 0));
        productLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        productLabel.setText("Product");
        productLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                productLabelMouseEntered(evt);
            }
        });
        jPanel4.add(productLabel, "card2");

        jPanel5.setBackground(new java.awt.Color(0, 0, 102));
        jPanel5.setLayout(new java.awt.CardLayout());

        categoryLabel.setFont(new java.awt.Font("Centaur", 1, 24)); // NOI18N
        categoryLabel.setForeground(new java.awt.Color(255, 102, 0));
        categoryLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        categoryLabel.setText("Category");
        categoryLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                categoryLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                categoryLabelMouseEntered(evt);
            }
        });
        jPanel5.add(categoryLabel, "card2");

        jPanel6.setBackground(new java.awt.Color(0, 0, 102));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel6MouseEntered(evt);
            }
        });
        jPanel6.setLayout(new java.awt.CardLayout());

        signoutLabel.setFont(new java.awt.Font("Centaur", 1, 24)); // NOI18N
        signoutLabel.setForeground(new java.awt.Color(255, 102, 0));
        signoutLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signoutLabel.setText("Sign Out");
        signoutLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signoutLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signoutLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signoutLabelMouseExited(evt);
            }
        });
        jPanel6.add(signoutLabel, "card2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
        );

        jLayeredPane1.setLayout(new java.awt.CardLayout());

        productPannel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                productPannelMouseEntered(evt);
            }
        });

        jPanel9.setBackground(new java.awt.Color(0, 0, 102));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel10.setBackground(new java.awt.Color(0, 0, 102));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel8.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Product ID");

        jLabel10.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Name");

        jLabel11.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 102, 102));
        jLabel11.setText("Quantity");

        jLabel12.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 102, 102));
        jLabel12.setText("Price");

        jLabel13.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("Category");

        productIdField.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        productIdField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        productIdField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        productIdField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                productIdFieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                productIdFieldKeyReleased(evt);
            }
        });

        productQuantityField.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        productQuantityField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        productQuantityField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        productQuantityField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                productQuantityFieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                productQuantityFieldKeyReleased(evt);
            }
        });

        productPriceField.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        productPriceField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        productPriceField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        productPriceField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                productPriceFieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                productPriceFieldKeyReleased(evt);
            }
        });

        productNameField.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        productNameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        productNameField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        productNameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                productNameFieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                productNameFieldKeyReleased(evt);
            }
        });

        productAddButton.setBackground(new java.awt.Color(0, 0, 153));
        productAddButton.setFont(new java.awt.Font("Centaur", 1, 18)); // NOI18N
        productAddButton.setForeground(new java.awt.Color(204, 102, 0));
        productAddButton.setText("ADD");
        productAddButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        productAddButton.setBorderPainted(false);
        productAddButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        productAddButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                productAddButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                productAddButtonMouseExited(evt);
            }
        });
        productAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productAddButtonActionPerformed(evt);
            }
        });

        productDeleteButton.setBackground(new java.awt.Color(0, 0, 153));
        productDeleteButton.setFont(new java.awt.Font("Centaur", 1, 18)); // NOI18N
        productDeleteButton.setForeground(new java.awt.Color(204, 102, 0));
        productDeleteButton.setText("DELETE");
        productDeleteButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        productDeleteButton.setBorderPainted(false);
        productDeleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                productDeleteButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                productDeleteButtonMouseExited(evt);
            }
        });
        productDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productDeleteButtonActionPerformed(evt);
            }
        });

        productClearButton.setBackground(new java.awt.Color(0, 0, 153));
        productClearButton.setFont(new java.awt.Font("Centaur", 1, 18)); // NOI18N
        productClearButton.setForeground(new java.awt.Color(204, 102, 0));
        productClearButton.setText("CLEAR");
        productClearButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        productClearButton.setBorderPainted(false);
        productClearButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                productClearButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                productClearButtonMouseExited(evt);
            }
        });
        productClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productClearButtonActionPerformed(evt);
            }
        });

        productEditButton.setBackground(new java.awt.Color(0, 0, 153));
        productEditButton.setFont(new java.awt.Font("Centaur", 1, 18)); // NOI18N
        productEditButton.setForeground(new java.awt.Color(204, 102, 0));
        productEditButton.setText("EDIT");
        productEditButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        productEditButton.setBorderPainted(false);
        productEditButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                productEditButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                productEditButtonMouseExited(evt);
            }
        });
        productEditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productEditButtonActionPerformed(evt);
            }
        });

        productTable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 153), 2, true));
        productTable.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ProductId", "ProductName", "Quantity", "Price", "Category"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        productTable.setColumnSelectionAllowed(true);
        productTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        productTable.setRowHeight(24);
        productTable.getTableHeader().setReorderingAllowed(false);
        productTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(productTable);
        productTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (productTable.getColumnModel().getColumnCount() > 0) {
            productTable.getColumnModel().getColumn(0).setResizable(false);
            productTable.getColumnModel().getColumn(1).setResizable(false);
            productTable.getColumnModel().getColumn(1).setPreferredWidth(100);
            productTable.getColumnModel().getColumn(2).setResizable(false);
            productTable.getColumnModel().getColumn(3).setResizable(false);
            productTable.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel14.setFont(new java.awt.Font("Centaur", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 51, 0));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Product List");

        categoryComboBox.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        categoryComboBox.setMaximumRowCount(10);
        categoryComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout productPannelLayout = new javax.swing.GroupLayout(productPannel);
        productPannel.setLayout(productPannelLayout);
        productPannelLayout.setHorizontalGroup(
            productPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(productPannelLayout.createSequentialGroup()
                .addGroup(productPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(productPannelLayout.createSequentialGroup()
                        .addGroup(productPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(productPannelLayout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addGroup(productPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(productPannelLayout.createSequentialGroup()
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(productQuantityField, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(productPannelLayout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(productIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(291, 291, 291))
                            .addGroup(productPannelLayout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(productAddButton)
                                .addGroup(productPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(productPannelLayout.createSequentialGroup()
                                        .addGap(119, 119, 119)
                                        .addComponent(productDeleteButton)
                                        .addGap(118, 118, 118)
                                        .addComponent(productEditButton)
                                        .addGap(39, 39, 39))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, productPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(productPannelLayout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, productPannelLayout.createSequentialGroup()
                                            .addGap(176, 176, 176)
                                            .addGroup(productPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(productPannelLayout.createSequentialGroup()
                                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(productNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(productPannelLayout.createSequentialGroup()
                                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(productPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                        .addGroup(productPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(productPannelLayout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(categoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(productPannelLayout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(productClearButton))))
                    .addGroup(productPannelLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 773, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        productPannelLayout.setVerticalGroup(
            productPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, productPannelLayout.createSequentialGroup()
                .addGroup(productPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(productPannelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(productPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(productIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(productNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(productPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(productQuantityField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(productPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(categoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(productPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(productAddButton)
                            .addComponent(productDeleteButton)
                            .addComponent(productClearButton)
                            .addComponent(productEditButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)))
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLayeredPane1.add(productPannel, "card2");

        jPanel11.setBackground(new java.awt.Color(0, 0, 102));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel12.setBackground(new java.awt.Color(0, 0, 102));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel15.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("Category Id");

        jLabel16.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("Category Name");

        jLabel17.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setText("Description");

        categoryIdField.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        categoryIdField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        categoryIdField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        categoryIdField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                categoryIdFieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                categoryIdFieldKeyReleased(evt);
            }
        });

        categoryNameField.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        categoryNameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        categoryNameField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        categoryNameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                categoryNameFieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                categoryNameFieldKeyReleased(evt);
            }
        });

        categoryDescriptionField.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        categoryDescriptionField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        categoryDescriptionField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        categoryDescriptionField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                categoryDescriptionFieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                categoryDescriptionFieldKeyReleased(evt);
            }
        });

        categoryAddButton.setBackground(new java.awt.Color(0, 0, 153));
        categoryAddButton.setFont(new java.awt.Font("Centaur", 1, 18)); // NOI18N
        categoryAddButton.setForeground(new java.awt.Color(204, 102, 0));
        categoryAddButton.setText("ADD");
        categoryAddButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        categoryAddButton.setBorderPainted(false);
        categoryAddButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                categoryAddButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                categoryAddButtonMouseExited(evt);
            }
        });
        categoryAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryAddButtonActionPerformed(evt);
            }
        });

        categoryDeleteButton.setBackground(new java.awt.Color(0, 0, 153));
        categoryDeleteButton.setFont(new java.awt.Font("Centaur", 1, 18)); // NOI18N
        categoryDeleteButton.setForeground(new java.awt.Color(204, 102, 0));
        categoryDeleteButton.setText("DELETE");
        categoryDeleteButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        categoryDeleteButton.setBorderPainted(false);
        categoryDeleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                categoryDeleteButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                categoryDeleteButtonMouseExited(evt);
            }
        });
        categoryDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryDeleteButtonActionPerformed(evt);
            }
        });

        categoryClearButton.setBackground(new java.awt.Color(0, 0, 153));
        categoryClearButton.setFont(new java.awt.Font("Centaur", 1, 18)); // NOI18N
        categoryClearButton.setForeground(new java.awt.Color(204, 102, 0));
        categoryClearButton.setText("CLEAR");
        categoryClearButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        categoryClearButton.setBorderPainted(false);
        categoryClearButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                categoryClearButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                categoryClearButtonMouseExited(evt);
            }
        });
        categoryClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryClearButtonActionPerformed(evt);
            }
        });

        categoryEditButton.setBackground(new java.awt.Color(0, 0, 153));
        categoryEditButton.setFont(new java.awt.Font("Centaur", 1, 18)); // NOI18N
        categoryEditButton.setForeground(new java.awt.Color(204, 102, 0));
        categoryEditButton.setText("EDIT");
        categoryEditButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        categoryEditButton.setBorderPainted(false);
        categoryEditButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                categoryEditButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                categoryEditButtonMouseExited(evt);
            }
        });
        categoryEditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryEditButtonActionPerformed(evt);
            }
        });

        categoryTable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 2, true));
        categoryTable.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        categoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CategoryId", "Name", "Description"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        categoryTable.setColumnSelectionAllowed(true);
        categoryTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        categoryTable.setRowHeight(24);
        categoryTable.setRowMargin(2);
        categoryTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        categoryTable.getTableHeader().setReorderingAllowed(false);
        categoryTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                categoryTableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(categoryTable);
        categoryTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (categoryTable.getColumnModel().getColumnCount() > 0) {
            categoryTable.getColumnModel().getColumn(0).setResizable(false);
            categoryTable.getColumnModel().getColumn(1).setResizable(false);
            categoryTable.getColumnModel().getColumn(1).setPreferredWidth(100);
            categoryTable.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel21.setFont(new java.awt.Font("Centaur", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 51, 0));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Category List");

        javax.swing.GroupLayout categoryPannelLayout = new javax.swing.GroupLayout(categoryPannel);
        categoryPannel.setLayout(categoryPannelLayout);
        categoryPannelLayout.setHorizontalGroup(
            categoryPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(categoryPannelLayout.createSequentialGroup()
                .addGroup(categoryPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(categoryPannelLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 773, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(categoryPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, categoryPannelLayout.createSequentialGroup()
                            .addGap(93, 93, 93)
                            .addComponent(categoryAddButton)
                            .addGroup(categoryPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(categoryPannelLayout.createSequentialGroup()
                                    .addGap(119, 119, 119)
                                    .addComponent(categoryDeleteButton)
                                    .addGap(118, 118, 118)
                                    .addComponent(categoryEditButton)
                                    .addGap(120, 120, 120))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, categoryPannelLayout.createSequentialGroup()
                                    .addGap(88, 88, 88)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(categoryClearButton))
                        .addGroup(categoryPannelLayout.createSequentialGroup()
                            .addGap(59, 59, 59)
                            .addGroup(categoryPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(categoryPannelLayout.createSequentialGroup()
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(categoryIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(135, 135, 135)
                                    .addComponent(jLabel16)
                                    .addGap(18, 18, 18)
                                    .addComponent(categoryNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(categoryPannelLayout.createSequentialGroup()
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(categoryDescriptionField, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        categoryPannelLayout.setVerticalGroup(
            categoryPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, categoryPannelLayout.createSequentialGroup()
                .addGroup(categoryPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(categoryPannelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(categoryPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(categoryIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(categoryNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(categoryPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(categoryDescriptionField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(categoryPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(categoryAddButton)
                            .addComponent(categoryDeleteButton)
                            .addComponent(categoryClearButton)
                            .addComponent(categoryEditButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)))
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLayeredPane1.add(categoryPannel, "card2");

        jPanel7.setBackground(new java.awt.Color(0, 0, 102));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(0, 0, 102));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Seller ID");

        jLabel2.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Username");

        jLabel3.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Name");

        jLabel4.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Password");

        jLabel5.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Gender");

        jLabel6.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Phone");

        sellerIdField.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        sellerIdField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sellerIdField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        sellerIdField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                sellerIdFieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sellerIdFieldKeyReleased(evt);
            }
        });

        sellerPasswordField.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        sellerPasswordField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sellerPasswordField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        sellerUsernameField.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        sellerUsernameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sellerUsernameField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        sellerUsernameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                sellerUsernameFieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sellerUsernameFieldKeyReleased(evt);
            }
        });

        sellerGenderField.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        sellerGenderField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sellerGenderField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        sellerGenderField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                sellerGenderFieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sellerGenderFieldKeyReleased(evt);
            }
        });

        sellerNameField.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        sellerNameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sellerNameField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        sellerNameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                sellerNameFieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sellerNameFieldKeyReleased(evt);
            }
        });

        sellerPhoneField.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        sellerPhoneField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sellerPhoneField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        sellerPhoneField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                sellerPhoneFieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sellerPhoneFieldKeyReleased(evt);
            }
        });

        sellerAddButton.setBackground(new java.awt.Color(0, 0, 153));
        sellerAddButton.setFont(new java.awt.Font("Centaur", 1, 18)); // NOI18N
        sellerAddButton.setForeground(new java.awt.Color(204, 102, 0));
        sellerAddButton.setText("ADD");
        sellerAddButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sellerAddButton.setBorderPainted(false);
        sellerAddButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sellerAddButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sellerAddButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sellerAddButtonMouseExited(evt);
            }
        });
        sellerAddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellerAddButtonActionPerformed(evt);
            }
        });

        sellerDeleteButton.setBackground(new java.awt.Color(0, 0, 153));
        sellerDeleteButton.setFont(new java.awt.Font("Centaur", 1, 18)); // NOI18N
        sellerDeleteButton.setForeground(new java.awt.Color(204, 102, 0));
        sellerDeleteButton.setText("DELETE");
        sellerDeleteButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sellerDeleteButton.setBorderPainted(false);
        sellerDeleteButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sellerDeleteButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sellerDeleteButtonMouseExited(evt);
            }
        });
        sellerDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellerDeleteButtonActionPerformed(evt);
            }
        });

        sellerClearButton.setBackground(new java.awt.Color(0, 0, 153));
        sellerClearButton.setFont(new java.awt.Font("Centaur", 1, 18)); // NOI18N
        sellerClearButton.setForeground(new java.awt.Color(204, 102, 0));
        sellerClearButton.setText("CLEAR");
        sellerClearButton.setBorderPainted(false);
        sellerClearButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sellerClearButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sellerClearButtonMouseExited(evt);
            }
        });
        sellerClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellerClearButtonActionPerformed(evt);
            }
        });

        sellerEditButton.setBackground(new java.awt.Color(0, 0, 153));
        sellerEditButton.setFont(new java.awt.Font("Centaur", 1, 18)); // NOI18N
        sellerEditButton.setForeground(new java.awt.Color(204, 102, 0));
        sellerEditButton.setText("EDIT");
        sellerEditButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sellerEditButton.setBorderPainted(false);
        sellerEditButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sellerEditButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sellerEditButtonMouseExited(evt);
            }
        });
        sellerEditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellerEditButtonActionPerformed(evt);
            }
        });

        sellerTable.setAutoCreateRowSorter(true);
        sellerTable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 2, true));
        sellerTable.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        sellerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SellerId", "Username", "Name", "Password", "Gender", "Phone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        sellerTable.setColumnSelectionAllowed(true);
        sellerTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sellerTable.setRowHeight(24);
        sellerTable.setRowMargin(2);
        sellerTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        sellerTable.getTableHeader().setReorderingAllowed(false);
        sellerTable.setVerifyInputWhenFocusTarget(false);
        sellerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sellerTableMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sellerTableMouseEntered(evt);
            }
        });
        jScrollPane2.setViewportView(sellerTable);
        sellerTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (sellerTable.getColumnModel().getColumnCount() > 0) {
            sellerTable.getColumnModel().getColumn(0).setResizable(false);
            sellerTable.getColumnModel().getColumn(1).setResizable(false);
            sellerTable.getColumnModel().getColumn(1).setPreferredWidth(100);
            sellerTable.getColumnModel().getColumn(2).setResizable(false);
            sellerTable.getColumnModel().getColumn(3).setResizable(false);
            sellerTable.getColumnModel().getColumn(4).setResizable(false);
            sellerTable.getColumnModel().getColumn(5).setResizable(false);
        }

        jLabel7.setFont(new java.awt.Font("Centaur", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Seller List");

        javax.swing.GroupLayout sellerPannelLayout = new javax.swing.GroupLayout(sellerPannel);
        sellerPannel.setLayout(sellerPannelLayout);
        sellerPannelLayout.setHorizontalGroup(
            sellerPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(sellerPannelLayout.createSequentialGroup()
                .addGroup(sellerPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sellerPannelLayout.createSequentialGroup()
                        .addGroup(sellerPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(sellerPannelLayout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addGroup(sellerPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(sellerPannelLayout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(sellerIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(sellerPannelLayout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(sellerPasswordField)))
                                .addGap(56, 56, 56)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(sellerUsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(sellerPannelLayout.createSequentialGroup()
                                .addGap(93, 93, 93)
                                .addComponent(sellerAddButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(sellerPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sellerPannelLayout.createSequentialGroup()
                                        .addComponent(sellerDeleteButton)
                                        .addGap(118, 118, 118)
                                        .addComponent(sellerEditButton)
                                        .addGap(39, 39, 39))
                                    .addGroup(sellerPannelLayout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(sellerGenderField, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sellerPannelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)))
                        .addGroup(sellerPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(sellerPannelLayout.createSequentialGroup()
                                .addGroup(sellerPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(sellerPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sellerNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sellerPhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(sellerPannelLayout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(sellerClearButton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(sellerPannelLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 773, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        sellerPannelLayout.setVerticalGroup(
            sellerPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sellerPannelLayout.createSequentialGroup()
                .addGroup(sellerPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(sellerPannelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(sellerPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sellerIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sellerNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sellerUsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(sellerPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sellerPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sellerGenderField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sellerPhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(sellerPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sellerAddButton)
                            .addComponent(sellerDeleteButton)
                            .addComponent(sellerClearButton)
                            .addComponent(sellerEditButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)))
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLayeredPane1.add(sellerPannel, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLayeredPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLayeredPane1)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void signoutLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signoutLabelMouseClicked
        // TODO add your handling code here:
        signoutLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        sellerLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 2));
        categoryLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 2));
        productLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 2));

        new toast("Signinng Out", 750, 650);
        new Login().setVisible(true);
        this.setVisible(false);
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(AdminPannel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_signoutLabelMouseClicked

    private void signoutLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signoutLabelMouseEntered
        // TODO add your handling code here:
        signoutLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_signoutLabelMouseEntered

    private void signoutLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signoutLabelMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_signoutLabelMouseExited

    private void jPanel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseEntered
        // TODO add your handling code here:

    }//GEN-LAST:event_jPanel6MouseEntered

    private void categoryLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoryLabelMouseClicked
        // TODO add your handling code here:
        sellerLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 2));
        productLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 2));
        signoutLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 2));
        categoryLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        headingLabel.setText("Manage Category");
        categoryPannel.setVisible(true);
        sellerPannel.setVisible(false);
        productPannel.setVisible(false);
        
        categoryTableModel.setRowCount(0);
        
                try {
            Statement stm = con.createStatement();
            String querry = "select * from categorytable;";

            ResultSet rs = stm.executeQuery(querry);

            while (rs.next()) {
                int catid = rs.getInt("CategoryId");
                String catname = rs.getString("CategoryName");
                String catdescription = rs.getString("Description");

                categoryTableModel.addRow(new Object[]{catid, catname, catdescription});
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error !!", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_categoryLabelMouseClicked

    private void categoryLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoryLabelMouseEntered
        // TODO add your handling code here:
        categoryLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_categoryLabelMouseEntered

    private void productLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productLabelMouseClicked
        // TODO add your handling code here:
        sellerLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 2));
        categoryLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 2));
        signoutLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 2));

        productLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        headingLabel.setText("Manage Product");
        productPannel.setVisible(true);
        categoryPannel.setVisible(false);
        sellerPannel.setVisible(false);

        try {
            String[] categoryItem;
            int i = 0;
            String querry1 = "select count(*) from categorytable;";
            Statement stm1 = con.createStatement();
            ResultSet rs1 = stm1.executeQuery(querry1);
            rs1.next();
            int n = rs1.getInt(1);
            categoryItem = new String[n];

            String querry2 = "select * from categorytable;";
            Statement stm2 = con.createStatement();
            ResultSet rs2 = stm2.executeQuery(querry2);
            while (rs2.next()) {
                categoryItem[i] = rs2.getString("CategoryName");
                i++;
            }

            categoryComboBox.setModel(new javax.swing.DefaultComboBoxModel(categoryItem));

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        



    }//GEN-LAST:event_productLabelMouseClicked

    private void productLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productLabelMouseEntered
        // TODO add your handling code here:
        productLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_productLabelMouseEntered

    private void sellerLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellerLabelMouseClicked
        // TODO add your handling code here:
        categoryLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 2));
        productLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 2));
        signoutLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 2));
        sellerLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        headingLabel.setText("Manage Seller");
        sellerPannel.setVisible(true);
        productPannel.setVisible(false);
        categoryPannel.setVisible(false);
   
    }//GEN-LAST:event_sellerLabelMouseClicked

    private void sellerLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellerLabelMouseEntered
        // TODO add your handling code here:
        sellerLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

    }//GEN-LAST:event_sellerLabelMouseEntered

    private void sellerAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellerAddButtonActionPerformed
        // TODO add your handling code here:

        if (sellerIdField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Seller Id is empty ", "Warnning", JOptionPane.WARNING_MESSAGE);
        } else if (sellerUsernameField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Seller Username is empty ", "Warnning", JOptionPane.WARNING_MESSAGE);
        } else if (sellerNameField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Seller Name is empty ", "Warnning", JOptionPane.WARNING_MESSAGE);
        } else if (sellerPasswordField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Seller Password is empty ", "Warnning", JOptionPane.WARNING_MESSAGE);
        } else if (sellerGenderField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Seller Gender is empty ", "Warnning", JOptionPane.WARNING_MESSAGE);
        } else if (sellerPhoneField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Seller Phone Number is empty ", "Warnning", JOptionPane.WARNING_MESSAGE);
        } else {

            String sellUsername, sellName, sellPassword, sellGender, sellPhone;
            int sellId;
            sellId = Integer.parseInt(sellerIdField.getText());
            sellUsername = sellerUsernameField.getText();
            sellName = sellerNameField.getText();
            sellPassword = sellerPasswordField.getText();
            sellGender = sellerGenderField.getText();
            sellPhone = sellerPhoneField.getText();

            try {
                String addQuerry = "insert into sellertable values(?,?,?,?,?,?);";
                PreparedStatement pst = con.prepareStatement(addQuerry);

                pst.setInt(1, sellId);
                pst.setString(2, sellUsername);
                pst.setString(3, sellName);
                pst.setString(4, sellPassword);
                pst.setString(5, sellGender);
                pst.setString(6, sellPhone);

                pst.execute();

                sellerTableModel.addRow(new Object[]{sellId, sellUsername, sellName, sellPassword, sellGender, sellPhone});

                new toast("Seller Added sucessfully", 750, 640);
                sellerIdField.setText("");
                sellerIdField.setEditable(true);
                sellerUsernameField.setText("");
                sellerNameField.setText("");
                sellerPasswordField.setText("");
                sellerGenderField.setText("");
                sellerPhoneField.setText("");

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }

        }


    }//GEN-LAST:event_sellerAddButtonActionPerformed

    private void sellerAddButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellerAddButtonMouseEntered
        // TODO add your handling code here:
        sellerAddButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        sellerAddButton.setBackground(new java.awt.Color(102, 0, 255));
    }//GEN-LAST:event_sellerAddButtonMouseEntered

    private void sellerAddButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellerAddButtonMouseExited
        // TODO add your handling code here:
        sellerAddButton.setBackground(new java.awt.Color(0, 0, 153));
    }//GEN-LAST:event_sellerAddButtonMouseExited

    private void sellerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellerTableMouseClicked
        // TODO add your handling code here:
        int i = sellerTable.getSelectedRow();
        selectedSellerTableRow = i;
        sellerIdField.setText(sellerTableModel.getValueAt(i, 0).toString());
        sellerUsernameField.setText(sellerTableModel.getValueAt(i, 1).toString());
        sellerNameField.setText(sellerTableModel.getValueAt(i, 2).toString());
        sellerPasswordField.setText(sellerTableModel.getValueAt(i, 3).toString());
        sellerGenderField.setText(sellerTableModel.getValueAt(i, 4).toString());
        sellerPhoneField.setText(sellerTableModel.getValueAt(i, 5).toString());
        sellerIdField.setEditable(false);
        //sellerIdField.setEnabled(false);
    }//GEN-LAST:event_sellerTableMouseClicked

    private void sellerClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellerClearButtonActionPerformed
        // TODO add your handling code here:
        sellerIdField.setText("");
        sellerIdField.setEditable(true);
        sellerUsernameField.setText("");
        sellerNameField.setText("");
        sellerPasswordField.setText("");
        sellerGenderField.setText("");
        sellerPhoneField.setText("");
    }//GEN-LAST:event_sellerClearButtonActionPerformed

    private void sellerDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellerDeleteButtonActionPerformed
        // TODO add your handling code here:

        if (sellerIdField.getText().equals("") || selectedSellerTableRow == -1) {
            JOptionPane.showMessageDialog(null, "Please select the seller to remove ", "Warnning ", JOptionPane.WARNING_MESSAGE);
        } else {
            int sellerid = Integer.parseInt(sellerIdField.getText());
            try {
                String querry = "delete from sellertable where SellerId =?";
                PreparedStatement pst = con.prepareStatement(querry);
                pst.setInt(1, sellerid);
                pst.execute();

                sellerTableModel.removeRow(selectedSellerTableRow);
                new toast("Seller Removed sucessfully", 750, 640);

                sellerIdField.setText("");
                sellerIdField.setEditable(true);
                sellerUsernameField.setText("");
                sellerNameField.setText("");
                sellerPasswordField.setText("");
                sellerGenderField.setText("");
                sellerPhoneField.setText("");

                selectedSellerTableRow = -1;
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Warnning ", JOptionPane.WARNING_MESSAGE);

            }
        }


    }//GEN-LAST:event_sellerDeleteButtonActionPerformed

    private void sellerDeleteButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellerDeleteButtonMouseEntered
        // TODO add your handling code here:
        sellerDeleteButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        sellerDeleteButton.setBackground(new java.awt.Color(102, 0, 255));
    }//GEN-LAST:event_sellerDeleteButtonMouseEntered

    private void sellerDeleteButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellerDeleteButtonMouseExited
        // TODO add your handling code here:
        sellerDeleteButton.setBackground(new java.awt.Color(0, 0, 153));
    }//GEN-LAST:event_sellerDeleteButtonMouseExited

    private void sellerEditButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellerEditButtonMouseEntered
        // TODO add your handling code here:
        sellerEditButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        sellerEditButton.setBackground(new java.awt.Color(102, 0, 255));
    }//GEN-LAST:event_sellerEditButtonMouseEntered

    private void sellerEditButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellerEditButtonMouseExited
        // TODO add your handling code here:
        sellerEditButton.setBackground(new java.awt.Color(0, 0, 153));
    }//GEN-LAST:event_sellerEditButtonMouseExited

    private void sellerClearButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellerClearButtonMouseEntered
        // TODO add your handling code here:
        sellerClearButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        sellerClearButton.setBackground(new java.awt.Color(102, 0, 255));

    }//GEN-LAST:event_sellerClearButtonMouseEntered

    private void sellerClearButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellerClearButtonMouseExited
        // TODO add your handling code here:
        sellerClearButton.setBackground(new java.awt.Color(0, 0, 153));
    }//GEN-LAST:event_sellerClearButtonMouseExited

    private void sellerEditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellerEditButtonActionPerformed
        // TODO add your handling code here:
        if (sellerIdField.getText().equals("") || selectedSellerTableRow == -1)
            JOptionPane.showMessageDialog(null, "Please select seller to edit ", "Warnning ", JOptionPane.WARNING_MESSAGE);
        else {
            String sellUsername, sellName, sellPassword, sellGender, sellPhone;
            int sellId;
            sellId = Integer.parseInt(sellerIdField.getText());
            sellUsername = sellerUsernameField.getText();
            sellName = sellerNameField.getText();
            sellPassword = sellerPasswordField.getText();
            sellGender = sellerGenderField.getText();
            sellPhone = sellerPhoneField.getText();

            try {
                String addQuerry = "update sellertable set Username = ?,Name = ?,Password = ?,Gender = ?,Phone = ? where SellerId = ? ;";
                PreparedStatement pst = con.prepareStatement(addQuerry);

                pst.setString(1, sellUsername);
                pst.setString(2, sellName);
                pst.setString(3, sellPassword);
                pst.setString(4, sellGender);
                pst.setString(5, sellPhone);
                pst.setInt(6, sellId);

                pst.execute();

                sellerTableModel.setValueAt(sellUsername, selectedSellerTableRow, 1);
                sellerTableModel.setValueAt(sellName, selectedSellerTableRow, 2);
                sellerTableModel.setValueAt(sellPassword, selectedSellerTableRow, 3);
                sellerTableModel.setValueAt(sellGender, selectedSellerTableRow, 4);
                sellerTableModel.setValueAt(sellPhone, selectedSellerTableRow, 5);

                sellerIdField.setText("");
                sellerIdField.setEditable(true);
                sellerUsernameField.setText("");
                sellerNameField.setText("");
                sellerPasswordField.setText("");
                sellerGenderField.setText("");
                sellerPhoneField.setText("");

                new toast("Seller Edited sucessfully", 750, 640);
                selectedSellerTableRow = -1;
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_sellerEditButtonActionPerformed

    private void categoryAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryAddButtonActionPerformed
        // TODO add your handling code here:
        if (categoryIdField.getText().equals(""))
            JOptionPane.showMessageDialog(null, "Category Id is empty ", "Warnning", JOptionPane.WARNING_MESSAGE);
        else if (categoryNameField.getText().equals(""))
            JOptionPane.showMessageDialog(null, "Category Name is empty ", "Warnning", JOptionPane.WARNING_MESSAGE);
        else if (categoryDescriptionField.getText().equals(""))
            JOptionPane.showMessageDialog(null, "Category Description is empty ", "Warnning", JOptionPane.WARNING_MESSAGE);
        else {
            int catId;
            String catName, catDescription;
            catId = Integer.parseInt(categoryIdField.getText());
            catName = categoryNameField.getText();
            catDescription = categoryDescriptionField.getText();

            try {
                String addQuerry = "insert into categorytable values(?,?,?);";
                PreparedStatement pst = con.prepareStatement(addQuerry);

                pst.setInt(1, catId);
                pst.setString(2, catName);
                pst.setString(3, catDescription);

                pst.execute();

                categoryTableModel.addRow(new Object[]{catId, catName, catDescription});

                new toast("Category Added sucessfully", 750, 640);
                categoryIdField.setText("");
                categoryIdField.setEditable(true);
                categoryNameField.setText("");
                categoryDescriptionField.setText("");

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }

        }
    }//GEN-LAST:event_categoryAddButtonActionPerformed

    private void sellerTableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellerTableMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_sellerTableMouseEntered

    private void categoryTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoryTableMouseClicked
        // TODO add your handling code here:
        int i = categoryTable.getSelectedRow();
        selectedCatTableRow = i;

        categoryIdField.setText(categoryTable.getValueAt(i, 0).toString());
        categoryNameField.setText(categoryTable.getValueAt(i, 1).toString());
        categoryDescriptionField.setText(categoryTable.getValueAt(i, 2).toString());
        categoryIdField.setEditable(false);
    }//GEN-LAST:event_categoryTableMouseClicked

    private void categoryClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryClearButtonActionPerformed
        // TODO add your handling code here:
        categoryIdField.setText("");
        categoryIdField.setEditable(true);
        categoryNameField.setText("");
        categoryDescriptionField.setText("");

    }//GEN-LAST:event_categoryClearButtonActionPerformed

    private void categoryDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryDeleteButtonActionPerformed
        // TODO add your handling code here:
        if (categoryIdField.getText().equals("") || selectedCatTableRow == -1) {
            JOptionPane.showMessageDialog(null, "Please select the Category to remove ", "Warnning ", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                Statement stm = con.createStatement();
                String querry1 = "select * from producttable where Category = '" + categoryNameField.getText() + "' ;";

                ResultSet rs1 = stm.executeQuery(querry1);

                if (rs1.next()) {
                    JOptionPane.showMessageDialog(null, "You cant delete Category of existing product", "Error !!", JOptionPane.ERROR_MESSAGE);
                } else {
                    int catid = Integer.parseInt(categoryIdField.getText());
                    try {
                        String querry = "delete from categorytable where CategoryId =?";
                        PreparedStatement pst = con.prepareStatement(querry);
                        pst.setInt(1, catid);
                        pst.execute();

                        categoryTableModel.removeRow(selectedCatTableRow);
                        new toast("Category Removed sucessfully", 750, 640);

                        categoryIdField.setText("");
                        categoryIdField.setEditable(true);
                        categoryNameField.setText("");
                        categoryDescriptionField.setText("");

                        selectedCatTableRow = -1;
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage(), "Warnning ", JOptionPane.WARNING_MESSAGE);

                    }
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error !!", JOptionPane.ERROR_MESSAGE);
            }

        }
    }//GEN-LAST:event_categoryDeleteButtonActionPerformed

    private void categoryEditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryEditButtonActionPerformed
        // TODO add your handling code here:
        if (categoryIdField.getText().equals("") || selectedCatTableRow == -1)
            JOptionPane.showMessageDialog(null, "Please select Category to edit ", "Warnning ", JOptionPane.WARNING_MESSAGE);
        else {
            String catname, catdescription;
            int catid;
            catid = Integer.parseInt(categoryIdField.getText());
            catname = categoryNameField.getText();
            catdescription = categoryDescriptionField.getText();

            try {
                String addQuerry = "update categorytable set CategoryName = ?,Description = ? where CategoryId = ? ;";
                PreparedStatement pst = con.prepareStatement(addQuerry);

                pst.setString(1, catname);
                pst.setString(2, catdescription);
                pst.setInt(3, catid);

                pst.execute();

                categoryTableModel.setValueAt(catname, selectedCatTableRow, 1);
                categoryTableModel.setValueAt(catdescription, selectedCatTableRow, 2);

                categoryIdField.setText("");
                categoryIdField.setEditable(true);
                categoryNameField.setText("");
                categoryDescriptionField.setText("");

                new toast("Category Edited sucessfully", 750, 640);
                selectedCatTableRow = -1;
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_categoryEditButtonActionPerformed

    private void productAddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productAddButtonActionPerformed
        // TODO add your handling code here:
        if (productIdField.getText().equals(""))
            JOptionPane.showMessageDialog(null, "Product id is empty ", "Warning", JOptionPane.WARNING_MESSAGE);
        else if (productNameField.getText().equals(""))
            JOptionPane.showMessageDialog(null, "Product Name is empty ", "Warning", JOptionPane.WARNING_MESSAGE);
        else if (productQuantityField.getText().equals(""))
            JOptionPane.showMessageDialog(null, "Product Quantity is empty ", "Warning", JOptionPane.WARNING_MESSAGE);
        else if (productPriceField.getText().equals(""))
            JOptionPane.showMessageDialog(null, "Product price is empty ", "Warning", JOptionPane.WARNING_MESSAGE);
        else {
            int productId, productQuantity;
            double productPrice;
            String productName, productCategory;
            productId = Integer.parseInt(productIdField.getText());
            productQuantity = Integer.parseInt(productQuantityField.getText());
            productPrice = Double.parseDouble(productPriceField.getText());
            productName = productNameField.getText();
            productCategory = categoryComboBox.getSelectedItem().toString();

            try {
                String addQuerry = "insert into producttable values(?,?,?,?,?);";
                PreparedStatement pst = con.prepareStatement(addQuerry);

                pst.setInt(1, productId);
                pst.setString(2, productName);
                pst.setInt(3, productQuantity);
                pst.setDouble(4, productPrice);
                pst.setString(5, productCategory);

                pst.execute();

                productTableModel.addRow(new Object[]{productId, productName, productQuantity, productPrice, productCategory});

                new toast("product Added sucessfully", 750, 640);

                productIdField.setText("");
                productNameField.setText("");
                productQuantityField.setText("");
                productPriceField.setText("");
                categoryComboBox.setSelectedIndex(0);
                productIdField.setEditable(true);

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }

        }
    }//GEN-LAST:event_productAddButtonActionPerformed

    private void productTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productTableMouseClicked
        // TODO add your handling code here:
        int i = productTable.getSelectedRow();
        selectedProductTableRow = i;
        productIdField.setText(productTable.getValueAt(i, 0).toString());
        productNameField.setText(productTable.getValueAt(i, 1).toString());
        productQuantityField.setText(productTable.getValueAt(i, 2).toString());
        productPriceField.setText(productTable.getValueAt(i, 3).toString());
        categoryComboBox.setSelectedItem(productTable.getValueAt(i, 4));
        productIdField.setEditable(false);

    }//GEN-LAST:event_productTableMouseClicked

    private void productClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productClearButtonActionPerformed
        // TODO add your handling code here:
        productIdField.setText("");
        productNameField.setText("");
        productQuantityField.setText("");
        productPriceField.setText("");
        categoryComboBox.setSelectedIndex(0);
        productIdField.setEditable(true);
    }//GEN-LAST:event_productClearButtonActionPerformed

    private void productDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productDeleteButtonActionPerformed
        // TODO add your handling code here:
        if (productIdField.getText().equals("") || selectedProductTableRow == -1) {
            JOptionPane.showMessageDialog(null, "Please select a product", "Warnning", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                String addQuerry = "delete from producttable where ProductId = ?;";
                PreparedStatement pst = con.prepareStatement(addQuerry);
                pst.setInt(1, Integer.parseInt(productIdField.getText()));

                pst.execute();

                productTableModel.removeRow(selectedProductTableRow);

                new toast("product removed sucessfully", 750, 640);

                productIdField.setText("");
                productNameField.setText("");
                productQuantityField.setText("");
                productPriceField.setText("");
                categoryComboBox.setSelectedIndex(0);
                productIdField.setEditable(true);
                selectedProductTableRow = -1;

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_productDeleteButtonActionPerformed

    private void productEditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productEditButtonActionPerformed
        // TODO add your handling code here:
        if (productIdField.getText().equals("") || selectedProductTableRow == -1)
            JOptionPane.showMessageDialog(null, "Please select a product", "Warnning", JOptionPane.WARNING_MESSAGE);
        else {
            try {
                String addQuerry = "update producttable set ProductName = ?,Quantity = ?,Price = ?,Category = ? where ProductId = ?;";

                PreparedStatement pst = con.prepareStatement(addQuerry);
                pst.setString(1, productNameField.getText());
                pst.setInt(2, Integer.parseInt(productQuantityField.getText()));
                pst.setDouble(3, Double.parseDouble(productPriceField.getText()));
                pst.setString(4, categoryComboBox.getSelectedItem().toString());
                pst.setInt(5, Integer.parseInt(productIdField.getText()));

                pst.execute();

                productTableModel.setValueAt(productNameField.getText(), selectedProductTableRow, 1);
                productTableModel.setValueAt(Integer.parseInt(productQuantityField.getText()), selectedProductTableRow, 2);
                productTableModel.setValueAt(Double.parseDouble(productPriceField.getText()), selectedProductTableRow, 3);
                productTableModel.setValueAt(categoryComboBox.getSelectedItem().toString(), selectedProductTableRow, 4);

                new toast("product Edited sucessfully", 750, 640);

                productIdField.setText("");
                productNameField.setText("");
                productQuantityField.setText("");
                productPriceField.setText("");
                categoryComboBox.setSelectedIndex(0);
                productIdField.setEditable(true);
                selectedProductTableRow = -1;

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_productEditButtonActionPerformed

    private void productClearButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productClearButtonMouseEntered
        // TODO add your handling code here:
        productClearButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        productClearButton.setBackground(new java.awt.Color(102, 0, 255));
    }//GEN-LAST:event_productClearButtonMouseEntered

    private void productClearButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productClearButtonMouseExited
        // TODO add your handling code here:
        productClearButton.setBackground(new java.awt.Color(0, 0, 153));
    }//GEN-LAST:event_productClearButtonMouseExited

    private void productPannelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productPannelMouseEntered
        // TODO add your handling code here:

    }//GEN-LAST:event_productPannelMouseEntered

    private void productEditButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productEditButtonMouseEntered
        // TODO add your handling code here:
        productEditButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        productEditButton.setBackground(new java.awt.Color(102, 0, 255));
    }//GEN-LAST:event_productEditButtonMouseEntered

    private void productEditButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productEditButtonMouseExited
        // TODO add your handling code here:
        productEditButton.setBackground(new java.awt.Color(0, 0, 153));
    }//GEN-LAST:event_productEditButtonMouseExited

    private void productDeleteButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productDeleteButtonMouseEntered
        // TODO add your handling code here:
        productDeleteButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        productDeleteButton.setBackground(new java.awt.Color(102, 0, 255));
    }//GEN-LAST:event_productDeleteButtonMouseEntered

    private void productDeleteButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productDeleteButtonMouseExited
        // TODO add your handling code here:
        productDeleteButton.setBackground(new java.awt.Color(0, 0, 153));
    }//GEN-LAST:event_productDeleteButtonMouseExited

    private void productAddButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productAddButtonMouseEntered
        // TODO add your handling code here:
        productAddButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        productAddButton.setBackground(new java.awt.Color(102, 0, 255));
    }//GEN-LAST:event_productAddButtonMouseEntered

    private void productAddButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productAddButtonMouseExited
        // TODO add your handling code here:
        productAddButton.setBackground(new java.awt.Color(0, 0, 153));
    }//GEN-LAST:event_productAddButtonMouseExited

    private void categoryAddButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoryAddButtonMouseEntered
        // TODO add your handling code here:
        categoryAddButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        categoryAddButton.setBackground(new java.awt.Color(102, 0, 255));
    }//GEN-LAST:event_categoryAddButtonMouseEntered

    private void categoryAddButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoryAddButtonMouseExited
        // TODO add your handling code here:
        categoryAddButton.setBackground(new java.awt.Color(0, 0, 153));
    }//GEN-LAST:event_categoryAddButtonMouseExited

    private void categoryDeleteButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoryDeleteButtonMouseEntered
        // TODO add your handling code here:
        categoryDeleteButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        categoryDeleteButton.setBackground(new java.awt.Color(102, 0, 255));

    }//GEN-LAST:event_categoryDeleteButtonMouseEntered

    private void categoryDeleteButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoryDeleteButtonMouseExited
        // TODO add your handling code here:
        categoryDeleteButton.setBackground(new java.awt.Color(0, 0, 153));
    }//GEN-LAST:event_categoryDeleteButtonMouseExited

    private void categoryEditButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoryEditButtonMouseEntered
        // TODO add your handling code here:
        categoryEditButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        categoryEditButton.setBackground(new java.awt.Color(102, 0, 255));
    }//GEN-LAST:event_categoryEditButtonMouseEntered

    private void categoryEditButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoryEditButtonMouseExited
        // TODO add your handling code here:
        categoryEditButton.setBackground(new java.awt.Color(0, 0, 153));
    }//GEN-LAST:event_categoryEditButtonMouseExited

    private void categoryClearButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoryClearButtonMouseEntered
        // TODO add your handling code here:
        categoryClearButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        categoryClearButton.setBackground(new java.awt.Color(102, 0, 255));
    }//GEN-LAST:event_categoryClearButtonMouseEntered

    private void categoryClearButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoryClearButtonMouseExited
        // TODO add your handling code here:
        categoryClearButton.setBackground(new java.awt.Color(0, 0, 153));
    }//GEN-LAST:event_categoryClearButtonMouseExited

    private void productIdFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_productIdFieldKeyPressed
        // TODO add your handling code here:
        int c = evt.getKeyChar();
        if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
            evt.consume();  // if it's not a number, ignore the event
            productIdField.setEditable(false);
        }
        else
            productIdField.setEditable(true);
    }//GEN-LAST:event_productIdFieldKeyPressed

    private void productNameFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_productNameFieldKeyPressed
        // TODO add your handling code here:
        int c = evt.getKeyChar();
        if ( ((c>=65 && c<=90) || (c >=97 && c<=122)) ||((c == KeyEvent.VK_BACK_SPACE)||(c == KeyEvent.VK_SPACE))) {
            productNameField.setEditable(true);
        }
        else{
            evt.consume();  // if it's not a number, ignore the event
            productNameField.setEditable(false);
        }
    }//GEN-LAST:event_productNameFieldKeyPressed

    private void productQuantityFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_productQuantityFieldKeyPressed
        // TODO add your handling code here:
        int c = evt.getKeyChar();
        if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
            evt.consume();  // if it's not a number, ignore the event
            productQuantityField.setEditable(false);
        }
        else
            productQuantityField.setEditable(true);
    }//GEN-LAST:event_productQuantityFieldKeyPressed

    private void productPriceFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_productPriceFieldKeyPressed
        // TODO add your handling code here:
        int c = evt.getKeyCode();
        if((c >='0' && c<='9')||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_PERIOD)||(c==KeyEvent.VK_DECIMAL))
            productPriceField.setEditable(true);
        else{
            evt.consume();
            productPriceField.setEditable(false);
        }
    }//GEN-LAST:event_productPriceFieldKeyPressed

    private void categoryIdFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_categoryIdFieldKeyPressed
        // TODO add your handling code here:
        int c = evt.getKeyChar();
        if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
            evt.consume();  // if it's not a number, ignore the event
            categoryIdField.setEditable(false);
        }
        else
            categoryIdField.setEditable(true);
    }//GEN-LAST:event_categoryIdFieldKeyPressed

    private void categoryNameFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_categoryNameFieldKeyPressed
        // TODO add your handling code here:
         int c = evt.getKeyChar();
        if ( ((c>=65 && c<=90) || (c >=97 && c<=122)) ||((c == KeyEvent.VK_BACK_SPACE)||(c == KeyEvent.VK_SPACE))) {
            categoryNameField.setEditable(true);
        }
        else{
            evt.consume();  // if it's not a number, ignore the event
            categoryNameField.setEditable(false);
        }
    }//GEN-LAST:event_categoryNameFieldKeyPressed

    private void categoryDescriptionFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_categoryDescriptionFieldKeyPressed
        // TODO add your handling code here:
         int c = evt.getKeyChar();
        if ( ((c>=65 && c<=90) || (c >=97 && c<=122)) ||((c == KeyEvent.VK_BACK_SPACE)||(c == KeyEvent.VK_SPACE))) {
            categoryDescriptionField.setEditable(true);
        }
        else{
            evt.consume();  // if it's not a number, ignore the event
            categoryDescriptionField.setEditable(false);
        }
    }//GEN-LAST:event_categoryDescriptionFieldKeyPressed

    private void sellerIdFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sellerIdFieldKeyPressed
        // TODO add your handling code here:
        int c = evt.getKeyChar();
        if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
            evt.consume();  // if it's not a number, ignore the event
            sellerIdField.setEditable(false);
        }
        else
            sellerIdField.setEditable(true);
    }//GEN-LAST:event_sellerIdFieldKeyPressed

    private void sellerUsernameFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sellerUsernameFieldKeyPressed

    }//GEN-LAST:event_sellerUsernameFieldKeyPressed

    private void sellerNameFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sellerNameFieldKeyPressed
        // TODO add your handling code here:
         int c = evt.getKeyChar();
        if ( ((c>=65 && c<=90) || (c >=97 && c<=122)) ||((c == KeyEvent.VK_BACK_SPACE)||(c == KeyEvent.VK_SPACE))) {
            sellerNameField.setEditable(true);
        }
        else{
            evt.consume();  // if it's not a number, ignore the event
            sellerNameField.setEditable(false);
        }
    }//GEN-LAST:event_sellerNameFieldKeyPressed

    private void sellerGenderFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sellerGenderFieldKeyPressed
        // TODO add your handling code here:
        int c = evt.getKeyChar();
        if ( ((c>=65 && c<=90) || (c >=97 && c<=122)) ||((c == KeyEvent.VK_BACK_SPACE)||(c == KeyEvent.VK_SPACE))) {
            sellerGenderField.setEditable(true);
        }
        else{
            evt.consume();  // if it's not a number, ignore the event
            sellerGenderField.setEditable(false);
        }
    }//GEN-LAST:event_sellerGenderFieldKeyPressed

    private void sellerPhoneFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sellerPhoneFieldKeyPressed
        // TODO add your handling code here:
        int c = evt.getKeyChar();
        if ( ((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
            evt.consume();  // if it's not a number, ignore the event
            sellerPhoneField.setEditable(false);
        }
        else
            sellerPhoneField.setEditable(true);
    }//GEN-LAST:event_sellerPhoneFieldKeyPressed

    private void productIdFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_productIdFieldKeyReleased
        // TODO add your handling code here:
        productIdField.setEditable(true);
    }//GEN-LAST:event_productIdFieldKeyReleased

    private void productNameFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_productNameFieldKeyReleased
        // TODO add your handling code here:
        productNameField.setEditable(true);
    }//GEN-LAST:event_productNameFieldKeyReleased

    private void productQuantityFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_productQuantityFieldKeyReleased
        // TODO add your handling code here:
        productQuantityField.setEditable(true);
    }//GEN-LAST:event_productQuantityFieldKeyReleased

    private void productPriceFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_productPriceFieldKeyReleased
        // TODO add your handling code here:
        productPriceField.setEditable(true);
    }//GEN-LAST:event_productPriceFieldKeyReleased

    private void categoryIdFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_categoryIdFieldKeyReleased
        // TODO add your handling code here:
        categoryIdField.setEditable(true);
    }//GEN-LAST:event_categoryIdFieldKeyReleased

    private void categoryNameFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_categoryNameFieldKeyReleased
        // TODO add your handling code here:
        categoryNameField.setEditable(true);
    }//GEN-LAST:event_categoryNameFieldKeyReleased

    private void categoryDescriptionFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_categoryDescriptionFieldKeyReleased
       categoryDescriptionField.setEditable(true); // TODO add your handling code here:
    }//GEN-LAST:event_categoryDescriptionFieldKeyReleased

    private void sellerIdFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sellerIdFieldKeyReleased
       sellerIdField.setEditable(true); // TODO add your handling code here:
    }//GEN-LAST:event_sellerIdFieldKeyReleased

    private void sellerUsernameFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sellerUsernameFieldKeyReleased
       sellerUsernameField.setEditable(true); // TODO add your handling code here:
    }//GEN-LAST:event_sellerUsernameFieldKeyReleased

    private void sellerNameFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sellerNameFieldKeyReleased
        sellerNameField.setEditable(true);// TODO add your handling code here:
    }//GEN-LAST:event_sellerNameFieldKeyReleased

    private void sellerGenderFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sellerGenderFieldKeyReleased
        sellerGenderField.setEditable(true);// TODO add your handling code here:
    }//GEN-LAST:event_sellerGenderFieldKeyReleased

    private void sellerPhoneFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sellerPhoneFieldKeyReleased
        sellerPhoneField.setEditable(true);// TODO add your handling code here:
    }//GEN-LAST:event_sellerPhoneFieldKeyReleased

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
            java.util.logging.Logger.getLogger(AdminPannel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPannel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPannel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPannel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AdminPannel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton categoryAddButton;
    private javax.swing.JButton categoryClearButton;
    private javax.swing.JComboBox<String> categoryComboBox;
    private javax.swing.JButton categoryDeleteButton;
    private javax.swing.JTextField categoryDescriptionField;
    private javax.swing.JButton categoryEditButton;
    private javax.swing.JTextField categoryIdField;
    private javax.swing.JLabel categoryLabel;
    private javax.swing.JTextField categoryNameField;
    private javax.swing.JPanel categoryPannel;
    private javax.swing.JTable categoryTable;
    private javax.swing.JLabel headingLabel;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton productAddButton;
    private javax.swing.JButton productClearButton;
    private javax.swing.JButton productDeleteButton;
    private javax.swing.JButton productEditButton;
    private javax.swing.JTextField productIdField;
    private javax.swing.JLabel productLabel;
    private javax.swing.JTextField productNameField;
    private javax.swing.JPanel productPannel;
    private javax.swing.JTextField productPriceField;
    private javax.swing.JTextField productQuantityField;
    private javax.swing.JTable productTable;
    private javax.swing.JButton sellerAddButton;
    private javax.swing.JButton sellerClearButton;
    private javax.swing.JButton sellerDeleteButton;
    private javax.swing.JButton sellerEditButton;
    private javax.swing.JTextField sellerGenderField;
    private javax.swing.JTextField sellerIdField;
    private javax.swing.JLabel sellerLabel;
    private javax.swing.JTextField sellerNameField;
    private javax.swing.JPanel sellerPannel;
    private javax.swing.JTextField sellerPasswordField;
    private javax.swing.JTextField sellerPhoneField;
    private javax.swing.JTable sellerTable;
    private javax.swing.JTextField sellerUsernameField;
    private javax.swing.JLabel signoutLabel;
    // End of variables declaration//GEN-END:variables
}
