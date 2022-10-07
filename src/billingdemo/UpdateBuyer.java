package billingdemo;

import java.awt.EventQueue;
import java.sql.*;
import project.ConnectionProvider;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UpdateBuyer extends JFrame {

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
					UpdateBuyer frame = new UpdateBuyer();
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
	public UpdateBuyer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 831, 500);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Update Buyer\r\n");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(312, 11, 215, 57);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Shreya\\Downloads\\Bms Icon Jframe\\bms\\Update buyer.png"));
		lblNewLabel_1.setBounds(240, 11, 60, 64);
		contentPane.add(lblNewLabel_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(48, 79, 719, 3);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(48, 131, 719, 3);
		contentPane.add(separator_1);
		
		JLabel lblNewLabel_2 = new JLabel("Contact No");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(58, 91, 114, 24);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(202, 93, 202, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(58, 145, 114, 24);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("Search\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String contactNo = textField.getText();
				try
				{
			        Connection con = project.ConnectionProvider.getCon();
			        Statement s = con.createStatement();
			        ResultSet rs = s.executeQuery("select * from login where contactNo = '"+contactNo+"'");
			        if(rs.next())
			        {
			        	textField.setText(rs.getString(2)); //name will be displayed 1st column
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
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setIcon(new ImageIcon(UpdateBuyer.class.getResource("/images/search.png")));
		btnNewButton.setBounds(435, 93, 114, 27);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("Name");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(72, 145, 60, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Contact No");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(72, 190, 75, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Email");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(72, 233, 49, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Address");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_7.setBounds(72, 276, 49, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Gender");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_8.setBounds(72, 319, 49, 14);
		contentPane.add(lblNewLabel_8);
		
		textField_1 = new JTextField();
		textField_1.setBounds(198, 145, 377, 24);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(198, 187, 377, 24);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(198, 230, 377, 24);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(198, 273, 377, 24);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(198, 316, 377, 24);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(48, 353, 719, 3);
		contentPane.add(separator_2);
		
		JButton btnNewButton_1 = new JButton("Update");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String contactNo1 = textField.getText();
				String name = textField_1.getText();
				String contactNo = textField_2.getText();
				String email = textField_3.getText();
				String address = textField_4.getText();
				String gender = textField_5.getText();
				
				try
				{
					Connection con = ConnectionProvider.getCon();
					Statement s = con.createStatement();
					s.executeUpdate("update login set name = '"+name+"' , email = '"+email+"' , contactNo = '"+contactNo+"' , address = '"+address+"' , gender = '"+gender+"'");
							
					JOptionPane.showMessageDialog(null, "Sucessfully updated");
				    setVisible(false);
				    new UpdateBuyer().setVisible(true);
				}
				catch(Exception ee)
				{
					ee.printStackTrace();
					JOptionPane.showMessageDialog(null, e);
				}
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Shreya\\Downloads\\Bms Icon Jframe\\bms\\save.png"));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(117, 386, 122, 55);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Reset");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				new UpdateBuyer().setVisible(true);
			}
		});
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\Shreya\\Downloads\\Bms Icon Jframe\\bms\\Reset.png"));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2.setBounds(358, 388, 122, 51);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Close");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
			}
		});
		btnNewButton_3.setIcon(new ImageIcon(UpdateBuyer.class.getResource("/images/close Jframe.png")));
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_3.setBounds(599, 387, 122, 52);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon("C:\\Users\\Shreya\\Downloads\\Bms Icon Jframe\\bms\\billing background.png"));
		lblNewLabel_9.setBounds(0, 0, 831, 500);
		contentPane.add(lblNewLabel_9);
	}
}
