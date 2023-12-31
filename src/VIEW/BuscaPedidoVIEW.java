
package VIEW;

import DAO.EbookDAO;
import DAO.ItemPedidoDAO;
import DAO.PedidoDAO;
import DTO.EbookDTO;
import DTO.ItemPedidoDTO;
import DTO.PedidoDTO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Grupo em conjunto cada membro fez uma tela.
 */
public class BuscaPedidoVIEW extends javax.swing.JFrame {

    /**
     * Creates new form telaBuscaCliente
     */
    int x, y;
    DefaultTableModel table;

    public BuscaPedidoVIEW() throws SQLException {
        initComponents();
        PedidoDAO dao = new PedidoDAO();
        dao.listarPedido(tblListaBuscarPedido);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        lblAlterarAutor = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListaBuscarPedido = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtBuscaBuscarPedidoID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lblSituacaoCadBuscaPedido = new javax.swing.JLabel();
        btnExCluirPedido = new javax.swing.JButton();
        txtBuscaSituacCadPedidocpf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(30, 34, 60));

        lblAlterarAutor.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        lblAlterarAutor.setForeground(new java.awt.Color(255, 255, 255));
        lblAlterarAutor.setText("CONSULTAR PEDIDO");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/icon tela/IconCloseXXX.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAlterarAutor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 386, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblAlterarAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jDesktopPane1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 40));

        tblListaBuscarPedido.setBackground(new java.awt.Color(204, 204, 204));
        tblListaBuscarPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Data", "Cliente", "Pagamento", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
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
        tblListaBuscarPedido.setGridColor(new java.awt.Color(204, 204, 204));
        tblListaBuscarPedido.setSelectionBackground(new java.awt.Color(0, 0, 0));
        tblListaBuscarPedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblListaBuscarPedidoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblListaBuscarPedido);

        jDesktopPane1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 540, 360));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("ID:");
        jDesktopPane1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 30, 20));

        txtBuscaBuscarPedidoID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBuscaBuscarPedidoID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtBuscaBuscarPedidoID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscaBuscarPedidoIDActionPerformed(evt);
            }
        });
        txtBuscaBuscarPedidoID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscaBuscarPedidoIDKeyReleased(evt);
            }
        });
        jDesktopPane1.add(txtBuscaBuscarPedidoID, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 160, 20));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Área de Busca");
        jDesktopPane1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, -1, -1));

        lblSituacaoCadBuscaPedido.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblSituacaoCadBuscaPedido.setText("CPF/CNPJ:");
        jDesktopPane1.add(lblSituacaoCadBuscaPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, -1, -1));

        btnExCluirPedido.setBackground(new java.awt.Color(84, 119, 97));
        btnExCluirPedido.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnExCluirPedido.setForeground(new java.awt.Color(255, 255, 255));
        btnExCluirPedido.setText("Excluir");
        btnExCluirPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExCluirPedidoActionPerformed(evt);
            }
        });
        jDesktopPane1.add(btnExCluirPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 450, -1, 30));

        txtBuscaSituacCadPedidocpf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBuscaSituacCadPedidocpf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtBuscaSituacCadPedidocpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscaSituacCadPedidocpfKeyReleased(evt);
            }
        });
        jDesktopPane1.add(txtBuscaSituacCadPedidocpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 200, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VIEW/icon tela/TelaBuscaAtt.png"))); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jDesktopPane1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, -4, 690, 500));

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 500));

        setSize(new java.awt.Dimension(687, 496));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscaBuscarPedidoIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscaBuscarPedidoIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscaBuscarPedidoIDActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // TODO add your handling code here:
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
        int xx = evt.getXOnScreen();
        int yy = evt.getYOnScreen();
        this.setLocation(xx - x, yy - y);
    }//GEN-LAST:event_formMouseDragged

    /**
     *
     * @param evt Evento que chama o método de pesquisar o pedido por id
     */
    private void txtBuscaBuscarPedidoIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaBuscarPedidoIDKeyReleased
        // Chamando método de pesquisa por id do pedido

        PedidoDAO objbusca = new PedidoDAO();
        try {
            objbusca.pesquisarPedidoID(txtBuscaBuscarPedidoID, tblListaBuscarPedido);
        } catch (Exception ex) {
            Logger.getLogger(BuscaEbookVIEW.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtBuscaBuscarPedidoIDKeyReleased

    private void tblListaBuscarPedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblListaBuscarPedidoMouseClicked
        // Setar campo de busca do pedido
        setarCampoPedido();
    }//GEN-LAST:event_tblListaBuscarPedidoMouseClicked

    /**
     *
     * @param evt Evento criado para excluir o pedido através do botao de
     * excluir
     */
    private void btnExCluirPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExCluirPedidoActionPerformed
        // Excluindo pedidos
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir este pedido? \nTodos os itens adicionados serão excluídos.", "Excluir Pedido", 0);
        if (opcao == 0) { // botao "yes" esta na posição zero, entao se ele for clicado, sera permitido a exclusão do pedido
            try {
                excluirItemPedido(); // primeiro ele executa a exclusão dos itens para, assim, excluir o pedido
                excluirPedido();
                //mensagem informando que o pedido foi excluído
            } catch (Exception e) { //tratamento de erro, caso o pedido não puder ser excluído
                JOptionPane.showMessageDialog(this, "Erro ao excluir a venda.\n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            } finally { //porfim, é enviado uma mensagem de pedido excluido e é chamado os metodos de limpar campo e carregar tabela
                JOptionPane.showMessageDialog(null, "Pedido excluído!", "Excluir", JOptionPane.INFORMATION_MESSAGE);
                limparCampos();
                carregarTabela();
            }
        }
    }//GEN-LAST:event_btnExCluirPedidoActionPerformed

    private void txtBuscaSituacCadPedidocpfKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaSituacCadPedidocpfKeyReleased
        // Chamando método de pesquisa por situação cadastral

        PedidoDAO objbusca = new PedidoDAO();
        try {
            objbusca.pesquisarPedidoSC(txtBuscaSituacCadPedidocpf, tblListaBuscarPedido);
        } catch (SQLException ex) {
            Logger.getLogger(BuscaEbookVIEW.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtBuscaSituacCadPedidocpfKeyReleased

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
            java.util.logging.Logger.getLogger(BuscaPedidoVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscaPedidoVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscaPedidoVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscaPedidoVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new BuscaPedidoVIEW().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(BuscaPedidoVIEW.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExCluirPedido;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAlterarAutor;
    private javax.swing.JLabel lblSituacaoCadBuscaPedido;
    private javax.swing.JTable tblListaBuscarPedido;
    private javax.swing.JTextField txtBuscaBuscarPedidoID;
    private javax.swing.JTextField txtBuscaSituacCadPedidocpf;
    // End of variables declaration//GEN-END:variables

    /**
     * método para jogar o valor do id na tabela para o campo de texto do id do
     * pedido
     */
    private void setarCampoPedido() {
        int setar = tblListaBuscarPedido.getSelectedRow(); // variavel setar é igual ao valor da linha selecionada
        txtBuscaBuscarPedidoID.setText(tblListaBuscarPedido.getModel().getValueAt(setar, 0).toString()); 
        //coluna zero é a primeira coluna da tabela
    }

    /**
     * @ throws SQLException Método criado para excluir o pedido
     */
    private void excluirPedido() throws SQLException {
        int id; //cria-se uma variavel int que receberá o valor do id do pedido para a pesquisa do mesmo
        id = Integer.valueOf(txtBuscaBuscarPedidoID.getText()); // o campo de texto pega esse valor e relaciona com o valor do banco de dados
        PedidoDTO obj = new PedidoDTO(); // objeto da classe dto, chamando os atributos encapsulados
        PedidoDAO dao = new PedidoDAO(); // objeto da classe dao, chamando os métodos sql
        obj.setId_pedido(id); // atribui o valor da variavel id para id_pedido da classe pedidodto
        dao.excluirPedido(obj); // a classe dao do pedido, por sua vez, pega esse valor e relaciona com o banco
    }

    /**
     *
     * @throws SQLException Método criado para poder excluir o pedido e os itens
     * juntos
     */
    private void excluirItemPedido() throws SQLException {
        int id; // variavel inteiro para relacionar com o id do pedido
        id = Integer.valueOf(txtBuscaBuscarPedidoID.getText()); // campo de texto guarda temporariamente o valor pego da tabela
        ItemPedidoDTO obj = new ItemPedidoDTO(); // objeto da classe itempedidodto
        PedidoDTO dto = new PedidoDTO(); //objeto da classe padidodto
        dto.setId_pedido(id); // objeto da classe dto, chamando os atributos encapsulados
        obj.setPedidodto(dto);
        ItemPedidoDAO dao = new ItemPedidoDAO();
        dao.excluirItemPedido(obj);// objeto da classe dao, chamando os métodos sql
    }

    /**
     * Método criado para carregar a tabela toda vez que um pedido for excluído
     */
    private void carregarTabela() {
        table = (DefaultTableModel) tblListaBuscarPedido.getModel();
        PedidoDAO dao = new PedidoDAO();
        try {
            dao.listarPedido(tblListaBuscarPedido);// chamando o metodo que lista os pedidos na tabela
        } catch (Exception e) { //tratamento de erro caso a tabela nao consiga carregar os pedidos
            JOptionPane.showMessageDialog(this, "Erro ao carregar grade.\n" + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     *
     * Método limpar campos é criado para que, toda vez que excluir um pedido,
     * limpar os campos de busca
     */
    private void limparCampos() { //resetando os campos 
        txtBuscaBuscarPedidoID.setText("");
        txtBuscaSituacCadPedidocpf.setText("");
    }

}
