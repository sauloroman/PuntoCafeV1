package views;

import entities.User;

public class MainFrame extends javax.swing.JFrame {
    
    private final MainFrameInit styleView;
    
    public MainFrame(User user) {
        initComponents();
        styleView = new MainFrameInit(this, user);
        styleView.init();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main = new javax.swing.JPanel();
        sidebar = new javax.swing.JPanel();
        boxLogo = new javax.swing.JLabel();
        btnWarehouse = new javax.swing.JButton();
        btnPurchases = new javax.swing.JButton();
        btnSales = new javax.swing.JButton();
        btnAccess = new javax.swing.JButton();
        btnQueries = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnSettings = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        header = new javax.swing.JPanel();
        welcomeMessage = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        userPhoto = new javax.swing.JLabel();
        userName = new javax.swing.JLabel();
        userRole = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        main.setBackground(new java.awt.Color(255, 255, 255));
        main.setOpaque(false);

        sidebar.setBackground(new java.awt.Color(255, 255, 255));
        sidebar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(221, 221, 221)));
        sidebar.setPreferredSize(new java.awt.Dimension(220, 920));

        boxLogo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        btnWarehouse.setBackground(new java.awt.Color(40, 60, 117));
        btnWarehouse.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnWarehouse.setForeground(new java.awt.Color(204, 204, 204));
        btnWarehouse.setText("Almacen");
        btnWarehouse.setBorder(null);
        btnWarehouse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnWarehouse.setFocusPainted(false);
        btnWarehouse.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnWarehouse.setIconTextGap(10);

        btnPurchases.setBackground(new java.awt.Color(40, 60, 117));
        btnPurchases.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnPurchases.setForeground(new java.awt.Color(204, 204, 204));
        btnPurchases.setText("Compras");
        btnPurchases.setBorder(null);
        btnPurchases.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPurchases.setFocusPainted(false);
        btnPurchases.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPurchases.setIconTextGap(10);

        btnSales.setBackground(new java.awt.Color(40, 60, 117));
        btnSales.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnSales.setForeground(new java.awt.Color(204, 204, 204));
        btnSales.setText("Ventas");
        btnSales.setBorder(null);
        btnSales.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSales.setFocusPainted(false);
        btnSales.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSales.setIconTextGap(10);

        btnAccess.setBackground(new java.awt.Color(40, 60, 117));
        btnAccess.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnAccess.setForeground(new java.awt.Color(204, 204, 204));
        btnAccess.setText("Acceso");
        btnAccess.setBorder(null);
        btnAccess.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAccess.setFocusPainted(false);
        btnAccess.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAccess.setIconTextGap(10);

        btnQueries.setBackground(new java.awt.Color(40, 60, 117));
        btnQueries.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnQueries.setForeground(new java.awt.Color(204, 204, 204));
        btnQueries.setText("Consultas");
        btnQueries.setBorder(null);
        btnQueries.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQueries.setFocusPainted(false);
        btnQueries.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnQueries.setIconTextGap(10);
        btnQueries.setRolloverEnabled(false);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Menú de navegación");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Acciones Generales");

        btnSettings.setBackground(new java.awt.Color(40, 60, 117));
        btnSettings.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnSettings.setForeground(new java.awt.Color(204, 204, 204));
        btnSettings.setText("Ajustes");
        btnSettings.setBorder(null);
        btnSettings.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSettings.setFocusPainted(false);
        btnSettings.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnSettings.setIconTextGap(10);

        btnLogout.setBackground(new java.awt.Color(40, 60, 117));
        btnLogout.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(204, 204, 204));
        btnLogout.setText("Cerrar Sesión");
        btnLogout.setBorder(null);
        btnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogout.setFocusPainted(false);
        btnLogout.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnLogout.setIconTextGap(10);

        javax.swing.GroupLayout sidebarLayout = new javax.swing.GroupLayout(sidebar);
        sidebar.setLayout(sidebarLayout);
        sidebarLayout.setHorizontalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnWarehouse, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnPurchases, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnSales, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnAccess, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnQueries, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidebarLayout.createSequentialGroup()
                .addGap(0, 19, Short.MAX_VALUE)
                .addComponent(boxLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(sidebarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(94, Short.MAX_VALUE))
            .addComponent(btnSettings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        sidebarLayout.setVerticalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(boxLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(btnWarehouse, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnPurchases, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnSales, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnAccess, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnQueries, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addComponent(btnSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(326, Short.MAX_VALUE))
        );

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(221, 221, 221)));
        header.setPreferredSize(new java.awt.Dimension(974, 60));

        welcomeMessage.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        welcomeMessage.setForeground(new java.awt.Color(55, 123, 76));
        welcomeMessage.setText("Bienvenido Román Santillán");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );

        userName.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        userName.setText("Saulo Román Santillán Nava");

        userRole.setBackground(new java.awt.Color(255, 255, 153));
        userRole.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        userRole.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userRole.setText("Administrador");
        userRole.setOpaque(true);

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(welcomeMessage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userName, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(userRole, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(userPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(userPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                                .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(userRole, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(headerLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(welcomeMessage)))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        mainPanel.setBackground(new java.awt.Color(240, 240, 240));
        mainPanel.setPreferredSize(new java.awt.Dimension(1300, 900));

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1320, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout mainLayout = new javax.swing.GroupLayout(main);
        main.setLayout(mainLayout);
        mainLayout.setHorizontalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLayout.createSequentialGroup()
                .addComponent(sidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, 1320, Short.MAX_VALUE)
                    .addGroup(mainLayout.createSequentialGroup()
                        .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        mainLayout.setVerticalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidebar, javax.swing.GroupLayout.DEFAULT_SIZE, 994, Short.MAX_VALUE)
            .addGroup(mainLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 936, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel boxLogo;
    public javax.swing.JButton btnAccess;
    public javax.swing.JButton btnLogout;
    public javax.swing.JButton btnPurchases;
    public javax.swing.JButton btnQueries;
    public javax.swing.JButton btnSales;
    public javax.swing.JButton btnSettings;
    public javax.swing.JButton btnWarehouse;
    public javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel4;
    public javax.swing.JPanel main;
    public javax.swing.JPanel mainPanel;
    public javax.swing.JPanel sidebar;
    public javax.swing.JLabel userName;
    public javax.swing.JLabel userPhoto;
    public javax.swing.JLabel userRole;
    public javax.swing.JLabel welcomeMessage;
    // End of variables declaration//GEN-END:variables
}
