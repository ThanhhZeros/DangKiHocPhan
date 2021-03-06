/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import DAO.DangKyDAO;
import DAO.HocPhanDAO;
import DAO.IHocPhanDAO;
import DAO.LopHocPhanDAO;
import Entity.DangKy;
import Entity.HocPhan;
import Entity.LopHocPhan;
import Entity.MonHoc;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class LichHoc extends javax.swing.JFrame {

    /**
     * Creates new form LichHoc
     */
    String MaLHP="",MaSV=Login.nameLogin;
    private DefaultTableModel dtm;
    private ArrayList<LopHocPhan> listLHP_DaDangKy=null;
    private ArrayList<DangKy> ListDKH=null;
    public LichHoc() {
        initComponents();
        setLocationRelativeTo(null);
        dtm = new DefaultTableModel();
        dtm.addColumn("Mã Lớp Học Phần");
        dtm.addColumn("Mã Học Phần");
        dtm.addColumn("Tên Môn Học");
        dtm.addColumn("Tiết Học");
        dtm.addColumn("Thứ");
        dtm.addColumn("Ngày Bắt Đầu");          
        dtm.addColumn("Địa Điểm");     
        loaddata();
    }
    
     private void loaddata() {
        try {
            ListDKH =new DangKyDAO().getAll_LHP_ByMaSV(Login.nameLogin);/*Load danh sách lớp học phần giáo viên đã đăng ký theo mã GV*/
            ArrayList<LopHocPhan> LHP = new ArrayList<LopHocPhan>(); 
            for(int i=0;i<ListDKH.size();i++){
            listLHP_DaDangKy = new LopHocPhanDAO().findByMaLHP(ListDKH.get(i).getMaLHP());
            LHP.add(listLHP_DaDangKy.get(0));
            }
            for (LopHocPhan lhp : LHP) {
                dtm.addRow(toObjectsData(lhp));
                }  
           jTableLichHoc.setModel(dtm); 
        } catch (InstantiationException ex) {
            Logger.getLogger(QuanLyLopHocPhan.class.getName()).log(Level.SEVERE, null, ex);
           
        } catch (IllegalAccessException ex) {
             Logger.getLogger(QuanLyLopHocPhan.class.getName()).log(Level.SEVERE, null, ex);
           
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(QuanLyLopHocPhan.class.getName()).log(Level.SEVERE, null, ex);
          
        }
    }
    public static Object[] toObjectsData(LopHocPhan lhp) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        HocPhan hp =new HocPhan();
        IHocPhanDAO hocPhanDAO = (IHocPhanDAO) Class.forName("DAO.HocPhanDAO").newInstance();
        ArrayList<HocPhan> listHP = new HocPhanDAO().findByMaHP(lhp.getMaHP());
         Object[] objectsData = {lhp.getMaLHP(), lhp.getMaHP(),listHP.get(0).getTenHP(),lhp.getTietHoc(), lhp.getThu(),lhp.getNgayBatDau(),lhp.getDiaDiem()};
        return objectsData;
    }
    private void huydangky(){
      if(MaLHP.equals("")){
            JOptionPane.showMessageDialog(null, "Chọn học phần muốn hủy đăng ký");
        }
      else{
              int b = JOptionPane.showConfirmDialog(null, "Bạn chắc chắn muốn hủy đăng ký lớp học phần này ?", "Thông Báo", JOptionPane.YES_NO_OPTION);
              if (b == JOptionPane.YES_OPTION) {
                  try {
                     new DangKyDAO().huydangkyhoc(MaLHP,MaSV);
                     dtm.removeRow(jTableLichHoc.getSelectedRow());
                     JOptionPane.showMessageDialog(this, "Hủy đăng ký thành công !", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                  }catch (SQLException ex) {}    
              }
            }    
        
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
        jTableLichHoc = new javax.swing.JTable();
        btnDong = new javax.swing.JButton();
        txtHuy = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("LỊCH HỌC");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(629, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(621, 621, 621))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTableLichHoc.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableLichHoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableLichHocMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableLichHoc);

        btnDong.setBackground(new java.awt.Color(0, 153, 255));
        btnDong.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDong.setText("Đóng");
        btnDong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDongActionPerformed(evt);
            }
        });

        txtHuy.setBackground(new java.awt.Color(0, 153, 255));
        txtHuy.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtHuy.setText("Hủy đăng ký");
        txtHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHuyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDong, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(txtHuy)
                .addGap(76, 76, 76))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDong, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDongActionPerformed
        // TODO add your handling code here:
         dispose();
    }//GEN-LAST:event_btnDongActionPerformed

    private void txtHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHuyActionPerformed
        // TODO add your handling code here:
        huydangky();
    }//GEN-LAST:event_txtHuyActionPerformed

    private void jTableLichHocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableLichHocMouseClicked
        // TODO add your handling code here:
         int r=jTableLichHoc.getSelectedRow();
        MaLHP=(String) jTableLichHoc.getValueAt(r, 0);
    }//GEN-LAST:event_jTableLichHocMouseClicked

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
            java.util.logging.Logger.getLogger(LichHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LichHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LichHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LichHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LichHoc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableLichHoc;
    private javax.swing.JButton txtHuy;
    // End of variables declaration//GEN-END:variables
}
