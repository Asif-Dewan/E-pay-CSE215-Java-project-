
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
import java.text.SimpleDateFormat;

public class UserProfileFrame extends JFrame implements ActionListener 
{
	String accNumber;String accpass;String fuserPicture;String accMobile;String accAddress;String accName;String accAmount;String accEmail;
    Container container = getContentPane();
    Date dNow = new Date();
    SimpleDateFormat ft = new SimpleDateFormat("hh:mm a dd/MM/yyyy");
    
    ShowItem si = new ShowItem();
    JLabel userInformation = new JLabel("User Information");
    String path = "F:\\JAVA_Eclipse\\E-Pay\\BankInfo.txt";
    JLabel userName = new JLabel("User Name");
    JLabel showName;

    JLabel address = new JLabel("Address");
    JLabel showAddress ;

    JLabel phoneNumber = new JLabel("Phone Number");
    JLabel showPhoneNumber;

    JLabel email = new JLabel("Email");
    JLabel showEmail;

    JLabel balance = new JLabel("Balance");
    JLabel showBalance ;

    JLabel profilePicture = new JLabel("Profile Picture : ");
    JLabel showProfilePicture;

    JButton LogoutButton = new JButton("Logout");
    JButton registrationButton = new JButton("Sign Up");
    JButton HomeButton = new JButton("Home");
    JButton RegistrationButton = new JButton("Create new Account");
    JButton DepositButton = new JButton("Deposit");
    JButton WithdrawButton = new JButton("Withdraw");
    JButton TransferButton = new JButton("Transfer");
    JButton timeDate = new JButton(ft.format(dNow));
    JButton nullButton2 = new JButton("");
    JButton nullButton3 = new JButton("");

    JLabel userImage;

    UserProfileFrame(String accNumber,String accpass,String fuserPicture,String accMobile,String accAddress,String accName,String accAmount,String accEmail) {

    	 this.accNumber=accNumber;
    	this.accpass=accpass;
    	this.fuserPicture =fuserPicture;
    	this.accMobile =accMobile;
    	this.accAddress = accAddress;
    	this.accName=accName;
    	this.accAmount=accAmount;
    	this.accEmail= accEmail;
    	
    	
    	showName =  new JLabel(": "+accName);
    	showAddress =  new JLabel(": "+accAddress);
    	showPhoneNumber =  new JLabel(": "+accMobile);
    	showEmail =  new JLabel(": "+accEmail);
    	showBalance = new JLabel(": "+accAmount);
    	showProfilePicture = new JLabel(": "+fuserPicture);
    	
        this.setTitle("E-PAY ");

        //setBounds(int Xaxis, int Yaxis, int width, int height)
        this.setBounds(16, 45, 1000, 700);

        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        userImage = new JLabel(new ImageIcon(fuserPicture));

        Initialize();
        addActionEvent();
    }

    public String getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}

	public String getAccpass() {
		return accpass;
	}

	public void setAccpass(String accpass) {
		this.accpass = accpass;
	}

	public String getFuserPicture() {
		return fuserPicture;
	}

	public void setFuserPicture(String fuserPicture) {
		this.fuserPicture = fuserPicture;
	}

	public String getAccMobile() {
		return accMobile;
	}

	public void setAccMobile(String accMobile) {
		this.accMobile = accMobile;
	}

	public String getAccAddress() {
		return accAddress;
	}

	public void setAccAddress(String accAddress) {
		this.accAddress = accAddress;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public String getAccAmount() {
		return accAmount;
	}

	public void setAccAmount(String accAmount) {
		this.accAmount = accAmount;
	}

	public String getAccEmail() {
		return accEmail;
	}

	public void setAccEmail(String accEmail) {
		this.accEmail = accEmail;
	}

	public JLabel getAddress() {
		return address;
	}

	public void setAddress(JLabel address) {
		this.address = address;
	}

	public JLabel getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(JLabel phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public JLabel getEmail() {
		return email;
	}

	public void setEmail(JLabel email) {
		this.email = email;
	}

	public JLabel getBalance() {
		return balance;
	}

	public void setBalance(JLabel balance) {
		this.balance = balance;
	}

	public JLabel getProfilePicture() {
		return profilePicture;
	}

	public void setProfilePicture(JLabel profilePicture) {
		this.profilePicture = profilePicture;
	}

	public void Initialize() {

        container.setLayout(null);
        container.setBackground(new Color(244, 247, 241));

        HomeButton.setBounds(0, 0, 97, 35);
        HomeButton.setHorizontalTextPosition(SwingConstants.CENTER);
        HomeButton.setBorder(null);
        HomeButton.setVerticalTextPosition(SwingConstants.CENTER);
        HomeButton.setBackground(new Color(3, 0, 0));
        HomeButton.setForeground(Color.WHITE);
        HomeButton.setFont(new Font("Times New Roman", Font.BOLD, 17));
        container.add(HomeButton);

        RegistrationButton.setBounds(96, 0, 155, 35);
        RegistrationButton.setHorizontalTextPosition(SwingConstants.CENTER);
        RegistrationButton.setBorder(null);
        RegistrationButton.setVerticalTextPosition(SwingConstants.CENTER);
        RegistrationButton.setBackground(new Color(3, 0, 0));
        RegistrationButton.setForeground(Color.WHITE);
        RegistrationButton.setFont(new Font("Times New Roman", Font.BOLD, 17));
        container.add(RegistrationButton);

        DepositButton.setBounds(251, 0, 97, 35);
        DepositButton.setHorizontalTextPosition(SwingConstants.CENTER);
        DepositButton.setBorder(null);
        DepositButton.setVerticalTextPosition(SwingConstants.CENTER);
        DepositButton.setBackground(new Color(3, 0, 0));
        DepositButton.setForeground(Color.WHITE);
        DepositButton.setFont(new Font("Times New Roman", Font.BOLD, 17));
        container.add(DepositButton);

        WithdrawButton.setBounds(347, 0, 97, 35);
        WithdrawButton.setHorizontalTextPosition(SwingConstants.CENTER);
        WithdrawButton.setBorder(null);
        WithdrawButton.setVerticalTextPosition(SwingConstants.CENTER);
        WithdrawButton.setBackground(new Color(3, 0, 0));
        WithdrawButton.setForeground(Color.WHITE);
        WithdrawButton.setFont(new Font("Times New Roman", Font.BOLD, 17));
        container.add(WithdrawButton);

        TransferButton.setBounds(443, 0, 155, 35);
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
        
        
        LogoutButton.setBounds(850, 0, 134, 35);
        LogoutButton.setHorizontalTextPosition(SwingConstants.CENTER);
        LogoutButton.setVerticalTextPosition(SwingConstants.CENTER);
        LogoutButton.setBackground(new Color(228, 108, 84));
        LogoutButton.setForeground(Color.WHITE);
        LogoutButton.setFont(new Font("Times New Roman", Font.BOLD, 17));
        container.add(LogoutButton);

        nullButton2.setBounds(866, 0, 134, 35);
        nullButton2.setHorizontalTextPosition(SwingConstants.CENTER);
        nullButton2.setBorder(null);
        nullButton2.setVerticalTextPosition(SwingConstants.CENTER);
        nullButton2.setBackground(new Color(3, 0, 0));
        nullButton2.setForeground(Color.WHITE);
        nullButton2.setFont(new Font("Times New Roman", Font.BOLD, 17));
        container.add(nullButton2);

        userImage.setBounds(700, 100, 215, 215);
        userImage.setHorizontalAlignment(SwingConstants.CENTER);
        userImage.setOpaque(true);
        container.add(userImage);
        
        userInformation.setBounds(150, 50, 500, 80);
        userInformation.setForeground(Color.BLACK);
        userInformation.setFont(new Font("San Francisco", Font.BOLD, 30));
        userInformation.setHorizontalAlignment(SwingConstants.CENTER);
        container.add(userInformation);
        
        userName.setBounds(100, 150, 312, 37);
        userName.setForeground(Color.BLACK);
        userName.setFont(new Font("San Francisco", Font.PLAIN, 16));
        userName.setHorizontalAlignment(SwingConstants.LEFT);
        container.add(userName);
        
        showName.setBounds(220, 150, 312, 37);
        showName.setForeground(Color.BLACK);
        showName.setFont(new Font("San Francisco", Font.PLAIN, 16));
        showName.setHorizontalAlignment(SwingConstants.LEFT);
        container.add(showName);
        
        address.setBounds(100, 195, 312, 37);
        address.setForeground(Color.BLACK);
        address.setFont(new Font("San Francisco", Font.PLAIN, 16));
        address.setHorizontalAlignment(SwingConstants.LEFT);
        container.add(address);
        
        showAddress.setBounds(220, 195, 312, 37);
        showAddress.setForeground(Color.BLACK);
        showAddress.setFont(new Font("San Francisco", Font.PLAIN, 16));
        showAddress.setHorizontalAlignment(SwingConstants.LEFT);
        container.add(showAddress);
        
        phoneNumber.setBounds(100, 240, 312, 37);
        phoneNumber.setForeground(Color.BLACK);
        phoneNumber.setFont(new Font("San Francisco", Font.PLAIN, 16));
        phoneNumber.setHorizontalAlignment(SwingConstants.LEFT);
        container.add(phoneNumber);
        
        showPhoneNumber.setBounds(220, 240, 312, 37);
        showPhoneNumber.setForeground(Color.BLACK);
        showPhoneNumber.setFont(new Font("San Francisco", Font.PLAIN, 16));
        showPhoneNumber.setHorizontalAlignment(SwingConstants.LEFT);
        container.add(showPhoneNumber);
        
        email.setBounds(100, 285, 312, 37);
        email.setForeground(Color.BLACK);
        email.setFont(new Font("San Francisco", Font.PLAIN, 16));
        email.setHorizontalAlignment(SwingConstants.LEFT);
        container.add(email);
        
        showEmail.setBounds(220, 285, 312, 37);
        showEmail.setForeground(Color.BLACK);
        showEmail.setFont(new Font("San Francisco", Font.PLAIN, 16));
        showEmail.setHorizontalAlignment(SwingConstants.LEFT);
        container.add(showEmail);
        
        balance.setBounds(100, 330, 312, 37);
        balance.setForeground(Color.BLACK);
        balance.setFont(new Font("San Francisco", Font.PLAIN, 16));
        balance.setHorizontalAlignment(SwingConstants.LEFT);
        container.add(balance);
        
        showBalance.setBounds(220, 330, 312, 37);
        showBalance.setForeground(Color.BLACK);
        showBalance.setFont(new Font("San Francisco", Font.PLAIN, 16));
        showBalance.setHorizontalAlignment(SwingConstants.LEFT);
        container.add(showBalance);

    }
    public void addActionEvent() {
		LogoutButton.addActionListener(this);
        RegistrationButton.addActionListener(this);
        HomeButton.addActionListener(this);
        WithdrawButton.addActionListener(this);
        DepositButton.addActionListener(this);
        TransferButton.addActionListener(this);
        
	 }
    public void actionPerformed(ActionEvent e) {
    if(e.getSource()== LogoutButton) {
		this.setVisible(false);
		HomePageScreen hps = new HomePageScreen();
		hps.setVisible(true);
	}
    if(e.getSource()== HomeButton) {
    	JOptionPane.showMessageDialog(null, "Please Logout from your account!", "WARNING!!", JOptionPane.ERROR_MESSAGE);
		
	}
	if(e.getSource()== WithdrawButton) {
		setVisible(false);
		WithdrawForm wf = new WithdrawForm(accNumber,accpass, fuserPicture,accMobile, accAddress, accName, accAmount, accEmail);
		wf.setVisible(true);
	}
	if(e.getSource()== TransferButton) {
		setVisible(false);
		TransferForm tf = new TransferForm(accNumber,accpass,fuserPicture,accMobile,accAddress,accName, accAmount, accEmail);
		tf.setVisible(true);
	}
	if(e.getSource()== DepositButton) {
		setVisible(false);
		DepositForm df = new DepositForm(accNumber,accpass,fuserPicture,accMobile,accAddress,accName, accAmount, accEmail);
		df.setVisible(true);	
		}
	
	}
    }

    




