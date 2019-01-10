/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims.dto;

import com.mysql.jdbc.Blob;
import java.util.Date;

/**
 *
 * @author MSI
 */
public class NhanVien {
    private String MaNV;
    byte[] imgByte;
    private String img;
    private String TenNV;
    private String TenDN;
    private String Matkhau;
    private String TenKhac;
    private String Ngaysinh;
    private String MaGT;
    private String GT;
    private String Noisinh;
    private String DNCuoi;
    private String sohieuCC;
    private String hoatdong;
    private String CMND;
    private String ngaycap;
    private String noicap;
    private String tentat;
    private String MaDT;
    private String MaTG;
    private String MaQT;
    private String MaTinh;
    private String MaTP;
    private String MaPhuong;
    private String ThonXom;
    private String DiaChi;
    private String NoiOHT;
    private String DTCQ;
    private String DTNR;
    private String DTDD;
    private String Email;
    private String MaHN;
    private String MaTPXT;
    private String MaUTBT;
    private String MaUTGD;
    private String NangKhieu;
    private String MaSK;
    private String MaNM;
    private int ChieuCao;
    private int CanNang;
    private String KhuyetTat;
    private String SoTK;
    private String NHMTK;
    private String NgayDongBHXH;
    private String SoBHXH;

    public NhanVien() {
    }

    public NhanVien(String MaNV, String img, String TenNV, String TenDN, String Matkhau, String TenKhac, String Ngaysinh, String MaGT, String GT, String Noisinh, String DNCuoi, String sohieuCC, String hoatdong, String CMND, String ngaycap, String noicap, String tentat, String MaDT, String MaTG, String MaQT, String MaTinh, String MaTP, String MaPhuong, String ThonXom, String DiaChi, String NoiOHT, String DTCQ, String DTNR, String DTDD, String Email, String MaHN, String MaTPXT, String MaUTBT, String MaUTGD, String NangKhieu, String MaSK, String MaNM, int ChieuCao, int CanNang, String KhuyetTat, String SoTK, String NHMTK, String NgayDongBHXH, String SoBHXH) {
        this.MaNV = MaNV;
        this.img = img;
        this.TenNV = TenNV;
        this.TenDN = TenDN;
        this.Matkhau = Matkhau;
        this.TenKhac = TenKhac;
        this.Ngaysinh = Ngaysinh;
        this.MaGT = MaGT;
        this.GT = GT;
        this.Noisinh = Noisinh;
        this.DNCuoi = DNCuoi;
        this.sohieuCC = sohieuCC;
        this.hoatdong = hoatdong;
        this.CMND = CMND;
        this.ngaycap = ngaycap;
        this.noicap = noicap;
        this.tentat = tentat;
        this.MaDT = MaDT;
        this.MaTG = MaTG;
        this.MaQT = MaQT;
        this.MaTinh = MaTinh;
        this.MaTP = MaTP;
        this.MaPhuong = MaPhuong;
        this.ThonXom = ThonXom;
        this.DiaChi = DiaChi;
        this.NoiOHT = NoiOHT;
        this.DTCQ = DTCQ;
        this.DTNR = DTNR;
        this.DTDD = DTDD;
        this.Email = Email;
        this.MaHN = MaHN;
        this.MaTPXT = MaTPXT;
        this.MaUTBT = MaUTBT;
        this.MaUTGD = MaUTGD;
        this.NangKhieu = NangKhieu;
        this.MaSK = MaSK;
        this.MaNM = MaNM;
        this.ChieuCao = ChieuCao;
        this.CanNang = CanNang;
        this.KhuyetTat = KhuyetTat;
        this.SoTK = SoTK;
        this.NHMTK = NHMTK;
        this.NgayDongBHXH = NgayDongBHXH;
        this.SoBHXH = SoBHXH;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getImgByte() {
        return img;
    }

    public void setImgByte(String img) {
        this.img = img;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getTenNV() {
        return TenNV;
    }

    public void setTenNV(String TenNV) {
        this.TenNV = TenNV;
    }

    public String getTenDN() {
        return TenDN;
    }

    public void setTenDN(String TenDN) {
        this.TenDN = TenDN;
    }

    public String getMatkhau() {
        return Matkhau;
    }

    public void setMatkhau(String Matkhau) {
        this.Matkhau = Matkhau;
    }

    public String getTenKhac() {
        return TenKhac;
    }

    public void setTenKhac(String TenKhac) {
        this.TenKhac = TenKhac;
    }

    public String getNgaysinh() {
        return Ngaysinh;
    }

    public void setNgaysinh(String Ngaysinh) {
        this.Ngaysinh = Ngaysinh;
    }

    public String getMaGT() {
        return MaGT;
    }

    public void setMaGT(String MaGT) {
        this.MaGT = MaGT;
    }

    public String getGT() {
        return GT;
    }

    public void setGT(String GT) {
        this.GT = GT;
    }

    public String getNoisinh() {
        return Noisinh;
    }

    public void setNoisinh(String Noisinh) {
        this.Noisinh = Noisinh;
    }

    public String getDNCuoi() {
        return DNCuoi;
    }

    public void setDNCuoi(String DNCuoi) {
        this.DNCuoi = DNCuoi;
    }

    public String getSohieuCC() {
        return sohieuCC;
    }

    public void setSohieuCC(String sohieuCC) {
        this.sohieuCC = sohieuCC;
    }

    public String getHoatdong() {
        return hoatdong;
    }

    public void setHoatdong(String hoatdong) {
        this.hoatdong = hoatdong;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public String getNgaycap() {
        return ngaycap;
    }

    public void setNgaycap(String ngaycap) {
        this.ngaycap = ngaycap;
    }

    public String getNoicap() {
        return noicap;
    }

    public void setNoicap(String noicap) {
        this.noicap = noicap;
    }

    public String getTentat() {
        return tentat;
    }

    public void setTentat(String tentat) {
        this.tentat = tentat;
    }

    public String getMaDT() {
        return MaDT;
    }

    public void setMaDT(String MaDT) {
        this.MaDT = MaDT;
    }

    public String getMaTG() {
        return MaTG;
    }

    public void setMaTG(String MaTG) {
        this.MaTG = MaTG;
    }

    public String getMaQT() {
        return MaQT;
    }

    public void setMaQT(String MaQT) {
        this.MaQT = MaQT;
    }

    public String getMaTinh() {
        return MaTinh;
    }

    public void setMaTinh(String MaTinh) {
        this.MaTinh = MaTinh;
    }

    public String getMaTP() {
        return MaTP;
    }

    public void setMaTP(String MaTP) {
        this.MaTP = MaTP;
    }

    public String getMaPhuong() {
        return MaPhuong;
    }

    public void setMaPhuong(String MaPhuong) {
        this.MaPhuong = MaPhuong;
    }

    public String getThonXom() {
        return ThonXom;
    }

    public void setThonXom(String ThonXom) {
        this.ThonXom = ThonXom;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getNoiOHT() {
        return NoiOHT;
    }

    public void setNoiOHT(String NoiOHT) {
        this.NoiOHT = NoiOHT;
    }

    public String getDTCQ() {
        return DTCQ;
    }

    public void setDTCQ(String DTCQ) {
        this.DTCQ = DTCQ;
    }

    public String getDTNR() {
        return DTNR;
    }

    public void setDTNR(String DTNR) {
        this.DTNR = DTNR;
    }

    public String getDTDD() {
        return DTDD;
    }

    public void setDTDD(String DTDD) {
        this.DTDD = DTDD;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getMaHN() {
        return MaHN;
    }

    public void setMaHN(String MaHN) {
        this.MaHN = MaHN;
    }

    public String getMaTPXT() {
        return MaTPXT;
    }

    public void setMaTPXT(String MaTPXT) {
        this.MaTPXT = MaTPXT;
    }

    public String getMaUTBT() {
        return MaUTBT;
    }

    public void setMaUTBT(String MaUTBT) {
        this.MaUTBT = MaUTBT;
    }

    public String getMaUTGD() {
        return MaUTGD;
    }

    public void setMaUTGD(String MaUTGD) {
        this.MaUTGD = MaUTGD;
    }

    public String getNangKhieu() {
        return NangKhieu;
    }

    public void setNangKhieu(String NangKhieu) {
        this.NangKhieu = NangKhieu;
    }

    public String getMaSK() {
        return MaSK;
    }

    public void setMaSK(String MaSK) {
        this.MaSK = MaSK;
    }

    public String getMaNM() {
        return MaNM;
    }

    public void setMaNM(String MaNM) {
        this.MaNM = MaNM;
    }

    public int getChieuCao() {
        return ChieuCao;
    }

    public void setChieuCao(int ChieuCao) {
        this.ChieuCao = ChieuCao;
    }

    public int getCanNang() {
        return CanNang;
    }

    public void setCanNang(int CanNang) {
        this.CanNang = CanNang;
    }

    public String getKhuyetTat() {
        return KhuyetTat;
    }

    public void setKhuyetTat(String KhuyetTat) {
        this.KhuyetTat = KhuyetTat;
    }

    public String getSoTK() {
        return SoTK;
    }

    public void setSoTK(String SoTK) {
        this.SoTK = SoTK;
    }

    public String getNHMTK() {
        return NHMTK;
    }

    public void setNHMTK(String NHMTK) {
        this.NHMTK = NHMTK;
    }

    public String getNgayDongBHXH() {
        return NgayDongBHXH;
    }

    public void setNgayDongBHXH(String NgayDongBHXH) {
        this.NgayDongBHXH = NgayDongBHXH;
    }

    public String getSoBHXH() {
        return SoBHXH;
    }

    public void setSoBHXH(String SoBHXH) {
        this.SoBHXH = SoBHXH;
    }

    
    
    
    
}
