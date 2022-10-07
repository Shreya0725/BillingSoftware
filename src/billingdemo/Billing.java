package billingdemo;

import java.awt.EventQueue;
import project.ConnectionProvider;
import java.util.*;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
public class Billing extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTable table;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JLabel lblNewLabel_20;
	private JLabel lblNewLabel_21;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Billing frame = new Billing();
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
	public Billing() {
	
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 812, 446);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Billing");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel.setBounds(104, 0, 146, 68);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Shreya\\Downloads\\Bms Icon Jframe\\bms\\billing.png"));
		lblNewLabel_1.setBounds(30, 8, 64, 60);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Date:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(604, 19, 49, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Time:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(604, 44, 49, 14);
		contentPane.add(lblNewLabel_3);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(40, 68, 743, 2);
		contentPane.add(separator);
		
		JLabel lblNewLabel_4 = new JLabel("Buyer Details:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4.setBounds(10, 68, 180, 30);
		contentPane.add(lblNewLabel_4);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(40, 168, 738, 2);
		contentPane.add(separator_1);
		
		JLabel lblNewLabel_5 = new JLabel("Product Details:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_5.setBounds(10, 171, 180, 30);
		contentPane.add(lblNewLabel_5);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(40, 274, 743, 2);
		contentPane.add(separator_2);
		
		JLabel lblNewLabel_6 = new JLabel("Name");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(30, 102, 49, 30);
		contentPane.add(lblNewLabel_6);
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name = textField.getText();
				try
				{
					Connection con = ConnectionProvider.getCon();
					Statement s = con.createStatement();
					ResultSet rs = s.executeQuery("select * from login where name like '"+name+"%'");
					if(rs.next())
					{
						textField.setText(rs.getString(1));
						textField_1.setText(rs.getString(2));
						textField_2.setText(rs.getString(3));
						textField_3.setText(rs.getString(4));
					}
					else
					{
						textField_1.setText("");
						textField_2.setText("");
						textField_3.setText("");
					}
				}
				catch(Exception ee)
				{
					JOptionPane.showMessageDialog(null, ee);
				}
			}
		});
		textField.setBounds(110, 109, 180, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("ContactNo");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_7.setBounds(30, 143, 71, 14);
		contentPane.add(lblNewLabel_7);
		
		textField_1 = new JTextField();
		textField_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String contactNo = textField_1.getText();
				try
				{
					Connection con = ConnectionProvider.getCon();
					Statement s = con.createStatement();
					ResultSet rs = s.executeQuery("select * from login where contactNo like '"+contactNo+"%'");
					if(rs.next())
					{
						textField_1.setText(rs.getString(2));
						textField.setText(rs.getString(1));
						textField_2.setText(rs.getString(3));
						textField_3.setText(rs.getString(4));
					}
					else
					{
						textField.setText("");
						textField_2.setText("");
						textField_3.setText("");
					}
				}
				catch(Exception ee)
				{
					JOptionPane.showMessageDialog(null, ee);
				}
			}
		});
		textField_1.setBounds(109, 140, 181, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Email");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_8.setBounds(389, 112, 49, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Address");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_9.setBounds(389, 143, 49, 14);
		contentPane.add(lblNewLabel_9);
		
		textField_2 = new JTextField();
		textField_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String email = textField_2.getText();
				try
				{
					Connection con = ConnectionProvider.getCon();
					Statement s = con.createStatement();
					ResultSet rs = s.executeQuery("select * from login where email like '"+email+"%'");
					if(rs.next())
					{
						textField.setText(rs.getString(1));
						textField_1.setText(rs.getString(2));
						textField_2.setText(rs.getString(3));
						textField_3.setText(rs.getString(4));
					}
					else
					{
						textField.setText("");
						textField_2.setText("");
						textField_3.setText("");
					}
				}
				catch(Exception ee)
				{
					JOptionPane.showMessageDialog(null, ee);
				}
			}
		});
		textField_2.setBounds(456, 109, 167, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String address = textField_3.getText();
				try
				{
					Connection con = ConnectionProvider.getCon();
					Statement s = con.createStatement();
					ResultSet rs = s.executeQuery("select * from login where address like '"+address+"%'");
					if(rs.next())
					{
						textField.setText(rs.getString(1));
						textField_1.setText(rs.getString(2));
						textField_2.setText(rs.getString(3));
						textField_3.setText(rs.getString(4));
					}
					else
					{
						textField.setText("");
						textField_2.setText("");
						textField_3.setText("");
					}
				}
				catch(Exception ee)
				{
					JOptionPane.showMessageDialog(null, ee);
				}
			}
		});
		textField_3.setBounds(456, 142, 167, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Product ID");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_10.setBounds(20, 212, 74, 14);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Product Name");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_11.setBounds(10, 249, 99, 14);
		contentPane.add(lblNewLabel_11);
		
		textField_4 = new JTextField();
		textField_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String pID = textField_4.getText();
				try
				{
					Connection con = ConnectionProvider.getCon();
					Statement s = con.createStatement();
					ResultSet rs = s.executeQuery("select * from item where pID = '"+pID+"'");
					if(rs.next())
					{
						textField_5.setText(rs.getString(2));
						textField_6.setText(rs.getString(3));
						textField_7.setText("1");
						textField_8.setText(rs.getString(4));
					}
					else
					{
						textField_5.setText("");
						textField_6.setText("");
						textField_7.setText("");
						textField_8.setText("");
					}
				}
				catch(Exception ee)
				{
					JOptionPane.showMessageDialog(null, ee);
				}
			}
		});
		textField_4.setBounds(104, 212, 180, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(104, 243, 180, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Rate");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_12.setBounds(319, 212, 49, 14);
		contentPane.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("Quantity");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_13.setBounds(323, 249, 64, 14);
		contentPane.add(lblNewLabel_13);
		
		textField_6 = new JTextField();
		textField_6.setBounds(389, 211, 167, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(389, 243, 167, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_14 = new JLabel("Description");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_14.setBounds(582, 232, 71, 14);
		contentPane.add(lblNewLabel_14);
		
		textField_8 = new JTextField();
		textField_8.setBounds(663, 229, 139, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("name");
		model.addColumn("description");
		model.addColumn("rate");
		model.addColumn("quantity");
		model.addColumn("total");
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(30, 287, 397, 148);
		contentPane.add(scrollPane);
		table = new JTable(model);
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel_15 = new JLabel("Calculation Details:");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_15.setBounds(437, 287, 202, 20);
		contentPane.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("Total");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_16.setBounds(437, 329, 49, 14);
		contentPane.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("Paid Amount");
		lblNewLabel_17.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_17.setBounds(437, 368, 99, 14);
		contentPane.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("New label");
		lblNewLabel_18.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_18.setBounds(437, 407, 71, 14);
		contentPane.add(lblNewLabel_18);
		
		textField_9 = new JTextField();
		textField_9.setBounds(546, 328, 126, 20);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(546, 367, 126, 20);
		contentPane.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(546, 406, 126, 20);
		contentPane.add(textField_11);
		textField_11.setColumns(10);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Shreya\\Downloads\\Bms Icon Jframe\\bms\\add.png"));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(694, 253, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Save");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Shreya\\Downloads\\Bms Icon Jframe\\bms\\save.png"));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBounds(694, 325, 108, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Reset");
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\Shreya\\Downloads\\Bms Icon Jframe\\bms\\Reset.png"));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_2.setBounds(694, 366, 108, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Close");
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\Shreya\\Downloads\\Bms Icon Jframe\\bms\\close Jframe.png"));
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_3.setBounds(694, 405, 108, 23);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_20 = new JLabel("New label");
		lblNewLabel_20.setBounds(663, 21, 74, 14);
		contentPane.add(lblNewLabel_20);
		
		JLabel lblNewLabel_21 = new JLabel("New label");
		lblNewLabel_21.setBounds(663, 46, 89, 14);
		contentPane.add(lblNewLabel_21);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Date d = new Date();
		lblNewLabel_20.setText(sdf.format(d));
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		lblNewLabel_21.setText(dtf.format(now));
		
		JLabel lblNewLabel_19 = new JLabel("New label");
		lblNewLabel_19.setIcon(new ImageIcon("C:\\Users\\Shreya\\Downloads\\Bms Icon Jframe\\bms\\billing background.png"));
		lblNewLabel_19.setBounds(0, 0, 812, 446);
		contentPane.add(lblNewLabel_19);
	}
}
