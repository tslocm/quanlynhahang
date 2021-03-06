package com.iuh.quanlynhahang.guis;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import javax.swing.JToolBar;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;

public class TrangChu extends JFrame implements ActionListener{

	private static TrangChu frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new TrangChu();
					frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	private JMenuBar menuBar;
	private JMenu mnTaiKhoan, mnQuanLy, mnThongKe, mnTimKiem, mnBaoCao, mnThongKeDoUong,
			mnThongKeKhachHang;
	private JMenuItem mniThongTinTaiKhoan, mniDangXuat, mniQuanLyKhachHang, mniQuanLyNhanVien, mniQuanLyTaiKhoan,
			mniQuanLyBan, mniQuanLySanh, mniQuanLyMonAn;
	private JMenuItem mniTimKiemKhachHang, mniTimKiemNhanVien, mniTimKiemMonAn, mniTimKiemTaiKhoan, mniTimKiemBan,
			mniTimKiemHoaDon;
	private JMenuItem mniDoUongBanChay, mniDenNhieuNhat, mniSoBillCaoNhat, mniThongKeDoanhThu, mnBaoCaoDoUong,
			mniDoUongBanChay_1, mniDoUongBanIt_1, mniBaoCaoDoanhThu, mniBaoCaoKhachHang, mniDenNhieuNhat_1,
			mniSoBillCaoNhat_1;
	private JMenu mnDatBanTiec;
	private JMenuItem mniDatBan;

	public TrangChu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(100, 100, 1100, 650);
		setSize(1100, 650);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 1162, 63);
		getContentPane().add(menuBar);

		mnTaiKhoan = new JMenu("T??i Kho???n");
		menuBar.add(mnTaiKhoan);

		mniThongTinTaiKhoan = new JMenuItem("Th??ng Tin T??i Kho???n");
		mnTaiKhoan.add(mniThongTinTaiKhoan);

		mniDangXuat = new JMenuItem("????ng Xu???t");
		mnTaiKhoan.add(mniDangXuat);

		mnQuanLy = new JMenu("Danh M???c");
		menuBar.add(mnQuanLy);

		mniQuanLyKhachHang = new JMenuItem("Qu???n L?? T??i Kho???n");
		mnQuanLy.add(mniQuanLyKhachHang);

		mniQuanLyNhanVien = new JMenuItem("Qu???n L?? Nh??n Vi??n");
		mnQuanLy.add(mniQuanLyNhanVien);
		mniQuanLyNhanVien.addActionListener(this);
		
		mniQuanLyBan = new JMenuItem("Qu???n L?? B??n");
		mnQuanLy.add(mniQuanLyBan);

		mniQuanLySanh = new JMenuItem("Qu???n L?? S???nh");
		mnQuanLy.add(mniQuanLySanh);

		mniQuanLyMonAn = new JMenuItem("Qu???n L?? M??n ??n");
		mnQuanLy.add(mniQuanLyMonAn);

		mniQuanLyTaiKhoan = new JMenuItem("Qu???n L?? T??i Kho???n");
		mnQuanLy.add(mniQuanLyTaiKhoan);
		mniQuanLyTaiKhoan.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				TaiKhoan tk= new TaiKhoan();
				tk.setVisible(true);
			}
		});

		mnTimKiem = new JMenu("T??m Ki???m");
		menuBar.add(mnTimKiem);

		mniTimKiemKhachHang = new JMenuItem("T??m Ki???m Kh??ch H??ng");
		mnTimKiem.add(mniTimKiemKhachHang);

		mniTimKiemNhanVien = new JMenuItem("T??m Ki???m Nh??n Vi??n");
		mnTimKiem.add(mniTimKiemNhanVien);

		mniTimKiemMonAn = new JMenuItem("T??m Ki???m M??n ??n");
		mnTimKiem.add(mniTimKiemMonAn);

		mniTimKiemBan = new JMenuItem("T??m Ki???m B??n");
		mnTimKiem.add(mniTimKiemBan);

		mniTimKiemHoaDon = new JMenuItem("T??m Ki???m H??a ????n");
		mnTimKiem.add(mniTimKiemHoaDon);

		mniTimKiemTaiKhoan = new JMenuItem("T??m Ki???m T??i Kho???n");
		mnTimKiem.add(mniTimKiemTaiKhoan);
		mniTimKiemTaiKhoan.addActionListener(this);

		mnThongKe = new JMenu("Th???ng K??");
		menuBar.add(mnThongKe);

		mnThongKeDoUong = new JMenu("Th???ng K?? ????? U???ng");
		mnThongKe.add(mnThongKeDoUong);

		mniDoUongBanChay = new JMenuItem("B??n Ch???y Nh???t");
		mnThongKeDoUong.add(mniDoUongBanChay);

		JMenuItem mniDoUongBanIt = new JMenuItem("B??n ??t Nh???t");
		mnThongKeDoUong.add(mniDoUongBanIt);

		JMenu mnThongKeKhachHang = new JMenu("Th???ng K?? Kh??ch H??ng");
		mnThongKe.add(mnThongKeKhachHang);

		mniDenNhieuNhat = new JMenuItem("?????n Nhi???u Nh???t");
		mnThongKeKhachHang.add(mniDenNhieuNhat);

		mniSoBillCaoNhat = new JMenuItem("C?? S??? Bill Cao Nh???t");
		mnThongKeKhachHang.add(mniSoBillCaoNhat);

		mniThongKeDoanhThu = new JMenuItem("Th???ng K?? Doanh Thu");
		mnThongKe.add(mniThongKeDoanhThu);

		mnBaoCao = new JMenu("B??o C??o");
		menuBar.add(mnBaoCao);

		mnBaoCaoDoUong = new JMenu("B??o C??o ????? U???ng");
		mnBaoCao.add(mnBaoCaoDoUong);

		mniDoUongBanChay_1 = new JMenuItem("B??n Ch???y Nh???t");
		mnBaoCaoDoUong.add(mniDoUongBanChay_1);

		mniDoUongBanIt_1 = new JMenuItem("B??n ??t Nh???t");
		mnBaoCaoDoUong.add(mniDoUongBanIt_1);

		mniBaoCaoDoanhThu = new JMenuItem("B??o C??o Doanh Thu");
		mnBaoCao.add(mniBaoCaoDoanhThu);

		mniBaoCaoKhachHang = new JMenu("B??o C??o Kh??ch H??ng");
		mnBaoCao.add(mniBaoCaoKhachHang);

		mniDenNhieuNhat_1 = new JMenuItem("?????n Nhi???u Nh???t");
		mniBaoCaoKhachHang.add(mniDenNhieuNhat_1);

		mniSoBillCaoNhat_1 = new JMenuItem("C?? S??? Bill Cao Nh???t");
		mniBaoCaoKhachHang.add(mniSoBillCaoNhat_1);
		
		mnDatBanTiec = new JMenu("?????t B??n Ti???c");
		menuBar.add(mnDatBanTiec);
		
		mniDatBan = new JMenuItem("?????t B??n");
		mnDatBanTiec.add(mniDatBan);
		mniDatBan.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				DatBanTiec frmdatBanTiec=new DatBanTiec();
				frmdatBanTiec.setVisible(true);
				
			}
		});

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		if(o.equals(mnDatBanTiec)) {
			System.out.println("ADAD");
			DatBanTiec frmdatBanTiec=new DatBanTiec();
			frmdatBanTiec.setVisible(true);
		}else if(o.equals(mniTimKiemTaiKhoan)) {
			System.out.println("ADADA");
		}else if(o.equals(mniQuanLyNhanVien)) {
			NhanVien frmNV=new NhanVien();
			frmNV.setVisible(true);
			System.out.println("ADADA");
		}
		
	}
}
