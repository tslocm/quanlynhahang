package com.iuh.quanlynhahang.guis;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class KhachHang extends JFrame {

	public JPanel contentPane;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					KhachHang frame = new KhachHang();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	private JTable table;
	private DefaultTableModel tableModel;
	private JScrollPane scrollPane;
	private JLabel lblDanhSchKhch;
	private JPanel panel;
	private JPanel panel_1;
	private JLabel lblThngTinKhch;
	private JLabel lblMKhchHng;
	private JLabel lblTnKhchHng;
	private JLabel lblMKhchHng_2;
	private JLabel lblMKhchHng_3;
	private JLabel lblMKhchHng_4;
	private JLabel lblMKhchHng_5;
	private JLabel lblMKhchHng_1;
	private JLabel lblMKhchHng_6;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_2;
	public KhachHang() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(100, 100, 1100, 650);
		setSize(1100, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		contentPane.setLayout(null);
		
		JLabel lblKhchHng = new JLabel("Kh??ch H??ng");
		lblKhchHng.setBounds(506, 5, 101, 24);
		lblKhchHng.setForeground(Color.RED);
		lblKhchHng.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		contentPane.add(lblKhchHng);
		
		
		
		String[] header = "M?? Kh??ch H??ng;?????a Ch???;Gi???i T??nh;Ng??y Sinh;S??? ??i???n Tho???i;T??nh Tr???ng".split(";");
		tableModel = new DefaultTableModel(header, 0);
		 scrollPane = new JScrollPane(table = new JTable(tableModel), JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		contentPane.add(scrollPane);
		scrollPane.setBounds(10, 95, 637, 391);
		
		lblDanhSchKhch = new JLabel("Danh S??ch Kh??ch H??ng :");
		lblDanhSchKhch.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblDanhSchKhch.setBounds(10, 61, 206, 24);
		contentPane.add(lblDanhSchKhch);
		
		panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(192, 192, 192)), "T\u00ECm Ki\u1EBFm Kh\u00E1ch H\u00E0ng", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 496, 637, 117);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnTimKiem = new JButton("T??m Ki???m");
		btnTimKiem.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnTimKiem.setBounds(523, 43, 104, 29);
		panel.add(btnTimKiem);
		
		JLabel lblNhpSin = new JLabel("Nh???p S??? ??i???n Tho???i :");
		lblNhpSin.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNhpSin.setBounds(10, 45, 138, 24);
		panel.add(lblNhpSin);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(160, 47, 238, 24);
		panel.add(textField_2);
		
		panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(Color.LIGHT_GRAY));
		panel_1.setBounds(657, 61, 419, 425);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		lblThngTinKhch = new JLabel("Th??ng Tin Kh??ch H??ng");
		lblThngTinKhch.setForeground(new Color(0, 0, 0));
		lblThngTinKhch.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblThngTinKhch.setBounds(120, 10, 221, 24);
		panel_1.add(lblThngTinKhch);
		
		lblMKhchHng = new JLabel("M?? Kh??ch H??ng : 1");
		lblMKhchHng.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblMKhchHng.setBounds(10, 67, 138, 24);
		panel_1.add(lblMKhchHng);
		
		lblTnKhchHng = new JLabel("T??n Kh??ch H??ng :");
		lblTnKhchHng.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblTnKhchHng.setBounds(10, 117, 120, 24);
		panel_1.add(lblTnKhchHng);
		
		lblMKhchHng_2 = new JLabel("?????a Ch??? :");
		lblMKhchHng_2.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblMKhchHng_2.setBounds(10, 167, 120, 24);
		panel_1.add(lblMKhchHng_2);
		
		lblMKhchHng_3 = new JLabel("Gi???i T??nh :");
		lblMKhchHng_3.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblMKhchHng_3.setBounds(10, 217, 138, 24);
		panel_1.add(lblMKhchHng_3);
		
		lblMKhchHng_4 = new JLabel("Ng??y Sinh :");
		lblMKhchHng_4.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblMKhchHng_4.setBounds(10, 267, 138, 24);
		panel_1.add(lblMKhchHng_4);
		
		lblMKhchHng_5 = new JLabel("T??nh Tr???ng :");
		lblMKhchHng_5.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblMKhchHng_5.setBounds(271, 67, 138, 24);
		panel_1.add(lblMKhchHng_5);
		
		lblMKhchHng_1 = new JLabel("S??? ??i???n Tho???i :");
		lblMKhchHng_1.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblMKhchHng_1.setBounds(10, 317, 138, 24);
		panel_1.add(lblMKhchHng_1);
		
		lblMKhchHng_6 = new JLabel("Email :");
		lblMKhchHng_6.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblMKhchHng_6.setBounds(10, 367, 138, 24);
		panel_1.add(lblMKhchHng_6);
		
		textField = new JTextField();
		textField.setBounds(140, 119, 238, 24);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(140, 169, 238, 24);
		panel_1.add(textField_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(140, 271, 238, 24);
		panel_1.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(140, 321, 238, 24);
		panel_1.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(140, 361, 238, 24);
		panel_1.add(textField_5);
		
		JRadioButton rdbNam = new JRadioButton("Nam");
		rdbNam.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		rdbNam.setBounds(140, 220, 65, 21);
		panel_1.add(rdbNam);
		
		JRadioButton rdbNu = new JRadioButton("N???");
		rdbNu.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		rdbNu.setBounds(220, 220, 65, 21);
		panel_1.add(rdbNu);
		
		JRadioButton rdbKhac = new JRadioButton("Kh??c");
		rdbKhac.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		rdbKhac.setBounds(297, 220, 65, 21);
		panel_1.add(rdbKhac);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(new LineBorder(new Color(192, 192, 192)), "Thao T\u00E1c", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(657, 496, 419, 117);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnXoaRong = new JButton("X??a R???ng");
		btnXoaRong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnXoaRong.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnXoaRong.setBounds(10, 43, 104, 29);
		panel_2.add(btnXoaRong);
		
		JButton btnThem = new JButton("Th??m");
		btnThem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnThem.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnThem.setBounds(157, 43, 104, 29);
		panel_2.add(btnThem);
		
		JButton btnCapNhat = new JButton("C???p Nh???t");
		btnCapNhat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCapNhat.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnCapNhat.setBounds(305, 43, 104, 29);
		panel_2.add(btnCapNhat);
	}
}
