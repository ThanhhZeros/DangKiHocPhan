/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import CustomTable.CustomTableChuyenNganh;
import DAO.ChuyenNganhDAO;
import DAO.IChuyenNganhDAO;
import DAO.IKhoaDAO;
import DAO.KhoaDAO;
import Entity.ChuyenNganh;
import Entity.Khoa;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class QuanLyChuyenNganh extends javax.swing.JPanel {

    /**
     * Creates new form QuanLyChuyenNganh
     */
    private String macn,tencn,khoa;
    ArrayList<ChuyenNganh> li=new ArrayList<ChuyenNganh>();
    public QuanLyChuyenNganh() {
        initComponents();
         LoadData();
    }
 public void LoadTable(){
        jTableChuyenNganh.setModel(new CustomTableChuyenNganh(li));
    }
    public void LoadData(){
        try{
           IChuyenNganhDAO chuyenNganhDAO=(IChuyenNganhDAO) Class.forName("DAO.ChuyenNganhDAO").newInstance();
              li = new ChuyenNganhDAO().getAll();
              LoadTable();
        } catch (InstantiationException ex) {
            Logger.getLogger(QuanLyChuyenNganh.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(QuanLyChuyenNganh.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(QuanLyChuyenNganh.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void LamMoi(){
        txtMaCN.setText("");
        txtTenCN.setText("");
        txtMaKhoa.setText("");
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
        jPanel4 = new javax.swing.JPanel();
        Them = new javax.swing.JButton();
        Xoa = new javax.swing.JButton();
        Lammoi = new javax.swing.JButton();
        Sua = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableChuyenNganh = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMaCN = new javax.swing.JTextField();
        txtTenCN = new javax.swing.JTextField();
        txtMaKhoa = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Quản Lý Chuyên Ngành");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );

        Them.setBackground(new java.awt.Color(0, 153, 255));
        Them.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Them.setText("Thêm");
        Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThemActionPerformed(evt);
            }
        });

        Xoa.setBackground(new java.awt.Color(0, 153, 255));
        Xoa.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Xoa.setText("Xóa");
        Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XoaActionPerformed(evt);
            }
        });

        Lammoi.setBackground(new java.awt.Color(0, 153, 255));
        Lammoi.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Lammoi.setText("Làm Mới");
        Lammoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LammoiActionPerformed(evt);
            }
        });

        Sua.setBackground(new java.awt.Color(0, 153, 255));
        Sua.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Sua.setText("Sửa");
        Sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SuaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Them, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(Sua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Lammoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Xoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Xoa)
                    .addComponent(Them))
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Sua)
                    .addComponent(Lammoi))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jTableChuyenNganh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTableChuyenNganh.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableChuyenNganh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableChuyenNganhMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableChuyenNganh);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 35, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Mã Chuyên Ngành:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("Tên Chuyên Ngành:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("Mã Khoa:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTenCN, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaCN, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMaCN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtTenCN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addComponent(jLabel4))
                    .addComponent(txtMaKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThemActionPerformed
       // TODO add your handling code here:
        String ma=txtMaKhoa.getText();
        Khoa kh=new Khoa(ma);
        try{
            if(txtMaCN.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Mã chuyên ngành không được để trống"); 
            }
            else if(txtMaKhoa.getText().equals("")||txtTenCN.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Điền đầy đủ thông tin của chuyên ngành trước khi thêm");
            }
            else{
                macn=txtMaCN.getText();
                tencn=txtTenCN.getText();
                khoa=txtMaKhoa.getText();
                ChuyenNganh ch=new ChuyenNganh(macn);
                if(li.contains(ch)){
                    JOptionPane.showMessageDialog(null, "Chuyên ngành này đã có trong danh sách");
                }
                else{
                    ChuyenNganh cn=new ChuyenNganh(macn,tencn,khoa);
                    ChuyenNganh add= new ChuyenNganhDAO().addNew(cn);
                    LoadData();
                      JOptionPane.showMessageDialog(null, "Thêm thành công");
                }
            
            LamMoi();
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Điền đầy đủ thông tin của chuyên ngành trước khi thêm");
        }
    }//GEN-LAST:event_ThemActionPerformed

    private void XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XoaActionPerformed
         // TODO add your handling code here:
        if(jTableChuyenNganh.getRowCount()==0){
             JOptionPane.showMessageDialog(null, "Danh sách rỗng");
        }
        else{
            String ma=txtMaCN.getText();
           ChuyenNganh cn=new ChuyenNganh(ma);
            if(li.contains(cn)){
                int chose=JOptionPane.showConfirmDialog(null, "Bạn chắc chắn muốn xóa chuyên ngành này?","Thông báo",
                        JOptionPane.YES_NO_OPTION);
                if(chose==JOptionPane.YES_OPTION){
                    li.remove(li.indexOf(cn));
                    try {
                        new ChuyenNganhDAO().deleteChuyenNganh(ma);
                        JOptionPane.showMessageDialog(this, "Xóa thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    }catch (SQLException ex) {
                            JOptionPane.showMessageDialog(this, "Dữ liệu chưa thể xóa, chuyên ngành còn lớp học, hãy xóa dữ liệu lớp trước", "Thông báo", JOptionPane.ERROR_MESSAGE);
                             
                    } catch (ClassNotFoundException ex) {
                            JOptionPane.showMessageDialog(this, "Dữ liệu chưa thể xóa, chuyên ngành còn lớp học, hãy xóa dữ liệu lớp trước", "Thông báo", JOptionPane.ERROR_MESSAGE);
                     }
                    while (li.size() > 0) {
                    li.remove(0);
            }
                    LoadTable();
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Chuyên ngành có mã "+ma+" không có trong danh sách");
            }
        }
    }//GEN-LAST:event_XoaActionPerformed

    private void LammoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LammoiActionPerformed
        // TODO add your handling code here:
        LamMoi();
    }//GEN-LAST:event_LammoiActionPerformed

    private void SuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SuaActionPerformed
         
        macn=txtMaCN.getText();
        tencn=txtTenCN.getText();
        khoa=txtMaKhoa.getText();
        if(txtMaCN.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Mã chuyên ngành không được để trống"); 
        }
        else if(txtMaKhoa.getText().equals("")||txtTenCN.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Điền đầy đủ thông tin của chuyên ngành trước khi sửa");
        }
        else{
            ChuyenNganh cnm=new ChuyenNganh(macn,tencn,khoa);
            ChuyenNganh cn=new ChuyenNganh(macn);

                if(li.contains(cn)){
                        li.set(li.indexOf(cn), cnm);
                        ChuyenNganh update=new ChuyenNganhDAO().updateByMa(cnm);
                        LoadData();
                        JOptionPane.showMessageDialog(null,"Sửa thành công");
                }
                else
                    JOptionPane.showMessageDialog(null,"Không cập nhật được thông tin cho chuyên ngành có mã "+macn);
            LamMoi();
        }

    }//GEN-LAST:event_SuaActionPerformed

    private void jTableChuyenNganhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableChuyenNganhMouseClicked
        // TODO add your handling code here:
        int selectedRow=jTableChuyenNganh.getSelectedRow();
        ChuyenNganh cn=li.get(selectedRow);
        txtMaCN.setText(cn.getMaChuyenNganh()+"");
        txtTenCN.setText(cn.getTenChuyenNganh()+"");
        txtMaKhoa.setText(cn.getMaKhoa()+"");
    }//GEN-LAST:event_jTableChuyenNganhMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Lammoi;
    private javax.swing.JButton Sua;
    private javax.swing.JButton Them;
    private javax.swing.JButton Xoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableChuyenNganh;
    private javax.swing.JTextField txtMaCN;
    private javax.swing.JTextField txtMaKhoa;
    private javax.swing.JTextField txtTenCN;
    // End of variables declaration//GEN-END:variables
}
