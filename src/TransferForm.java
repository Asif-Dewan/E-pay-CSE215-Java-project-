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
import java.text.SimpleDateFormat;
public class TransferForm extends JFrame implements ActionListener {

Container container=getContentPane();

Date dNow = new Date();
SimpleDateFormat ft = new SimpleDateFormat("hh:mm a dd/MM/yyyy");

	//Declaring Variables
String accNumber;String accpass;String fuserPicture;String accMobile;String accAddress;String accName;String accAmount;String accEmail;

	
	//Application label
	JLabel appLabel =new JLabel("Account No");
	JLabel appLabel2 =new JLabel("Target Account ");
	JLabel appLabel3 =new JLabel("User Name");
	JLabel appLabel4 =new JLabel("Password");
	JLabel appLabel5 =new JLabel("Transfer Form");
	JLabel appLabel6 =new JLabel("Amount");
	
	
	JTextField AcTextField = new JTextField();
	JTextField TargetACTextField = new JTextField();
	JTextField usernameTextField = new JTextField();
	 JPasswordField passwordTextField = new JPasswordField();
	 JTextField amountTextField = new JTextField();
	 
	 JCheckBox showPassword = new JCheckBox("Show Password");
	
	 JButton submitButton=new JButton("Submit");
	
    
    JButton HomeButton = new JButton("Home");
    JButton RegistrationButton=new JButton("Create new Account");
    JButton DepositButton = new JButton ("Deposit");
    JButton WithdrawButton = new JButton ("Withdraw");
    JButton TransferButton = new JButton ("Transfer");
    JButton timeDate = new JButton(ft.format(dNow));
	JButton nullButton2 = new JButton("");
	
	JButton nullButton3 = new JButton("");
	
	
	JLabel line1 = new JLabel(new ImageIcon("F:\\JAVA_Eclipse\\E-Pay\\rainbow.jpg"));
    
	JLabel line2 = new JLabel(new ImageIcon("F:\\JAVA_Eclipse\\E-Pay\\rainbow.jpg"));
    
	
	TransferForm(String accNumber,String accpass,String fuserPicture,String accMobile,String accAddress,String accName,String accAmount,String accEmail){
		
		this.accNumber=accNumber;
    	this.accpass=accpass;
    	this.fuserPicture =fuserPicture;
    	this.accMobile =accMobile;
    	this.accAddress = accAddress;
    	this.accName=accName;
    	this.accAmount=accAmount;
    	this.accEmail= accEmail;
    	
    	
    	
         this.setTitle("E-PAY ");
		
		//setBounds(int Xaxis, int Yaxis, int width, int height)
		this.setBounds(16,45,1000,700);
		
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//this.setIconImage(Toolkit.getDefaultToolkit().getImage(""));
		
		
		
		Initialize();
		
		 addActionEvent();
		
	}
public void Initialize() {
		
		container.setLayout(null);
		container.setBackground(new Color(244, 247, 241));
		
		
	    //Label -Ac no
		
		appLabel.setBounds(200, 212, 312,37);
		appLabel.setForeground(new Color(0, 0, 0));
		appLabel.setFont(new Font("San Francisco", Font.ROMAN_BASELINE, 17));
		
		appLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		container.add(appLabel);
		
		
		
		//label2-target ac
		appLabel2.setBounds(195, 263, 312,37);
		appLabel2.setForeground(new Color(0, 0, 0));
		appLabel2.setFont(new Font("San Francisco", Font.ROMAN_BASELINE, 17));
		
		appLabel2.setHorizontalAlignment(SwingConstants.CENTER);
		
		container.add(appLabel2);
		
         
		//label3-username
		appLabel3.setBounds(190, 320, 312,37);
		appLabel3.setForeground(new Color(0, 0, 0));
		appLabel3.setFont(new Font("San Francisco", Font.ROMAN_BASELINE, 17));
				
		appLabel3.setHorizontalAlignment(SwingConstants.CENTER);
				
		container.add(appLabel3);
		
		
		//label4- password
		appLabel4.setBounds(185, 370, 312,37);
		appLabel4.setForeground(new Color(0, 0, 0));
		appLabel4.setFont(new Font("San Francisco", Font.ROMAN_BASELINE, 17));
				
		appLabel4.setHorizontalAlignment(SwingConstants.CENTER);
				
		container.add(appLabel4);
		
		
		
		//label5- withdraw form
		appLabel5.setBounds(270, 150, 312,37);
		appLabel5.setForeground(new Color(0, 0, 0));
		appLabel5.setFont(new Font("San Francisco", Font.ROMAN_BASELINE, 35));
				
		appLabel5.setHorizontalAlignment(SwingConstants.CENTER);
				
		container.add(appLabel5);
		
		
		
		//label6- amount
				appLabel6.setBounds(185,420, 312,37);
				appLabel6.setForeground(new Color(0, 0, 0));
				appLabel6.setFont(new Font("San Francisco", Font.ROMAN_BASELINE, 17));
						
				appLabel6.setHorizontalAlignment(SwingConstants.CENTER);
						
				container.add(appLabel6);
		
		
        //Ac box
		AcTextField.setBounds(430, 212, 312, 37);
		AcTextField.setToolTipText("Enter Account No.");
		AcTextField.setFont(new Font("San Francisco", Font.PLAIN, 16));
        container.add(AcTextField);
		
        
        
        
        //Target ac box
        TargetACTextField.setBounds(430, 263, 312, 37);
        TargetACTextField.setToolTipText("Enter Target Account");
        TargetACTextField.setFont(new Font("San Francisco", Font.PLAIN, 16));
        container.add(TargetACTextField);
        
        //username box
        usernameTextField.setBounds(430, 320, 312, 37);
        usernameTextField.setToolTipText("Enter username");
        usernameTextField.setFont(new Font("San Francisco", Font.PLAIN, 16));
        container.add(usernameTextField);
        
        
        //password box
        passwordTextField.setBounds(430, 370, 312, 37);
        passwordTextField.setToolTipText("Enter passowrd");
        passwordTextField.setFont(new Font("San Francisco", Font.PLAIN, 16));
        container.add(passwordTextField);
        
        //# Check Boxes
        showPassword.setBounds(740, 370, 20, 20);
        showPassword.setBackground(Color.BLUE);
        showPassword.setToolTipText("Show Password");
        container.add(showPassword);
        
        //amount box
        amountTextField.setBounds(430, 420, 312, 37);
        amountTextField.setToolTipText("Enter amount");
        amountTextField.setFont(new Font("San Francisco", Font.PLAIN, 16));
        container.add(amountTextField);
        
       // submitButtons
        submitButton.setBounds(300, 490, 97, 35);
        submitButton.setHorizontalTextPosition(SwingConstants.CENTER);
        submitButton.setVerticalTextPosition(SwingConstants.CENTER);
        submitButton.setBackground(new Color(46, 204, 113));
        submitButton.setFont(new Font("San Francisco", Font.BOLD, 17));
        container.add(submitButton);
        
       
        
        
        //Asif's Code
        HomeButton.setBounds(0,0, 97, 35);
        HomeButton.setHorizontalTextPosition(SwingConstants.CENTER);
        HomeButton.setBorder(null);
        HomeButton.setVerticalTextPosition(SwingConstants.CENTER);
        //HomeButton.setBackground(new Color(3, 0, 0));
        HomeButton.setBackground(new Color(0, 104, 227));
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
          line1.setBounds(200, 190, 650, 4);
  		 line1.setHorizontalAlignment(SwingConstants.CENTER);
  		  line1.setOpaque(false);
  	      container.add(line1);
  	      
  	      
  	    //Picture background
          line2.setBounds(200, 470, 650, 4);
  		 line2.setHorizontalAlignment(SwingConstants.CENTER);
  		  line2.setOpaque(false);
  	      container.add(line2);
        
        
        
	}

	public void addActionEvent() {
		 showPassword.addActionListener(this);
	       RegistrationButton.addActionListener(this);
	       HomeButton.addActionListener(this);
	       WithdrawButton.addActionListener(this);
	       DepositButton.addActionListener(this);
	       //TransferButton.addActionListener(this);
	       submitButton.addActionListener(this);
   
}
	
	public void actionPerformed(ActionEvent e) {
		 if(e.getSource()== HomeButton) {
		    	JOptionPane.showMessageDialog(null, "Please Logout from your account!", "WARNING!!", JOptionPane.ERROR_MESSAGE);
				
			}
		 if(e.getSource()== WithdrawButton) {
				setVisible(false);
				WithdrawForm wf = new WithdrawForm(accNumber,accpass, fuserPicture,accMobile, accAddress, accName, accAmount, accEmail);
				wf.setVisible(true);
			}
		 if(e.getSource()== DepositButton) {
				setVisible(false);
				DepositForm df = new DepositForm(accNumber,accpass,fuserPicture,accMobile,accAddress,accName, accAmount, accEmail);
				df.setVisible(true);		
				}
		 
	 if(e.getSource()== submitButton) {	
				
			 	double newAmount,recievedAmount;
	            double userAmount = Double.parseDouble(accAmount);
	            double transferAmount = Double.parseDouble(amountTextField.getText());
	            if (transferAmount < userAmount) {
	                newAmount = userAmount - transferAmount;
	                System.out.println(newAmount);
	                
	                
	                //File Work
	                
	               /* 
	                String filePath = "BankInfo.txt";
	            	
	            	String tempFile = "File2.txt";
	            	File oldFile  = new File(filePath);
	            	File newFile  = new File(tempFile);
	            	
	            	
	            	//String firstName = ""; String lastName= ""; String Id =""; String amount = "";
	            	
	            	try {
	            	
	            		//FileWriter fw = new FileWriter(tempFile,true);
	            		//BufferedWriter bw = new BufferedWriter(fw);
	            		FileWriter myWriter = new FileWriter(tempFile,false);
	            		
	            		
	            		FileReader fr = new FileReader(oldFile);
	            		BufferedReader br = new BufferedReader(fr);
	            		
	            		String line;
	            		while((line=br.readLine())!=null) {
	            			//firstName = myReader.next();
	            			//lastName = myReader.next();
	            			//Id = myReader.next();
	            			//amount = myReader.next();
	            		
	            		
	            		myWriter.write(line+"\n");

	            			
	            		}
	            		br.close();
	            		myWriter.flush();
	            		myWriter.close();
	            		System.out.println(oldFile.delete());
	            		
	            		File newTemp = new File(filePath);
	            		
	            		System.out.println(newTemp.createNewFile());
	            		
	            		
	            		//FileWriter fw2 = new FileWriter(filePath,true);
	            		//BufferedWriter bw2 = new BufferedWriter(fw2);
	            		FileWriter myWriter2 = new FileWriter(filePath,false);
	            		

	            		FileReader fr2 = new FileReader(newFile);
	            		BufferedReader br2 = new BufferedReader(fr2);
	            		
	            		
	            		String line2;
	            		String AccNumber="";String Accpass="";String FuserPicture="";String AccMobile="";String AccAddress="";String AccName="";String AccAmount="";String AccEmail="";
	            		while((line2=br2.readLine())!=null) {
	            			//firstName = myReader.next();
	            			//lastName = myReader.next();
	            			//Id = myReader.next();
	            			//amount = myReader.next();
	            			
	            			
	            		if((!(line2.startsWith(this.accName))&&(!(line2.startsWith(TargetACTextField.getText()))))) {
	            			myWriter2.write(line2+"\n");
	            		}
	            		else if ((line2.startsWith(TargetACTextField.getText()))){
	            			AccName= line2.split(" ")[0]+" "+line.split(" ")[1];
	    	            	AccNumber = line2.split(" ")[2];
	    	            	Accpass = line2.split(" ")[3];
	    	            	FuserPicture= line2.split(" ")[4];
	    	            	AccMobile = line2.split(" ")[5];
	    	            	AccAddress = line2.split(" ")[6];
	    	            	AccEmail = line2.split(" ")[7];
	    	            	AccAmount = line2.split(" ")[8];
	    	            	
	            			
	            		}
	            		
	            		

	            			
	            		}
	            		myWriter2.write(this.accName+" "+this.accNumber+" "+this.accpass+" "+this.fuserPicture+" "+this.accNumber+" "+this.accAddress+" "+this.accEmail+" "+newAmount+"\n");
	            		
	            		myWriter2.write(AccName+" "+AccNumber+" "+Accpass+" "+FuserPicture+" "+AccNumber+" "+AccAddress+" "+AccEmail+" "+transferAmount+"\n");

	            		
	            		br2.close();
	            		myWriter2.flush();
	            		myWriter2.close();
	            		
	            		System.out.println(newFile.delete());
	            		
	            		
	            		
	            		
	            		
	            	}catch(Exception op) {
	            		System.out.println("Error occured!");
	            		
	            	}
	                
	                
	            } 
	            
	            //File End
	              
	             */
	            
	            
	            else {
	                System.out.println("Txn. Failed!");
	            }
	            
	           
			 
			 
	            JOptionPane.showMessageDialog(null, "Deposit Completed, Please Login again to continue", "WARNING!!", JOptionPane.WARNING_MESSAGE);

				setVisible(false);
				HomePageScreen hpc = new HomePageScreen();
				hpc.setVisible(true);
			
			
			}
		 
		 if (e.getSource() == showPassword) 
	        {
	        	//int d = passwordField.getEchoChar();
	        	
	            if (showPassword.isSelected()) 
	            {
	            	passwordTextField.setEchoChar((char) 0);
	            }
	            else 
	            {
	            	passwordTextField.setEchoChar((char) 8226);
	            }
	        }
		// EKHONO SET Kora BAKI ASE;
		
	}
	
	/*public static void main(String[] args) {
		TransferForm tf = new TransferForm();
		tf.setVisible(true);
	}*/
	
}

