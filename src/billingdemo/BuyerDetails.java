package billingdemo;

import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.EventQueue;
import java.awt.Font;

import net.proteanit.sql.DbUtils;
import project.ConnectionProvider;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class BuyerDetails extends JFrame {
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BuyerDetails frame = new BuyerDetails();
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
	public BuyerDetails() {
//		addComponentListener(new ComponentAdapter() {
//			@Override
//			public void componentShown(ComponentEvent e) {
//				
//				try
//				{
//					Connection con = ConnectionProvider.getCon();
//					PreparedStatement ps = con.prepareStatement("select * from login");
//					ResultSet rs = ps.executeQuery();
//					table_1.setModel(DbUtils.resultSetToTableModel(rs));
//					
//				}
//				catch(Exception ee)
//				{
//					JOptionPane.showMessageDialog(null, ee);
//				}
//			}
//		});
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUndecorated(false);
		setBounds(100, 100, 827, 511);
		//setUndecorated(true);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Buyer Details");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(306, 4, 258, 89);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Shreya\\Downloads\\Bms Icon Jframe\\bms\\buyer Details.png"));
		lblNewLabel_1.setBounds(224, 4, 72, 89);
		getContentPane().add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(31, 84, 721, 9);
		getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(31, 415, 721, 2);
		getContentPane().add(separator_1);
		
		JButton btnNewButton = new JButton("Print");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try
				{
					table_1.print(JTable.PrintMode.NORMAL);
				}
				catch(Exception ee)
				{
					System.out.println(ee);
				}
				
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Shreya\\Downloads\\Bms Icon Jframe\\bms\\print.png"));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(93, 434, 154, 61);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Close");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Shreya\\Downloads\\Bms Icon Jframe\\bms\\close Jframe.png"));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBounds(559, 437, 154, 58);
		getContentPane().add(btnNewButton_1);
		
//		table_2 = new JTable();
//		scrollPane.setViewportView(table_2);
		
		JButton btnNewButton_2 = new JButton("Load Data");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try
				{
					Connection con = ConnectionProvider.getCon();
					PreparedStatement ps = con.prepareStatement("select * from login");
					ResultSet rs = ps.executeQuery();
					table_1.setModel(DbUtils.resultSetToTableModel(rs));
					
				}
				catch(Exception ee)
				{
					JOptionPane.showMessageDialog(null, ee);
				}
			}
		});
		btnNewButton_2.setIcon(new ImageIcon(BuyerDetails.class.getResource("/images/Reset.png")));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_2.setBounds(328, 434, 165, 61);
		getContentPane().add(btnNewButton_2);
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("name");
		model.addColumn("contactNo");
		model.addColumn("email");
		model.addColumn("address");
		model.addColumn("gender");
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(93, 120, 625, 264);
		getContentPane().add(scrollPane);
		table_1 = new JTable(model);
		scrollPane.setViewportView(table_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Shreya\\Downloads\\Bms Icon Jframe\\bms\\billing background.png"));
		lblNewLabel_2.setBounds(0, 0, 827, 511);
		getContentPane().add(lblNewLabel_2);

	}
}
