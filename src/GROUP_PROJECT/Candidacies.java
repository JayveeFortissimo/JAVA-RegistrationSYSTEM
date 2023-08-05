/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GROUP_PROJECT;

import static java.lang.System.exit;
import javax.swing.JOptionPane;
import com.mysql.cj.xdevapi.Statement;
import static java.lang.System.exit;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author JK
 */
public class Candidacies extends javax.swing.JFrame {

    /**
     * Creates new form Candidacies
     */
    public Candidacies() {
        initComponents();
         Select1();
    }

  
    private void Select1(){
            DefaultTableModel tbl = (DefaultTableModel) Table2.getModel();
        try{
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/connector?useSSL=false","root","jayvee0123");
          String query = "select * from candidate";
        java.sql.Statement st = con.createStatement();
            ResultSet Rs = st.executeQuery(query);
       Table2.setModel(DbUtils.resultSetToTableModel(Rs));
        
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Name1 = new javax.swing.JTextField();
        birth1 = new javax.swing.JTextField();
        Gender1 = new javax.swing.JComboBox<>();
        Contact1 = new javax.swing.JTextField();
        Poliyical1 = new javax.swing.JTextField();
        Position1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table2 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        age1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        Civil = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        House1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        Muni = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        Province = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        Candite = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GROUP_PROJECT/2.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 110, 100));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Gender");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Contact information");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Current Address:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Full Name");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Date of birth");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Position running for");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 650, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Political party affiliation");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, -1, -1));

        Name1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(Name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 142, 200, 30));

        birth1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(birth1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 220, 30));

        Gender1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select", "Male", "Female" }));
        Gender1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Gender1ActionPerformed(evt);
            }
        });
        jPanel1.add(Gender1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 100, 30));

        Contact1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(Contact1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 200, 30));

        Poliyical1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(Poliyical1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 590, 210, 30));

        Position1.setBackground(new java.awt.Color(255, 255, 255));
        Position1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Position1ActionPerformed(evt);
            }
        });
        jPanel1.add(Position1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 650, 240, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("X");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1430, 0, -1, -1));

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Republic of the Philippines");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 204, 255));
        jLabel11.setText("Commission of Election");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FullName", "Birthday", "Gender", "Contact", "Province", "Municipality", "HouseNo", "Age", "CivilStatus", "PoliticalParty", "position", "CanditeNo"
            }
        ));
        Table2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table2);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 840, -1));

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("Remove");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 550, -1, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Information");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 550, 90, 30));

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("CLEAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, -1, 30));

        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("UPDATE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 550, 100, 30));

        jButton5.setBackground(new java.awt.Color(204, 204, 204));
        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 0, 0));
        jButton5.setText("BACK");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 550, 100, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, 860, 600));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Age");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, -1, -1));

        age1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(age1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 510, 170, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Civil Status");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, -1, -1));

        Civil.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(Civil, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 550, 190, 30));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("HouseNo");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, -1, -1));

        House1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.add(House1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 190, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Municipality");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        Muni.setBackground(new java.awt.Color(255, 255, 255));
        Muni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MuniActionPerformed(evt);
            }
        });
        jPanel3.add(Muni, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 170, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Province");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        Province.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.add(Province, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 18, 160, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 440, 110));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("CanditeNo");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 700, -1, -1));

        Candite.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(Candite, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 700, 240, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1450, 786));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Gender1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Gender1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Gender1ActionPerformed

    private void Position1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Position1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Position1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Name1.setText("");
          birth1.setText("");
            Contact1.setText("");
              Province.setText("");
                Poliyical1.setText("");
                  Position1.setText("");
         Civil.setText("");
          age1.setText("");
         Candite.setText("");
           Muni.setText("");
            House1.setText("");
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
            int result = JOptionPane.showOptionDialog(null, "Do you want to Exit?", "Confirmation",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);

       if(result == JOptionPane.YES_OPTION){
           exit(0);
       }else if(result == JOptionPane.NO_OPTION){
          JOptionPane.showMessageDialog(null, "Proceed Again Ms and Mr", "Read-Only Dialog", JOptionPane.INFORMATION_MESSAGE);
       }
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
           
        if(Name1.getText().equals("")||birth1.getText().equals("")||Contact1.getText().equals("")||Poliyical1.getText().equals("")||Position1.getText().equals("")||age1.getText().equals("")||Civil.getText().equals("")||House1.getText().equals("")||Muni.getText().equals("")||Province.getText().equals("")||Candite.getText().equals("")){
             JOptionPane.showMessageDialog(null, "Please Fill Up The Form", "Warning", JOptionPane.INFORMATION_MESSAGE);
        } else if (Integer.parseInt(age1.getText()) < 18) {
 
      JOptionPane.showMessageDialog(null, "Minor not Allowed", "Warning", JOptionPane.INFORMATION_MESSAGE);
}else{
            
            try {
                Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/connector?useSSL=false","root","jayvee0123");
           PreparedStatement Add = con1.prepareStatement("insert into candidate values(?,?,?,?,?,?,?,?,?,?,?,?)");
            
           Add.setString(1,Name1.getText());
             Add.setString(2,birth1.getText());
               Add.setString(3,Gender1.getSelectedItem().toString());
             Add.setString(4,Contact1.getText());
             Add.setString(5,Province.getText());
             Add.setString(6,Muni.getText());
             Add.setString(7,House1.getText());
             Add.setString(8,age1.getText());
             Add.setString(9,Civil.getText());
            Add.setString(10,Poliyical1.getText());
                Add.setString(11,Position1.getText());
            Add.setString(12,Candite.getText());

               int row = Add.executeUpdate();
               JOptionPane.showMessageDialog(this,"Success upload");
               con1.close();
            Select1();
            
             Name1.setText("");
          birth1.setText("");
            Contact1.setText("");
              Province.setText("");
                Poliyical1.setText("");
                  Position1.setText("");
         Civil.setText("");
          age1.setText("");
         Candite.setText("");
           Muni.setText("");
            House1.setText("");
            
            
            } catch (Exception e) {
               e.printStackTrace();
            }
        
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void MuniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MuniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MuniActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.hide();
        new Menu().show();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      if(Name1.getText().isEmpty()){
           JOptionPane.showMessageDialog(this,"Table is empty and please select first");
        
    }else{
            try{
           
               Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/connector?useSSL=false","root","jayvee0123");
            String indi = Name1.getText();
            String Query = "delete from candidate where Full = '"+indi+"'";
                java.sql.Statement Add  = con1.createStatement();
           Add.executeUpdate(Query);
            Select1();
            JOptionPane.showMessageDialog(this,"Success DELETE");
            
            }catch(Exception e){
                e.printStackTrace();
            }
      }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void Table2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table2MouseClicked
        // TODO add your handling code here:
          DefaultTableModel tbl = (DefaultTableModel) Table2.getModel();
        int MyIndex = Table2.getSelectedRow();
        Name1.setText(tbl.getValueAt(MyIndex,0).toString());
           birth1.setText(tbl.getValueAt(MyIndex,1).toString());
            Gender1.setSelectedItem(tbl.getValueAt(MyIndex,2).toString());
            Contact1.setText(tbl.getValueAt(MyIndex,3).toString());
            Province.setText(tbl.getValueAt(MyIndex,4).toString());
            Muni.setText(tbl.getValueAt(MyIndex,5).toString());
           House1.setText(tbl.getValueAt(MyIndex,6).toString());
              age1.setText(tbl.getValueAt(MyIndex,7).toString());
             Civil.setText(tbl.getValueAt(MyIndex,8).toString());
             Poliyical1.setText(tbl.getValueAt(MyIndex,9).toString());
              Position1.setText(tbl.getValueAt(MyIndex,10).toString());
           Candite.setText(tbl.getValueAt(MyIndex,11).toString());
             
    }//GEN-LAST:event_Table2MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       
        try{
           
               Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/connector?useSSL=false","root","jayvee0123");
  
                 
                                        
            String upQuery = "UPDATE candidate SET Full='"+Name1.getText()+"'"+",DateB='"+birth1.getText()+"'"+",Gen='"+Gender1.getSelectedItem().toString()+"'"+",Con='"+Contact1.getText()+"'"+",Pro='"+Province.getText()+"'"+",Mune='"+Muni.getText()+"'"+",house='"+House1.getText()+"'"+",Age='"+age1.getText()+"'"+",Civil='"+Civil.getText()+"'"+",PoliticalAF='"+Poliyical1.getText()+"'"+",Positions='"+Position1.getText()+"'"+"WHERE CanNo="+Candite.getText();
                java.sql.Statement Add  = con1.createStatement();
           Add.executeUpdate(upQuery);
            Select1();
            JOptionPane.showMessageDialog(this,"Success UPDATE");
            
            }catch(Exception e){
                e.printStackTrace();
            }
        
        
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Candidacies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Candidacies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Candidacies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Candidacies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Candidacies().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Candite;
    private javax.swing.JTextField Civil;
    private javax.swing.JTextField Contact1;
    private javax.swing.JComboBox<String> Gender1;
    private javax.swing.JTextField House1;
    private javax.swing.JTextField Muni;
    private javax.swing.JTextField Name1;
    private javax.swing.JTextField Poliyical1;
    private javax.swing.JTextField Position1;
    private javax.swing.JTextField Province;
    private javax.swing.JTable Table2;
    private javax.swing.JTextField age1;
    private javax.swing.JTextField birth1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
