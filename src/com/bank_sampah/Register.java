package com.bank_sampah;
import java.awt.*;
import java.awt.event.FocusEvent;
import javax.swing.*;

public class Register extends javax.swing.JFrame {

    private final JPanel jPanel1 = new JPanel();
    private final JLabel jLabel1 = new JLabel();
    private final JTextField jtNama = new JTextField();
    private final JSeparator jSeparator1 = new JSeparator();
    private final JTextField username = new JTextField();
    private final JSeparator jSeparator2 = new JSeparator();
    private final JTextField email = new JTextField();
    private final JSeparator jSeparator3 = new JSeparator();
    private final JTextField alamat = new JTextField();
    private final JSeparator jSeparator4 = new JSeparator();
    private final JPasswordField password = new JPasswordField();
    private final JSeparator jSeparator6 = new JSeparator();
    private final JCheckBox jCheckBox1 = new JCheckBox();
    private final JLabel register_button = new JLabel();
    private final JPanel jPanel2 = new JPanel();
    private FocusEvent evt;

    public Register() {
        initComponents();
        this.getContentPane().setBackground(new Color(51,51,51));
        this.setLocationRelativeTo(null);
        this.requestFocus();
        this.setVisible(true);
    }

    private void initComponents() {



        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        jPanel1.setForeground(new java.awt.Color(255, 255, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 24));
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Register");

        jtNama.setBackground(new java.awt.Color(51, 51, 51));
        jtNama.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 12)); // NOI18N
        jtNama.setForeground(new java.awt.Color(255, 255, 0));
        jtNama.setText("Nama Lengkap");
        jtNama.setBorder(null);
        jtNama.setCaretColor(new Color(255,255,0));
        jtNama.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtNamaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtNamaFocusLost(evt);
            }
        });
        jtNama.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtNamaMousePressed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(255, 255, 0));

        username.setBackground(new java.awt.Color(51, 51, 51));
        username.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 12));
        username.setForeground(new java.awt.Color(255, 255, 0));
        username.setText("Username");
        username.setBorder(null);
        username.setCaretColor(new Color(255,255,0));
        username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameFocusLost(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(255, 255, 0));

        email.setBackground(new java.awt.Color(51, 51, 51));
        email.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 12)); // NOI18N
        email.setForeground(new java.awt.Color(255, 255, 0));
        email.setText("Email");
        email.setBorder(null);
        email.setCaretColor(new Color(255,255,0)); // mengatur warna cursor
        email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailFocusLost(evt);
            }
        });

        jSeparator3.setForeground(new java.awt.Color(255, 255, 0));

        alamat.setBackground(new java.awt.Color(51, 51, 51));
        alamat.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 12)); // NOI18N
        alamat.setForeground(new java.awt.Color(255, 255, 51));
        alamat.setText("Alamat Lengkap");
        alamat.setBorder(null);
        alamat.setCaretColor(new Color(255,255,0));
        alamat.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                alamatFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                alamatFocusLost(evt);
            }
        });

        jSeparator4.setForeground(new java.awt.Color(255, 255, 0));

        password.setBackground(new java.awt.Color(51, 51, 51));
        password.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 12)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 0));
        password.setText("Password");
        password.setBorder(null);
        password.setCaretColor(new Color(255,255,0));
        password.setEchoChar((char)0);
        password.addFocusListener(new java.awt.event.FocusAdapter() {
            //mengatur agar simbol sensor pada pass dapat diubah
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFocusGained();
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFocusLost();
            }
        });

        jSeparator6.setForeground(new java.awt.Color(255, 255, 0));

        jCheckBox1.setBackground(new java.awt.Color(51, 51, 51));
        jCheckBox1.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 9));
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 0));
        jCheckBox1.setText("Saya Menyetujui Segala Syarat dan Ketentuan");

        register_button.setBackground(new java.awt.Color(51, 51, 51));
        register_button.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 18));
        register_button.setForeground(new java.awt.Color(255, 255, 0));
        register_button.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        register_button.setText("Register");
        register_button.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0)));
        register_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                register_buttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                register_buttonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 29, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(password, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(alamat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                                                                .addComponent(email, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(username, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(jtNama, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(register_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addGap(25, 25, 25))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(93, 93, 93)))))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(register_button, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 278, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>







    private void jtNamaMousePressed(java.awt.event.MouseEvent evt) {

    }

    private void jtNamaFocusGained(java.awt.event.FocusEvent evt) {
        if(jtNama.getText().equals("Nama Lengkap")){
            jtNama.setText("");
        }
    }

    private void jtNamaFocusLost(java.awt.event.FocusEvent evt) {
        if(jtNama.getText().equals("")){
            jtNama.setText("Nama Lengkap");
        }
    }

    private void register_buttonMouseEntered(java.awt.event.MouseEvent evt) {
        register_button.setOpaque(true);
        register_button.setBackground(new Color(250,250,0));
        register_button.setForeground(new Color(51,51,51));
        register_button.setCursor( Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }

    private void register_buttonMouseExited(java.awt.event.MouseEvent evt) {
        register_button.setBackground(new Color(51,51,51));
        register_button.setForeground(new Color(250,250,0));
    }

    private void usernameFocusGained(java.awt.event.FocusEvent evt) {
        if(username.getText().equals("Username")){
            username.setText("");
        }
    }

    private void usernameFocusLost(java.awt.event.FocusEvent evt) {
        if(username.getText().equals("")){
            username.setText("Username");
        }
    }

    private void emailFocusGained(java.awt.event.FocusEvent evt) {
        if(email.getText().equals("Email")){
            email.setText("");
        }
    }

    private void emailFocusLost(java.awt.event.FocusEvent evt) {
        if(email.getText().equals("")){
            email.setText("Email");
        }
    }

    private void alamatFocusGained(java.awt.event.FocusEvent evt) {
        if(alamat.getText().equals("Alamat Lengkap")){
            alamat.setText("");
        }
    }

    private void alamatFocusLost(java.awt.event.FocusEvent evt) {
        if(alamat.getText().equals("")){
            alamat.setText("Alamat Lengkap");
        }
    }

    private void passwordFocusGained() {
        String temp = String.valueOf(this.password.getPassword());
        if(temp.equals("Password")){
            password.setText("");
            password.setEchoChar('\u25CF');
        }
    }
    private void passwordFocusLost(){
        String temp = String.valueOf(this.password.getPassword());
        if(temp.equals("")){
            password.setEchoChar((char)0);
            password.setText("Password");
        }
    }
}
