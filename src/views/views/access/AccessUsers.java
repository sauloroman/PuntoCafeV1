package views.access;

public class AccessUsers extends javax.swing.JPanel {

    private final AccessUsersInit style = new AccessUsersInit(this);
    
    public AccessUsers() {
        initComponents();
        style.init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        quantityUsers = new javax.swing.JLabel();
        btnNewUser = new javax.swing.JButton();
        userRoleCombo = new javax.swing.JComboBox<>();
        searchUserTxt = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        usersTable = new javax.swing.JTable();
        pageCombo = new javax.swing.JComboBox<>();
        titlePage = new javax.swing.JLabel();
        titleItems = new javax.swing.JLabel();
        itemsPerPageComboBox = new javax.swing.JComboBox<>();
        quantityItems = new javax.swing.JLabel();
        btnSeeUser = new javax.swing.JButton();
        btnRestore = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel1.setText("Administración de usuarios");

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Administra tus miembros del equipo y su asignación activa de responsabilidades");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Todos los Usuarios >");

        quantityUsers.setBackground(new java.awt.Color(255, 250, 199));
        quantityUsers.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        quantityUsers.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quantityUsers.setText("10");
        quantityUsers.setOpaque(true);

        btnNewUser.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnNewUser.setText("Crear Usuario");
        btnNewUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        userRoleCombo.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        userRoleCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Filtro por Roles", "Administrador", "Supervisor", "Vendedor" }));
        userRoleCombo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnSearch.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnSearch.setText("Buscar");
        btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        usersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(usersTable);

        titlePage.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        titlePage.setText("No. Página");

        titleItems.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        titleItems.setText("Registros por página");

        itemsPerPageComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "15", "20" }));
        itemsPerPageComboBox.setPreferredSize(new java.awt.Dimension(70, 22));

        quantityItems.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        quantityItems.setForeground(new java.awt.Color(102, 102, 102));
        quantityItems.setText("Visualizando 10 de 30 categorías");

        btnSeeUser.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnSeeUser.setText("Ver Usuario");
        btnSeeUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnRestore.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnRestore.setText("Reestablecer");
        btnRestore.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(quantityUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(quantityItems))
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(searchUserTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSeeUser, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(userRoleCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(btnNewUser, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(titlePage)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pageCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(titleItems)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(itemsPerPageComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRestore, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1255, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNewUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(userRoleCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSeeUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(searchUserTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(quantityUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(quantityItems))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pageCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titlePage)
                    .addComponent(titleItems)
                    .addComponent(itemsPerPageComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRestore, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnNewUser;
    public javax.swing.JButton btnRestore;
    public javax.swing.JButton btnSearch;
    public javax.swing.JButton btnSeeUser;
    public javax.swing.JComboBox<String> itemsPerPageComboBox;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JComboBox<String> pageCombo;
    public javax.swing.JLabel quantityItems;
    public javax.swing.JLabel quantityUsers;
    public javax.swing.JTextField searchUserTxt;
    public javax.swing.JLabel titleItems;
    public javax.swing.JLabel titlePage;
    public javax.swing.JComboBox<String> userRoleCombo;
    public javax.swing.JTable usersTable;
    // End of variables declaration//GEN-END:variables
}
