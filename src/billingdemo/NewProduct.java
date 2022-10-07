package billingdemo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.*;
import java.sql.*;
import project.ConnectionProvider;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class NewProduct extends JFrame {

	private JPanel contentPane;
	private JTextField txtEnterProductName;
	private JTextField txtEnterProductRate;
	private JTextField txtEnterProductDescription;
	private JLabel lblNewLabel_3;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewProduct frame = new NewProduct();
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
	
	public NewProduct() {
		
	
			
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUndecorated(true);
		setBounds(100, 100, 748, 485);
		contentPane = new JPanel();
		contentPane.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent e) {
				
				
			}
		});
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New Product");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel.setBounds(261, 11, 285, 61);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Shreya\\Downloads\\Bms Icon Jframe\\bms\\new product.png"));
		lblNewLabel_1.setBounds(190, 11, 72, 61);
		contentPane.add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(43, 83, 673, 2);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(43, 154, 673, 2);
		contentPane.add(separator_1);
		
		JLabel lblNewLabel_2 = new JLabel("Product ID");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(156, 115, 122, 28);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("Product Name");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(156, 191, 102, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Rate");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(156, 244, 86, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Activate");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(156, 350, 93, 19);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Description");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_7.setBounds(156, 294, 86, 14);
		contentPane.add(lblNewLabel_7);
		
		txtEnterProductName = new JTextField();
		txtEnterProductName.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				
				if(txtEnterProductName.getText().equals("Enter Product Name"))
				{
					txtEnterProductName.setText("");
					txtEnterProductName.setForeground(new Color(0,0,0));
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				

				if(txtEnterProductName.getText().equals(""))
				{
					txtEnterProductName.setText("Enter Product Name");
					txtEnterProductName.setForeground(new Color(153,153,153));
				}
			}
		});
		txtEnterProductName.setForeground(Color.LIGHT_GRAY);
		txtEnterProductName.setText("Enter Product Name");
		txtEnterProductName.setBounds(261, 186, 305, 28);
		contentPane.add(txtEnterProductName);
		txtEnterProductName.setColumns(10);
		
		txtEnterProductRate = new JTextField();
		txtEnterProductRate.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				
				if(txtEnterProductRate.getText().equals("Enter Product Rate"))
				{
					txtEnterProductRate.setText("");
					txtEnterProductRate.setForeground(new Color(0,0,0));
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				
				if(txtEnterProductRate.getText().equals(""))
				{
					txtEnterProductRate.setText("Enter Product Rate");
					txtEnterProductRate.setForeground(new Color(153,153,153));
				}
			}
		});
		txtEnterProductRate.setForeground(Color.LIGHT_GRAY);
		txtEnterProductRate.setText("Enter Product Rate");
		txtEnterProductRate.setBounds(261, 239, 305, 28);
		contentPane.add(txtEnterProductRate);
		txtEnterProductRate.setColumns(10);
		
		txtEnterProductDescription = new JTextField();
		txtEnterProductDescription.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				
				if(txtEnterProductDescription.getText().equals("Enter Product Description"))
				{
					txtEnterProductDescription.setText("");
					txtEnterProductDescription.setForeground(new Color(0,0,0));
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				
				if(txtEnterProductDescription.getText().equals(""))
				{
					txtEnterProductDescription.setText("Enter Product Description");
					txtEnterProductDescription.setForeground(new Color(153,153,153));
				}
			}
		});
		txtEnterProductDescription.setForeground(Color.LIGHT_GRAY);
		txtEnterProductDescription.setText("Enter Product Description");
		txtEnterProductDescription.setBounds(261, 289, 305, 28);
		contentPane.add(txtEnterProductDescription);
		txtEnterProductDescription.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("100");
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3.setBounds(256, 105, 61, 38);
		contentPane.add(lblNewLabel_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Yes ", "No"}));
		comboBox.setBounds(263, 347, 303, 28);
		contentPane.add(comboBox);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(43, 413, 673, 2);
		contentPane.add(separator_2);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String pID = lblNewLabel_3.getText();
				String pName = txtEnterProductName.getText();
				String pRate = txtEnterProductRate.getText();
				String pDescription = txtEnterProductDescription.getText();
				String activate = (String)comboBox.getSelectedItem();
				
				try
				{
					Connection con = ConnectionProvider.getCon();
					PreparedStatement ps = con.prepareStatement("insert into item values(? , ? , ? , ? , ?)");
					ps.setString(1, pID);
					ps.setString(2, pName);
					ps.setString(3, pRate);
					ps.setString(4, pDescription);
					ps.setString(5, activate);
					ps.executeUpdate();
					JOptionPane.showMessageDialog(null, "updated successfully");
					setVisible(false);
					new NewProduct().setVisible(true);
				}
				catch(Exception ee)
				{
					JOptionPane.showMessageDialog(null, ee);
				}
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Shreya\\Downloads\\Bms Icon Jframe\\bms\\save.png"));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(53, 417, 143, 57);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Close");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Shreya\\Downloads\\Bms Icon Jframe\\bms\\close Jframe.png"));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBounds(545, 416, 143, 58);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Reset");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				new NewProduct().setVisible(true);
			}
		});
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\Shreya\\Downloads\\Bms Icon Jframe\\bms\\Reset.png"));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_2.setBounds(304, 417, 143, 57);
		contentPane.add(btnNewButton_2);
		
		
		
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent e) {
				
				try
				{
					Connection con = ConnectionProvider.getCon();
					Statement ps = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
				    ResultSet.CONCUR_READ_ONLY);
					ResultSet rs = ps.executeQuery("select max(pID) from item");
					if(rs.first())
					{
						int id = rs.getInt(1);
						id = id+1;
						String str = String.valueOf(id);
						lblNewLabel_3.setText(str);
						
					}
					else
					{
						lblNewLabel_3.setText("1");
					}
				}
				catch(Exception ee)
				{
					ee.printStackTrace();
					JOptionPane.showMessageDialog(null, ee);
				}
			}
		});
		
	}
}
