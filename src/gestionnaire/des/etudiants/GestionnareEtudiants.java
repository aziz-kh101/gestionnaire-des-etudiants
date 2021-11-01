/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionnaire.des.etudiants;

import javax.swing.JOptionPane;
import javax.swing.JTree;
import javax.swing.text.Position;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;

/**
 *
 * @author aziz
 */
public class GestionnareEtudiants extends javax.swing.JFrame {

    DefaultMutableTreeNode FSM;

    /**
     * Creates new form GestionnareEtudiants1
     */
    public GestionnareEtudiants() {
        FSM = new DefaultMutableTreeNode("FSM");
        initComponents();
        jTree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
        jTree.getSelectionModel().addTreeSelectionListener((evt) -> {
            DefaultMutableTreeNode node = (DefaultMutableTreeNode) jTree.getLastSelectedPathComponent();
            if (node != null && node.getUserObject() instanceof Etudiant) {
                Etudiant e = (Etudiant) node.getUserObject();
                nom_label.setText(e.getNom());
                prnom_label.setText(e.getPrenom());
                classe_label.setText(e.getClasse().getName());
                email_label.setText(e.getEmail());
                tel_label.setText(e.getNum_portable());
                adresse_label.setText(e.getAdresse());
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpFormulaire = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        prenom = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        num_portable = new javax.swing.JTextField();
        classe = new javax.swing.JTextField();
        nom = new javax.swing.JTextField();
        adresse = new javax.swing.JTextField();
        num_fix = new javax.swing.JTextField();
        niveau = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jpArbreEtInfo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree = new javax.swing.JTree();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        nom_label = new javax.swing.JLabel();
        prnom_label = new javax.swing.JLabel();
        classe_label = new javax.swing.JLabel();
        email_label = new javax.swing.JLabel();
        tel_label = new javax.swing.JLabel();
        adresse_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestionnaire des etudiant");
        setMinimumSize(new java.awt.Dimension(755, 630));
        setPreferredSize(new java.awt.Dimension(755, 630));
        getContentPane().setLayout(new java.awt.BorderLayout(10, 10));

        jpFormulaire.setMinimumSize(new java.awt.Dimension(788, 260));
        jpFormulaire.setPreferredSize(new java.awt.Dimension(788, 260));

        jLabel1.setText("Prenom*");

        jLabel2.setText("Email*");

        jLabel3.setText("Numero portable*");

        jLabel4.setText("Classe*");

        jLabel5.setText("* champ obligatoire");

        jLabel6.setText("Nom*");

        jLabel7.setText("Adresse*");

        jLabel8.setText("Numero fix");

        jLabel9.setText("Niveau*");

        classe.setToolTipText("");

        niveau.setToolTipText("");

        jButton1.setText("annuler");

        jButton2.setText("ajouter");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpFormulaireLayout = new javax.swing.GroupLayout(jpFormulaire);
        jpFormulaire.setLayout(jpFormulaireLayout);
        jpFormulaireLayout.setHorizontalGroup(
            jpFormulaireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFormulaireLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpFormulaireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpFormulaireLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpFormulaireLayout.createSequentialGroup()
                        .addGroup(jpFormulaireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(85, 85, 85)
                        .addGroup(jpFormulaireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(classe, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(num_portable, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(prenom, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                        .addGroup(jpFormulaireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addGap(101, 101, 101)
                        .addGroup(jpFormulaireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(niveau, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(num_fix, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adresse, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))))
            .addGroup(jpFormulaireLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpFormulaireLayout.setVerticalGroup(
            jpFormulaireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFormulaireLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpFormulaireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpFormulaireLayout.createSequentialGroup()
                        .addGroup(jpFormulaireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6)
                            .addComponent(prenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jpFormulaireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jpFormulaireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8)
                            .addComponent(num_portable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jpFormulaireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9)
                            .addComponent(classe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpFormulaireLayout.createSequentialGroup()
                        .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(adresse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(num_fix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(niveau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpFormulaireLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        getContentPane().add(jpFormulaire, java.awt.BorderLayout.PAGE_START);

        jTree.setModel(new DefaultTreeModel(FSM));
        jTree.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTree.setMaximumSize(getMaximumSize());
        jScrollPane1.setViewportView(jTree);

        jButton3.setText("actualiser");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("enregistrer");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel10.setText("Nom");

        jLabel11.setText("Prenom");

        jLabel12.setText("Classe");

        jLabel13.setText("Email");

        jLabel14.setText("Telephone");

        jLabel15.setText("Adresse");

        javax.swing.GroupLayout jpArbreEtInfoLayout = new javax.swing.GroupLayout(jpArbreEtInfo);
        jpArbreEtInfo.setLayout(jpArbreEtInfoLayout);
        jpArbreEtInfoLayout.setHorizontalGroup(
            jpArbreEtInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpArbreEtInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpArbreEtInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpArbreEtInfoLayout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE))
                .addGap(66, 66, 66)
                .addGroup(jpArbreEtInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addGap(92, 92, 92)
                .addGroup(jpArbreEtInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adresse_label)
                    .addComponent(tel_label)
                    .addComponent(email_label)
                    .addComponent(classe_label)
                    .addComponent(prnom_label)
                    .addComponent(nom_label))
                .addGap(205, 205, 205))
        );
        jpArbreEtInfoLayout.setVerticalGroup(
            jpArbreEtInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpArbreEtInfoLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jpArbreEtInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                    .addGroup(jpArbreEtInfoLayout.createSequentialGroup()
                        .addGroup(jpArbreEtInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(nom_label))
                        .addGap(18, 18, 18)
                        .addGroup(jpArbreEtInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(prnom_label))
                        .addGap(18, 18, 18)
                        .addGroup(jpArbreEtInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(classe_label))
                        .addGap(18, 18, 18)
                        .addGroup(jpArbreEtInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(email_label))
                        .addGap(18, 18, 18)
                        .addGroup(jpArbreEtInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(tel_label))
                        .addGap(18, 18, 18)
                        .addGroup(jpArbreEtInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(adresse_label))))
                .addGap(18, 18, 18)
                .addGroup(jpArbreEtInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jpArbreEtInfo, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        System.out.println("Button Actualiser");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        System.out.println("Button Enregistrer");
        DefaultMutableTreeNode node = (DefaultMutableTreeNode) jTree.getLastSelectedPathComponent();
        if (node != null) {
            if (node.getUserObject() instanceof Etudiant) {
                Etudiant e = (Etudiant) node.getUserObject();
                System.out.println("Etudiant{" + "nom=" + e.getNom() + ", prenom=" + e.getPrenom() + ", email=" + e.getEmail()
                        + ", adresse=" + e.getAdresse() + ", num_portable=" + e.getNum_portable() + ", num_fix=" + e.getNum_fix() + ", niveau=" + e.getNiveau() + ", classe=" + e.getClasse().getName() + '}');
            } else {
                System.out.println("Nœud : " + node.toString());
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (verif_champs()) {
            Classe c = new Classe(classe.getText());
            addClasse(c);

            Etudiant e = new Etudiant(nom.getText(), prenom.getText(), email.getText(), adresse.getText(), num_portable.getText(), num_fix.getText(), niveau.getText(), c);
            addEtudiant(e);
        } else {
            JOptionPane jo = new JOptionPane();
            jo.showMessageDialog(this, "you need to complete les champs obligatoire", "erreur", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    boolean verif_champs() {
        return !nom.getText().isEmpty() && !prenom.getText().isEmpty() && !adresse.getText().isEmpty() && !email.getText().isEmpty() && !num_portable.getText().isEmpty()
                && !classe.getText().isEmpty() && !niveau.getText().isEmpty();
    }

    void addClasse(Classe c) {
        TreePath path = jTree.getNextMatch(c.toString(), 0, Position.Bias.Forward);
        if (path == null) {
            DefaultTreeModel model = (DefaultTreeModel) jTree.getModel();

            DefaultMutableTreeNode root = (DefaultMutableTreeNode) jTree.getModel()
                    .getRoot();
            DefaultMutableTreeNode child = new DefaultMutableTreeNode(c);
            model.insertNodeInto(child, root, root.getChildCount());
            model.reload();
            expandAllNodes(jTree, 0, jTree.getRowCount());
        }
    }

    void addEtudiant(Etudiant e) {
        DefaultTreeModel model = (DefaultTreeModel) jTree.getModel();
        DefaultMutableTreeNode root = getClasseNode(e.getClasse());
        DefaultMutableTreeNode child = new DefaultMutableTreeNode(e);
        model.insertNodeInto(child, root, root.getChildCount());
        model.reload();
        expandAllNodes(jTree, 0, jTree.getRowCount());
    }

    DefaultMutableTreeNode getClasseNode(Classe c) {
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) jTree.getModel()
                .getRoot();
        for (int i = 0; i < root.getChildCount(); i++) {
            if (c.getName().equalsIgnoreCase(root.getChildAt(i).toString())) {
                return (DefaultMutableTreeNode) root.getChildAt(i);
            }
        }
        return null;
    }

    private void expandAllNodes(JTree tree, int startingIndex, int rowCount) {
        for (int i = startingIndex; i < rowCount; ++i) {
            tree.expandRow(i);
        }

        if (tree.getRowCount() != rowCount) {
            expandAllNodes(tree, rowCount, tree.getRowCount());
        }
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

        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GestionnareEtudiants ge = new GestionnareEtudiants();
                ge.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adresse;
    private javax.swing.JLabel adresse_label;
    private javax.swing.JTextField classe;
    private javax.swing.JLabel classe_label;
    private javax.swing.JTextField email;
    private javax.swing.JLabel email_label;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree jTree;
    private javax.swing.JPanel jpArbreEtInfo;
    private javax.swing.JPanel jpFormulaire;
    private javax.swing.JTextField niveau;
    private javax.swing.JTextField nom;
    private javax.swing.JLabel nom_label;
    private javax.swing.JTextField num_fix;
    private javax.swing.JTextField num_portable;
    private javax.swing.JTextField prenom;
    private javax.swing.JLabel prnom_label;
    private javax.swing.JLabel tel_label;
    // End of variables declaration//GEN-END:variables
}
