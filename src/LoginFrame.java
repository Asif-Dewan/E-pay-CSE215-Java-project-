/*
import java.awt.Color;  
import java.awt.Container;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
*/


import java.util.*;  
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.SimpleDateFormat;


public class LoginFrame extends JFrame  implements ActionListener 
{
	
	
	Container container=getContentPane();
	
	Date dNow = new Date();
	SimpleDateFormat ft = new SimpleDateFormat("hh:mm a dd/MM/yyyy");

	
	//Application label
	JLabel appLabel =new JLabel("Sign in to your account");
	JLabel appLabel2 =new JLabel(" Account Number ");
	JLabel appLabel3 =new JLabel(" Password* ");
	JLabel appLabel4 =new JLabel(" Show Password ");
	
	JTextField AccNoField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    
    JCheckBox showPassword = new JCheckBox("Show Password");
	
    JButton LoginButton=new JButton("Login");
    JButton   registrationButton=new JButton("Sign Up");
    JButton HomeButton = new JButton("Home");
    JButton RegistrationButton=new JButton("Create new Account");
    JButton DepositButton = new JButton ("Deposit");
    JButton WithdrawButton = new JButton ("Withdraw");
    JButton TransferButton = new JButton ("Transfer");
    JButton timeDate = new JButton(ft.format(dNow));
    
	JButton nullButton2 = new JButton("");
	
	JButton nullButton3 = new JButton("");
	
	JLabel bgImage = new JLabel(new ImageIcon("F:\\JAVA_Eclipse\\E-Pay\\GrayBackground.png"));
	//JLabel bgImage = new JLabel(new ImageIcon("")); //Change korte hobe;

    
	LoginFrame(){
		
		this.setTitle("E-PAY ");
		
		//setBounds(int Xaxis, int Yaxis, int width, int height)
		this.setBounds(16,45,1000,700);
		
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		
		Initialize();
		addActionEvent();
	}
	public void Initialize() {
		
		container.setLayout(null);
		container.setBackground(new Color(244, 247, 241));
		
		
	    //Label -sign in
		appLabel.setBounds(240, 200, 500,80);
		appLabel.setForeground(new Color(0, 0, 0));
		appLabel.setFont(new Font("San Francisco", Font.BOLD, 35));
		
		appLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		container.add(appLabel);
		
		//label2-username
		appLabel2.setBounds(210, 263, 312,37);
		appLabel2.setForeground(new Color(0, 0, 0));
		appLabel2.setFont(new Font("San Francisco", Font.ROMAN_BASELINE, 17));
		
		appLabel2.setHorizontalAlignment(SwingConstants.CENTER);
		
		container.add(appLabel2);
		
         
		//label3-password
		appLabel3.setBounds(193, 320, 312,37);
		appLabel3.setForeground(new Color(0, 0, 0));
		appLabel3.setFont(new Font("San Francisco", Font.ROMAN_BASELINE, 17));
				
		appLabel3.setHorizontalAlignment(SwingConstants.CENTER);
				
		container.add(appLabel3);
		
		/*
		//label4-show password
		appLabel4.setBounds(300, 320, 312,35);
		appLabel4.setForeground(new Color(0, 0, 0));
		appLabel4.setFont(new Font("San Francisco", Font.ROMAN_BASELINE, 25));
				
		appLabel4.setHorizontalAlignment(SwingConstants.CENTER);
				
		container.add(appLabel4);
		*/
		
        //user box
		AccNoField.setBounds(300, 290, 312, 32);
		AccNoField.setToolTipText("Enter Account-No:");
		AccNoField.setFont(new Font("San Francisco", Font.PLAIN, 16));
        container.add(AccNoField);
		
        
        //password box
        passwordField.setBounds(300, 350, 312, 37);
        passwordField.setToolTipText("Password");
        passwordField.setFont(new Font("San Francisco", Font.PLAIN, 16));
        container.add(passwordField);
        
        
        
        //# Check Boxes
        showPassword.setBounds(610, 360, 20, 20);
        showPassword.setBackground(Color.BLUE);
        showPassword.setToolTipText("Show Password");
        container.add(showPassword);
	    
      //# Buttons
        LoginButton.setBounds(300, 400, 97, 35);
        LoginButton.setHorizontalTextPosition(SwingConstants.CENTER);
        LoginButton.setVerticalTextPosition(SwingConstants.CENTER);
        LoginButton.setBackground(new Color(17, 84, 228));
        LoginButton.setFont(new Font("San Francisco", Font.BOLD, 17));
        LoginButton.setForeground(Color.WHITE);
        container.add(LoginButton);
		
		
        
        
        
        //Asif's Code
        HomeButton.setBounds(0,0, 97, 35);
        HomeButton.setHorizontalTextPosition(SwingConstants.CENTER);
        HomeButton.setBorder(null);
        HomeButton.setVerticalTextPosition(SwingConstants.CENTER);
        HomeButton.setBackground(new Color(3, 0, 0));
        //HomeButton.setBackground(new Color(0, 104, 227));
        HomeButton.setForeground(Color.WHITE);
        HomeButton.setFont(new Font("Times New Roman", Font.BOLD, 17));
        container.add(HomeButton);
        
        
        
        RegistrationButton.setBounds(96,0, 155, 35);
        RegistrationButton.setHorizontalTextPosition(SwingConstants.CENTER);
        RegistrationButton.setBorder(null);
        RegistrationButton.setVerticalTextPosition(SwingConstants.CENTER);
        RegistrationButton.setBackground(new Color(3, 0, 0));
        RegistrationButton.setForeground(Color.WHITE);
        RegistrationButton.setFont(new Font("Times New Roman", Font.BOLD, 17));
        container.add(RegistrationButton);
        
        
        DepositButton.setBounds(251,0, 97, 35);
        DepositButton.setHorizontalTextPosition(SwingConstants.CENTER);
        DepositButton.setBorder(null);
        DepositButton.setVerticalTextPosition(SwingConstants.CENTER);
        DepositButton.setBackground(new Color(3, 0, 0));
        DepositButton.setForeground(Color.WHITE);
        DepositButton.setFont(new Font("Times New Roman", Font.BOLD, 17));
         container.add(DepositButton);
         
         WithdrawButton.setBounds(347,0, 97, 35);
         WithdrawButton.setHorizontalTextPosition(SwingConstants.CENTER);
         WithdrawButton.setBorder(null);
         WithdrawButton.setVerticalTextPosition(SwingConstants.CENTER);
         WithdrawButton.setBackground(new Color(3, 0, 0));
         WithdrawButton.setForeground(Color.WHITE);
         WithdrawButton.setFont(new Font("Times New Roman", Font.BOLD, 17));
         container.add(WithdrawButton);
         
         
         TransferButton.setBounds(443,0, 155, 35);
         TransferButton.setHorizontalTextPosition(SwingConstants.CENTER);
         TransferButton.setBorder(null);
         TransferButton.setVerticalTextPosition(SwingConstants.CENTER);
         TransferButton.setBackground(new Color(3, 0, 0));
         TransferButton.setForeground(Color.WHITE);
         TransferButton.setFont(new Font("Times New Roman", Font.BOLD, 17));
         container.add(TransferButton);
         
         timeDate.setBounds(598, 0, 134, 35);
         timeDate.setHorizontalTextPosition(SwingConstants.CENTER);
         timeDate.setBorder(null);
         timeDate.setVerticalTextPosition(SwingConstants.CENTER);
         timeDate.setBackground(new Color(3, 0, 0));
         timeDate.setForeground(Color.WHITE);
         timeDate.setFont(new Font("Times New Roman", Font.BOLD, 14));
         container.add(timeDate);
          
          
          nullButton2.setBounds(866,0, 134, 35);
          nullButton2.setHorizontalTextPosition(SwingConstants.CENTER);
          nullButton2.setBorder(null);
          nullButton2.setVerticalTextPosition(SwingConstants.CENTER);
          nullButton2.setBackground(new Color(3, 0, 0));
          nullButton2.setForeground(Color.WHITE);
          nullButton2.setFont(new Font("Times New Roman", Font.BOLD, 17));
          container.add(nullButton2);
          
          
          
          nullButton3.setBounds(732,0, 134, 35);
          nullButton3.setHorizontalTextPosition(SwingConstants.CENTER);
          nullButton3.setBorder(null);
          nullButton3.setVerticalTextPosition(SwingConstants.CENTER);
          nullButton3.setBackground(new Color(3, 0, 0));
          nullButton3.setForeground(Color.WHITE);
          nullButton3.setFont(new Font("Times New Roman", Font.BOLD, 17));
          container.add(nullButton3);
        
        
          
          //Picture background
        bgImage.setBounds(200, 170, 650, 300);
  		bgImage.setHorizontalAlignment(SwingConstants.CENTER);
  		bgImage.setOpaque(false);
  	    container.add(bgImage);
        
	}
	 public void addActionEvent() {
		 LoginButton.addActionListener(this);
         RegistrationButton.addActionListener(this);
         HomeButton.addActionListener(this);
         WithdrawButton.addActionListener(this);
         DepositButton.addActionListener(this);
         TransferButton.addActionListener(this);
         showPassword.addActionListener(this);
	 }
	 
	 public void actionPerformed(ActionEvent e) {
			if(e.getSource()==LoginButton) {
				String passwordText;
				String accNumberText;
				accNumberText = AccNoField.getText();
				passwordText = passwordField.getText();
			
			try {
				String path = "F:\\JAVA_Eclipse\\E-Pay\\BankInfo.txt";
				FileReader fr = new FileReader(path);
				BufferedReader br = new BufferedReader(fr);
				boolean isLoginSuccess = false;
	            int u=0;
	            String line, accNumber, accpass, fuserPicture,accMobile,accAddress, accName, accAmount,accEmail;
	            while((line=br.readLine())!=null) {
	            	accName= line.split(" ")[0]+" "+line.split(" ")[1];
	            	accNumber = line.split(" ")[2];
	            	accpass = line.split(" ")[3];
	            	fuserPicture= line.split(" ")[4];
	            	accMobile = line.split(" ")[5];
	            	accAddress = line.split(" ")[6];
	            	accEmail = line.split(" ")[7];
	            	accAmount = line.split(" ")[8];
	            	
	            	
	            	
	            	/* if(fuserDomain.equalsIgnoreCase("northsouth.edu"))
		                {
		                	isfromNSU = true;
		                }*/
	            	if(accNumber.equals(accNumberText)&& accpass.equals(passwordText)) {
	            		isLoginSuccess = true;
	            		setVisible(false);
	            		
	            		UserProfileFrame profilePage = new  UserProfileFrame( accNumber, accpass, fuserPicture,accMobile,accAddress,accName,accAmount,accEmail);
	            		profilePage.setVisible(true);
		            break;
	            	}
	            	 else if(accNumber.equals(accNumberText))
		                {
		                	u++;
		                } 
	            	
	            }
	            if(!isLoginSuccess)
	            {
	            	if(u>0)
	            	{
	            		JOptionPane.showMessageDialog(null, "Invalid Password!", "WARNING!!", JOptionPane.WARNING_MESSAGE);
	            	}
	            	else
	            	{
	            		JOptionPane.showMessageDialog(null, "Invalid Number!", "WARNING!!", JOptionPane.WARNING_MESSAGE);
	            	}
	            }
	           
	            fr.close();
	            //get.close();
				
			}
			catch (Exception ep) {
				System.out.println("ERROR 404! File-Not-Found");
	            //ep.printStackTrace();
	        }
			
			}
			if(e.getSource()== RegistrationButton) {
	    		this.setVisible(false);
	    		CreateNewAccount ca = new CreateNewAccount();
	    		ca.setVisible(true);
	    	}
			if(e.getSource()== HomeButton) {
	    		this.setVisible(false);
	    		HomePageScreen hps = new HomePageScreen();
	    		hps.setVisible(true);
	    	}
	    	if(e.getSource()== WithdrawButton) {
				JOptionPane.showMessageDialog(null, "Please Log-in before you take any action", "WARNING!!", JOptionPane.ERROR_MESSAGE);
			}
			if(e.getSource()== TransferButton) {
				JOptionPane.showMessageDialog(null, "Please Log-in before you take any action", "WARNING!!", JOptionPane.ERROR_MESSAGE);
			}
			if(e.getSource()== DepositButton) {
				JOptionPane.showMessageDialog(null, "Please Log-in before you take any action", "WARNING!!", JOptionPane.ERROR_MESSAGE);
			}
			
			 if (e.getSource() == showPassword) 
		        {
		        	//int d = passwordField.getEchoChar();
		        	
		            if (showPassword.isSelected()) 
		            {
		            	passwordField.setEchoChar((char) 0);
		            }
		            else 
		            {
		            	passwordField.setEchoChar((char) 8226);
		            }
		        }
			
			
	 }
	 
	
	/* public static void main (String[] args) {
		LoginFrame lf = new LoginFrame();
		lf.setVisible(true);
	} */
	
	
}

