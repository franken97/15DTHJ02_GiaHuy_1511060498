/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims.dal;

import com.mysql.jdbc.Blob;
import ims.dto.DanToc;
import ims.dto.GioiTinh;
import ims.dto.HonNhan;
import ims.dto.NhanVien;
import ims.dto.NhomMau;
import ims.dto.Phuong;
import ims.dto.QuocTich;
import ims.dto.SucKhoe;
import ims.dto.ThanhPho;
import ims.dto.Tinh;
import ims.dto.TonGiao;
import ims.dto.TpXuatThan;
import ims.dto.UuTienBT;
import ims.dto.UuTienGD;
import ims.gui.Employee;
import java.sql.Connection;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;

/**
 *
 * @author AigYuh
 */
public class QLNhanVienDAL extends ConnectionDB {

    public static Connection conn = null;
    public static Statement stmt = null;

    public ArrayList<GioiTinh> readGioiTinhDAL() {
        ArrayList<GioiTinh> GTList = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
            String sql = "SELECT * FROM gioitinh";
            ResultSet rs = null;

            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                GioiTinh em = new GioiTinh();
                em.setMaGT(rs.getString("MaGT"));
                em.setGT(rs.getString("GT"));

                GTList.add(em);
            }
        } catch (SQLException e) {
            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            return GTList;
        }
    }

    public ArrayList<DanToc> readDanTocDAL() {
        ArrayList<DanToc> DTList = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
            String sql = "SELECT * FROM dantoc";
            ResultSet rs = null;

            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                DanToc em = new DanToc();
                em.setMaDT(rs.getString("MaDT"));
                em.setTenDT(rs.getString("TenDT"));

                DTList.add(em);
            }
        } catch (SQLException e) {
            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            return DTList;
        }
    }

    public ArrayList<TonGiao> readTonGiaoDAL() {
        ArrayList<TonGiao> TGList = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
            String sql = "SELECT * FROM tongiao";
            ResultSet rs = null;

            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                TonGiao em = new TonGiao();
                em.setMaTG(rs.getString("MaTG"));
                em.setTenTG(rs.getString("TenTG"));

                TGList.add(em);
            }
        } catch (SQLException e) {
            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            return TGList;
        }
    }

    public ArrayList<QuocTich> readQuocTichDAL() {
        ArrayList<QuocTich> QTList = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
            String sql = "SELECT * FROM quoctich";
            ResultSet rs = null;

            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                QuocTich em = new QuocTich();
                em.setMaQT(rs.getString("MaQT"));
                em.setTenQT(rs.getString("TenQT"));

                QTList.add(em);
            }
        } catch (SQLException e) {
            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            return QTList;
        }
    }

    public ArrayList<Tinh> readTinhDAL() {
        ArrayList<Tinh> TList = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
            String sql = "SELECT * FROM tinh";
            ResultSet rs = null;

            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Tinh em = new Tinh();
                em.setMaTinh(rs.getString("MaTinh"));
                em.setTenTinh(rs.getString("TenTinh"));

                TList.add(em);
            }
        } catch (SQLException e) {
            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            return TList;
        }
    }

    public ArrayList<ThanhPho> readThanhPhoDAL() {
        ArrayList<ThanhPho> TPList = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
            String sql = "SELECT * FROM thanhpho";
            ResultSet rs = null;

            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                ThanhPho em = new ThanhPho();
                em.setMaTP(rs.getString("MaTP"));
                em.setTenTP(rs.getString("TenTP"));

                TPList.add(em);
            }
        } catch (SQLException e) {
            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            return TPList;
        }
    }

    public ArrayList<Phuong> readPhuongDAL() {
        ArrayList<Phuong> PList = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
            String sql = "SELECT * FROM phuong";
            ResultSet rs = null;

            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Phuong em = new Phuong();
                em.setMaPhuong(rs.getString("MaPhuong"));
                em.setTenPhuong(rs.getString("TenPhuong"));

                PList.add(em);
            }
        } catch (SQLException e) {
            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            return PList;
        }
    }

    public ArrayList<HonNhan> readHonNhanDAL() {
        ArrayList<HonNhan> HNList = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
            String sql = "SELECT * FROM honnhan";
            ResultSet rs = null;

            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                HonNhan em = new HonNhan();
                em.setMaHN(rs.getString("MaHN"));
                em.setTTrang(rs.getString("TTrang"));

                HNList.add(em);
            }
        } catch (SQLException e) {
            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            return HNList;
        }
    }

    public ArrayList<TpXuatThan> readTpXuatThanDAL() {
        ArrayList<TpXuatThan> XTList = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
            String sql = "SELECT * FROM tpxuatthan";
            ResultSet rs = null;

            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                TpXuatThan em = new TpXuatThan();
                em.setMaTPXT(rs.getString("MaTPXT"));
                em.setTPXT(rs.getString("TPXT"));

                XTList.add(em);
            }
        } catch (SQLException e) {
            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            return XTList;
        }
    }

    public ArrayList<UuTienBT> readUuTienBTDAL() {
        ArrayList<UuTienBT> BTList = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
            String sql = "SELECT * FROM uutienbt";
            ResultSet rs = null;

            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                UuTienBT em = new UuTienBT();
                em.setMaUTBT(rs.getString("MaUTBT"));
                em.setLoaiUTBT(rs.getString("LoaiUTBT"));

                BTList.add(em);
            }
        } catch (SQLException e) {
            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            return BTList;
        }
    }

    public ArrayList<UuTienGD> readUuTienGDDAL() {
        ArrayList<UuTienGD> GDList = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
            String sql = "SELECT * FROM uutiengd";
            ResultSet rs = null;

            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                UuTienGD em = new UuTienGD();
                em.setMaUTGD(rs.getString("MaUTGD"));
                em.setLoaiUTGD(rs.getString("LoaiUTGD"));

                GDList.add(em);
            }
        } catch (SQLException e) {
            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            return GDList;
        }
    }

    public ArrayList<SucKhoe> readSucKhoeDAL() {
        ArrayList<SucKhoe> SKList = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
            String sql = "SELECT * FROM suckhoe";
            ResultSet rs = null;

            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                SucKhoe em = new SucKhoe();
                em.setMaSK(rs.getString("MaSK"));
                em.setTTSK(rs.getString("TTSK"));

                SKList.add(em);
            }
        } catch (SQLException e) {
            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            return SKList;
        }
    }

    public ArrayList<NhomMau> readNhomMauDAL() {
        ArrayList<NhomMau> NMList = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
            String sql = "SELECT * FROM nhommau";
            ResultSet rs = null;

            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                NhomMau em = new NhomMau();
                em.setMaNM(rs.getString("MaNM"));
                em.setTenNM(rs.getString("TenNM"));

                NMList.add(em);
            }
        } catch (SQLException e) {
            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            return NMList;
        }
    }

    public ArrayList<NhanVien> readNhanVienDAL() {
        ArrayList<NhanVien> emList = new ArrayList<>();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
        } catch (SQLException e) {
            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        String sql = "SELECT MaNV,TenNV,TenDN,Ngaysinh,Noisinh,GT FROM nhanvien,gioitinh WHERE nhanvien.MaGT = gioitinh.MaGT";
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery(sql);
        } catch (SQLException e) {
            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null, e);
        }
        try {
            while (rs.next()) {
                NhanVien em = new NhanVien();
                em.setMaNV(rs.getString("MaNV"));
                em.setTenNV(rs.getString("TenNV"));
                em.setTenDN(rs.getString("TenDN"));
                em.setNgaysinh(rs.getString("Ngaysinh"));
                em.setNoisinh(rs.getString("Noisinh"));
                em.setGT(rs.getString("GT"));
                emList.add(em);
            }
        } catch (SQLException e) {
            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            return emList;
        }
    }

    public void addNewNhanVienDAL(NhanVien nhanVien) {
        conn = null;
        Statement stmt = null;
        

        try {
            conn = getConnection();
            stmt = conn.createStatement();
            String MaNV = nhanVien.getMaNV();
            String Img=nhanVien.getImg();
            String TenNV = nhanVien.getTenNV();
            String TenDN = nhanVien.getTenDN();
            String Matkhau = nhanVien.getMatkhau();
            String TenKhac = nhanVien.getTenKhac();
            String Ngaysinh = nhanVien.getNgaysinh();
            //sqlNgaySinh = new java.sql.Date(Ngaysinh.getTime());

            String MaGT = nhanVien.getMaGT();
            String Noisinh = nhanVien.getNoisinh();
            String DNCuoi = nhanVien.getDNCuoi();
            String sohieuCC = nhanVien.getSohieuCC();
            String hoatdong = nhanVien.getHoatdong();
            String CMND = nhanVien.getCMND();
            String ngaycap = nhanVien.getNgaycap();
            String noicap = nhanVien.getNoicap();
            String tentat = nhanVien.getTentat();
            String MaDT = nhanVien.getMaDT();
            String MaTG = nhanVien.getMaTG();
            String MaQT = nhanVien.getMaQT();
            String MaTinh = nhanVien.getMaTinh();
            String MaTP = nhanVien.getMaTP();
            String MaPhuong = nhanVien.getMaPhuong();
            String ThonXom = nhanVien.getThonXom();
            String DiaChi = nhanVien.getDiaChi();
            String NoiOHT = nhanVien.getNoiOHT();
            String DTCQ = nhanVien.getDTCQ();
            String DTNR = nhanVien.getDTNR();
            String DTDD = nhanVien.getDTDD();
            String Email = nhanVien.getEmail();
            String MaHN = nhanVien.getMaHN();
            String MaTPXT = nhanVien.getMaTPXT();
            String MaUTBT = nhanVien.getMaUTBT();
            String MaUTGD = nhanVien.getMaUTGD();
            String NangKhieu = nhanVien.getNangKhieu();
            String MaSK = nhanVien.getMaSK();
            String MaNM = nhanVien.getMaNM();
            int ChieuCao = nhanVien.getChieuCao();
            int CanNang = nhanVien.getCanNang();
            String KhuyetTat = nhanVien.getKhuyetTat();
            String SoTK = nhanVien.getSoTK();
            String NHMTK = nhanVien.getNHMTK();
            String NgayDongBHXH = nhanVien.getNgayDongBHXH();
            String SoBHXH = nhanVien.getSoBHXH();
            String sql = "INSERT INTO `nhanvien`(`Img`,`maNV`, `TenNV`, `TenDN`, `Matkhau`, `TenKhac`, `Ngaysinh`, `MaGT`, `Noisinh`, `DNCuoi`, `sohieuCC`, `hoatdong`, `CMND`, `ngaycap`, `noicap`, `tenntat`, `MaDT`, `MaTG`, `MaQT`, `MaTinh`, `TP`, `Phuong`, `ThonXom`, `DiaChi`, `NoiOHT`, `DTCQ`, `DTNR`, `DTDD`, `Email`, `MaHN`, `MaTPXT`, `MaUTBT`, `MaUTGD`, `NangKhieu`, `MaSK`, `MaNM`, `ChieuCao`, `CanNang`, `KhuyetTat`, `SoTK`, `NHMTK`, `NgayDongBHXH`, `SoBHXH`) "
                    + "VALUES ('"+Img+"',0,'" + TenNV + "','" + TenDN + "','" + Matkhau + "','" + TenKhac + "','"+ Ngaysinh +"','" + MaGT + "','" + Noisinh + "','"+ DNCuoi +"','" + sohieuCC + "','" + hoatdong + "','" + CMND + "','"+ ngaycap +"','" + noicap + "','" + tentat + "','" + MaDT + "','" + MaTG + "','" + MaQT + "','" + MaTinh + "','" + MaTP + "','" + MaPhuong + "','" + ThonXom + "','" + DiaChi + "','" + NoiOHT + "','" + DTCQ + "','" + DTNR + "','" + DTDD + "','" + Email + "','" + MaHN + "','" + MaTPXT + "','" + MaUTBT + "','" + MaUTGD + "','" + NangKhieu + "','" + MaSK + "','" + MaNM + "','" + ChieuCao + "','" + CanNang + "','" + KhuyetTat + "','" + SoTK + "','" + NHMTK + "','"+ NgayDongBHXH +"','" + SoBHXH + "')";
            stmt.executeUpdate(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // ----------------
    public GioiTinh takeMaGioiTinhDAL(String loaiGioiTinh) {
        GioiTinh Gt = new GioiTinh();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
            String sql = "SELECT MaGT,GT FROM gioitinh WHERE GT = '" + loaiGioiTinh + "'";
            ResultSet rs = null;
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
                Gt.setMaGT(rs.getString("MaGT"));
                Gt.setGT(rs.getString("GT"));
            }
        } catch (SQLException e) {
            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            return Gt;
        }
    }

    public DanToc takeMaDanTocDAL(String loaiDanToc) {
        DanToc Dt = new DanToc();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
            String sql = "SELECT MaDT,TenDT FROM dantoc WHERE TenDT = '" + loaiDanToc + "'";
            ResultSet rs = null;
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
                Dt.setMaDT(rs.getString("MaDT"));
                Dt.setTenDT(rs.getString("TenDT"));
            }
        } catch (SQLException e) {
            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            return Dt;
        }
    }

    public TonGiao takeMaTonGiaoDAL(String loaiTonGiao) {
        TonGiao Tgi = new TonGiao();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
            String sql = "SELECT MaTG,TenTG FROM tongiao WHERE TenTG = '" + loaiTonGiao + "'";
            ResultSet rs = null;
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
                Tgi.setMaTG(rs.getString("MaTG"));
                Tgi.setTenTG(rs.getString("TenTG"));
            }
        } catch (SQLException e) {
            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            return Tgi;
        }
    }

    public QuocTich takeMaQuocTichDAL(String loaiQuocTich) {
        QuocTich Qt = new QuocTich();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
            String sql = "SELECT MaQT,TenQT FROM quoctich WHERE TenQT = '" + loaiQuocTich + "'";
            ResultSet rs = null;
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
                Qt.setMaQT(rs.getString("MaQT"));
                Qt.setTenQT(rs.getString("TenQT"));
            }
        } catch (SQLException e) {
            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            return Qt;
        }
    }

    public Tinh takeMaTinhDAL(String loaiTinh) {
        Tinh T = new Tinh();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
            String sql = "SELECT MaTinh,TenTinh FROM tinh WHERE TenTinh = '" + loaiTinh + "'";
            ResultSet rs = null;
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
                T.setMaTinh(rs.getString("MaTinh"));
                T.setTenTinh(rs.getString("TenTinh"));
            }
        } catch (SQLException e) {
            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            return T;
        }
    }

    public ThanhPho takeMaThanhPhoDAL(String loaiThanhPho) {
        ThanhPho Tp = new ThanhPho();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
            String sql = "SELECT MaTP,TenTP FROM thanhpho WHERE TenTP = '" + loaiThanhPho + "'";
            ResultSet rs = null;
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
                Tp.setMaTP(rs.getString("MaTP"));
                Tp.setTenTP(rs.getString("TenTP"));
            }
        } catch (SQLException e) {
            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            return Tp;
        }
    }

    public Phuong takeMaPhuongDAL(String loaiPhuong) {
        Phuong P = new Phuong();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
            String sql = "SELECT MaPhuong,TenPhuong FROM phuong WHERE TenPhuong = '" + loaiPhuong + "'";
            ResultSet rs = null;
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
                P.setMaPhuong(rs.getString("MaPhuong"));
                P.setTenPhuong(rs.getString("TenPhuong"));
            }
        } catch (SQLException e) {
            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            return P;
        }
    }

    public HonNhan takeMaHonNhanDAL(String loaiHonNhan) {
        HonNhan Hn = new HonNhan();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
            String sql = "SELECT MaHN,TTrang FROM honnhan WHERE TTrang = '" + loaiHonNhan + "'";
            ResultSet rs = null;
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
                Hn.setMaHN(rs.getString("MaHN"));
                Hn.setTTrang(rs.getString("TTrang"));
            }
        } catch (SQLException e) {
            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            return Hn;
        }
    }

    public TpXuatThan takeMaTpXuatThanDAL(String loaiTpXuatThan) {
        TpXuatThan Xt = new TpXuatThan();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
            String sql = "SELECT MaTPXT,TPXT FROM tpxuatthan WHERE TPXT = '" + loaiTpXuatThan + "'";
            ResultSet rs = null;
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
                Xt.setMaTPXT(rs.getString("MaTPXT"));
                Xt.setTPXT(rs.getString("TPXT"));
            }
        } catch (SQLException e) {
            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            return Xt;
        }
    }

    public UuTienGD takeMaUuTienGDDAL(String loaiUuTienGD) {
        UuTienGD GD = new UuTienGD();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
            String sql = "SELECT MaUTGD,LoaiUTGD FROM uutiengd WHERE LoaiUTGD = '" + loaiUuTienGD + "'";
            ResultSet rs = null;
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
                GD.setMaUTGD(rs.getString("MaUTGD"));
                GD.setLoaiUTGD(rs.getString("LoaiUTGD"));
            }
        } catch (SQLException e) {
            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            return GD;
        }
    }

    public UuTienBT takeMaUuTienBTDAL(String loaiUuTienBT) {
        UuTienBT Bt = new UuTienBT();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
            String sql = "SELECT MaUTBT,LoaiUTBT FROM uutienbt WHERE LoaiUTBT = '" + loaiUuTienBT + "'";
            ResultSet rs = null;
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
                Bt.setMaUTBT(rs.getString("MaUTBT"));
                Bt.setLoaiUTBT(rs.getString("LoaiUTBT"));
            }
        } catch (SQLException e) {
            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            return Bt;
        }
    }

    public SucKhoe takeMaSucKhoeDAL(String loaiSucKhoe) {
        SucKhoe Sk = new SucKhoe();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
            String sql = "SELECT MaSK,TTSK FROM suckhoe WHERE TTSK = '" + loaiSucKhoe + "'";
            ResultSet rs = null;
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
                Sk.setMaSK(rs.getString("MaSK"));
                Sk.setTTSK(rs.getString("TTSK"));
            }
        } catch (SQLException e) {
            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            return Sk;
        }
    }

    public NhomMau takeMaNhomMauDAL(String loaiNhomMau) {
        NhomMau Nm = new NhomMau();
        conn = getConnection();
        try {
            stmt = conn.createStatement();
            String sql = "SELECT MaNM,TenNM FROM nhommau WHERE TenNM = '" + loaiNhomMau + "'";
            ResultSet rs = null;
            rs = stmt.executeQuery(sql);
            if (rs.next()) {
                Nm.setMaNM(rs.getString("MaNM"));
                Nm.setTenNM(rs.getString("TenNM"));
            }
        } catch (SQLException e) {
            Logger.getLogger(QLNhanVienDAL.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            return Nm;
        }
    }
    
    //---------------------- Xóa
    public void deleteNhanVienDAL(String id) {
        try {
            conn = getConnection();
            stmt = conn.createStatement();
            String sql = "DELETE FROM nhanvien WHERE MaNV = " + id;
            stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}
