package billingdemo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class UserFrame extends JFrame {

	public int z = 0;
	private JPanel contentPane;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_10;
	private JButton btnNewButton_11;
	
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	private JLabel lblNewLabel_12;
	private JLabel lblNewLabel_13;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserFrame frame = new UserFrame();
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
	public UserFrame() {
		
		//setMinimumSize(new Dimension(1366, 768));
		//setMaximizedBounds(new Rectangle(0, 0, 0, 0));
		//setMaximumSize(new Dimension(1366, 768));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000 , 500);
		setBounds(100, 100, 1000, 500);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
//		btnNewButton.setVisible(false);
//		btnNewButton_1.setVisible(false);
//		btnNewButton_2.setVisible(false);
//		btnNewButton_3.setVisible(false);
//		btnNewButton_4.setVisible(false);
//		btnNewButton_5.setVisible(false);
//		btnNewButton_6.setVisible(false);
//		btnNewButton_7.setVisible(false);
//		btnNewButton_8.setVisible(false);
//		btnNewButton_9.setVisible(false);
//		btnNewButton_10.setVisible(false);
//		
//		lblNewLabel.setVisible(false);
//		lblNewLabel_1.setVisible(false);
//		lblNewLabel_2.setVisible(false);
//		lblNewLabel_3.setVisible(false);
//		lblNewLabel_4.setVisible(false);
//		lblNewLabel_5.setVisible(false);
//		lblNewLabel_6.setVisible(false);
//		lblNewLabel_7.setVisible(false);
//		lblNewLabel_8.setVisible(false);
//		lblNewLabel_9.setVisible(false);
//		lblNewLabel_10.setVisible(false);
		
		z=0;
		
		
		
		btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new NewBuyer().setVisible(true);
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Shreya\\Downloads\\Bms Icon Jframe\\bms\\new buyer.png"));
		btnNewButton_1.setBounds(104, 102, 99, 69);
		btnNewButton_1.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent e) {
				
				try
				{
					Thread.sleep(250);
					btnNewButton_2.setVisible(true);
					lblNewLabel_1.setVisible(true);
				}
				catch(Exception ee)
				{
					System.out.println(ee);
				}
			}
		});
		contentPane.add(btnNewButton_1);
		
		
		
		btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new BuyerDetails().setVisible(true);
				
			}
		});
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\Shreya\\Downloads\\Bms Icon Jframe\\bms\\buyer Details.png"));
		btnNewButton_2.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent e) {
				
				try
				{
					Thread.sleep(250);
					btnNewButton_3.setVisible(true);
					lblNewLabel_2.setVisible(true);
				}
				catch(Exception ee)
				{
					System.out.println(ee);
				}
			}
		});
		btnNewButton_2.setBounds(322, 102, 99, 69);
		contentPane.add(btnNewButton_2);
		
		
		
		btnNewButton_3 = new JButton("");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new UpdateBuyer().setVisible(true);
				
			}
		});
		btnNewButton_3.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent e) {
				
				try
				{
					Thread.sleep(250);
					btnNewButton_4.setVisible(true);
					lblNewLabel_3.setVisible(true);
				}
				catch(Exception ee)
				{
					System.out.println(ee);
				}
			}
		});
		
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\Shreya\\Downloads\\Bms Icon Jframe\\bms\\Update buyer.png"));
		btnNewButton_3.setBounds(213, 102, 99, 69);
		contentPane.add(btnNewButton_3);
		
		
		
		btnNewButton_4 = new JButton("delete");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new DeleteBuyer().setVisible(true);
			}
		});
		btnNewButton_4.setIcon(new ImageIcon("C:\\Users\\Shreya\\Downloads\\Bms Icon Jframe\\bms\\delete buyer.png"));
		btnNewButton_4.setBounds(431, 102, 89, 69);
		btnNewButton_4.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent e) {
				
				try
				{
					Thread.sleep(250);
					//btnNewButton_5.setVisible(true);
					lblNewLabel_4.setVisible(true);
				}
				catch(Exception ee)
				{
					System.out.println(ee);
				}
			}
		});
		contentPane.add(btnNewButton_4);
		
		btnNewButton_10 = new JButton("");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int a = JOptionPane.showConfirmDialog(null, "Do you really want to Logout?" , "Select" , JOptionPane.YES_NO_OPTION);
				if(a == 0)
				{
					setVisible(false);
					new login().setVisible(true);
				}
			}
		});
		btnNewButton_10.setIcon(new ImageIcon("C:\\Users\\Shreya\\Downloads\\Bms Icon Jframe\\bms\\logout.png"));
		btnNewButton_10.setBounds(393, 240, 99, 69);
		contentPane.add(btnNewButton_10);
		
		
		
		btnNewButton_11 = new JButton("");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = JOptionPane.showConfirmDialog(null, "Do you really want to Close?" , "Select" , JOptionPane.YES_NO_OPTION);
				if(a == 0)
				{
					System.exit(0);
				}
			}
		});
		btnNewButton_11.setIcon(new ImageIcon("C:\\Users\\Shreya\\Downloads\\Bms Icon Jframe\\bms\\Close.png"));
		btnNewButton_11.setBounds(502, 240, 89, 69);
		contentPane.add(btnNewButton_11);
		
		
		
		lblNewLabel = new JLabel("New Buyer");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(114, 190, 82, 30);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Update Buyer");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(223, 190, 99, 30);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Buyer Details");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(332, 195, 89, 20);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Delete Buyer");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(442, 195, 82, 20);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_10 = new JLabel("Close Application");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_10.setBounds(512, 328, 110, 20);
		contentPane.add(lblNewLabel_10);
		
		lblNewLabel_11 = new JLabel("Logout");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_11.setBounds(416, 328, 55, 20);
		contentPane.add(lblNewLabel_11);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new NewProduct().setVisible(true);
			}
		});
		btnNewButton_5.setIcon(new ImageIcon("C:\\Users\\Shreya\\Downloads\\Bms Icon Jframe\\bms\\new product.png"));
		btnNewButton_5.setBounds(530, 102, 110, 69);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new UpdateProduct().setVisible(true);
			}
		});
		btnNewButton_6.setIcon(new ImageIcon("C:\\Users\\Shreya\\Downloads\\Bms Icon Jframe\\bms\\update product.png"));
		btnNewButton_6.setBounds(650, 102, 94, 69);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.setIcon(new ImageIcon("C:\\Users\\Shreya\\Downloads\\Bms Icon Jframe\\bms\\details product.png"));
		btnNewButton_7.setBounds(754, 102, 89, 69);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("");
		btnNewButton_8.setIcon(new ImageIcon("C:\\Users\\Shreya\\Downloads\\Bms Icon Jframe\\bms\\delete product.png"));
		btnNewButton_8.setBounds(853, 102, 89, 69);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("");
		btnNewButton_9.setIcon(new ImageIcon("C:\\Users\\Shreya\\Downloads\\Bms Icon Jframe\\bms\\billing.png"));
		btnNewButton_9.setBounds(285, 240, 99, 69);
		contentPane.add(btnNewButton_9);
		
		JLabel lblNewLabel_5 = new JLabel("New Product");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(546, 195, 80, 20);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Update Product");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(645, 193, 99, 24);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Delete Product\r\n");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_7.setBounds(871, 198, 99, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Product Details");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_8.setBounds(762, 198, 101, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Billing");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_9.setBounds(318, 323, 66, 30);
		contentPane.add(lblNewLabel_9);
		
		lblNewLabel_12 = new JLabel("Food Billing Software");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel_12.setBounds(228, 22, 560, 61);
		contentPane.add(lblNewLabel_12);
		
		lblNewLabel_13 = new JLabel("New label");
		lblNewLabel_13.setIcon(new ImageIcon("C:\\Users\\Shreya\\Downloads\\bag.jpg"));
		lblNewLabel_13.setBounds(0, 0, 1000, 500);
		contentPane.add(lblNewLabel_13);
	}
}
