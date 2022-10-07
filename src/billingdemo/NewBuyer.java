package billingdemo;

import java.awt.*;
import project.ConnectionProvider;
import java.sql.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Component;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JButton;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NewBuyer extends JFrame {

	private JPanel contentPane;
	private JTextField txtEnterName;
	private JTextField txtEnterContactNo;
	private JTextField txtEnterEmail;
	private JTextField txtEnterAddress;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewBuyer frame = new NewBuyer();
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
	public NewBuyer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 827, 511);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New Buyer");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel.setBounds(290, 11, 219, 87);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(NewBuyer.class.getResource("/images/new buyer.png")));
		lblNewLabel_1.setBounds(209, 11, 71, 87);
		contentPane.add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 96, 779, 2);
		contentPane.add(separator);
		
		JLabel lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(104, 121, 59, 24);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Contact No.");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(104, 172, 96, 21);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Email");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_4.setBounds(104, 223, 59, 24);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Address");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5.setBounds(104, 272, 71, 24);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Gender");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_6.setBounds(104, 327, 71, 23);
		contentPane.add(lblNewLabel_6);
		
		txtEnterName = new JTextField();
		txtEnterName.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				
				if(txtEnterName.getText().equals("Enter Name"))
				{
					txtEnterName.setText("");
					txtEnterName.setForeground(new Color(0,0,0));
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				
				if(txtEnterName.getText().equals(""))
				{
					txtEnterName.setText("Enter Name");
					txtEnterName.setForeground(new Color(109,109,109));
				}
			}
		});
		txtEnterName.setForeground(new Color(160, 160, 160));
		txtEnterName.setAlignmentX(Component.LEFT_ALIGNMENT);
		txtEnterName.setText("Enter Name");
		txtEnterName.setBounds(228, 122, 334, 27);
		contentPane.add(txtEnterName);
		txtEnterName.setColumns(10);
		
		txtEnterContactNo = new JTextField();
		txtEnterContactNo.setDisabledTextColor(UIManager.getColor("Button.shadow"));
		txtEnterContactNo.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if(txtEnterContactNo.getText().equals("Enter Contact No."))
				{
					txtEnterContactNo.setText("");
					txtEnterContactNo.setForeground(new Color(0,0,0));
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				
				if(txtEnterContactNo.getText().equals(""))
				{
					txtEnterContactNo.setText("Enter Contact No.");
					txtEnterContactNo.setForeground(new Color(109,109,109));
				}
			}
		});
		txtEnterContactNo.setForeground(UIManager.getColor("Button.shadow"));
		txtEnterContactNo.setText("Enter Contact No.");
		txtEnterContactNo.setBounds(228, 171, 334, 27);
		contentPane.add(txtEnterContactNo);
		txtEnterContactNo.setColumns(10);
		
		txtEnterEmail = new JTextField();
		txtEnterEmail.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				
				if(txtEnterEmail.getText().equals("Enter Email"))
				{
					txtEnterEmail.setText("");
					txtEnterEmail.setForeground(new Color(0,0,0));
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				
				if(txtEnterEmail.getText().equals(""))
				{
					txtEnterEmail.setText("Enter Email");
					txtEnterEmail.setForeground(new Color(109,109,109));
				}
			}
		});
		txtEnterEmail.setForeground(UIManager.getColor("Button.shadow"));
		txtEnterEmail.setText("Enter Email");
		txtEnterEmail.setBounds(228, 224, 334, 27);
		contentPane.add(txtEnterEmail);
		txtEnterEmail.setColumns(10);
		
		txtEnterAddress = new JTextField();
		txtEnterAddress.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				
				if(txtEnterAddress.getText().equals("Enter Address"))
				{
					txtEnterAddress.setText("");
					txtEnterAddress.setForeground(new Color(0,0,0));
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				
				if(txtEnterAddress.getText().equals(""))
				{
					txtEnterAddress.setText("Enter Address");
					txtEnterAddress.setForeground(new Color(109,109,109));
				}
			}
		});
		txtEnterAddress.setForeground(UIManager.getColor("Button.shadow"));
		txtEnterAddress.setText("Enter Address");
		txtEnterAddress.setBounds(228, 273, 334, 27);
		contentPane.add(txtEnterAddress);
		txtEnterAddress.setColumns(10);
		
		String[] s = {"Male" , "Female" , "Others"};
		JComboBox comboBox = new JComboBox(s);
		comboBox.setBounds(228, 327, 334, 27);
		contentPane.add(comboBox);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 382, 779, 2);
		contentPane.add(separator_1);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name = txtEnterName.getText();
				String contactNo = txtEnterContactNo.getText();
				String email = txtEnterEmail.getText();
				String address = txtEnterAddress.getText();
				String gender = (String)comboBox.getSelectedItem();
				
				try
				{
					Connection con = ConnectionProvider.getCon();
					PreparedStatement ps = con.prepareStatement("insert into login values(? , ? , ? , ? , ?)");
					ps.setString(1 , name);
					ps.setString(2, contactNo);
					ps.setString(3, email);
					ps.setString(4, address);
					ps.setString(5, gender);
					ps.executeUpdate();
					
					JOptionPane.showMessageDialog(null , "Successfully Updated");
					setVisible(false);
					new NewBuyer().setVisible(true);
					
				}
				catch(Exception ee)
				{
					JOptionPane.showMessageDialog(null , ee);
				}
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Shreya\\Downloads\\Bms Icon Jframe\\bms\\save.png"));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(64, 407, 136, 42);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset\r\n");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				new NewBuyer().setVisible(true);
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Shreya\\Downloads\\Bms Icon Jframe\\bms\\Reset.png"));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(326, 407, 125, 42);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Close");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
			}
		});
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\Shreya\\Downloads\\Bms Icon Jframe\\bms\\close Jframe.png"));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2.setBounds(563, 404, 119, 45);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setIcon(new ImageIcon(NewBuyer.class.getResource("/images/billing background.png")));
		lblNewLabel_7.setBounds(0, 0, 827, 511);
		contentPane.add(lblNewLabel_7);
	}
}
