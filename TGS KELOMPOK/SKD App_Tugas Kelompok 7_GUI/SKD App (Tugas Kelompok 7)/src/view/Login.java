package view;

import javax.swing.JPasswordField;
import javax.swing.JTextField;
import controller.ControllerLogin;

/**
 *
 * @author ASUS
 */


public class Login extends javax.swing.JFrame {
    ControllerLogin controllerLogin = new ControllerLogin(this);

  
    public Login() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
    }  

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Left = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        loginEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        loginPassword = new javax.swing.JPasswordField();
        loginButton = new javax.swing.JButton();
        Right1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");

        Left.setBackground(new java.awt.Color(255, 255, 255));
        Left.setMinimumSize(new java.awt.Dimension(400, 500));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 151, 178));
        jLabel1.setText("LOGIN");

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Email");

        loginEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        loginEmail.setForeground(new java.awt.Color(102, 102, 102));
        loginEmail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 151, 178), 2, true));

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Password");

        loginPassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 151, 178), 2, true));

        loginButton.setBackground(new java.awt.Color(0, 151, 178));
        loginButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
        Left.setLayout(LeftLayout);
        LeftLayout.setHorizontalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftLayout.createSequentialGroup()
                .addGap(0, 70, Short.MAX_VALUE)
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(loginPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(loginEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        LeftLayout.setVerticalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(loginEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(loginPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Right1.setBackground(new java.awt.Color(0, 151, 178));
        Right1.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("-Amir  -Namira  -Juan  -Shinta");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Survei Kebutuhan Data");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Politeknik Statistika STIS");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("2023/2024");

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bpsicon.png"))); // NOI18N
        jLabel18.setText("jLabel11");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Kuesioner");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Kelompok 7");

        javax.swing.GroupLayout Right1Layout = new javax.swing.GroupLayout(Right1);
        Right1.setLayout(Right1Layout);
        Right1Layout.setHorizontalGroup(
            Right1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Right1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(Right1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addGroup(Right1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel17)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Right1Layout.createSequentialGroup()
                .addGap(0, 5, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Right1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Right1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Right1Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(103, 103, 103))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Right1Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71))))
            .addGroup(Right1Layout.createSequentialGroup()
                .addGroup(Right1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Right1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel16))
                    .addGroup(Right1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel20)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Right1Layout.setVerticalGroup(
            Right1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Right1Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGroup(Right1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Right1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(Right1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel17)))
                .addGap(5, 5, 5)
                .addComponent(jLabel20)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(Right1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Left, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Right1, javax.swing.GroupLayout.DEFAULT_SIZE, 522, Short.MAX_VALUE)
            .addComponent(Left, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
        controllerLogin.cek();
        loginEmail.setText("");
        loginPassword.setText("");
    }//GEN-LAST:event_loginButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Left;
    private javax.swing.JPanel Right;
    private javax.swing.JPanel Right1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton loginButton;
    private javax.swing.JTextField loginEmail;
    private javax.swing.JPasswordField loginPassword;
    // End of variables declaration//GEN-END:variables
    public String getLoginPassword() {
        return String.valueOf(loginPassword.getPassword());
    }

    public JTextField getLoginEmail() {
        return loginEmail;
    }

    public void setLoginPassword(JPasswordField loginPassword) {
        this.loginPassword = loginPassword;
    }

    public void setLoginEmail(JTextField loginUsername) {
        this.loginEmail = loginUsername;
    }
}

