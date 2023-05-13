package view;

import controller.RMIMedicineManageControl;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Use;

public class UseForm extends javax.swing.JPanel {
    
    RMIMedicineManageControl rmiServer = new RMIMedicineManageControl();

    public UseForm() {
        initComponents();
        initData();
    }
    
    private void initData(){ 
        try {
            List<Use> resultListUse = new ArrayList<Use>();
            DefaultTableModel model = new DefaultTableModel();
            model.setColumnIdentifiers(new String [] {
              "id", "name", "description"
            });
            resultListUse = rmiServer.SearchUses("");
            for(int i = 0 ; i < resultListUse.size(); i++) {
                model.addRow(resultListUse.get(i).toRows());
            }
              jTable1.setModel(model);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        SearchUseTextField = new javax.swing.JTextField();
        SearchUseBtn = new javax.swing.JButton();
        UseNameLabel = new javax.swing.JLabel();
        UseNameTextField = new javax.swing.JTextField();
        UseDescriptionLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        UseDescriptionTextarea = new javax.swing.JTextArea();
        AddUseBtn = new javax.swing.JButton();
        EditUseBtn = new javax.swing.JButton();
        DeleteUseBtn = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã", "Tên", "Mô tả"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        SearchUseTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchUseTextFieldActionPerformed(evt);
            }
        });

        SearchUseBtn.setText("Tìm kiếm");
        SearchUseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchUseBtnActionPerformed(evt);
            }
        });

        UseNameLabel.setText("Tên");

        UseNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UseNameTextFieldActionPerformed(evt);
            }
        });

        UseDescriptionLabel.setText("Mô tả");

        UseDescriptionTextarea.setColumns(20);
        UseDescriptionTextarea.setRows(5);
        jScrollPane2.setViewportView(UseDescriptionTextarea);

        AddUseBtn.setText("Thêm công dụng");
        AddUseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddUseBtnActionPerformed(evt);
            }
        });

        EditUseBtn.setText("Sửa công dụng");
        EditUseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditUseBtnActionPerformed(evt);
            }
        });

        DeleteUseBtn.setText("Xóa công dụng");
        DeleteUseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteUseBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(SearchUseTextField)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UseNameTextField)
                    .addComponent(jScrollPane2)
                    .addComponent(SearchUseBtn)
                    .addComponent(UseNameLabel)
                    .addComponent(UseDescriptionLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AddUseBtn)
                        .addGap(10, 10, 10)
                        .addComponent(EditUseBtn)
                        .addGap(18, 18, 18)
                        .addComponent(DeleteUseBtn)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(SearchUseBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(SearchUseTextField))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(UseNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UseNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UseDescriptionLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddUseBtn)
                            .addComponent(EditUseBtn)
                            .addComponent(DeleteUseBtn))))
                .addGap(56, 56, 56))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SearchUseTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchUseTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchUseTextFieldActionPerformed

    private void SearchUseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchUseBtnActionPerformed
        try {
                List<Use> resultListUse = new ArrayList<Use>();
                DefaultTableModel model = new DefaultTableModel();
                model.setColumnIdentifiers(new String [] {
                "id", "name", "description"
            });
                String keyword = SearchUseTextField.getText();
                resultListUse = rmiServer.SearchUses(keyword);
                for(int i = 0 ; i < resultListUse.size(); i++) {
                    System.out.println(resultListUse.get(i));
                    model.addRow(resultListUse.get(i).toRows());
                }
                jTable1.setModel(model);
            } catch (Exception ex) {
                ex.printStackTrace();
        }
    }//GEN-LAST:event_SearchUseBtnActionPerformed

    private void UseNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UseNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UseNameTextFieldActionPerformed

    private void DeleteUseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteUseBtnActionPerformed
      try {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            int currentId = Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
            boolean isDeleted = rmiServer.deleteUse(currentId);
            if (isDeleted) {
                model.removeRow(jTable1.getSelectedRow());
                jTable1.setModel(model);
            }
        } catch (Exception ex) {
           ex.printStackTrace();
        }
    }//GEN-LAST:event_DeleteUseBtnActionPerformed

    private void AddUseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddUseBtnActionPerformed
       try {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            Use use = new Use();
            String useName = UseNameTextField.getText();
            String useDescription = UseDescriptionTextarea.getText();
            use = rmiServer.addUse(useName, useDescription);
            model.addRow(use.toRows());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_AddUseBtnActionPerformed

    private void EditUseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditUseBtnActionPerformed
        try {
            int currentId = Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
            Use use = new Use();
            String useName = UseNameTextField.getText();
            String useDescription = UseDescriptionTextarea.getText();
            use = rmiServer.updateUse(currentId, useName, useDescription);
            jTable1.setValueAt(useName, jTable1.getSelectedRow(), 1);
            jTable1.setValueAt(useDescription, jTable1.getSelectedRow(), 2);
        } catch (Exception ex) {
           ex.printStackTrace();
        }
    }//GEN-LAST:event_EditUseBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddUseBtn;
    private javax.swing.JButton DeleteUseBtn;
    private javax.swing.JButton EditUseBtn;
    private javax.swing.JButton SearchUseBtn;
    private javax.swing.JTextField SearchUseTextField;
    private javax.swing.JLabel UseDescriptionLabel;
    private javax.swing.JTextArea UseDescriptionTextarea;
    private javax.swing.JLabel UseNameLabel;
    private javax.swing.JTextField UseNameTextField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
