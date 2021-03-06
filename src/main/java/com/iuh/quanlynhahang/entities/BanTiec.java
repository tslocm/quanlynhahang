package com.iuh.quanlynhahang.entities;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: DatMon
 *
 */
@Entity
@Table(name = "DatBanTiec")
public class BanTiec implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	private String maBanTiec;
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "maKhachhang")
	private KhachHang khachHang;

//	@ManyToMany(cascade = CascadeType.ALL)
//	@JoinTable(name = "DatBanTiec_Ban", joinColumns = @JoinColumn(name = "maBanTiec", referencedColumnName = "maBanTiec"), inverseJoinColumns = @JoinColumn(name = "maMon", referencedColumnName = "maMon"))
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "maBanTiec")
	private Set<Ban> bans;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "DatBanTiec_Mon", joinColumns = @JoinColumn(name = "maBanTiec", referencedColumnName = "maBanTiec"), inverseJoinColumns = @JoinColumn(name = "maMon", referencedColumnName = "maMon"))
	private Set<Mon> monAns;
	private LocalDate ngayDatMon;
	private LocalDate ngaySuDung;
	private String gioSuDung;
	private String loaiBanTiec;
	private int soLuongNguoi;

	public BanTiec() {
		super();
	}

	public String getMaBanTiec() {
		return maBanTiec;
	}

	public void setMaBanTiec(String maBanTiec) {
		this.maBanTiec = maBanTiec;
	}

	public KhachHang getKhachHang() {
		return khachHang;
	}

	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}

//	public Set<Ban> getBans() {
//		return bans;
//	}
//
//	public void setBans(Set<Ban> bans) {
//		this.bans = bans;
//	}
//
//	public Set<Mon> getMonAns() {
//		return monAns;
//	}
//
//	public void setMonAns(Set<Mon> monAns) {
//		this.monAns = monAns;
//	}

	public LocalDate getNgayDatMon() {
		return ngayDatMon;
	}

	public void setNgayDatMon(LocalDate ngayDatMon) {
		this.ngayDatMon = ngayDatMon;
	}

	public LocalDate getNgaySuDung() {
		return ngaySuDung;
	}

	public void setNgaySuDung(LocalDate ngaySuDung) {
		this.ngaySuDung = ngaySuDung;
	}

	public String getGioSuDung() {
		return gioSuDung;
	}

	public void setGioSuDung(String gioSuDung) {
		this.gioSuDung = gioSuDung;
	}

	public String getLoaiBanTiec() {
		return loaiBanTiec;
	}

	public void setLoaiBanTiec(String loaiBanTiec) {
		this.loaiBanTiec = loaiBanTiec;
	}

	public int getSoLuongNguoi() {
		return soLuongNguoi;
	}

	public void setSoLuongNguoi(int soLuongNguoi) {
		this.soLuongNguoi = soLuongNguoi;
	}

}
