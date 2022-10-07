package project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import java.sql.*;

public class JDBCConnect implements ActionListener{

	JFrame jf;
	JLabel jl1 , jl2;
	JTextField jt1 , jt2;
	JButton jb;
	public JDBCConnect()
	{
		jf = new JFrame();
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLayout(null);
		jf.setSize(500 , 500);
		
		jl1 = new JLabel("Enter name");
		jl1.setBounds(50 , 50 , 100 , 30);
		jf.add(jl1);
		jl2 = new JLabel("Enter email");
		jl2.setBounds(50 , 100 , 100 , 30);
		jf.add(jl2);
		
		jt1 = new JTextField();
		jt1.setBounds(200 , 50 , 150 , 30);
		jf.add(jt1);
		jt2 = new JTextField();
		jt2.setBounds(200 , 100 , 150 , 30);
		jf.add(jt2);
		
		jb = new JButton("Save");
		jb.setBounds(150 , 150 , 80 , 40);
		jb.addActionListener(this);
		jf.add(jb);
		jf.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		String name = jt1.getText();
		String email = jt2.getText();
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3305/billing" , "root" , "root");
			PreparedStatement ps = con.prepareStatement("insert into student values(? , ?)");
			ps.setString(1, name);
			ps.setString(2, email);
			ps.executeUpdate();
			
		}
		catch(Exception ee)
		{
			System.out.println(ee);
		}
		
		if(e.getSource() == jb)
		{
			JOptionPane.showMessageDialog(null, "Insertion successfull");
			jf.setVisible(false);
			jf.setVisible(true);
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Mobile registered already");
		}
		
	}
	
	 public static void main(String[] args) {
		
		 new JDBCConnect();
	}
}
