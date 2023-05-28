
package Pantallas;

import Entidades.Celular;
import Entidades.Navegador;
import Entidades.SmartTV;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;

public class ListaDeNavegadores extends javax.swing.JFrame {
    
    List<Celular> celulares = new ArrayList<>();
    List<SmartTV> televisores = new ArrayList<>();
    List<Navegador> navegadores = new ArrayList<>();
    DefaultListModel modeloLista = new DefaultListModel();
    
    public ListaDeNavegadores() {
        initComponents();
        lstNavegadores.setModel(modeloLista);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtBuscar = new javax.swing.JTextField();
        btnSmart = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstNavegadores = new javax.swing.JList<>();
        jButton2 = new javax.swing.JButton();
        btnCelular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 380, 40));

        btnSmart.setText("Agregar SmarTV");
        btnSmart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSmartActionPerformed(evt);
            }
        });
        jPanel1.add(btnSmart, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 170, 40));

        lstNavegadores.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstNavegadores);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 510, 210));

        jButton2.setText("BUSCAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 100, 40));

        btnCelular.setText("Agregar Celular");
        btnCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCelularActionPerformed(evt);
            }
        });
        jPanel1.add(btnCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, 180, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCelularActionPerformed
        EditarCelular editar = new EditarCelular(this);
        editar.setLocationRelativeTo(null);
        editar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCelularActionPerformed

    private void btnSmartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSmartActionPerformed
        EditarSmarTV editar = new EditarSmarTV(this);
        editar.setLocationRelativeTo(null);
        editar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnSmartActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        buscar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void buscar() {
        modeloLista.removeAllElements();
        for(Navegador nav: navegadores){
            if(nav.getNombre().toLowerCase()
                    .contains(txtBuscar.getText())){
                modeloLista.addElement(nav.getNombre().toLowerCase());
            }
        }
    }

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        buscar();
    }//GEN-LAST:event_txtBuscarKeyReleased

    void actualizarLista(){
        modeloLista.removeAllElements();
        for(Navegador nav: navegadores){
            modeloLista.addElement(nav.getNombre());
        }
    }
    
    void setCelular(Celular celular){
        celulares.add(celular);
        navegadores.add(celular);
        actualizarLista();
    }
    
    void setSmartTV(SmartTV televisor){
        televisores.add(televisor);
        navegadores.add(televisor);
        actualizarLista();
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
            java.util.logging.Logger.getLogger(ListaDeNavegadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaDeNavegadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaDeNavegadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaDeNavegadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaDeNavegadores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCelular;
    private javax.swing.JButton btnSmart;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lstNavegadores;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables

}
