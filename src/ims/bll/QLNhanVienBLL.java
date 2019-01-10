/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ims.bll;

import ims.dal.QLNhanVienDAL;
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
import java.sql.Date;
import java.util.ArrayList;
import javax.swing.JComboBox;


/**
 *
 * @author AigYuh
 */
public class QLNhanVienBLL {
         QLNhanVienDAL dal = new QLNhanVienDAL();
     public ArrayList<NhanVien> readNhanVienBLL() {
         ArrayList<NhanVien> listNhanVien = new ArrayList<>();
         listNhanVien = dal.readNhanVienDAL();
         return listNhanVien;
     }
     
     public ArrayList<GioiTinh> readGioiTinhBLL() {
         ArrayList<GioiTinh> listGT = new ArrayList<>();
         listGT = dal.readGioiTinhDAL();
         return listGT;
     }
     
     public ArrayList<DanToc> readDanTocBLL() {
         ArrayList<DanToc> listDT = new ArrayList<>();
         listDT = dal.readDanTocDAL();
         return listDT;
     }
     
     public ArrayList<TonGiao> readTonGiaoBLL() {
         ArrayList<TonGiao> listTG = new ArrayList<>();
         listTG = dal.readTonGiaoDAL();
         return listTG;
     }
     
     public ArrayList<QuocTich> readQuocTichBLL() {
         ArrayList<QuocTich> listQT = new ArrayList<>();
         listQT = dal.readQuocTichDAL();
         return listQT;
     }
     public ArrayList<Tinh> readTinhBLL() {
         ArrayList<Tinh> listT = new ArrayList<>();
         listT = dal.readTinhDAL();
         return listT;
     }
     public ArrayList<ThanhPho> readThanhPhoBLL() {
         ArrayList<ThanhPho> listTP = new ArrayList<>();
         listTP = dal.readThanhPhoDAL();
         return listTP;
     }
     public ArrayList<Phuong> readPhuongBLL() {
         ArrayList<Phuong> listP = new ArrayList<>();
         listP = dal.readPhuongDAL();
         return listP;
     }
     public ArrayList<HonNhan> readHonNhanBLL() {
         ArrayList<HonNhan> listHN = new ArrayList<>();
         listHN = dal.readHonNhanDAL();
         return listHN;
     }
     public ArrayList<TpXuatThan> readTpXuatThanBLL() {
         ArrayList<TpXuatThan> listXT = new ArrayList<>();
         listXT = dal.readTpXuatThanDAL();
         return listXT;
     }
     public ArrayList<UuTienBT> readUuTienBTBLL() {
         ArrayList<UuTienBT> listBT = new ArrayList<>();
         listBT = dal.readUuTienBTDAL();
         return listBT;
     }
     public ArrayList<UuTienGD> readUuTienGDBLL() {
         ArrayList<UuTienGD> listGD = new ArrayList<>();
         listGD = dal.readUuTienGDDAL();
         return listGD;
     }
     public ArrayList<SucKhoe> readSucKhoeBLL() {
         ArrayList<SucKhoe> listSK = new ArrayList<>();
         listSK = dal.readSucKhoeDAL();
         return listSK;
     }
     
     public ArrayList<NhomMau> readNhomMauBLL() {
         ArrayList<NhomMau> listNM = new ArrayList<>();
         listNM = dal.readNhomMauDAL();
         return listNM;
     }
     
public void addNewNhanVienBLL(NhanVien nhanVien) {
        dal.addNewNhanVienDAL(nhanVien);
    }

public GioiTinh takeMaGioiTinhBLL(String loaiGioiTinh) {
         GioiTinh GT = new GioiTinh();
         GT = dal.takeMaGioiTinhDAL(loaiGioiTinh);
         return GT;
     }

public DanToc takeMaDanTocBLL(String loaiDanToc) {
         DanToc Dt = new DanToc();
         Dt = dal.takeMaDanTocDAL(loaiDanToc);
         return Dt;
     }

public TonGiao takeMaTonGiaoBLL(String loaiTonGiao) {
         TonGiao Tgi = new TonGiao();
         Tgi = dal.takeMaTonGiaoDAL(loaiTonGiao);
         return Tgi;
     }

public QuocTich takeMaQuocTichBLL(String loaiQuocTich) {
         QuocTich Qt = new QuocTich();
         Qt = dal.takeMaQuocTichDAL(loaiQuocTich);
         return Qt;
     }

public Tinh takeMaTinhBLL(String maTinh) {
         Tinh T = new Tinh();
         T = dal.takeMaTinhDAL(maTinh);
         return T;
     }

public ThanhPho takeMaThanhPhoBLL(String loaiThanhPho) {
        ThanhPho Tp = new ThanhPho();
         Tp = dal.takeMaThanhPhoDAL(loaiThanhPho);
         return Tp;
     }

public Phuong takeMaPhuongBLL(String loaiPhuong) {
         Phuong P = new Phuong();
         P = dal.takeMaPhuongDAL(loaiPhuong);
         return P;
     }

public HonNhan takeMaHonNhanBLL(String loaiHonNhan) {
         HonNhan Hn = new HonNhan();
         Hn = dal.takeMaHonNhanDAL(loaiHonNhan);
         return Hn;
     }

public TpXuatThan takeMaTpXuatThanBLL(String loaiTpXuatThan) {
         TpXuatThan Xt = new TpXuatThan();
         Xt = dal.takeMaTpXuatThanDAL(loaiTpXuatThan);
         return Xt;
     }

public UuTienGD takeMaUuTienGDBLL(String loaiUuTienGD) {
         UuTienGD GD = new UuTienGD();
         GD = dal.takeMaUuTienGDDAL(loaiUuTienGD);
         return GD;
     }

public UuTienBT takeMaUuTienBTBLL(String loaiUuTienBT) {
         UuTienBT Bt = new UuTienBT();
         Bt = dal.takeMaUuTienBTDAL(loaiUuTienBT);
         return Bt;
     }

public SucKhoe takeMaSucKhoeBLL(String loaiSucKhoe) {
         SucKhoe Sk = new SucKhoe();
         Sk = dal.takeMaSucKhoeDAL(loaiSucKhoe);
         return Sk;
     }

public NhomMau takeMaNhomMauBLL(String loaiNhomMau) {
        NhomMau Nm = new NhomMau();
         Nm = dal.takeMaNhomMauDAL(loaiNhomMau);
         return Nm;
     }

  //------------------------------Xóa
public void deleteNhanVienBLL(String id) {
        dal.deleteNhanVienDAL(id);
    }
}
