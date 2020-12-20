import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private JTextField txtUserName;
	private JTextField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 502, 361);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnEducation = new JButton("Login");
		btnEducation.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnEducation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			       String id;
			        String pass;
			        id=txtUserName.getText();
			        pass=txtPassword.getText();
			        if(pass.equals("123456") && id.equals("Rifa") )
			        {
			        	ReportPersonalInfo rp=new ReportPersonalInfo();
						rp.setVisible(true); }
			else{
				System.out.println("Error");
				}
			}     

			
		});
		btnEducation.setBounds(159, 190, 89, 23);
		contentPane.add(btnEducation);
		
		txtUserName = new JTextField();
		txtUserName.setBounds(239, 103, 86, 20);
		contentPane.add(txtUserName);
		txtUserName.setColumns(10);
		
		txtPassword = new JTextField();
		txtPassword.setBounds(239, 129, 86, 20);
		contentPane.add(txtPassword);
		txtPassword.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("User Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(115, 105, 99, 17);
		contentPane.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPassword.setBounds(115, 131, 99, 17);
		contentPane.add(lblPassword);
		
		JButton btnNewButton = new JButton("Exit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(264, 190, 89, 23);
		contentPane.add(btnNewButton);
	}
}
