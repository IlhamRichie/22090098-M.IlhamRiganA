package inventorycashiering;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author IlhamRgn
 */
public class InventoryManagement extends javax.swing.JFrame {

    Connection con = null;
    PreparedStatement pst = null;
    PreparedStatement pst1 = null;
    ResultSet rs = null;

    public InventoryManagement() {
        initComponents();
        this.setLocationRelativeTo(null);

        dispStaffTransaction();
        manageProduct();
    }

    public void dispStaffTransaction() {
        DefaultTableModel staffTransactionModel = (DefaultTableModel) staffTransactionTable.getModel();
        String yourTransact = (String)this.staffIdField.getText();
        int count = 0;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/management_system", "root", "")) {
                Statement stmt = con.createStatement();
                ResultSet transactdata = stmt.executeQuery("SELECT `STransactionID`, `InventoryID`, `productName`, `Quantity`, `TypeOfTransaction`, `UserID`, `TransactionDate` FROM `stransactions` WHERE `UserID` ='"+ yourTransact +"'");

//                ResultSet datas = stmt.executeQuery("SELECT a.TransactionDate, a.UserID, b.ProductName, a.TypeOfTransaction, b.Quantity, a.Quantity AS \"Added Quantity\" FROM stransactions a, inventory b WHERE a.STransactionID=b.InventoryID;");
                while (transactdata.next()) {
                    count = 0;
                    staffTransactionModel.addRow(new Object[]{transactdata.getString("STransactionId"), transactdata.getString("transactionDate"), transactdata.getString("userId"), transactdata.getString("InventoryId"), transactdata.getString("productName"), transactdata.getString("typeoftransaction")});
                }
            }
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public void manageProduct() {
        DefaultTableModel producttable = (DefaultTableModel) manageProductTbl.getModel();

        int stockCount;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/management_system", "root", "")) {
                Statement stmt = con.createStatement();

                ResultSet datas = stmt.executeQuery("SELECT * FROM `inventory`");
                while (datas.next()) {
                    stockCount = 0;
                    producttable.addRow(new Object[]{datas.getString("inventoryID"), datas.getString("ProductName"), datas.getString("BuyingPrice"), datas.getString("SellingPrice"), datas.getString("quantity"), datas.getString("UnitOfMeasure"), datas.getString("description"), datas.getString("stockThreshold"), datas.getString("thresholdStatus")});

                }
            }
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        logoutBtn = new javax.swing.JButton();
        homeManageProBtn = new javax.swing.JButton();
        homeTransactBtn = new javax.swing.JButton();
        homeHomeBtn = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        manageProductTbl = new javax.swing.JTable();
        jPanel19 = new javax.swing.JPanel();
        logOutbtn = new javax.swing.JButton();
        mpMpBtn = new javax.swing.JButton();
        mpTransactBtn = new javax.swing.JButton();
        mpHomeBtn = new javax.swing.JButton();
        inventoryaddbtn = new javax.swing.JButton();
        inventorydeletebtn = new javax.swing.JButton();
        inventoryupdatebtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        productnamefield = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        productidfield = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        sellingpricefield = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        productpricefield = new javax.swing.JTextField();
        productdescriptionfield = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        quantityfield = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        uomfield = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        murResetBtn = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        statusField = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        thresholdField = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        logOutbtn1 = new javax.swing.JButton();
        tranMpBtn1 = new javax.swing.JButton();
        tranTransactBtn1 = new javax.swing.JButton();
        tranHomeBtn1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        staffTransactionTable = new javax.swing.JTable();
        jPanel13 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        transactRefreshBtn = new javax.swing.JButton();
        staffIdField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        staffField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/back7.PNG"))); // NOI18N
        jPanel10.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 570, 590));

        jPanel5.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 590));

        jPanel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel14MouseClicked(evt);
            }
        });
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel17.setBackground(new java.awt.Color(0, 153, 255));
        jPanel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel17MouseClicked(evt);
            }
        });
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoutBtn.setText("Log Out");
        logoutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutBtnMouseClicked(evt);
            }
        });
        jPanel17.add(logoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 130, -1));

        homeManageProBtn.setText("Manage Product");
        homeManageProBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeManageProBtnMouseClicked(evt);
            }
        });
        jPanel17.add(homeManageProBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 130, -1));

        homeTransactBtn.setText("Your Transaction");
        homeTransactBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeTransactBtnMouseClicked(evt);
            }
        });
        jPanel17.add(homeTransactBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        homeHomeBtn.setText("Home");
        homeHomeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeHomeBtnMouseClicked(evt);
            }
        });
        jPanel17.add(homeHomeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 130, -1));

        jPanel14.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 350, 280));

        jPanel5.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 550, 590));

        jPanel6.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTabbedPane1.addTab("home", jPanel6);

        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBackground(new java.awt.Color(255, 204, 204));

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 0));
        jLabel4.setText("Manage Products");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 310, 50));

        manageProductTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "InventoryID", "Product Name", "Buying Price", "Selling Price", "Quantity", "UoM", "Description", "Stock Threshold", "Treshold Status"
            }
        ));
        manageProductTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageProductTblMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(manageProductTbl);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 1100, 280));

        jPanel19.setBackground(new java.awt.Color(153, 0, 51));
        jPanel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel19MouseClicked(evt);
            }
        });
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logOutbtn.setText("Log Out");
        logOutbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOutbtnMouseClicked(evt);
            }
        });
        jPanel19.add(logOutbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 130, -1));

        mpMpBtn.setText("Manage Product");
        mpMpBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mpMpBtnMouseClicked(evt);
            }
        });
        jPanel19.add(mpMpBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 130, -1));

        mpTransactBtn.setText("Your Transaction");
        mpTransactBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mpTransactBtnMouseClicked(evt);
            }
        });
        jPanel19.add(mpTransactBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        mpHomeBtn.setText("Home");
        mpHomeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mpHomeBtnMouseClicked(evt);
            }
        });
        jPanel19.add(mpHomeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 130, -1));

        jPanel3.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 430, 340, 140));

        inventoryaddbtn.setText("Add Stock");
        inventoryaddbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inventoryaddbtnMouseClicked(evt);
            }
        });
        jPanel3.add(inventoryaddbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 520, -1, -1));

        inventorydeletebtn.setText("Delete");
        inventorydeletebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inventorydeletebtnMouseClicked(evt);
            }
        });
        jPanel3.add(inventorydeletebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 520, 80, -1));

        inventoryupdatebtn.setText("Update");
        inventoryupdatebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inventoryupdatebtnMouseClicked(evt);
            }
        });
        inventoryupdatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventoryupdatebtnActionPerformed(evt);
            }
        });
        jPanel3.add(inventoryupdatebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 520, 80, -1));

        jLabel5.setText("InventoryID:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));
        jPanel3.add(productnamefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 360, 183, -1));

        jLabel6.setText("Product Name:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, -1, -1));
        jPanel3.add(productidfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 183, -1));

        jLabel7.setText("Buying Price:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 360, -1, -1));
        jPanel3.add(sellingpricefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 183, -1));

        jLabel8.setText("Selling Price:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        productpricefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productpricefieldActionPerformed(evt);
            }
        });
        jPanel3.add(productpricefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 360, 183, -1));
        jPanel3.add(productdescriptionfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 480, 390, -1));

        jLabel9.setText("Description:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 480, -1, -1));

        quantityfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                quantityfieldKeyReleased(evt);
            }
        });
        jPanel3.add(quantityfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, 183, -1));

        jLabel11.setText("Quantity:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, -1, -1));
        jPanel3.add(uomfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 400, 183, -1));

        jLabel12.setText("UoM:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 400, -1, -1));

        murResetBtn.setText("Reset");
        murResetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                murResetBtnActionPerformed(evt);
            }
        });
        jPanel3.add(murResetBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 520, 78, -1));

        jLabel14.setText("Threshold Status: ");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 440, -1, -1));

        statusField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusFieldActionPerformed(evt);
            }
        });
        jPanel3.add(statusField, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 440, 180, -1));

        jLabel16.setText("Stock Threshold:");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, -1, -1));
        jPanel3.add(thresholdField, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 400, 180, -1));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("MP", jPanel8);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel20.setBackground(new java.awt.Color(153, 0, 51));
        jPanel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel20MouseClicked(evt);
            }
        });
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logOutbtn1.setText("Log Out");
        logOutbtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOutbtn1MouseClicked(evt);
            }
        });
        jPanel20.add(logOutbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 130, -1));

        tranMpBtn1.setText("Manage Product");
        tranMpBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tranMpBtn1MouseClicked(evt);
            }
        });
        jPanel20.add(tranMpBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 130, -1));

        tranTransactBtn1.setText("Your Transaction");
        tranTransactBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tranTransactBtn1MouseClicked(evt);
            }
        });
        jPanel20.add(tranTransactBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        tranHomeBtn1.setText("Home");
        tranHomeBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tranHomeBtn1MouseClicked(evt);
            }
        });
        tranHomeBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tranHomeBtn1ActionPerformed(evt);
            }
        });
        jPanel20.add(tranHomeBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 130, -1));

        jPanel4.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 430, 340, 140));

        staffTransactionTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Transaction_ID", "Transaction Date", "UserID", "InventoryID", "Product Name", "Type of Transaction"
            }
        ));
        staffTransactionTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                staffTransactionTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(staffTransactionTable);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 1100, 300));

        jPanel13.setBackground(new java.awt.Color(255, 204, 204));

        jLabel13.setFont(new java.awt.Font("Tahoma", 3, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 0, 0));
        jLabel13.setText("Your Transaction");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 310, 50));

        transactRefreshBtn.setText("View Your Transaction");
        transactRefreshBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transactRefreshBtnMouseClicked(evt);
            }
        });
        jPanel4.add(transactRefreshBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 460, -1, 40));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("transaction", jPanel9);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1130, 590));

        staffIdField.setFont(new java.awt.Font("Courier New", 3, 14)); // NOI18N
        jPanel1.add(staffIdField, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 50, 30));

        jLabel1.setText("Your ID:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jPanel15.setBackground(new java.awt.Color(102, 0, 0));

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 204, 204));
        jLabel10.setText("Inventory Management Section");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        jPanel26.setBackground(new java.awt.Color(153, 0, 51));
        jPanel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        staffField.setFont(new java.awt.Font("Courier New", 3, 14)); // NOI18N
        jPanel26.add(staffField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 270, 30));

        jPanel1.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, 290, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel17MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel17MouseClicked

    private void jPanel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel19MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel19MouseClicked

    private void homeManageProBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeManageProBtnMouseClicked
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_homeManageProBtnMouseClicked

    private void homeTransactBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeTransactBtnMouseClicked
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_homeTransactBtnMouseClicked

    private void homeHomeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeHomeBtnMouseClicked
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_homeHomeBtnMouseClicked

    private void logoutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMouseClicked
        int a = JOptionPane.showConfirmDialog(null, "Are you sure to logout?", "Warning", JOptionPane.YES_NO_OPTION);
        if (a == JOptionPane.YES_OPTION) {
            new LoginPage().setVisible(true);
            this.dispose();
        } else {
            JOptionPane.getRootFrame().dispose();
        }
    }//GEN-LAST:event_logoutBtnMouseClicked

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel3MouseClicked

    private void mpTransactBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mpTransactBtnMouseClicked
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_mpTransactBtnMouseClicked

    private void logOutbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutbtnMouseClicked
        int a = JOptionPane.showConfirmDialog(null, "Are you sure to logout?", "Warning", JOptionPane.YES_NO_OPTION);
        if (a == JOptionPane.YES_OPTION) {
            new LoginPage().setVisible(true);
            this.dispose();
        } else {
            JOptionPane.getRootFrame().dispose();
        }
    }//GEN-LAST:event_logOutbtnMouseClicked

    private void mpMpBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mpMpBtnMouseClicked
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_mpMpBtnMouseClicked

    private void logOutbtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutbtn1MouseClicked
        int a = JOptionPane.showConfirmDialog(null, "Are you sure to logout?", "Warning", JOptionPane.YES_NO_OPTION);
        if (a == JOptionPane.YES_OPTION) {
            new LoginPage().setVisible(true);
            this.dispose();
        } else {
            JOptionPane.getRootFrame().dispose();
        }
    }//GEN-LAST:event_logOutbtn1MouseClicked

    private void tranMpBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tranMpBtn1MouseClicked
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_tranMpBtn1MouseClicked

    private void tranTransactBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tranTransactBtn1MouseClicked
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_tranTransactBtn1MouseClicked

    private void tranHomeBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tranHomeBtn1MouseClicked
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_tranHomeBtn1MouseClicked

    private void jPanel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel20MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel20MouseClicked

    private void manageProductTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageProductTblMouseClicked
        DefaultTableModel inventoryTableModel = (DefaultTableModel) manageProductTbl.getModel();

        String proid = (String) inventoryTableModel.getValueAt(manageProductTbl.getSelectedRow(), 0);
        String proname = (String) inventoryTableModel.getValueAt(manageProductTbl.getSelectedRow(), 1);
        String buyingPrice = (String) inventoryTableModel.getValueAt(manageProductTbl.getSelectedRow(), 2);
        String sellingPrice = (String) inventoryTableModel.getValueAt(manageProductTbl.getSelectedRow(), 3);
        String quantity = (String) inventoryTableModel.getValueAt(manageProductTbl.getSelectedRow(), 4);
        String unitofmeasure = (String) inventoryTableModel.getValueAt(manageProductTbl.getSelectedRow(), 5);
        String description = (String) inventoryTableModel.getValueAt(manageProductTbl.getSelectedRow(), 6);
        String threshold = (String) inventoryTableModel.getValueAt(manageProductTbl.getSelectedRow(), 7);
        String inventoryStatus = (String) inventoryTableModel.getValueAt(manageProductTbl.getSelectedRow(), 8);

        this.productidfield.setText(proid);
        this.productidfield.setEditable(false);
        this.productnamefield.setText(proname);
        this.productpricefield.setText(buyingPrice);
        this.sellingpricefield.setText(sellingPrice);
        this.quantityfield.setText(quantity);
        this.uomfield.setText(unitofmeasure);
        this.productdescriptionfield.setText(description);
        this.statusField.setText(inventoryStatus);
        this.thresholdField.setText(threshold);
    }//GEN-LAST:event_manageProductTblMouseClicked

    private void inventoryaddbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventoryaddbtnMouseClicked
        DefaultTableModel manageinventorytablemodel = (DefaultTableModel) manageProductTbl.getModel();

        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter orderDate = DateTimeFormatter.ofPattern("E, MMM dd yyyy");

        String inventoryId = productidfield.getText();
        String productName = productnamefield.getText();
        String buyingPrice = String.valueOf(productpricefield.getText());
        String sellingPrice = String.valueOf(sellingpricefield.getText());
        String quantity = String.valueOf(quantityfield.getText());
        String uom = uomfield.getText();
        String description = productdescriptionfield.getText();
        String transactType = "Added Inventory";
        String transactDate = myDateObj.format(orderDate);
        System.out.println(transactDate);
        String staffAccountId = staffIdField.getText();
        String stockLimit = thresholdField.getText();
        String thresholdStatus = statusField.getText();

        int productcount = 0;
        try {
            String sql = "INSERT INTO `inventory`" + "(`InventoryID`,`ProductName`, `BuyingPrice`, `SellingPrice`, `Quantity`, `UnitOfMeasure`, `Description`, `stockThreshold`, `thresholdStatus` )" + " VALUES " + "(?, ?, ?, ?, ?, ?, ?, ?, ?)";
            String sql1 = "INSERT INTO `stransactions`" + "(`InventoryID`,`productName`,`Quantity`, `TypeOfTransaction`,`TransactionDate`, `userid`)" + " VALUES " + "(?, ?, ?, ?, ?, ?)";

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/management_system", "root", "");
            pst = con.prepareStatement(sql);

            pst.setString(1, inventoryId);
            pst.setString(2, productName);
            pst.setString(3, buyingPrice);
            pst.setString(4, sellingPrice);
            pst.setString(5, quantity);
            pst.setString(6, uom);
            pst.setString(7, description);
            pst.setString(8, stockLimit);
            pst.setString(9, thresholdStatus);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Successfully Added Data.", "Alert", JOptionPane.INFORMATION_MESSAGE);

            this.productidfield.setText(null);
            this.productnamefield.setText(null);
            this.productpricefield.setText(null);
            this.sellingpricefield.setText(null);
            this.quantityfield.setText(null);
            this.uomfield.setText(null);
            this.productdescriptionfield.setText(null);
            this.thresholdField.setText(null);
            this.statusField.setText(null);

            Statement stmt = con.createStatement();
            Statement stmt1 = con.createStatement();

            int count;

            ResultSet datas = stmt1.executeQuery("SELECT * FROM `inventory`");

            while (datas.next()) {
                productcount = 0;
                manageinventorytablemodel.removeRow(productcount);
                manageinventorytablemodel.addRow(new Object[]{datas.getString("inventoryID"), datas.getString("ProductName"), datas.getString("BuyingPrice"), datas.getString("SellingPrice"), datas.getString("quantity"), datas.getString("UnitOfMeasure"), datas.getString("description"), datas.getString("stockThreshold"), datas.getString("thresholdStatus")});
            }

            pst1 = con.prepareStatement(sql1);
            pst1.setString(1, inventoryId);
            pst1.setString(2, productName);
            pst1.setString(3, quantity);
            pst1.setString(4, transactType);
            pst1.setString(5, transactDate);
            pst1.setString(6, staffAccountId);

            pst1.executeUpdate();

//            JOptionPane.showMessageDialog(null, "Your transaction is being recorded!", "Alert", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }

//        DefaultTableModel manageinventorytablemodel = (DefaultTableModel) manageProductTbl.getModel();
//
//        LocalDateTime myDateObj = LocalDateTime.now();
//        DateTimeFormatter orderDate = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
//
//        String transactDate = myDateObj.format(orderDate);
//        System.out.println(transactDate);
//        String transactType = "Add Inventory";
//        System.out.println(transactType);
//  
//
//        int count = 0;
//        try {
//            String sql = "INSERT INTO `inventory`" + "(`InventoryID`, `ProductName`, `BuyingPrice`, `SellingPrice`, `Quantity`, `UnitOfMeasure`, `Description`)" + " VALUES " + "(?, ?, ?, ?, ?, ?, ?)";
//            String sql1 = "INSERT INTO `stransactions`" + "(`InventoryID`,`productName`,`Quantity`, `TypeOfTransaction`,`TransactionDate`)" + " VALUES " + "(?, ?, ?, ?, ?)";
//
//            
//            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/management_system", "root", "");
//            pst = con.prepareStatement(sql);
//            pst = con.prepareStatement(sql1);
//
//            pst.setString(1, productidfield.getText());
//            pst.setString(2, productnamefield.getText());
//            pst.setString(3, productpricefield.getText());
//            pst.setString(4, sellingpricefield.getText());
//            pst.setString(5, quantityfield.getText());
//            pst.setString(6, uomfield.getText());
//            pst.setString(7, productdescriptionfield.getText());
//            pst.executeUpdate();
//            
//            
//            pst1.setString(1, productidfield.getText());
//            pst1.setString(2, productnamefield.getText());
//            pst1.setString(3, quantityfield.getText());
//            pst1.setString(4, (transactType));
//            pst1.setString(5, (transactDate));
//            
//        
//            pst1.executeUpdate();
//
//            JOptionPane.showMessageDialog(null, "Successfully Added Data.", "Alert", JOptionPane.INFORMATION_MESSAGE);
//
//            Statement stmt = con.createStatement();
//            Statement stmt1 = con.createStatement();
//            ResultSet datas = stmt1.executeQuery("SELECT * FROM `inventory`");
//            while (datas.next()) {
//                count = 0;
//                manageinventorytablemodel.removeRow(count);
//                manageinventorytablemodel.addRow(new Object[]{datas.getString("inventoryID"), datas.getString("ProductName"), datas.getString("BuyingPrice"), datas.getString("SellingPrice"), datas.getString("quantity"), datas.getString("UnitOfMeasure"), datas.getString("description")});
//            }
//            this.productidfield.setText(null);
//            this.productnamefield.setText(null);
//            this.productpricefield.setText(null);
//            this.sellingpricefield.setText(null);
//            this.quantityfield.setText(null);
//            this.uomfield.setText(null);
//            this.productdescriptionfield.setText(null);
//
//        } catch (SQLException | HeadlessException e) {
//            JOptionPane.showMessageDialog(null, e);
//        }

    }//GEN-LAST:event_inventoryaddbtnMouseClicked

    private void inventorydeletebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventorydeletebtnMouseClicked

        DefaultTableModel inventoryTableModel1 = (DefaultTableModel) manageProductTbl.getModel();
        if (manageProductTbl.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "Select Row to Delete!", "Alert", JOptionPane.ERROR_MESSAGE);
        } else {
            LocalDateTime myDateObj = LocalDateTime.now();
            DateTimeFormatter orderDate = DateTimeFormatter.ofPattern("E, MMM dd yyyy");

            String inventoryId = productidfield.getText();
            String productName = productnamefield.getText();
            String buyingPrice = String.valueOf(productpricefield.getText());
            String sellingPrice = String.valueOf(sellingpricefield.getText());
            String quantity = String.valueOf(quantityfield.getText());
            String uom = uomfield.getText();
            String description = productdescriptionfield.getText();
            String transactType = "Delete Inventory";
            String transactDate = myDateObj.format(orderDate);
            System.out.println(transactDate);
            String staffAccountId = staffIdField.getText();
            String inventoryproid = (String) inventoryTableModel1.getValueAt(manageProductTbl.getSelectedRow(), 0);
            try {
                Class.forName("com.mysql.jdbc.Driver");
                try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/management_system", "root", "")) {
                    Statement stmt = con.createStatement();
                    String query = "DELETE FROM inventory WHERE inventoryID= " + inventoryproid + "";
                    String query1 = "INSERT INTO `stransactions`" + "(`InventoryID`,`productName`,`Quantity`, `TypeOfTransaction`,`TransactionDate`, `userid`)" + " VALUES " + "(?, ?, ?, ?, ?, ?)";
                    stmt.execute(query);

                    int a = JOptionPane.showConfirmDialog(null, "Anda Yakin?", "Warning", JOptionPane.YES_NO_OPTION);
                    if (a == JOptionPane.YES_OPTION) {
                        stmt.execute(query);
                        JOptionPane.showMessageDialog(null, "Berhasil dihapus.", "Alert", JOptionPane.INFORMATION_MESSAGE);
                        inventoryTableModel1.removeRow(manageProductTbl.getSelectedRow());
                    } else {
                        JOptionPane.getRootFrame().dispose();
                    }

                    this.productidfield.setText(null);
                    this.productnamefield.setText(null);
                    this.productpricefield.setText(null);
                    this.sellingpricefield.setText(null);
                    this.quantityfield.setText(null);
                    this.uomfield.setText(null);
                    this.productdescriptionfield.setText(null);
                    this.thresholdField.setText(null);
                    this.statusField.setText(null);

                    pst1 = con.prepareStatement(query1);
                    pst1.setString(1, inventoryId);
                    pst1.setString(2, productName);
                    pst1.setString(3, quantity);
                    pst1.setString(4, transactType);
                    pst1.setString(5, transactDate);
                    pst1.setString(6, staffAccountId);
                    pst1.executeUpdate();
                }
            } catch (HeadlessException | ClassNotFoundException | SQLException e) {
                System.out.println(e.getMessage());
                JOptionPane.showMessageDialog(null, "Tidak Berhasil!", "Alert", JOptionPane.ERROR_MESSAGE);
            }
        }

//        DefaultTableModel inventoryTableModel1 = (DefaultTableModel) manageProductTbl.getModel();
//        if (manageProductTbl.getSelectedRow() < 0) {
//            JOptionPane.showMessageDialog(null, "Unsuccessful!", "Alert", JOptionPane.ERROR_MESSAGE);
//        } else {
//
//            String inventoryproid = (String) inventoryTableModel1.getValueAt(manageProductTbl.getSelectedRow(), 0);
//            try {
//                Class.forName("com.mysql.jdbc.Driver");
//                try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/management_system", "root", "")) {
//                    Statement stmt = con.createStatement();
//                    String query = "DELETE FROM inventory WHERE inventoryID= " + inventoryproid + "";
//                    stmt.execute(query);
//                    con.close();
//                    JOptionPane.showMessageDialog(null, "Successfully Deleted.", "Alert", JOptionPane.INFORMATION_MESSAGE);
//                    inventoryTableModel1.removeRow(manageProductTbl.getSelectedRow());
//
//                    this.productidfield.setText(null);
//                    this.productnamefield.setText(null);
//                    this.productpricefield.setText(null);
//                    this.sellingpricefield.setText(null);
//                    this.quantityfield.setText(null);
//                    this.uomfield.setText(null);
//                    this.productdescriptionfield.setText(null);
//                }
//            } catch (HeadlessException | ClassNotFoundException | SQLException e) {
//                System.out.println(e.getMessage());
//                JOptionPane.showMessageDialog(null, "Unsuccessful!", "Alert", JOptionPane.ERROR_MESSAGE);
//            }
//        }
    }//GEN-LAST:event_inventorydeletebtnMouseClicked

    private void inventoryupdatebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventoryupdatebtnMouseClicked

        DefaultTableModel manageinventtablemodel = (DefaultTableModel) manageProductTbl.getModel();

        if ("".equals(productnamefield.getText()) && "".equals(productpricefield.getText())) {
            JOptionPane.showMessageDialog(null, "No Selected Product!", "Alert", JOptionPane.ERROR_MESSAGE);
        } else {
            LocalDateTime myDateObj = LocalDateTime.now();
            DateTimeFormatter orderDate = DateTimeFormatter.ofPattern("E, MMM dd yyyy");

            String inventoryId = productidfield.getText();
            String productName = productnamefield.getText();
            String buyingPrice = String.valueOf(productpricefield.getText());
            String sellingPrice = String.valueOf(sellingpricefield.getText());
            String quantity = String.valueOf(quantityfield.getText());
            String uom = uomfield.getText();
            String description = productdescriptionfield.getText();
            String transactType = "Update Inventory";
            String transactDate = myDateObj.format(orderDate);
            System.out.println(transactDate);
            String staffAccountId = staffIdField.getText();

            String proid = (String) manageinventtablemodel.getValueAt(manageProductTbl.getSelectedRow(), 0);

            int count;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/management_system", "root", "")) {
                    Statement stmt = con.createStatement();
                    Statement stmt1 = con.createStatement();
                    String query = "UPDATE `inventory` SET `productName`='" + this.productnamefield.getText() + "',`BuyingPrice`='" + this.productpricefield.getText() + "',`SellingPrice`='" + this.sellingpricefield.getText() + "',`Quantity`='" + this.quantityfield.getText() + "',`UnitOfMeasure`='" + this.uomfield.getText() + "',`description`='" + this.productdescriptionfield.getText()+ "',`stockThreshold`='" + this.thresholdField.getText() + "',`thresholdStatus`='" + this.statusField.getText() + "' WHERE  inventoryID = '" + proid + "'";
                    String query1 = "INSERT INTO `stransactions`" + "(`InventoryID`,`productName`,`Quantity`, `TypeOfTransaction`,`TransactionDate`, `userid`)" + " VALUES " + "(?, ?, ?, ?, ?, ?)";

                    stmt.execute(query);
                    this.productidfield.setText(null);
                    this.productnamefield.setText(null);
                    this.productpricefield.setText(null);
                    this.sellingpricefield.setText(null);
                    this.quantityfield.setText(null);
                    this.uomfield.setText(null);
                    this.productdescriptionfield.setText(null);
                    this.thresholdField.setText(null);
                    this.statusField.setText(null);

                    pst1 = con.prepareStatement(query1);
                    pst1.setString(1, inventoryId);
                    pst1.setString(2, productName);
                    pst1.setString(3, quantity);
                    pst1.setString(4, transactType);
                    pst1.setString(5, transactDate);
                    pst1.setString(6, staffAccountId);
                    pst1.executeUpdate();

                    ResultSet datas = stmt1.executeQuery("SELECT * FROM `inventory`");
                    while (datas.next()) {
                        count = 0;
                        manageinventtablemodel.removeRow(count);
                        manageinventtablemodel.addRow(new Object[]{datas.getString("inventoryID"), datas.getString("ProductName"), datas.getString("BuyingPrice"), datas.getString("SellingPrice"), datas.getString("quantity"), datas.getString("UnitOfMeasure"), datas.getString("description"), datas.getString("stockThreshold"), datas.getString("thresholdStatus")});
                    }
                    con.close();
                    JOptionPane.showMessageDialog(null, "Successfully Updated.", "Alert", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (HeadlessException | ClassNotFoundException | SQLException e) {
                System.out.println(e.getMessage());
            }
        }

    }//GEN-LAST:event_inventoryupdatebtnMouseClicked

    private void inventoryupdatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventoryupdatebtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inventoryupdatebtnActionPerformed

    private void productpricefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productpricefieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productpricefieldActionPerformed

    private void murResetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_murResetBtnActionPerformed
        if (evt.getSource() == murResetBtn) {
            this.productidfield.setText(null);
            this.productidfield.setEditable(true);
            this.productnamefield.setText(null);
            this.productpricefield.setText(null);
            this.sellingpricefield.setText(null);
            this.quantityfield.setText(null);
            this.uomfield.setText(null);
            this.productdescriptionfield.setText(null);
        }
    }//GEN-LAST:event_murResetBtnActionPerformed

    private void mpHomeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mpHomeBtnMouseClicked
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_mpHomeBtnMouseClicked

    private void tranHomeBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tranHomeBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tranHomeBtn1ActionPerformed

    private void staffTransactionTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_staffTransactionTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_staffTransactionTableMouseClicked

    private void jPanel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel14MouseClicked

    }//GEN-LAST:event_jPanel14MouseClicked

    private void transactRefreshBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transactRefreshBtnMouseClicked
        DefaultTableModel staffTransactionModel = (DefaultTableModel) staffTransactionTable.getModel();
        String yourTransact = (String) this.staffIdField.getText();
        int count = 0;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/management_system", "root", "")) {
                Statement stmt = con.createStatement();
                ResultSet transactdata = stmt.executeQuery("SELECT `STransactionID`, `InventoryID`, `productName`, `Quantity`, `TypeOfTransaction`, `UserID`, `TransactionDate` FROM `stransactions` WHERE `UserID` ='"+ yourTransact +"' ");

                //                ResultSet datas = stmt.executeQuery("SELECT a.TransactionDate, a.UserID, b.ProductName, a.TypeOfTransaction, b.Quantity, a.Quantity AS \"Added Quantity\" FROM stransactions a, inventory b WHERE a.STransactionID=b.InventoryID;");
                while (staffTransactionModel.getRowCount() > 0) {
                    staffTransactionModel.removeRow(0);
                }

                while (transactdata.next()) {
                    count = 0;
                    staffTransactionModel.addRow(new Object[]{transactdata.getString("STransactionId"), transactdata.getString("transactionDate"), transactdata.getString("userId"), transactdata.getString("InventoryId"), transactdata.getString("productName"), transactdata.getString("typeoftransaction")});

                }
            }
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }

        //        try {
        //            PreparedStatement ps;
        //            String Query = "Select * from stransactions";
        //            ps = DB_Connector.getConnection().prepareStatement(Query);
        //
        //            DefaultTableModel tbModel = (DefaultTableModel) transactionTable.getModel();
        //            while (tbModel.getRowCount() > 0) {
        //                tbModel.removeRow(0);
        //            }
        //            ResultSet rs = ps.executeQuery(Query);
        //            while (rs.next()) {
        //                String transactionID = rs.getString("STransactionId");
        //                String productId = rs.getString("ProdID");
        //                String quantity = rs.getString("Quantity");
        //                String tot = rs.getString("TypeOfTransaction");
        //                String userid = rs.getString("UserID");
        //                String date = rs.getString("Date");
        //
        //                String tbData[] = {transactionID, productId, quantity, tot, userid, date};
        //                tbModel.addRow(tbData);
        //            }
        //
        //        } catch (SQLException ex) {
        //
        //        }

    }//GEN-LAST:event_transactRefreshBtnMouseClicked

    private void statusFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusFieldActionPerformed

    private void quantityfieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantityfieldKeyReleased
        if ("".equals(this.quantityfield.getText())) {
            JOptionPane.showMessageDialog(null, "Declare product quantity", "Alert", JOptionPane.ERROR_MESSAGE);

        } else if (Integer.parseInt(quantityfield.getText()) <= 10) {
            this.statusField.setText("Low Inventory");

        } else {
            this.statusField.setText("Active");
        }
    }//GEN-LAST:event_quantityfieldKeyReleased

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
            java.util.logging.Logger.getLogger(InventoryManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InventoryManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InventoryManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InventoryManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InventoryManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton homeHomeBtn;
    private javax.swing.JButton homeManageProBtn;
    private javax.swing.JButton homeTransactBtn;
    private javax.swing.JButton inventoryaddbtn;
    private javax.swing.JButton inventorydeletebtn;
    private javax.swing.JButton inventoryupdatebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton logOutbtn;
    private javax.swing.JButton logOutbtn1;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JTable manageProductTbl;
    private javax.swing.JButton mpHomeBtn;
    private javax.swing.JButton mpMpBtn;
    private javax.swing.JButton mpTransactBtn;
    private javax.swing.JButton murResetBtn;
    private javax.swing.JTextField productdescriptionfield;
    private javax.swing.JTextField productidfield;
    private javax.swing.JTextField productnamefield;
    private javax.swing.JTextField productpricefield;
    private javax.swing.JTextField quantityfield;
    private javax.swing.JTextField sellingpricefield;
    public javax.swing.JTextField staffField;
    public javax.swing.JTextField staffIdField;
    private javax.swing.JTable staffTransactionTable;
    private javax.swing.JTextField statusField;
    private javax.swing.JTextField thresholdField;
    private javax.swing.JButton tranHomeBtn1;
    private javax.swing.JButton tranMpBtn1;
    private javax.swing.JButton tranTransactBtn1;
    private javax.swing.JButton transactRefreshBtn;
    private javax.swing.JTextField uomfield;
    // End of variables declaration//GEN-END:variables
}
