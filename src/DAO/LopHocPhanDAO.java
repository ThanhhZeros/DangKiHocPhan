/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import ConnectDatabase.DBConnect;
import Entity.LopHocPhan;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class LopHocPhanDAO implements ILopHocPhanDAO{
     @Override
    public ArrayList<LopHocPhan> getAll() {
        ArrayList<LopHocPhan> list = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.cnn.prepareStatement("select *from LopHocPhan");
                rs = ps.executeQuery();
                list = new ArrayList<LopHocPhan>();
                while (rs.next()) {
                    LopHocPhan lhp = new LopHocPhan();
                    lhp.setMaLHP(rs.getString(1));
                    lhp.setMaHP(rs.getString(2));
                    lhp.setMaGV(rs.getString(3));
                    lhp.setTietHoc(rs.getString(4));
                    lhp.setThu(rs.getString(5)); 
                    lhp.setNgayBatDau(rs.getString(6));
                    lhp.setDiaDiem(rs.getString(7));
                    list.add(lhp);
                }
            } catch (SQLException ex) {
                Logger.getLogger(LopHocPhanDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                DBConnect.close(ps, rs);
            }
        }
        return list;
    }

    @Override
    public LopHocPhan addNew(LopHocPhan lhp) {
        PreparedStatement ps = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.cnn.prepareStatement("insert into LopHocPhan(MaLHP,MaHP,MaGV,TietHoc,Thu,NgayBatDau,DiaDiem) values(?,?,?,?,?,?,?)");
                ps.setString(1, lhp.getMaLHP());
                ps.setString(2, lhp.getMaHP());
                ps.setString(3, lhp.getMaGV());
                ps.setString(4, lhp.getTietHoc());
                ps.setString(5, lhp.getThu());
                ps.setString(6, lhp.getNgayBatDau());
                ps.setString(7, lhp.getDiaDiem());
                int row = ps.executeUpdate();
                if (row < 1) {
                    lhp = null;
                }
            } catch (SQLException ex) {
               
                JOptionPane.showMessageDialog(null, "M?? h???c ph???n n??y ch??a c??, th??m h???c ph???n n??y v??o danh s??ch h???c ph???n tr?????c khi th??m l???p h???c ph???n");
                lhp = null;
            } finally {
                DBConnect.close(ps);
            }
        }
        return lhp;
    }

    @Override
    public LopHocPhan updateByMa(LopHocPhan lhp) {
        PreparedStatement ps = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.cnn.prepareStatement("update LopHocPhan set MaHP = ?,MaGV=?, TietHoc = ?, Thu = ?, NgayBatDau = ?,DiaDiem= ? where MaLHP = ?");
               
                ps.setString(1, lhp.getMaHP());
                ps.setString(2, lhp.getMaGV());
                ps.setString(3, lhp.getTietHoc());
                ps.setString(4, lhp.getThu());
                ps.setString(5, lhp.getNgayBatDau());
                ps.setString(6, lhp.getDiaDiem()); 
                ps.setString(7, lhp.getMaLHP());
                int row = ps.executeUpdate();
                if (row < 1) {
                    lhp = null;
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "M?? h???c ph???n ho???c m?? gi???ng vi??n n??y ch??a c?? trong danh s??ch qu???n l??, kh??ng th??? s???a l???p h???c ph???n n??y");
                lhp = null;
            } finally {
                DBConnect.close();
            }
        }
        return lhp;
    }
    public void deleteLopHocPhan(String maLHP)throws SQLException, ClassNotFoundException{
    PreparedStatement ps = null;
        if (DBConnect.open()) {
            ps = DBConnect.cnn.prepareStatement("delete from LopHocPhan where MaLHP= ?");
            ps.setString(1, maLHP);
            ps.executeUpdate();
            DBConnect.close();
        }
    }

    @Override
    public ArrayList<LopHocPhan> checkMaLHP(String maLHP) {
      ArrayList<LopHocPhan> list = null;
      PreparedStatement psCheck = null;
      ResultSet rs = null;
        if (DBConnect.open()) {
            try {
                psCheck = DBConnect.cnn.prepareStatement("select *from LopHocPhan where MaLHP=?");
                psCheck.setString(1, maLHP);
                rs = psCheck.executeQuery();
                list = new ArrayList<LopHocPhan>();
                while (rs.next()) {
                    LopHocPhan lhp = new LopHocPhan();
                    lhp.setMaLHP(rs.getString(1));
                    list.add(lhp);
                }
            } catch (SQLException ex) {
                Logger.getLogger(LopHocPhanDAO.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
            DBConnect.close(psCheck, rs);
            }
            
        }
        return list;
    }

    @Override
    public ArrayList<LopHocPhan> findByMaLHP(String maLHP) {
        ArrayList<LopHocPhan> list = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.cnn.prepareStatement("select * from LopHocPhan where MaLHP = ?");
               ps.setString(1, maLHP);
                rs = ps.executeQuery();
                list = new ArrayList<LopHocPhan>();
                while (rs.next()) {
                    LopHocPhan lhp = new LopHocPhan();
                    lhp.setMaLHP(rs.getString(1));
                    lhp.setMaHP(rs.getString(2));
                    lhp.setMaGV(rs.getString(3));
                    lhp.setTietHoc(rs.getString(4));
                    lhp.setThu(rs.getString(5)); 
                    lhp.setNgayBatDau(rs.getString(6));
                    lhp.setDiaDiem(rs.getString(7));
                    list.add(lhp);
                }

            } catch (SQLException ex) {
                Logger.getLogger(LopHocPhanDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                DBConnect.close(ps, rs);
            }
        }
        return list;
    }
    
    public ArrayList<LopHocPhan> findByMaHP(String maHP) {
        ArrayList<LopHocPhan> list = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.cnn.prepareStatement("select * from LopHocPhan where MaHP = ?");
               ps.setString(1, maHP);
                rs = ps.executeQuery();
                list = new ArrayList<LopHocPhan>();
                while (rs.next()) {
                    LopHocPhan lhp = new LopHocPhan();
                    lhp.setMaLHP(rs.getString(1));
                    lhp.setMaHP(rs.getString(2));
                    lhp.setMaGV(rs.getString(3));
                    lhp.setTietHoc(rs.getString(4));
                    lhp.setThu(rs.getString(5)); 
                    lhp.setNgayBatDau(rs.getString(6));
                    lhp.setDiaDiem(rs.getString(7));
                    list.add(lhp);
                }

            } catch (SQLException ex) {
                Logger.getLogger(LopHocPhanDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                DBConnect.close(ps, rs);
            }
        }
        return list;
    }
    public ArrayList<LopHocPhan> findByTenHP(String tenHP) {
        ArrayList<LopHocPhan> list = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        if (DBConnect.open()) {
            try {
                ps = DBConnect.cnn.prepareStatement("select MaLHP,MaHP,TenHP,TietHoc, Thu,NgayBatDau,DiaDiem from LopHocPhan,HocPhan where MaHP = ?");
               ps.setString(1, tenHP);
                rs = ps.executeQuery();
                list = new ArrayList<LopHocPhan>();
                while (rs.next()) {
                    LopHocPhan lhp = new LopHocPhan();
                    lhp.setMaLHP(rs.getString(1));
                    lhp.setMaHP(rs.getString(2));
                    lhp.setMaGV(rs.getString(3));
                    lhp.setTietHoc(rs.getString(4));
                    lhp.setThu(rs.getString(5)); 
                    lhp.setNgayBatDau(rs.getString(6));
                    lhp.setDiaDiem(rs.getString(7));
                    list.add(lhp);
                }

            } catch (SQLException ex) {
                Logger.getLogger(LopHocPhanDAO.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                DBConnect.close(ps, rs);
            }
        }
        return list;
    }
}
