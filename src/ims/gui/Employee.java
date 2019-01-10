/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims.gui;

import ims.bll.QLNhanVienBLL;
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
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javafx.scene.control.ComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author NAT
 */
public class Employee extends javax.swing.JFrame {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/database";
    static final String USER = "root";
    static final String PASS = "";

    /**
     * Creates new form Employee
     */
    QLNhanVienBLL nhanVienBLL = new QLNhanVienBLL();
    NhanVien nhanVien = new NhanVien();
    QLNhanVienBLL addNewNV = new QLNhanVienBLL();
    QLNhanVienBLL gioiTinhBLL = new QLNhanVienBLL();
    QLNhanVienBLL danTocBLL = new QLNhanVienBLL();
    QLNhanVienBLL tonGiaoBLL = new QLNhanVienBLL();
    QLNhanVienBLL quocTichBLL = new QLNhanVienBLL();
    QLNhanVienBLL tinhBLL = new QLNhanVienBLL();
    QLNhanVienBLL thanhPhoBLL = new QLNhanVienBLL();
    QLNhanVienBLL phuongBLL = new QLNhanVienBLL();
    QLNhanVienBLL honNhanBLL = new QLNhanVienBLL();
    QLNhanVienBLL xuatThanBLL = new QLNhanVienBLL();
    QLNhanVienBLL giaDinhBLL = new QLNhanVienBLL();
    QLNhanVienBLL banThanBLL = new QLNhanVienBLL();
    QLNhanVienBLL sucKhoeBLL = new QLNhanVienBLL();
    QLNhanVienBLL nhomMauBLL = new QLNhanVienBLL();
    GioiTinh Gt = new GioiTinh();
    DanToc Dt = new DanToc();
    TonGiao Tgi = new TonGiao();
    QuocTich Qt = new QuocTich();
    Tinh T = new Tinh();
    ThanhPho Tp = new ThanhPho();
    Phuong Qh = new Phuong();
    HonNhan Hn = new HonNhan();
    TpXuatThan Xt = new TpXuatThan();
    UuTienGD Gd = new UuTienGD();
    UuTienBT Bt = new UuTienBT();
    SucKhoe Sk = new SucKhoe();
    NhomMau Nm = new NhomMau();
    
    public Employee() {
        initComponents();
        stateButton(true);
        setInfoDialog();
//        String sqlGioiTinh = " SELECT * FROM gioitinh  WHERE LoaiGioiTinh = MaGT ";
//        LoadDataCB(sqlGioiTinh, this.cbGioiTinh, "GT");
//        String sqlDanToc = " SELECT * FROM dantoc";
//        LoadDataCB(sqlDanToc, this.cbDanToc, "TenDT");
//        String sqlTonGiao = " SELECT * FROM tongiao";
//        LoadDataCB(sqlTonGiao, this.cbTonGiao, "TenTG");
//        String sqlQuocTich = " SELECT * FROM quoctich";
//        LoadDataCB(sqlQuocTich, this.cbQuocTich, "TenQT");
//        String sqlTinh = " SELECT * FROM tinh";
//        LoadDataCB(sqlTinh, this.cbTinh, "TenTinh");
//        String sqlThanhPho = " SELECT * FROM thanhpho";
//        LoadDataCB(sqlThanhPho, this.cbTPho, "TenTP");
//        String sqlPhuong = " SELECT * FROM phuong";
//        LoadDataCB(sqlPhuong, this.cbQuanHuyen, "TenPhuong");
//        String sqlHonNhan = " SELECT * FROM honnhan";
//        LoadDataCB(sqlHonNhan, this.cbHonNhan, "TTrang");
//        String sqlXuatThan = " SELECT * FROM tpxuatthan";
//        LoadDataCB(sqlXuatThan, this.cbXuatThan, "TPXT");
//        String sqlUTGiaDinh = " SELECT * FROM uutiengd";
//        LoadDataCB(sqlUTGiaDinh, this.cbUuTienGĐ, "LoaiUTGD");
//        String sqlUTXuatThan = " SELECT * FROM uutienbt";
//        LoadDataCB(sqlUTXuatThan, this.cbUuTienBT, "LoaiUTBT");
//        String sqlSucKhoe = " SELECT * FROM suckhoe";
//        LoadDataCB(sqlSucKhoe, this.cbSucKhoe, "TTSK");
//        String sqlNhomMau = " SELECT * FROM nhommau";
//        LoadDataCB(sqlNhomMau, this.cbNhomMau, "TenNM");
    }

    public void setInfoDialog() {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - getHeight()) / 2);
        setLocation(x, y);
        setResizable(false);
    }

    public void stateButton(boolean value) {

        btSave.setVisible(true);
        btCancel.setVisible(true);

    }

//    public void LoadDataCB(String sql, JComboBox cb, String bien) {
//        Connection conn = null;
//        Statement stmt = null;
//        try {
//            Class.forName(JDBC_DRIVER);
//            conn = DriverManager.getConnection(DB_URL, USER, PASS);
//            stmt = conn.createStatement();
//
//            ResultSet rs = stmt.executeQuery(sql);
//            while (rs.next()) {
//                cb.addItem(rs.getString(bien));
//            }
//        } catch (ClassNotFoundException ex) {
//            ex.printStackTrace();
//        } catch (SQLException ex) {
////                Logger.getLogger(JDBC_Example.class.getName()).log(Level.SEVERE, null, ex);
//            ex.printStackTrace();
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        } finally {
//            try {
//                if (stmt != null) {
//                    stmt.close();
//                }
//            } catch (SQLException ex) {
//            }
//            try {
//                if (conn != null) {
//                    conn.close();
//                }
//            } catch (SQLException ex) {
//                ex.printStackTrace();
//            }
//        }
//    }
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfTenDangNhap = new javax.swing.JTextField();
        tfHoTen = new javax.swing.JTextField();
        tfNoiSinh = new javax.swing.JTextField();
        tfCMND = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tfTenGoiKhac = new javax.swing.JTextField();
        tfNoiCap = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cbGioiTinh = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        tfSoHieu = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        checkHoatDong = new javax.swing.JCheckBox();
        btChonAnh = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        tfTenTat = new javax.swing.JTextField();
        tfPhuong = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        tfDiaChiTC = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        tfDiaChiHT = new javax.swing.JTextField();
        tfDTCoQuan = new javax.swing.JTextField();
        tfNangKhieu = new javax.swing.JTextField();
        tfKhuyetTat = new javax.swing.JTextField();
        tfNganHangMoTK = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        cbDanToc = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        cbTonGiao = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        cbQuocTich = new javax.swing.JComboBox<>();
        cbTinh = new javax.swing.JComboBox<>();
        cbTPho = new javax.swing.JComboBox<>();
        cbQuanHuyen = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        tfDTNR = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        tfDTDĐ = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        cbHonNhan = new javax.swing.JComboBox<>();
        jLabel32 = new javax.swing.JLabel();
        cbXuatThan = new javax.swing.JComboBox<>();
        cbUuTienGĐ = new javax.swing.JComboBox<>();
        jLabel33 = new javax.swing.JLabel();
        cbUuTienBT = new javax.swing.JComboBox<>();
        cbSucKhoe = new javax.swing.JComboBox<>();
        jLabel34 = new javax.swing.JLabel();
        cbNhomMau = new javax.swing.JComboBox<>();
        jLabel35 = new javax.swing.JLabel();
        tfChieuCao = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        tfCanNang = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        tfSoTaiKhoan = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        tfSoSoBH = new javax.swing.JTextField();
        btSave = new javax.swing.JButton();
        btCancel = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lbAnh = new javax.swing.JLabel();
        jpMatKhau = new javax.swing.JPasswordField();
        jpNhapLaiMK = new javax.swing.JPasswordField();
        jDNgaySinh = new com.toedter.calendar.JDateChooser();
        jDDNCuoi = new com.toedter.calendar.JDateChooser();
        jDNgayCap = new com.toedter.calendar.JDateChooser();
        jDBHXH = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Tên Đăng Nhập:");

        jLabel2.setText("Họ và Tên:");

        jLabel3.setText("Nơi Sinh:");

        jLabel4.setText("Số CMND:");

        jLabel5.setText("Ngày Cấp:");

        jLabel6.setText("Mật Khẩu:");

        jLabel7.setText("Tên Gọi Khác:");

        jLabel8.setText("Đăng Nhập Cuối:");

        jLabel9.setText("Nơi Cấp:");

        jLabel10.setText("Nhập Lại M.Khẩu:");

        jLabel11.setText("Ngày Sinh:");

        jLabel12.setText("Giới Tính:");

        cbGioiTinh.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbGioiTinhItemStateChanged(evt);
            }
        });

        jLabel13.setText("Số Hiệu CC:");

        jLabel14.setText("Hoạt Động:");

        btChonAnh.setText("Chọn Ảnh");
        btChonAnh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btChonAnhActionPerformed(evt);
            }
        });

        jLabel15.setText("Tên Tắt (Xếp TKB):");

        jLabel16.setText("Quê Quán:");

        tfPhuong.setText("Phuong");
        tfPhuong.setToolTipText("");
        tfPhuong.setName(""); // NOI18N

        jLabel17.setText("Địa Chỉ Thường Chú:");

        jLabel18.setText("Nơi Ở Hiện Nay:");

        jLabel19.setText("Điện Thoại Cơ Quan:");

        jLabel20.setText("Tình Trạng Hôn Nhân:");

        jLabel21.setText("Diện Ưu Tiên Gia Đình:");

        jLabel22.setText("Năng Khiếu/Sở Trường:");

        jLabel23.setText("Tình Trạng Sức Khỏe:");

        jLabel24.setText("Khuyết Tật:");

        jLabel25.setText("Ngân Hàng Mở TK:");

        jLabel26.setText("Dân Tộc:");

        cbDanToc.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbDanTocItemStateChanged(evt);
            }
        });

        jLabel27.setText("Tôn Giáo:");

        cbTonGiao.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbTonGiaoItemStateChanged(evt);
            }
        });

        jLabel28.setText("Quốc Tịch:");

        cbQuocTich.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbQuocTichItemStateChanged(evt);
            }
        });

        cbTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chọn Tỉnh" }));
        cbTinh.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbTinhItemStateChanged(evt);
            }
        });

        cbTPho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chọn Thành Phố" }));
        cbTPho.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbTPhoItemStateChanged(evt);
            }
        });

        cbQuanHuyen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chọn Quận/Huyện" }));
        cbQuanHuyen.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbQuanHuyenItemStateChanged(evt);
            }
        });

        jLabel29.setText("Điện Thoại NR:");

        jLabel30.setText("ĐTDĐ:");

        jLabel31.setText("Email:");

        cbHonNhan.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbHonNhanItemStateChanged(evt);
            }
        });

        jLabel32.setText("Thành Phần Xuất Thân:");

        cbXuatThan.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbXuatThanItemStateChanged(evt);
            }
        });

        cbUuTienGĐ.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbUuTienGĐItemStateChanged(evt);
            }
        });

        jLabel33.setText("Diện Ưu Tiên Bản Thân:");

        cbUuTienBT.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbUuTienBTItemStateChanged(evt);
            }
        });

        cbSucKhoe.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbSucKhoeItemStateChanged(evt);
            }
        });

        jLabel34.setText("Nhóm Máu:");

        cbNhomMau.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbNhomMauItemStateChanged(evt);
            }
        });

        jLabel35.setText("Chiều Cao(cm):");

        jLabel36.setText("Cân Nặng:");

        jLabel37.setText("Số Tài Khoản:");

        jLabel38.setText("Ngày Bắt Đầu Đóng BHXH:");

        jLabel39.setText("Số Sổ BHXH:");

        btSave.setText("Lưu");
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveActionPerformed(evt);
            }
        });

        btCancel.setText("Hủy");
        btCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbAnh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ims/images/imgNull.png"))); // NOI18N
        lbAnh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbAnh))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbAnh, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btChonAnh)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(tfHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(tfTenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(tfCMND, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(32, 32, 32)
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jDNgayCap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(tfNoiSinh, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jpMatKhau)
                                            .addComponent(tfTenGoiKhac, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                                            .addComponent(jDDNCuoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGap(31, 31, 31)
                                                .addComponent(jLabel13)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(tfSoHieu, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jDNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(17, 17, 17)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(10, 10, 10)
                                                        .addComponent(checkHoatDong))
                                                    .addComponent(cbGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(jpNhapLaiMK)))
                                    .addComponent(tfNoiCap)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbQuocTich, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel24)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel17))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfDiaChiHT)
                                    .addComponent(tfNangKhieu)
                                    .addComponent(tfDiaChiTC)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cbHonNhan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(tfDTCoQuan, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel29)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tfDTNR, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(cbUuTienGĐ, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(38, 38, 38)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel33)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cbUuTienBT, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel30)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tfDTDĐ, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(38, 38, 38)
                                                .addComponent(jLabel31)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tfEmail))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel32)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cbXuatThan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(tfTenTat)
                                                .addGap(24, 24, 24)
                                                .addComponent(jLabel26)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cbDanToc, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(cbTinh, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cbTPho, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(cbQuanHuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel27)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cbTonGiao, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfPhuong, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel28)
                                                .addGap(213, 213, 213))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(cbSucKhoe, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel34)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cbNhomMau, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(36, 36, 36)
                                                .addComponent(jLabel35))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(tfKhuyetTat, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                                                .addComponent(jLabel37))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(tfNganHangMoTK, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(38, 38, 38)
                                                .addComponent(jLabel38)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(btSave)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(btCancel))
                                                    .addComponent(jDBHXH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(tfChieuCao, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel36)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tfCanNang, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(tfSoTaiKhoan)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel39)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tfSoSoBH)))))))
                        .addGap(40, 40, 40))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tfTenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10)
                            .addComponent(jpMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jpNhapLaiMK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(tfHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7)
                                .addComponent(tfTenGoiKhac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cbGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12))
                            .addComponent(jDNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(tfNoiSinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8)
                                .addComponent(jLabel13)
                                .addComponent(tfSoHieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel14))
                            .addComponent(checkHoatDong)
                            .addComponent(jDDNCuoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(tfNoiCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(tfCMND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5))
                            .addComponent(jDNgayCap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btChonAnh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(tfTenTat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(cbDanToc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(cbTonGiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28)
                    .addComponent(cbQuocTich, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(tfPhuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbTPho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbQuanHuyen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDiaChiTC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(tfDiaChiHT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(tfDTCoQuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29)
                    .addComponent(tfDTNR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30)
                    .addComponent(tfDTDĐ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(cbHonNhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32)
                    .addComponent(cbXuatThan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(cbUuTienGĐ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33)
                    .addComponent(cbUuTienBT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(tfNangKhieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(cbSucKhoe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34)
                    .addComponent(cbNhomMau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35)
                    .addComponent(tfChieuCao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36)
                    .addComponent(tfCanNang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(tfKhuyetTat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37)
                    .addComponent(tfSoTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel25)
                                .addComponent(tfNganHangMoTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel38))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel39)
                                .addComponent(tfSoSoBH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btSave)
                            .addComponent(btCancel)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jDBHXH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    String imgPath ;

    public ImageIcon ResizeImage(String imagePath) {
        ImageIcon myImage = null;

        if (imagePath == null) {
            myImage = new ImageIcon("D:\\BT Java\\java\\InventoryManagement\\src\\ims\\images\\imgNull.png");
        } else {
            myImage = new ImageIcon(imagePath);
        }
        Image img = myImage.getImage();
        Image img2 = img.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(img2);
        return image;
    }
    private void btChonAnhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btChonAnhActionPerformed
        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));

        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.image", "jpg", "png");
        file.addChoosableFileFilter(filter);
        int result = file.showSaveDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = file.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            lbAnh.setIcon(ResizeImage(path));
            imgPath = path;
        } else {
            System.out.println("No File selected");
        }
    }//GEN-LAST:event_btChonAnhActionPerformed

    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
        stateButton(true);
try{
        //Blob Img;
        String TenNV = tfHoTen.getText();
        
        String TenDN = tfTenDangNhap.getText();
        String Matkhau = jpMatKhau.getSelectedText();
        String TenKhac = tfTenGoiKhac.getText();
        
        
        String Noisinh = tfNoiSinh.getText();
       
        //Date DNCuoi;
        String sohieuCC = tfSoHieu.getText();
        String hoatdong = checkHoatDong.getText();
        String CMND = tfCMND.getText();
        
        
        
        String noicap = tfNoiCap.getText();
        String tentat = tfTenTat.getText();
       
        String ThonXom = tfPhuong.getText();
        String DiaChi = tfDiaChiHT.getText();
        String NoiOHT = tfDiaChiTC.getText();
        String DTCQ = tfDTCoQuan.getText();
        String DTNR = tfDTNR.getText();
        String DTDD = tfDTDĐ.getText();
        String Email = tfEmail.getText();
        
        String NangKhieu = tfNangKhieu.getText();
       
        int ChieuCao = Integer.parseInt(tfChieuCao.getText());
        int CanNang = Integer.parseInt(tfCanNang.getText());
        String KhuyetTat = tfKhuyetTat.getText();
        String SoTK = tfSoTaiKhoan.getText();
        String NHMTK = tfNganHangMoTK.getText();
        String SoBHXH = tfSoSoBH.getText();
        Date bhxh = jDBHXH.getDate();
        String ngaybatdauBHXH = DateFormat.getDateInstance().format(bhxh);
        Date ns = jDNgaySinh.getDate();
        String ngaysinh = DateFormat.getDateInstance().format(ns);
        Date dnc = jDDNCuoi.getDate();
        String dncuoi = DateFormat.getDateInstance().format(dnc);        
        Date nc = jDNgayCap.getDate();
        String ngaycap = DateFormat.getDateInstance().format(nc);
        

        nhanVien.setTenNV(TenNV);
        nhanVien.setImgByte(imgPath);
        nhanVien.setTenDN(TenDN);
        nhanVien.setMatkhau(Matkhau);
        nhanVien.setTenKhac(TenKhac);
        nhanVien.setNgaysinh(ngaysinh);
        nhanVien.setMaGT(Gt.getMaGT());
        nhanVien.setNoisinh(Noisinh);
        nhanVien.setDNCuoi(dncuoi);
        nhanVien.setSohieuCC(sohieuCC);
        nhanVien.setHoatdong(hoatdong);
        nhanVien.setCMND(CMND);
        nhanVien.setNgaycap(ngaycap);
        nhanVien.setNoicap(noicap);
        nhanVien.setTentat(tentat);
        nhanVien.setMaDT(Dt.getMaDT());
        nhanVien.setMaTG(Tgi.getMaTG());
        nhanVien.setMaQT(Qt.getMaQT());
        nhanVien.setMaTinh(T.getMaTinh());
        nhanVien.setMaTP(Tp.getMaTP());
        nhanVien.setMaPhuong(Qh.getMaPhuong());
        nhanVien.setThonXom(ThonXom);
        nhanVien.setDiaChi(DiaChi);
        nhanVien.setNoiOHT(NoiOHT);
        nhanVien.setDTCQ(DTCQ);
        nhanVien.setDTNR(DTNR);
        nhanVien.setDTDD(DTDD);
        nhanVien.setEmail(Email);
        nhanVien.setMaHN(Hn.getMaHN());
        nhanVien.setMaTPXT(Xt.getMaTPXT());
        nhanVien.setMaUTBT(Bt.getMaUTBT());
        nhanVien.setMaUTGD(Gd.getMaUTGD());
        nhanVien.setNangKhieu(NangKhieu);
        nhanVien.setMaSK(Sk.getMaSK());
        nhanVien.setMaNM(Nm.getMaNM());
        nhanVien.setChieuCao(ChieuCao);
        nhanVien.setCanNang(CanNang);
        nhanVien.setKhuyetTat(KhuyetTat);
        nhanVien.setSoTK(SoTK);
        nhanVien.setNHMTK(NHMTK);
        nhanVien.setNgayDongBHXH(ngaybatdauBHXH);
        nhanVien.setSoBHXH(SoBHXH);
        addNewNV.addNewNhanVienBLL(nhanVien);
        }catch(Exception e){
            e.printStackTrace();
        }

    }//GEN-LAST:event_btSaveActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        DefaultComboBoxModel model = (DefaultComboBoxModel) cbGioiTinh.getModel();
        ArrayList<GioiTinh> GTListModel = gioiTinhBLL.readGioiTinhBLL();
        GioiTinh GTModel = new GioiTinh();
        for (int i = 0; i < GTListModel.size(); i++) {
            GTModel = GTListModel.get(i);
            model.addElement(GTModel.getGT());
        }
        GTListModel.clear();

        model = (DefaultComboBoxModel) cbDanToc.getModel();
        ArrayList<DanToc> DTListModel = danTocBLL.readDanTocBLL();
        DanToc DTModel = new DanToc();
        for (int i = 0; i < DTListModel.size(); i++) {
            DTModel = DTListModel.get(i);
            model.addElement(DTModel.getTenDT());
        }
        DTListModel.clear();

        model = (DefaultComboBoxModel) cbTonGiao.getModel();
        ArrayList<TonGiao> TGListModel = tonGiaoBLL.readTonGiaoBLL();
        TonGiao TGModel = new TonGiao();
        for (int i = 0; i < TGListModel.size(); i++) {
            TGModel = TGListModel.get(i);
            model.addElement(TGModel.getTenTG());
        }
        TGListModel.clear();

        model = (DefaultComboBoxModel) cbQuocTich.getModel();
        ArrayList<QuocTich> QTListModel = quocTichBLL.readQuocTichBLL();
        QuocTich QTModel = new QuocTich();
        for (int i = 0; i < QTListModel.size(); i++) {
            QTModel = QTListModel.get(i);
            model.addElement(QTModel.getTenQT());
        }
        QTListModel.clear();

        model = (DefaultComboBoxModel) cbTinh.getModel();
        ArrayList<Tinh> TListModel = tinhBLL.readTinhBLL();
        Tinh TModel = new Tinh();
        for (int i = 0; i < TListModel.size(); i++) {
            TModel = TListModel.get(i);
            model.addElement(TModel.getTenTinh());
        }
        TListModel.clear();

        model = (DefaultComboBoxModel) cbTPho.getModel();
        ArrayList<ThanhPho> TPListModel = thanhPhoBLL.readThanhPhoBLL();
        ThanhPho TPModel = new ThanhPho();
        for (int i = 0; i < TPListModel.size(); i++) {
            TPModel = TPListModel.get(i);
            model.addElement(TPModel.getTenTP());
        }
        TPListModel.clear();

        model = (DefaultComboBoxModel) cbQuanHuyen.getModel();
        ArrayList<Phuong> PListModel = phuongBLL.readPhuongBLL();
        Phuong PModel = new Phuong();
        for (int i = 0; i < PListModel.size(); i++) {
            PModel = PListModel.get(i);
            model.addElement(PModel.getTenPhuong());
        }
        PListModel.clear();

        model = (DefaultComboBoxModel) cbHonNhan.getModel();
        ArrayList<HonNhan> HNistModel = honNhanBLL.readHonNhanBLL();
        HonNhan HNModel = new HonNhan();
        for (int i = 0; i < HNistModel.size(); i++) {
            HNModel = HNistModel.get(i);
            model.addElement(HNModel.getTTrang());
        }
        HNistModel.clear();

        model = (DefaultComboBoxModel) cbXuatThan.getModel();
        ArrayList<TpXuatThan> XTListModel = xuatThanBLL.readTpXuatThanBLL();
        TpXuatThan XTModel = new TpXuatThan();
        for (int i = 0; i < XTListModel.size(); i++) {
            XTModel = XTListModel.get(i);
            model.addElement(XTModel.getTPXT());
        }
        XTListModel.clear();

        model = (DefaultComboBoxModel) cbUuTienBT.getModel();
        ArrayList<UuTienBT> BTListModel = banThanBLL.readUuTienBTBLL();
        UuTienBT BTModel = new UuTienBT();
        for (int i = 0; i < BTListModel.size(); i++) {
            BTModel = BTListModel.get(i);
            model.addElement(BTModel.getLoaiUTBT());
        }
        BTListModel.clear();

        model = (DefaultComboBoxModel) cbUuTienGĐ.getModel();
        ArrayList<UuTienGD> GDListModel = giaDinhBLL.readUuTienGDBLL();
        UuTienGD GDModel = new UuTienGD();
        for (int i = 0; i < GDListModel.size(); i++) {
            GDModel = GDListModel.get(i);
            model.addElement(GDModel.getLoaiUTGD());
        }
        GDListModel.clear();

        model = (DefaultComboBoxModel) cbSucKhoe.getModel();
        ArrayList<SucKhoe> SKListModel = sucKhoeBLL.readSucKhoeBLL();
        SucKhoe SKModel = new SucKhoe();
        for (int i = 0; i < SKListModel.size(); i++) {
            SKModel = SKListModel.get(i);
            model.addElement(SKModel.getTTSK());
        }
        SKListModel.clear();

        model = (DefaultComboBoxModel) cbNhomMau.getModel();
        ArrayList<NhomMau> NMListModel = nhomMauBLL.readNhomMauBLL();
        NhomMau NMModel = new NhomMau();
        for (int i = 0; i < NMListModel.size(); i++) {
            NMModel = NMListModel.get(i);
            model.addElement(NMModel.getTenNM());
        }
        NMListModel.clear();

    }//GEN-LAST:event_formWindowOpened

    private void cbGioiTinhItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbGioiTinhItemStateChanged
        String takeGT = cbGioiTinh.getSelectedItem().toString();
        QLNhanVienBLL nV = new QLNhanVienBLL();
        Gt = nV.takeMaGioiTinhBLL(takeGT);
    }//GEN-LAST:event_cbGioiTinhItemStateChanged

    private void btCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelActionPerformed
        EmployeeList emListGui= new EmployeeList();
        emListGui.setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_btCancelActionPerformed

    private void cbDanTocItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbDanTocItemStateChanged
        String takeDT = cbDanToc.getSelectedItem().toString();
        QLNhanVienBLL nV = new QLNhanVienBLL();
        Dt = nV.takeMaDanTocBLL(takeDT);
    }//GEN-LAST:event_cbDanTocItemStateChanged

    private void cbTonGiaoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbTonGiaoItemStateChanged
        String takeTgi = cbTonGiao.getSelectedItem().toString();
        QLNhanVienBLL nV = new QLNhanVienBLL();
        Tgi = nV.takeMaTonGiaoBLL(takeTgi);
    }//GEN-LAST:event_cbTonGiaoItemStateChanged

    private void cbQuocTichItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbQuocTichItemStateChanged
        String takeQt = cbQuocTich.getSelectedItem().toString();
        QLNhanVienBLL nV = new QLNhanVienBLL();
        Qt = nV.takeMaQuocTichBLL(takeQt);
    }//GEN-LAST:event_cbQuocTichItemStateChanged

    private void cbTinhItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbTinhItemStateChanged
        String takeT = cbTinh.getSelectedItem().toString();
        QLNhanVienBLL nV = new QLNhanVienBLL();
        T = nV.takeMaTinhBLL(takeT);
    }//GEN-LAST:event_cbTinhItemStateChanged

    private void cbTPhoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbTPhoItemStateChanged
        String takeTp = cbTPho.getSelectedItem().toString();
        QLNhanVienBLL nV = new QLNhanVienBLL();
        Tp = nV.takeMaThanhPhoBLL(takeTp);
    }//GEN-LAST:event_cbTPhoItemStateChanged

    private void cbQuanHuyenItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbQuanHuyenItemStateChanged
        String takeQh = cbQuanHuyen.getSelectedItem().toString();
        QLNhanVienBLL nV = new QLNhanVienBLL();
        Qh = nV.takeMaPhuongBLL(takeQh);
    }//GEN-LAST:event_cbQuanHuyenItemStateChanged

    private void cbHonNhanItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbHonNhanItemStateChanged
        String takeHn = cbHonNhan.getSelectedItem().toString();
        QLNhanVienBLL nV = new QLNhanVienBLL();
        Hn = nV.takeMaHonNhanBLL(takeHn);
    }//GEN-LAST:event_cbHonNhanItemStateChanged

    private void cbXuatThanItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbXuatThanItemStateChanged
        String takeXt = cbXuatThan.getSelectedItem().toString();
        QLNhanVienBLL nV = new QLNhanVienBLL();
        Xt = nV.takeMaTpXuatThanBLL(takeXt);
    }//GEN-LAST:event_cbXuatThanItemStateChanged

    private void cbUuTienGĐItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbUuTienGĐItemStateChanged
        String takeGd = cbUuTienGĐ.getSelectedItem().toString();
        QLNhanVienBLL nV = new QLNhanVienBLL();
        Gd = nV.takeMaUuTienGDBLL(takeGd);
    }//GEN-LAST:event_cbUuTienGĐItemStateChanged

    private void cbUuTienBTItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbUuTienBTItemStateChanged
        String takeBt = cbUuTienBT.getSelectedItem().toString();
        QLNhanVienBLL nV = new QLNhanVienBLL();
        Bt = nV.takeMaUuTienBTBLL(takeBt);
    }//GEN-LAST:event_cbUuTienBTItemStateChanged

    private void cbSucKhoeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbSucKhoeItemStateChanged
        String takeSk = cbSucKhoe.getSelectedItem().toString();
        QLNhanVienBLL nV = new QLNhanVienBLL();
        Sk = nV.takeMaSucKhoeBLL(takeSk);
    }//GEN-LAST:event_cbSucKhoeItemStateChanged

    private void cbNhomMauItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbNhomMauItemStateChanged
        String takeNm = cbNhomMau.getSelectedItem().toString();
        QLNhanVienBLL nV = new QLNhanVienBLL();
        Nm = nV.takeMaNhomMauBLL(takeNm);
    }//GEN-LAST:event_cbNhomMauItemStateChanged

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
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancel;
    private javax.swing.JButton btChonAnh;
    private javax.swing.JButton btSave;
    private javax.swing.JComboBox<String> cbDanToc;
    private javax.swing.JComboBox<String> cbGioiTinh;
    private javax.swing.JComboBox<String> cbHonNhan;
    private javax.swing.JComboBox<String> cbNhomMau;
    private javax.swing.JComboBox<String> cbQuanHuyen;
    private javax.swing.JComboBox<String> cbQuocTich;
    private javax.swing.JComboBox<String> cbSucKhoe;
    private javax.swing.JComboBox<String> cbTPho;
    private javax.swing.JComboBox<String> cbTinh;
    private javax.swing.JComboBox<String> cbTonGiao;
    private javax.swing.JComboBox<String> cbUuTienBT;
    private javax.swing.JComboBox<String> cbUuTienGĐ;
    private javax.swing.JComboBox<String> cbXuatThan;
    private javax.swing.JCheckBox checkHoatDong;
    private com.toedter.calendar.JDateChooser jDBHXH;
    private com.toedter.calendar.JDateChooser jDDNCuoi;
    private com.toedter.calendar.JDateChooser jDNgayCap;
    private com.toedter.calendar.JDateChooser jDNgaySinh;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jpMatKhau;
    private javax.swing.JPasswordField jpNhapLaiMK;
    private javax.swing.JLabel lbAnh;
    private javax.swing.JTextField tfCMND;
    private javax.swing.JTextField tfCanNang;
    private javax.swing.JTextField tfChieuCao;
    private javax.swing.JTextField tfDTCoQuan;
    private javax.swing.JTextField tfDTDĐ;
    private javax.swing.JTextField tfDTNR;
    private javax.swing.JTextField tfDiaChiHT;
    private javax.swing.JTextField tfDiaChiTC;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfHoTen;
    private javax.swing.JTextField tfKhuyetTat;
    private javax.swing.JTextField tfNangKhieu;
    private javax.swing.JTextField tfNganHangMoTK;
    private javax.swing.JTextField tfNoiCap;
    private javax.swing.JTextField tfNoiSinh;
    private javax.swing.JTextField tfPhuong;
    private javax.swing.JTextField tfSoHieu;
    private javax.swing.JTextField tfSoSoBH;
    private javax.swing.JTextField tfSoTaiKhoan;
    private javax.swing.JTextField tfTenDangNhap;
    private javax.swing.JTextField tfTenGoiKhac;
    private javax.swing.JTextField tfTenTat;
    // End of variables declaration//GEN-END:variables
}
