
/**
 *
 * @author jawed
 */

import java.util.*; 
  
import javax.swing.*;

//import Dem.HomePage;
//import Demo.SignUpFrame;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
/**
 *
 * @author jawed
 */
public class CreateNewAccount extends JFrame implements ActionListener{
    private Container container;
    
    Date dNow = new Date();
    SimpleDateFormat ft = new SimpleDateFormat("hh:mm a dd/MM/yyyy");
    private ImageIcon icon;
    String path = "F:\\JAVA_Eclipse\\E-Pay\\BankInfo.txt";
    JLabel createAccount = new JLabel("Create New Account");
    JLabel firstName = new JLabel("First Name");
    JLabel lastName = new JLabel("Last Name");
    JLabel address = new JLabel("Address");
    JLabel accnumber = new JLabel("Account Number");
    JLabel password = new JLabel("Password");
    JLabel repassword = new JLabel("Re-Password");
    JLabel phoneNumber = new JLabel("Phone Number");
    JLabel email = new JLabel("Email");
    JLabel amount = new JLabel("Amount");
    JLabel profilePicture =new JLabel("Profile Picture");
    
    JTextField firstNameBox = new JTextField();
    JTextField lastNameBox = new JTextField();
    JTextField addressBox = new JTextField();
    JTextField accnumberBox = new JTextField();
    JTextField passwordBox = new JTextField();
    JTextField repasswordBox = new JTextField();
    JTextField phoneNumberBox = new JTextField();
    JTextField emailBox = new JTextField();
    JTextField amountBox = new JTextField();
    JTextField profilePictureBox = new JTextField();
    
    JButton LoginButton = new JButton("Login");
	JButton RegistrationButton = new JButton("Create new account");
	JButton WithdrawButton = new JButton ("Withdraw");
	JButton DepositButton = new JButton ("Deposit");
	JButton TransferButton = new JButton ("Transfer");
	JButton timeDate = new JButton(ft.format(dNow));
	JButton nullButton2 = new JButton("");
	JButton SignupButton = new JButton("Sign up");

	JButton HomeButton = new JButton ("Home");	
    
    public CreateNewAccount(){
	this.setTitle("E-PAY ");
		
		//setBounds(int Xaxis, int Yaxis, int width, int height)
		this.setBounds(16,45,1000,700);
		
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       Initialize();
       addActionEvent();
    }
    public void Initialize(){
        container = this.getContentPane();
        container.setLayout(null);
		container.setBackground(new Color(244, 247, 241));
        
      //  icon = new ImageIcon(getClass().getResource("icon.png"));
       // this.setIconImage(icon.getImage());
		
		
		 HomeButton.setBounds(0,0, 97, 35);
	     HomeButton.setHorizontalTextPosition(SwingConstants.CENTER);
	     HomeButton.setBorder(null);
	     HomeButton.setVerticalTextPosition(SwingConstants.CENTER);
	     HomeButton.setBackground(new Color(3, 0, 0));
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
	     
	      	timeDate.setBounds(598, 0, 255, 35);
	        timeDate.setHorizontalTextPosition(SwingConstants.CENTER);
	        timeDate.setBorder(null);
	        timeDate.setVerticalTextPosition(SwingConstants.CENTER);
	        timeDate.setBackground(new Color(3, 0, 0));
	        timeDate.setForeground(Color.WHITE);
	        timeDate.setFont(new Font("Times New Roman", Font.BOLD, 14));
	        container.add(timeDate);
	      
	      
	     
	     LoginButton.setBounds(850, 0, 134, 35);
	     LoginButton.setHorizontalTextPosition(SwingConstants.CENTER);
	     //LoginButton.setBorder(null);
	     LoginButton.setVerticalTextPosition(SwingConstants.CENTER);
	     LoginButton.setBackground(new Color(17, 84, 228));
	     LoginButton.setForeground(Color.WHITE);
	     LoginButton.setFont(new Font("Times New Roman", Font.BOLD, 17));
	     container.add(LoginButton);
	       
	      
	      nullButton2.setBounds(866,0, 134, 35);
	      nullButton2.setHorizontalTextPosition(SwingConstants.CENTER);
	      nullButton2.setBorder(null);
	      nullButton2.setVerticalTextPosition(SwingConstants.CENTER);
	      nullButton2.setBackground(new Color(3, 0, 0));
	      nullButton2.setForeground(Color.WHITE);
	      nullButton2.setFont(new Font("Times New Roman", Font.BOLD, 17));
	      container.add(nullButton2);
		
		
        
        createAccount.setBounds(240, 50, 500, 80);
        createAccount.setForeground(Color.BLACK);
        createAccount.setFont(new Font("San Francisco", Font.BOLD, 30));
        createAccount.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(createAccount);
        
        firstName.setBounds(173, 150, 312,37);
        firstName.setForeground(Color.BLACK);
        firstName.setFont(new Font("San Francisco", Font.PLAIN, 16));
        firstName.setHorizontalAlignment(SwingConstants.LEFT);
        container.add(firstName);
        
        firstNameBox.setBounds(173, 180, 312, 32);
        firstNameBox.setToolTipText("enter frist name");
        firstNameBox.setFont(new Font("San Francisco", Font.PLAIN, 16));
        container.add(firstNameBox);
        
        lastName.setBounds(373, 150, 312,37);
        lastName.setForeground(Color.BLACK);
        lastName.setFont(new Font("San Francisco", Font.PLAIN, 16));
        lastName.setHorizontalAlignment(SwingConstants.RIGHT);
        container.add(lastName);
        
        lastNameBox.setBounds(610, 180, 312, 32);
        lastNameBox.setToolTipText("enter last name");
        lastNameBox.setFont(new Font("San Francisco", Font.PLAIN, 16));
        container.add(lastNameBox);
        
        address.setBounds(173, 210, 312,37);
        address.setForeground(Color.BLACK);
        address.setFont(new Font("San Francisco", Font.PLAIN, 16));
        address.setHorizontalAlignment(SwingConstants.LEFT);
        container.add(address);
        
        addressBox.setBounds(173, 240, 312, 32);
        addressBox.setToolTipText("enter address");
        addressBox.setFont(new Font("San Francisco", Font.PLAIN, 16));
        container.add(addressBox);
        
        accnumber.setBounds(173, 270, 312,37);
        accnumber.setForeground(Color.BLACK);
        accnumber.setFont(new Font("San Francisco", Font.PLAIN, 16));
        accnumber.setHorizontalAlignment(SwingConstants.LEFT);
        container.add(accnumber);
        
        accnumberBox.setBounds(173, 300, 312, 32);
        accnumberBox.setToolTipText("enter user name");
        accnumberBox.setFont(new Font("San Francisco", Font.PLAIN, 16));
        container.add(accnumberBox);
        
        password.setBounds(173, 330, 312,37);
        password.setForeground(Color.BLACK);
        password.setFont(new Font("San Francisco", Font.PLAIN, 16));
        password.setHorizontalAlignment(SwingConstants.LEFT);
        container.add(password);
        
        passwordBox.setBounds(173, 360, 312, 32);
        passwordBox.setToolTipText("enter password");
        passwordBox.setFont(new Font("San Francisco", Font.PLAIN, 16));
        container.add(passwordBox);
        
        repassword.setBounds(393, 330, 312,37);
        repassword.setForeground(Color.BLACK);
        repassword.setFont(new Font("San Francisco", Font.PLAIN, 16));
        repassword.setHorizontalAlignment(SwingConstants.RIGHT);
        container.add(repassword);
        
        repasswordBox.setBounds(610, 360, 312, 32);
        repasswordBox.setToolTipText("enter re-password");
        repasswordBox.setFont(new Font("San Francisco", Font.PLAIN, 16));
        container.add(repasswordBox);
        
        phoneNumber.setBounds(173, 390, 312, 37);
        phoneNumber.setForeground(Color.BLACK);
        phoneNumber.setFont(new Font("San Francisco", Font.PLAIN, 16));
        phoneNumber.setHorizontalAlignment(SwingConstants.LEFT);
        container.add(phoneNumber);
        
        phoneNumberBox.setBounds(173, 420, 312, 32);
        phoneNumberBox.setToolTipText("enter phone number");
        phoneNumberBox.setFont(new Font("San Francisco", Font.PLAIN, 16));
        container.add(phoneNumberBox);
        
        email.setBounds(338, 390, 312, 37);
        email.setForeground(Color.BLACK);
        email.setFont(new Font("San Francisco", Font.PLAIN, 16));
        email.setHorizontalAlignment(SwingConstants.RIGHT);
        container.add(email);
        
        emailBox.setBounds(610, 420, 312, 32);
        emailBox.setToolTipText("enter email");
        emailBox.setFont(new Font("San Francisco", Font.PLAIN, 16));
        container.add(emailBox);
        
        amount.setBounds(173, 450, 312, 37);
        amount.setForeground(Color.BLACK);
        amount.setFont(new Font("San Francisco", Font.PLAIN, 16));
        amount.setHorizontalAlignment(SwingConstants.LEFT);
        container.add(amount);
        
        amountBox.setBounds(173, 480, 312, 32);
        amountBox.setToolTipText("enter amount");
        amountBox.setFont(new Font("San Francisco", Font.PLAIN, 16));
        container.add(amountBox);
        
        profilePicture.setBounds(173, 510, 312, 37);
        profilePicture.setForeground(Color.BLACK);
        profilePicture.setFont(new Font("San Francisco", Font.PLAIN, 16));
        profilePicture.setHorizontalAlignment(SwingConstants.LEFT);
        container.add(profilePicture);
        
        profilePictureBox.setBounds(173, 540, 312, 32);
        profilePictureBox.setToolTipText("enter link");
        profilePictureBox.setFont(new Font("San Francisco", Font.PLAIN, 16));
        container.add(profilePictureBox);
        
        SignupButton.setBounds(610,540, 97, 35);
      //  SignupButton.setHorizontalTextPosition(SwingConstants.CENTER);
        //SignupButton.setVerticalTextPosition(SwingConstants.CENTER);
        SignupButton.setBackground(new Color(228, 108, 84));
        SignupButton.setForeground(Color.WHITE);
        SignupButton.setFont(new Font("San Francisco", Font.BOLD, 17));
        container.add(SignupButton);
        
    }
    public void addActionEvent() {
    	 LoginButton.addActionListener(this);
         RegistrationButton.addActionListener(this);
         HomeButton.addActionListener(this);
         WithdrawButton.addActionListener(this);
         DepositButton.addActionListener(this);
         TransferButton.addActionListener(this);
         SignupButton.addActionListener(this);
	 }
    public boolean Check(String number){
    	String line;
    	try {
    		FileReader fr = new FileReader(path);
    		BufferedReader br = new BufferedReader(fr);
    	
    		while((line = br.readLine())!=null) {
    			if(line.split(" ")[2].equals(number)) {
    				return true;
    				}
    			}
    		}
    	catch (Exception ep) {
    		System.out.println("ERROR 404! File-Not-Found");
            //ep.printStackTrace();
        }
    	return false;
    	}

    public void actionPerformed(ActionEvent e) {
    	
    	if(e.getSource()==LoginButton) {
    		this.setVisible(false);
    		LoginFrame lpage = new LoginFrame();
    		lpage.setVisible(true);
    	} 
    	
    	if(e.getSource()==SignupButton) {
    		
    	
    		try {
    			if(!Check(accnumberBox.getText())){
    			FileWriter myWriter = new FileWriter(path,true);
    			myWriter.write(firstNameBox.getText()+" "+lastNameBox.getText()+" "+accnumberBox.getText()+" "+passwordBox.getText()+" "+profilePictureBox.getText()+" "+phoneNumberBox.getText()+" "+addressBox.getText()+" "+emailBox.getText()+" "+amountBox.getText()+"\n");
    			myWriter.close();
    			JOptionPane.showMessageDialog(null, "Successfully Registered! Please Login to continue...","Confirmation", JOptionPane.WARNING_MESSAGE);
    			}
    			else
    		      {
    		    	  JOptionPane.showMessageDialog(null, "Username already in use!","Confirmation", JOptionPane.WARNING_MESSAGE);
    		      }
    		}
    		catch (IOException ep) {
    		      System.out.println("ERROR 404! File-Not-Found");
    		      ep.printStackTrace();
    		    }
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
    	
    	}
   /* public static void main(String[] args) {
        
       CreateNewAccount frame = new CreateNewAccount();
       frame.setVisible(true);
     
    }  */ 
}



