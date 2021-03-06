/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;
import formularios.FormCadastrarClientes;
/**
 *
 * @author Juliana
 */
public class FormMenu extends javax.swing.JFrame {

    /**
     * Creates new form oficial
     */
    public FormMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton6 = new javax.swing.JButton();
        planodefundo = new javax.swing.JPanel();
        btnCadCliente = new javax.swing.JButton();
        btnCadAdvogado = new javax.swing.JButton();
        btnAgeAudiência = new javax.swing.JButton();
        btnCadIntimacao = new javax.swing.JButton();
        btnCadLogin = new javax.swing.JButton();
        btnRegProcesso = new javax.swing.JButton();
        btnSobre = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        jButton6.setText("jButton6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal");
        setResizable(false);

        planodefundo.setBackground(new java.awt.Color(255, 255, 255));

        btnCadCliente.setBackground(new java.awt.Color(255, 255, 255));
        btnCadCliente.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        btnCadCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/adicionar ofi.png"))); // NOI18N
        btnCadCliente.setText("Cadastrar Cliente");
        btnCadCliente.setBorderPainted(false);
        btnCadCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadClienteActionPerformed(evt);
            }
        });

        btnCadAdvogado.setBackground(new java.awt.Color(255, 255, 255));
        btnCadAdvogado.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        btnCadAdvogado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/adicionar ofi.png"))); // NOI18N
        btnCadAdvogado.setText("Cadastrar Advogado  ");
        btnCadAdvogado.setBorderPainted(false);
        btnCadAdvogado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadAdvogado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadAdvogadoActionPerformed(evt);
            }
        });

        btnAgeAudiência.setBackground(new java.awt.Color(255, 255, 255));
        btnAgeAudiência.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        btnAgeAudiência.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agendinha.png"))); // NOI18N
        btnAgeAudiência.setText("Agendar Audiência");
        btnAgeAudiência.setBorder(null);
        btnAgeAudiência.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgeAudiência.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgeAudiênciaActionPerformed(evt);
            }
        });

        btnCadIntimacao.setBackground(new java.awt.Color(255, 255, 255));
        btnCadIntimacao.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        btnCadIntimacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/arq.png"))); // NOI18N
        btnCadIntimacao.setText("Cadastrar Intimação");
        btnCadIntimacao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadIntimacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadIntimacaoActionPerformed(evt);
            }
        });

        btnCadLogin.setBackground(new java.awt.Color(255, 255, 255));
        btnCadLogin.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        btnCadLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/chave.png"))); // NOI18N
        btnCadLogin.setText("Login");
        btnCadLogin.setBorderPainted(false);
        btnCadLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnRegProcesso.setBackground(new java.awt.Color(255, 255, 255));
        btnRegProcesso.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        btnRegProcesso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/arquivo.png"))); // NOI18N
        btnRegProcesso.setText("Registrar Processo");
        btnRegProcesso.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegProcesso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegProcessoActionPerformed(evt);
            }
        });

        btnSobre.setBackground(new java.awt.Color(255, 255, 255));
        btnSobre.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        btnSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iformação.png"))); // NOI18N
        btnSobre.setText("Sobre o Software");
        btnSobre.setBorderPainted(false);
        btnSobre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSobreActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscar.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setBorderPainted(false);
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout planodefundoLayout = new javax.swing.GroupLayout(planodefundo);
        planodefundo.setLayout(planodefundoLayout);
        planodefundoLayout.setHorizontalGroup(
            planodefundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(planodefundoLayout.createSequentialGroup()
                .addGap(257, 257, 257)
                .addGroup(planodefundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(planodefundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnCadAdvogado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegProcesso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCadLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(planodefundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(planodefundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnCadCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCadIntimacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSobre, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAgeAudiência, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(257, Short.MAX_VALUE))
        );
        planodefundoLayout.setVerticalGroup(
            planodefundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(planodefundoLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(planodefundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadAdvogado, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(planodefundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegProcesso, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadIntimacao, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(planodefundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgeAudiência, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(planodefundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSobre, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        getContentPane().add(planodefundo, java.awt.BorderLayout.CENTER);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logoMenu.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadClienteActionPerformed
        if(evt.getSource().equals(btnCadCliente)){
              FormCadastrarClientes formCli = new FormCadastrarClientes(this, true);
              formCli.setVisible(true);
         }
    }//GEN-LAST:event_btnCadClienteActionPerformed

    private void btnCadAdvogadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadAdvogadoActionPerformed
        if(evt.getSource().equals(btnCadAdvogado)){
              FormCadastrarAdvogado formAdv = new FormCadastrarAdvogado(this, true);
              formAdv.setVisible(true);
         }
    }//GEN-LAST:event_btnCadAdvogadoActionPerformed

    private void btnAgeAudiênciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgeAudiênciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgeAudiênciaActionPerformed

    private void btnCadIntimacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadIntimacaoActionPerformed
        if(evt.getSource().equals(btnCadIntimacao)){
              FormCadastrarIntimacao formInt = new FormCadastrarIntimacao(this, true);
              formInt.setVisible(true);
         }
    }//GEN-LAST:event_btnCadIntimacaoActionPerformed

    
    private void btnSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSobreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSobreActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if(evt.getSource().equals(btnBuscar)){
              FormBuscar formBsc = new FormBuscar(this, true);
              formBsc.setVisible(true);
         }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnRegProcessoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegProcessoActionPerformed
        if(evt.getSource().equals(btnRegProcesso)){
              FormCadastrarProcessos formPro = new FormCadastrarProcessos(this, true);
              formPro.setVisible(true);
         }
    }//GEN-LAST:event_btnRegProcessoActionPerformed

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
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnAgeAudiência;
    public static javax.swing.JButton btnBuscar;
    public static javax.swing.JButton btnCadAdvogado;
    public static javax.swing.JButton btnCadCliente;
    public static javax.swing.JButton btnCadIntimacao;
    public static javax.swing.JButton btnCadLogin;
    public static javax.swing.JButton btnRegProcesso;
    public static javax.swing.JButton btnSobre;
    public static javax.swing.JButton jButton6;
    public static javax.swing.JLabel jLabel2;
    public static javax.swing.JPanel jPanel1;
    public static javax.swing.JPanel planodefundo;
    // End of variables declaration//GEN-END:variables
}
