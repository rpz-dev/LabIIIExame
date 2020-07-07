package ProjetoLAB;

import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.table.DefaultTableModel;

public class Main extends javax.swing.JFrame {
    //Variáveis utilizadas
    private javax.swing.JButton opLimpar;
    private javax.swing.JButton opSalvar;
    private javax.swing.JComboBox<String> cbbTipo;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JLabel lblPreco;
    private javax.swing.JRadioButton rdbtnComercial;
    private javax.swing.JRadioButton rdbtnResidencial;
    private javax.swing.JScrollPane scpPainel;
    private javax.swing.JScrollPane scpTabImoveis;
    private javax.swing.JPanel tabCadastrar;
    private javax.swing.JTable tabImoveis;
    private javax.swing.JTabbedPane tbpUnico;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPreco;
    
    //Criação da lista
    java.util.List<Imovel> lista = new ArrayList<>();
    
    public Main() {
        initComponents();
        configs();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        opLimpar = new javax.swing.JButton();
        tbpUnico = new javax.swing.JTabbedPane();
        tabCadastrar = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblDescricao = new javax.swing.JLabel();
        scpPainel = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        lblCategoria = new javax.swing.JLabel();
        rdbtnResidencial = new javax.swing.JRadioButton();
        rdbtnComercial = new javax.swing.JRadioButton();
        lblTipo = new javax.swing.JLabel();
        cbbTipo = new javax.swing.JComboBox<>();
        lblPreco = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        opSalvar = new javax.swing.JButton();
        scpTabImoveis = new javax.swing.JScrollPane();
        tabImoveis = new javax.swing.JTable();

        opLimpar.setText("Limpar");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNome.setFont(new java.awt.Font("DialogInput", 0, 18)); 
        lblNome.setText("Insira o nome do proprietário:");

        lblDescricao.setFont(new java.awt.Font("DialogInput", 0, 18)); 
        lblDescricao.setText("Descrição:");

        txtDescricao.setColumns(20);
        txtDescricao.setRows(5);
        scpPainel.setViewportView(txtDescricao);

        lblCategoria.setFont(new java.awt.Font("DialogInput", 0, 18)); 
        lblCategoria.setText("Categoria:");

        rdbtnResidencial.setText("Residencial");

        rdbtnComercial.setText("Comercial");

        lblTipo.setFont(new java.awt.Font("DialogInput", 0, 18)); 
        lblTipo.setText("Tipo:");

        cbbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Apartamento", "Casa", "Chácara", "Sala", "Salão", "Sítio" }));

        lblPreco.setFont(new java.awt.Font("DialogInput", 0, 18)); 
        lblPreco.setText("Valor:");

        opSalvar.setText("Salvar");
        opSalvar.setMaximumSize(new java.awt.Dimension(70, 32));
        opSalvar.setMinimumSize(new java.awt.Dimension(70, 32));
        opSalvar.setPreferredSize(new java.awt.Dimension(70, 32));
        opSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        tabImoveis.setModel(new javax.swing.table.DefaultTableModel(
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
        scpTabImoveis.setViewportView(tabImoveis);

        javax.swing.GroupLayout tabCadastrarLayout = new javax.swing.GroupLayout(tabCadastrar);
        tabCadastrar.setLayout(tabCadastrarLayout);
        tabCadastrarLayout.setHorizontalGroup(
            tabCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabCadastrarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabCadastrarLayout.createSequentialGroup()
                        .addComponent(lblNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tabCadastrarLayout.createSequentialGroup()
                        .addGroup(tabCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tabCadastrarLayout.createSequentialGroup()
                                .addComponent(lblCategoria)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdbtnResidencial))
                            .addGroup(tabCadastrarLayout.createSequentialGroup()
                                .addComponent(lblTipo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(tabCadastrarLayout.createSequentialGroup()
                                .addComponent(lblPreco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(tabCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(opSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rdbtnComercial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(tabCadastrarLayout.createSequentialGroup()
                        .addComponent(lblDescricao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scpPainel, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scpTabImoveis, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                .addContainerGap())
        );
        tabCadastrarLayout.setVerticalGroup(
            tabCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabCadastrarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(tabCadastrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scpTabImoveis, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(18, 18, 18))
            .addGroup(tabCadastrarLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(tabCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCategoria)
                    .addComponent(rdbtnResidencial)
                    .addComponent(rdbtnComercial))
                .addGroup(tabCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabCadastrarLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(tabCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTipo)
                            .addComponent(cbbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(tabCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPreco)
                            .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabCadastrarLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(opSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)))
                .addGroup(tabCadastrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scpPainel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6))
        );

        tbpUnico.addTab("Cadastrar", tabCadastrar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tbpUnico, javax.swing.GroupLayout.PREFERRED_SIZE, 758, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbpUnico, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {
        Imovel imovel = new Imovel();

        imovel.setNome(txtNome.getText());
        imovel.setDescricao(txtDescricao.getText());

        String _t = (String) cbbTipo.getSelectedItem();
        imovel.setTipo(_t);

        String _c = "";
        if (rdbtnComercial.isSelected()){
            _c = "Comercial";
        }else if (rdbtnResidencial.isSelected()){
            _c = "Residencial";
        }
        imovel.setCategoria(_c);

        imovel.setPreco(txtPreco.getText());

        lista.add(imovel);

        DefaultTableModel u = (DefaultTableModel)tabImoveis.getModel();
        u.addRow(new String[]{imovel.getNome(), imovel.getCategoria(), imovel.getTipo(), imovel.getPreco(), imovel.getDescricao()});
        tabImoveis.setModel(u);

    }

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    private void configs() {       
        this.setTitle("Cadastro de Imóveis");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
        //Definição do RadioButton
        ButtonGroup btngp = new ButtonGroup();
        btngp.add(rdbtnComercial);
        btngp.add(rdbtnResidencial);
        
        table();
    }
    
    private void table(){
        DefaultTableModel u = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }  
        };
        
        //Definição das colunas
        u.addColumn("Nome");
        u.addColumn("Categoria");
        u.addColumn("Tipo");
        u.addColumn("Preco");
        u.addColumn("Descrição");
        tabImoveis.setModel(u);
    }
}
