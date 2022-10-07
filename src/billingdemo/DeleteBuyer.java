package billingdemo;

import java.sql.*;
import project.ConnectionProvider;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DeleteBuyer extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteBuyer frame = new DeleteBuyer();
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
	public DeleteBuyer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 717, 507);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Shreya\\Downloads\\Bms Icon Jframe\\bms\\delete buyer.png"));
		lblNewLabel_1.setBounds(177, 25, 71, 61);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Delete Buyer");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel.setBounds(273, 15, 260, 79);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Contact No");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(63, 108, 114, 20);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(197, 105, 335, 31);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String contactNo = textField.getText();
				try
				{
					Connection con = ConnectionProvider.getCon();
					PreparedStatement ps = con.prepareStatement("select * from login where contactNo = '"+contactNo+"'");
					ResultSet rs = ps.executeQuery();
					 if(rs.next())
				        {
				        	textField_1.setText(rs.getString(1));
				        	textField_2.setText(rs.getString(2));
				        	textField_3.setText(rs.getString(3));
				        	textField_4.setText(rs.getString(4));
				        	textField_5.setText(rs.getString(5));
				        	textField.setEditable(false);
				        	
				        }
				        else
				        {
				        	JOptionPane.showMessageDialog(null, "contact does not exists");
				        }
				}
				catch(Exception ee)
				{
					JOptionPane.showMessageDialog(null, ee);
				}
				
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Shreya\\Downloads\\Bms Icon Jframe\\bms\\search.png"));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(562, 103, 114, 31);
		contentPane.add(btnNewButton);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(29, 157, 674, 2);
		contentPane.add(separator);
		
		JLabel lblNewLabel_3 = new JLabel("Name");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(127, 182, 49, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Contact No");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(127, 224, 71, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Email");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(128, 267, 49, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Address");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(128, 311, 49, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Gender");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_7.setBounds(128, 356, 49, 14);
		contentPane.add(lblNewLabel_7);
		
		textField_1 = new JTextField();
		textField_1.setBounds(227, 176, 348, 31);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(227, 218, 348, 31);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(227, 260, 348, 33);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(227, 304, 348, 32);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(227, 350, 348, 31);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(36, 413, 667, 2);
		contentPane.add(separator_1);
		
		JButton btnNewButton_1 = new JButton("Delete");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String contactNo = textField.getText();
				int a = JOptionPane.showConfirmDialog(null, "Do you really want to Delete?" , "select" , JOptionPane.YES_NO_OPTION);
				if(a == 0)
				{
					try
					{
						Connection con = ConnectionProvider.getCon();
						PreparedStatement ps = con.prepareStatement("delete from login where contactNo = '"+contactNo+"'");
						ps.executeUpdate();
						setVisible(false);
						new DeleteBuyer().setVisible(true);
					}
					catch(Exception ee)
					{
						
					}
				}
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Shreya\\Downloads\\Bms Icon Jframe\\bms\\delete.png"));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(63, 426, 132, 44);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Reset");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				new DeleteBuyer().setVisible(true);
			}
		});
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\Shreya\\Downloads\\Bms Icon Jframe\\bms\\Reset.png"));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2.setBounds(306, 426, 114, 44);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Close");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
			}
		});
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\Shreya\\Downloads\\Bms Icon Jframe\\bms\\close Jframe.png"));
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_3.setBounds(529, 426, 114, 44);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\Shreya\\Downloads\\Bms Icon Jframe\\bms\\billing background.png"));
		lblNewLabel_8.setBounds(0, 0, 717, 507);
		contentPane.add(lblNewLabel_8);
	}
}
