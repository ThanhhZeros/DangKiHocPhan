/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import CustomTable.CustomTableLopHoc;
import DAO.ILopHocDAO;
import DAO.LopHocDAO;
import Entity.LopHoc;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class QuanLyLopHoc extends javax.swing.JPanel {

    /**
     * Creates new form QuanLyLopHoc
     */
    private String malop,tenlop,macn,khoahoc;
    private int siso,selectedRow=-1;
    ArrayList<LopHoc> li=new ArrayList<>();
    public QuanLyLopHoc() {
        initComponents();
        LoadData();
    }
public void LoadTable(){
        jTableLop.setModel(new CustomTableLopHoc(li));
    }
    public void LoadData(){
        try{
           //   ILopHocDAO lopHocDAO = (ILopHocDAO) Class.forName("DAO.LopHocDAO").newInstance();
           ILopHocDAO lopHocDAO=(ILopHocDAO) Class.forName("DAO.LopHocDAO").newInstance();
              li = new LopHocDAO().getAll();
//            for (HocPhan hp : list) {
//                dtm.addRow(toObjectsData(hp));
//            }
              LoadTable();
        
   

         } catch (InstantiationException ex) {
            Logger.getLogger(QuanLyLopHoc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(QuanLyLopHoc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(QuanLyLopHoc.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void LamMoi(){
        txtMaLop.setText("");
        txtTenLop.setText("");
        txtSiSo.setText("");
        jComboBoxChuyenNganh.setSelectedItem("CNTT");
        txtKhoaHoc.setText("");
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableLop = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtKhoaHoc = new javax.swing.JTextField();
        txtTenLop = new javax.swing.JTextField();
        txtSiSo = new javax.swing.JTextField();
        txtMaLop = new javax.swing.JTextField();
        jComboBoxChuyenNganh = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        Them = new javax.swing.JButton();
        Sua = new javax.swing.JButton();
        LamMoi = new javax.swing.JButton();
        Xoa = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("QUẢN LÝ LỚP HỌC");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(421, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(421, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        jTableLop.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTableLop.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableLop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableLopMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableLop);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Tên lớp:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("Mã lớp:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("Sĩ số:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("Khóa học:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText("Mã chuyên ngành:");

        jComboBoxChuyenNganh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CNTT", "HTTT", "KHMT", "DULICH", "QTKD", "KHACHSAN", "OTO", "HOA", "KETOAN" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSiSo, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaLop, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTenLop, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtKhoaHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxChuyenNganh, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMaLop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtKhoaHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTenLop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBoxChuyenNganh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSiSo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        Them.setBackground(new java.awt.Color(0, 153, 255));
        Them.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Them.setText("Thêm");
        Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThemActionPerformed(evt);
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

        LamMoi.setBackground(new java.awt.Color(0, 153, 255));
        LamMoi.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        LamMoi.setText("Làm mới");
        LamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LamMoiActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LamMoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Xoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Sua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Them, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Them)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(Sua)
                .addGap(18, 18, 18)
                .addComponent(Xoa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LamMoi)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTableLopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableLopMouseClicked
        // TODO add your handling code here:
        selectedRow=jTableLop.getSelectedRow();
        LopHoc lh=li.get(selectedRow);
        txtMaLop.setText(lh.getMaLop()+"");
        txtTenLop.setText(lh.getTenLop()+"");
        txtSiSo.setText(lh.getSiSo()+"");
        jComboBoxChuyenNganh.setSelectedItem(lh.getMaChuyenNganh());
        txtKhoaHoc.setText(lh.getKhoaHoc()+"");
    }//GEN-LAST:event_jTableLopMouseClicked

    private void ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThemActionPerformed
        // TODO add your handling code here:
         try{
            if(txtMaLop.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Mã lớp không được để trống"); 
            }
            else if(txtTenLop.getText().equals("")||txtSiSo.getText().equals("")||txtKhoaHoc.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Điền đầy đủ thông tin của lớp trước khi thêm");
            }
            else{
                malop=txtMaLop.getText();
                tenlop=txtTenLop.getText();
                siso=(int) Float.parseFloat(txtSiSo.getText());
                khoahoc=txtKhoaHoc.getText();
                macn=(String) jComboBoxChuyenNganh.getSelectedItem();
                LopHoc check=new LopHoc(malop);
                if(li.contains(check)){
                    JOptionPane.showMessageDialog(null, "Mã lớp học bị trùng, không thể thêm");
                }
                else{
                    LopHoc lh=new LopHoc(malop,tenlop,siso,khoahoc,macn);
                    LopHoc add= new LopHocDAO().addNew(lh);
                    LamMoi();
                    LoadData();
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Điền đầy đủ thông tin của lớp trước khi thêm");
        }
    }//GEN-LAST:event_ThemActionPerformed

    private void SuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SuaActionPerformed
        // TODO add your handling code here:
         try{
            if(txtMaLop.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Mã lớp không được để trống"); 
            }
            else if(txtTenLop.getText().equals("")||txtSiSo.getText().equals("")||txtKhoaHoc.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Điền đầy đủ thông tin của lớp trước khi sửa");
                    }
            else{
                String ma=txtMaLop.getText();
                selectedRow=jTableLop.getSelectedRow();
                malop=txtMaLop.getText();
                tenlop=txtTenLop.getText();
                siso=(int) Float.parseFloat(txtSiSo.getText());
                khoahoc=txtKhoaHoc.getText();
                macn=(String) jComboBoxChuyenNganh.getSelectedItem();
                LopHoc lhm=new LopHoc(malop,tenlop,siso,khoahoc,macn);
                    LopHoc lh=new LopHoc(ma);
                    if(li.contains(lh)){
                        li.set(li.indexOf(lh), lhm);
                        LopHoc update=new LopHocDAO().updateByMa(lhm);
                        LoadData();
                        JOptionPane.showMessageDialog(null,"Sửa thành công");
                        LamMoi();
                    }
                    else
                    JOptionPane.showMessageDialog(null,"Không cập nhật được thông tin cho lớp học có mã "+ma);
            }
         }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Điền đầy đủ thông tin của lớp trước khi sửa");
        }
        
    }//GEN-LAST:event_SuaActionPerformed

    private void LamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LamMoiActionPerformed
        // TODO add your handling code here:
        LamMoi();
    }//GEN-LAST:event_LamMoiActionPerformed

    private void XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XoaActionPerformed
        // TODO add your handling code here:
        if(jTableLop.getRowCount()==0){
            JOptionPane.showMessageDialog(null, "Danh sách rỗng");
        }
        else{
            String ma=txtMaLop.getText();
            LopHoc lh=new LopHoc(ma);
            if(li.contains(lh)){
                int chose=JOptionPane.showConfirmDialog(null, "Những thông tin về sinh viên của lớp học này cũng sẽ bị xóa. Bạn chắc chắn muốn xóa lớp này?","Thông báo",
                    JOptionPane.YES_NO_OPTION);
                if(chose==JOptionPane.YES_OPTION){
                    li.remove(li.indexOf(lh));
                    try {
                        String malop = txtMaLop.getText();
                        new LopHocDAO().deleteLopHoc(malop);
                        JOptionPane.showMessageDialog(this, "Xóa thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                    }catch (SQLException ex) {
                        JOptionPane.showMessageDialog(this, "Dữ liệu chưa thể xóa, lớp học còn sinh viên, hãy xóa dữ liệu sinh viên trước", "Thông báo", JOptionPane.ERROR_MESSAGE);
                    } catch (ClassNotFoundException ex) {
                        JOptionPane.showMessageDialog(this, "Dữ liệu chưa thể xóa, lớp học còn sinh viên, hãy xóa dữ liệu sinh viên trước", "Thông báo", JOptionPane.ERROR_MESSAGE);
                    }
                    LoadTable();
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Lớp học có mã "+ma+" không có trong danh sách");
            }
        }
    }//GEN-LAST:event_XoaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LamMoi;
    private javax.swing.JButton Sua;
    private javax.swing.JButton Them;
    private javax.swing.JButton Xoa;
    private javax.swing.JComboBox<String> jComboBoxChuyenNganh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableLop;
    private javax.swing.JTextField txtKhoaHoc;
    private javax.swing.JTextField txtMaLop;
    private javax.swing.JTextField txtSiSo;
    private javax.swing.JTextField txtTenLop;
    // End of variables declaration//GEN-END:variables
}
