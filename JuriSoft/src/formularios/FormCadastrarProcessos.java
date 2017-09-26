/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import dao.ClientesDAO;
import dao.ProcessoDAO;
import jurisoft.Mensagens;
import regrasDeNegocio.Clientes;
import regrasDeNegocio.Numeros;
import regrasDeNegocio.Processo;
import regrasDeNegocio.ValidarCPF;

/**
 *
 * @author 00733769225
 */
public class FormCadastrarProcessos extends javax.swing.JDialog {

    /**
     * Creates new form FormProcesso
     */
    public FormCadastrarProcessos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        travarComponentes();
        
        txtNumPro.setDocument(new Numeros());
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblNumPro = new javax.swing.JLabel();
        lblAssuntoPro = new javax.swing.JLabel();
        lblVaraPro = new javax.swing.JLabel();
        lblClassificacaoPro = new javax.swing.JLabel();
        lblSituacaoPro = new javax.swing.JLabel();
        lblTipoPro = new javax.swing.JLabel();
        lblCodCli = new javax.swing.JLabel();
        lblOrigemPro = new javax.swing.JLabel();
        lblNaturezaPro = new javax.swing.JLabel();
        lblFasePro = new javax.swing.JLabel();
        lblInstanciaPro = new javax.swing.JLabel();
        lblDescricaoPro = new javax.swing.JLabel();
        lblNívelPro = new javax.swing.JLabel();
        txtNumPro = new javax.swing.JTextField();
        cmbVaraPro = new javax.swing.JComboBox<>();
        cmbClassificacaoPro = new javax.swing.JComboBox<>();
        cmbSituacaoPro = new javax.swing.JComboBox<>();
        cmbTipoPro = new javax.swing.JComboBox<>();
        cmbOrigemPro = new javax.swing.JComboBox<>();
        txtNaturezaPro = new javax.swing.JTextField();
        cmbInstanciaPro = new javax.swing.JComboBox<>();
        cmbFasePro = new javax.swing.JComboBox<>();
        cmbNivelPro = new javax.swing.JComboBox<>();
        JScrollPane = new javax.swing.JScrollPane();
        txtDescricaoPro = new javax.swing.JTextArea();
        txtAssuntoPro = new javax.swing.JTextField();
        btnInserir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        txtCodCli = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/jurilogoProcesso.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(790, 499));

        lblNumPro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNumPro.setText("Número do Processo");

        lblAssuntoPro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblAssuntoPro.setText("Assunto do Processo");

        lblVaraPro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblVaraPro.setText("Vara");

        lblClassificacaoPro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblClassificacaoPro.setText("Classificação do Processo");

        lblSituacaoPro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblSituacaoPro.setText("Situação do Processo");

        lblTipoPro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTipoPro.setText("Tipo de Ação");

        lblCodCli.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCodCli.setText("Código do Cliente");

        lblOrigemPro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblOrigemPro.setText("Origem do Processo");

        lblNaturezaPro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNaturezaPro.setText("Natureza do Processo");

        lblFasePro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblFasePro.setText("Fase");

        lblInstanciaPro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblInstanciaPro.setText("Instância");

        lblDescricaoPro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblDescricaoPro.setText("Descrição");

        lblNívelPro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNívelPro.setText("Nível de Acesso");

        txtNumPro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNumPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumProActionPerformed(evt);
            }
        });

        cmbVaraPro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbVaraPro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Civil", "Criminal", "Trabalhista" }));

        cmbClassificacaoPro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbClassificacaoPro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Processo de Conhecimento", "Processo de Execução", "Processo Cautelar" }));

        cmbSituacaoPro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbSituacaoPro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Em Instrução", "Aguardando Comissão", "Em Instrução/Sobrestado", "Iniciamento/defesa", "Processo Encaminhado para Julgamento", "Processo Julgado" }));

        cmbTipoPro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbTipoPro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ações Declaratórias", "Ações Constitutivas", "Ações Condenatórias", "Ações Mandamentais", "Ação de Execução", "Ação Cautelar" }));

        cmbOrigemPro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbOrigemPro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Processo Interno", "Processo Externo" }));

        txtNaturezaPro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        cmbInstanciaPro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbInstanciaPro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1ª Instância", "2ª Instância" }));

        cmbFasePro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbFasePro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sentença", "Recurso", "Execução de sentença" }));

        cmbNivelPro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbNivelPro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Restrito", "Público", "Sigiloso" }));

        txtDescricaoPro.setColumns(20);
        txtDescricaoPro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtDescricaoPro.setRows(5);
        JScrollPane.setViewportView(txtDescricaoPro);

        txtAssuntoPro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtAssuntoPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAssuntoProActionPerformed(evt);
            }
        });

        btnInserir.setBackground(new java.awt.Color(255, 255, 255));
        btnInserir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnInserir.setText("INSERIR");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(255, 255, 255));
        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSalvar.setBackground(new java.awt.Color(255, 255, 255));
        btnSalvar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSalvar.setText("SALVAR");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbClassificacaoPro, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JScrollPane, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lblDescricaoPro, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cmbFasePro, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblFasePro))
                            .addComponent(txtAssuntoPro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtCodCli)
                                        .addGap(15, 15, 15))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblClassificacaoPro, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblCodCli, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(89, 89, 89)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbSituacaoPro, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblSituacaoPro, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtNaturezaPro, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNaturezaPro, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblNumPro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                                    .addComponent(txtNumPro, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(35, 35, 35)
                                .addComponent(lblAssuntoPro, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cmbVaraPro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbTipoPro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbOrigemPro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbInstanciaPro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbNivelPro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblTipoPro, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVaraPro, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOrigemPro, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblInstanciaPro, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNívelPro, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(116, 116, 116))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(btnInserir)
                .addGap(43, 43, 43)
                .addComponent(btnCancelar)
                .addGap(43, 43, 43)
                .addComponent(btnSalvar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumPro)
                    .addComponent(lblAssuntoPro)
                    .addComponent(lblVaraPro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbVaraPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAssuntoPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblClassificacaoPro)
                            .addComponent(lblTipoPro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbClassificacaoPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbTipoPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCodCli)
                            .addComponent(lblOrigemPro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbOrigemPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblSituacaoPro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbSituacaoPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCodCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNaturezaPro)
                    .addComponent(lblFasePro)
                    .addComponent(lblInstanciaPro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNaturezaPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbInstanciaPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbFasePro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescricaoPro)
                    .addComponent(lblNívelPro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbNivelPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnCancelar)
                    .addComponent(btnInserir))
                .addGap(39, 39, 39))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 96, 796, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumProActionPerformed

    private void txtAssuntoProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAssuntoProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAssuntoProActionPerformed

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        txtAssuntoPro.setEditable(true);
        txtCodCli.setEditable(true);
        txtDescricaoPro.setEditable(true);
        txtNaturezaPro.setEditable(true);
        txtNumPro.setEditable(true);
        cmbNivelPro.setEditable(true);
        cmbTipoPro.setEditable(true);
        cmbClassificacaoPro.setEditable(true);
        cmbFasePro.setEditable(true);
        cmbInstanciaPro.setEditable(true);
        cmbOrigemPro.setEditable(true);
        cmbSituacaoPro.setEditable(true);
        cmbVaraPro.setEditable(true);

        btnCancelar.setEnabled(true);
        btnSalvar.setEnabled(true);
        btnInserir.setEnabled(false); 
    }//GEN-LAST:event_btnInserirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        travarComponentes();
        btnInserir.setEnabled(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
       // int idCliente;
        Clientes cli = new Clientes();
        Processo proc = new Processo();
        ClientesDAO cliDAO = new ClientesDAO();
        ProcessoDAO procDAO = new ProcessoDAO();
        
            cliDAO.pesquisarCpf(txtCodCli.getText());
            cli = cliDAO.getCliente();
            
            proc.setAssuntoPro(txtAssuntoPro.getText());     
            proc.setDescricaoPro(txtDescricaoPro.getText()); 
            proc.setNaturezaPro(txtNaturezaPro.getText()); 
            proc.setNumeroPro(txtNumPro.getText()); 
            proc.setNivelPro(String.valueOf(cmbNivelPro.getSelectedItem())); 
            proc.setTipoAcaoPro(String.valueOf(cmbTipoPro.getSelectedItem())); 
            proc.setClassificacaoPro(String.valueOf(cmbClassificacaoPro.getSelectedItem())); 
            proc.setFasePro(String.valueOf(cmbFasePro.getSelectedItem())); 
            proc.setInstanciaPro(String.valueOf(cmbInstanciaPro.getSelectedItem())); 
            proc.setOrigemPro(String.valueOf(cmbOrigemPro.getSelectedItem())); 
            proc.setSituacaoPro(String.valueOf(cmbSituacaoPro.getSelectedItem())); 
            proc.setVaraPro(String.valueOf(cmbVaraPro.getSelectedItem())); 
                  
            proc.setCodCli(cli.getCodCli());
            procDAO.cadastrarProcesso(proc);
            
            
        btnInserir.setEnabled(true);
        travarComponentes(); 
    }//GEN-LAST:event_btnSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(FormCadastrarProcessos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormCadastrarProcessos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormCadastrarProcessos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormCadastrarProcessos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormCadastrarProcessos dialog = new FormCadastrarProcessos(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane JScrollPane;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cmbClassificacaoPro;
    private javax.swing.JComboBox<String> cmbFasePro;
    private javax.swing.JComboBox<String> cmbInstanciaPro;
    private javax.swing.JComboBox<String> cmbNivelPro;
    private javax.swing.JComboBox<String> cmbOrigemPro;
    private javax.swing.JComboBox<String> cmbSituacaoPro;
    private javax.swing.JComboBox<String> cmbTipoPro;
    private javax.swing.JComboBox<String> cmbVaraPro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAssuntoPro;
    private javax.swing.JLabel lblClassificacaoPro;
    private javax.swing.JLabel lblCodCli;
    private javax.swing.JLabel lblDescricaoPro;
    private javax.swing.JLabel lblFasePro;
    private javax.swing.JLabel lblInstanciaPro;
    private javax.swing.JLabel lblNaturezaPro;
    private javax.swing.JLabel lblNumPro;
    private javax.swing.JLabel lblNívelPro;
    private javax.swing.JLabel lblOrigemPro;
    private javax.swing.JLabel lblSituacaoPro;
    private javax.swing.JLabel lblTipoPro;
    private javax.swing.JLabel lblVaraPro;
    private javax.swing.JTextField txtAssuntoPro;
    private javax.swing.JTextField txtCodCli;
    private javax.swing.JTextArea txtDescricaoPro;
    private javax.swing.JTextField txtNaturezaPro;
    private javax.swing.JTextField txtNumPro;
    // End of variables declaration//GEN-END:variables
public void travarComponentes(){           
        txtAssuntoPro.setText(null);
        txtCodCli.setText(null);
        txtDescricaoPro.setText(null); 
        txtNaturezaPro.setText(null);
        txtNumPro.setText(null);
        cmbNivelPro.setSelectedIndex(0);
        cmbTipoPro.setSelectedIndex(0);
        cmbClassificacaoPro.setSelectedIndex(0);
        cmbFasePro.setSelectedIndex(0);
        cmbInstanciaPro.setSelectedIndex(0);
        cmbOrigemPro.setSelectedIndex(0);
        cmbSituacaoPro.setSelectedIndex(0);
        cmbVaraPro.setSelectedIndex(0);
        
        
        txtAssuntoPro.setEditable(false);
        txtCodCli.setEditable(false);
        txtDescricaoPro.setEditable(false);
        txtNaturezaPro.setEditable(false);
        txtNumPro.setEditable(false);
        cmbNivelPro.setEditable(false);
        cmbTipoPro.setEditable(false);
        cmbClassificacaoPro.setEditable(false);
        cmbFasePro.setEditable(false);
        cmbInstanciaPro.setEditable(false);
        cmbOrigemPro.setEditable(false);
        cmbSituacaoPro.setEditable(false);
        cmbVaraPro.setEditable(false);

        btnCancelar.setEnabled(false);
        btnSalvar.setEnabled(false);
        btnInserir.setEnabled(true); 
    }
}
