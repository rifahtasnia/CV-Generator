import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.design.JasperDesign;

import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

import java.util.*;
import javax.swing.JLabel;


public class ReportPersonalInfo extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtFullName;
	private JTextField txtNationality;
	private JTextField txtDateofBirth;
	private JTextField txtAddress;
	private JTextField txtMobile;
	private JTextField txtEmail;
	private JTextField txtGender;
	private JTextField txtMasters;
	private JTextField txtBechelor;
	private JTextField txtHSC;
	private JTextField txtSSC;
	private JTextField txtJSC;
	
	private JLabel lblNewLabel;
	private JLabel lblBechelorsDegree;
	private JLabel lblSsc;
	private JLabel lblHsc;
	private JLabel lblJsc;
	private JLabel lblPersonalInformation;
	
	private JTextField txtSkill1;
	private JTextField txtSkill2;
	private JTextField txtSkill3;
	private JTextField txtSkill4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReportPersonalInfo frame = new ReportPersonalInfo();
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
	public ReportPersonalInfo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 885, 522);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnFullName = new JButton("Full Name");
		btnFullName.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnFullName.setBounds(10, 60, 135, 25);
		contentPane.add(btnFullName);
		
		JButton btnNationality = new JButton("Nationality");
		btnNationality.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNationality.setBounds(10, 109, 135, 25);
		contentPane.add(btnNationality);
		
		JButton btnFullName_1 = new JButton("Date of Birth");
		btnFullName_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnFullName_1.setBounds(10, 156, 135, 25);
		contentPane.add(btnFullName_1);
		
		JButton btnGender = new JButton("Gender");
		btnGender.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnGender.setBounds(10, 207, 135, 25);
		contentPane.add(btnGender);
		
		JButton btnAddress = new JButton("Address");
		btnAddress.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnAddress.setBounds(10, 254, 135, 25);
		contentPane.add(btnAddress);
		
		JButton btnMobile = new JButton("Mobile");
		btnMobile.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnMobile.setBounds(10, 290, 135, 25);
		contentPane.add(btnMobile);
		
		JButton btnEmail = new JButton("Email");
		btnEmail.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnEmail.setBounds(10, 334, 135, 25);
		contentPane.add(btnEmail);
		
		txtFullName = new JTextField();
		txtFullName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				}
		});
		txtFullName.setBounds(183, 63, 256, 25);
		contentPane.add(txtFullName);
		txtFullName.setColumns(10);
		
		txtNationality = new JTextField();
		txtNationality.setColumns(10);
		txtNationality.setBounds(183, 112, 256, 25);
		contentPane.add(txtNationality);
		
		txtDateofBirth = new JTextField();
		txtDateofBirth.setColumns(10);
		txtDateofBirth.setBounds(183, 159, 256, 25);
		contentPane.add(txtDateofBirth);
		
		txtAddress = new JTextField();
		txtAddress.setColumns(10);
		txtAddress.setBounds(183, 257, 256, 25);
		contentPane.add(txtAddress);
		
		txtMobile = new JTextField();
		txtMobile.setColumns(10);
		txtMobile.setBounds(183, 293, 256, 25);
		contentPane.add(txtMobile);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(183, 337, 256, 25);
		contentPane.add(txtEmail);
		
		JButton btnCVgenerate = new JButton("Generate CV");
		btnCVgenerate.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCVgenerate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
				      JasperDesign jd =JRXmlLoader.load(new File("").getAbsolutePath()+"/src/cv.jrxml");
				      
				      HashMap<String, Object> map = new HashMap<String, Object>();
				        map.put("FullName",txtFullName.getText());
				        map.put("Gender",txtGender.getText());
				        map.put("Nationality",txtNationality.getText());
				        map.put("DateofBirth",txtDateofBirth.getText());
				        map.put("Address",txtAddress.getText());
				        map.put("Mobile",txtMobile.getText());
				        map.put("Email",txtEmail.getText());
				        				        
						map.put("Masters",txtMasters.getText());
						map.put("Bechelors",txtBechelor.getText());
						map.put("HSC",txtHSC.getText());
						map.put("SSC",txtSSC.getText());
						map.put("JSC",txtJSC.getText());
						
						map.put("Skill1",txtSkill1.getText());
						map.put("Skill2",txtSkill2.getText());
						map.put("Skill3",txtSkill3.getText());
						map.put("Skill4",txtSkill4.getText());
				       
				     
				       
				       JasperReport jr=JasperCompileManager.compileReport(jd);
				       JasperPrint jp=JasperFillManager.fillReport(jr, map);
				       JasperViewer jv=new JasperViewer(jp,false);
				       jv.setVisible(true);
				      
				    } catch (Exception e) {
				      // TODO: handle exception
				      e.printStackTrace();
				    }
			}
		});
		btnCVgenerate.setBounds(187, 403, 109, 35);
		contentPane.add(btnCVgenerate);
		
		txtGender = new JTextField();
		txtGender.setColumns(10);
		txtGender.setBounds(181, 210, 258, 25);
		contentPane.add(txtGender);
		
		JLabel lblEducation = new JLabel("Education");
		lblEducation.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblEducation.setBounds(598, 11, 109, 33);
		contentPane.add(lblEducation);
		
		txtMasters = new JTextField();
		txtMasters.setColumns(10);
		txtMasters.setBounds(663, 60, 149, 25);
		contentPane.add(txtMasters);
		
		txtBechelor = new JTextField();
		txtBechelor.setColumns(10);
		txtBechelor.setBounds(663, 96, 149, 25);
		contentPane.add(txtBechelor);
		
		txtHSC = new JTextField();
		txtHSC.setColumns(10);
		txtHSC.setBounds(663, 132, 149, 25);
		contentPane.add(txtHSC);
		
		txtSSC = new JTextField();
		txtSSC.setColumns(10);
		txtSSC.setBounds(661, 168, 151, 25);
		contentPane.add(txtSSC);
		
		txtJSC = new JTextField();
		txtJSC.setColumns(10);
		txtJSC.setBounds(663, 208, 149, 25);
		contentPane.add(txtJSC);
		
		lblNewLabel = new JLabel("Master's degree:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(517, 55, 109, 35);
		contentPane.add(lblNewLabel);
		
		lblBechelorsDegree = new JLabel("Bechelor's degree:");
		lblBechelorsDegree.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblBechelorsDegree.setBounds(517, 90, 109, 35);
		contentPane.add(lblBechelorsDegree);
		
		lblSsc = new JLabel("SSC:");
		lblSsc.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSsc.setBounds(517, 162, 109, 35);
		contentPane.add(lblSsc);
		
		lblHsc = new JLabel("HSC:");
		lblHsc.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblHsc.setBounds(517, 126, 109, 35);
		contentPane.add(lblHsc);
		
		lblJsc = new JLabel("JSC:");
		lblJsc.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblJsc.setBounds(517, 202, 109, 35);
		contentPane.add(lblJsc);
		
		lblPersonalInformation = new JLabel("Personal Information");
		lblPersonalInformation.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblPersonalInformation.setBounds(109, 10, 258, 35);
		contentPane.add(lblPersonalInformation);
		
		JLabel lblSkills = new JLabel("Skills");
		lblSkills.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblSkills.setBounds(618, 270, 109, 33);
		contentPane.add(lblSkills);
		
		txtSkill1 = new JTextField();
		txtSkill1.setColumns(10);
		txtSkill1.setBounds(663, 316, 149, 25);
		contentPane.add(txtSkill1);
		
		txtSkill2 = new JTextField();
		txtSkill2.setColumns(10);
		txtSkill2.setBounds(663, 352, 149, 25);
		contentPane.add(txtSkill2);
		
		txtSkill3 = new JTextField();
		txtSkill3.setColumns(10);
		txtSkill3.setBounds(663, 388, 149, 25);
		contentPane.add(txtSkill3);
		
		txtSkill4 = new JTextField();
		txtSkill4.setColumns(10);
		txtSkill4.setBounds(661, 424, 151, 25);
		contentPane.add(txtSkill4);
	}
}
