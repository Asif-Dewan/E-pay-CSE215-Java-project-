


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
import java.text.SimpleDateFormat;

public class HomePageScreen extends JFrame implements ActionListener {

    Container hContainer = getContentPane();
    
    Date dNow = new Date();
    SimpleDateFormat ft = new SimpleDateFormat("hh:mm a dd/MM/yyyy");


    JLabel homepageImage = new JLabel(new ImageIcon("F:\\JAVA_Eclipse\\E-Pay\\money.jpg"));

    JLabel appLabel = new JLabel("One Click Banking Solution");

    JButton LoginButton = new JButton("Login");
    JButton RegistrationButton = new JButton("Create new account");
    JButton WithdrawButton = new JButton("Withdraw");
    JButton DepositButton = new JButton("Deposit");
    JButton TransferButton = new JButton("Transfer");
    JButton timeDate = new JButton(ft.format(dNow));
    JButton nullButton2 = new JButton("");

    JButton HomeButton = new JButton("Home");

    public HomePageScreen() {

        this.setTitle("E-Pay Online Bank");
        this.setBounds(16, 45, 1000, 700);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("F:\\JAVA_Eclipse\\SwingProject_Practise\\whatsappLogo.jpg"));

        Initialize();
        addActionEvent();
    }

    public void Initialize() {
        hContainer.setLayout(null);
        hContainer.setBackground(new Color(244, 247, 241));

        HomeButton.setBounds(0, 0, 97, 35);
        HomeButton.setHorizontalTextPosition(SwingConstants.CENTER);
        HomeButton.setBorder(null);
        HomeButton.setVerticalTextPosition(SwingConstants.CENTER);
        HomeButton.setBackground(new Color(3, 0, 0));
        HomeButton.setForeground(Color.WHITE);
        HomeButton.setFont(new Font("Times New Roman", Font.BOLD, 17));
        hContainer.add(HomeButton);

        RegistrationButton.setBounds(96, 0, 155, 35);
        RegistrationButton.setHorizontalTextPosition(SwingConstants.CENTER);
        RegistrationButton.setBorder(null);
        RegistrationButton.setVerticalTextPosition(SwingConstants.CENTER);
        RegistrationButton.setBackground(new Color(3, 0, 0));
        RegistrationButton.setForeground(Color.WHITE);
        RegistrationButton.setFont(new Font("Times New Roman", Font.BOLD, 17));
        hContainer.add(RegistrationButton);

        DepositButton.setBounds(251, 0, 97, 35);
        DepositButton.setHorizontalTextPosition(SwingConstants.CENTER);
        DepositButton.setBorder(null);
        DepositButton.setVerticalTextPosition(SwingConstants.CENTER);
        DepositButton.setBackground(new Color(3, 0, 0));
        DepositButton.setForeground(Color.WHITE);
        DepositButton.setFont(new Font("Times New Roman", Font.BOLD, 17));
        hContainer.add(DepositButton);

        WithdrawButton.setBounds(347, 0, 97, 35);
        WithdrawButton.setHorizontalTextPosition(SwingConstants.CENTER);
        WithdrawButton.setBorder(null);
        WithdrawButton.setVerticalTextPosition(SwingConstants.CENTER);
        WithdrawButton.setBackground(new Color(3, 0, 0));
        WithdrawButton.setForeground(Color.WHITE);
        WithdrawButton.setFont(new Font("Times New Roman", Font.BOLD, 17));
        hContainer.add(WithdrawButton);

        TransferButton.setBounds(443, 0, 155, 35);
        TransferButton.setHorizontalTextPosition(SwingConstants.CENTER);
        TransferButton.setBorder(null);
        TransferButton.setVerticalTextPosition(SwingConstants.CENTER);
        TransferButton.setBackground(new Color(3, 0, 0));
        TransferButton.setForeground(Color.WHITE);
        TransferButton.setFont(new Font("Times New Roman", Font.BOLD, 17));
        hContainer.add(TransferButton);


        timeDate.setBounds(598, 0, 255, 35);
        timeDate.setHorizontalTextPosition(SwingConstants.CENTER);
        timeDate.setBorder(null);
        timeDate.setVerticalTextPosition(SwingConstants.CENTER);
        timeDate.setBackground(new Color(3, 0, 0));
        timeDate.setForeground(Color.WHITE);
        timeDate.setFont(new Font("Times New Roman", Font.BOLD, 14));
        hContainer.add(timeDate);

        LoginButton.setBounds(850, 0, 134, 35);
        LoginButton.setHorizontalTextPosition(SwingConstants.CENTER);
        //LoginButton.setBorder(null);
        LoginButton.setVerticalTextPosition(SwingConstants.CENTER);
        LoginButton.setBackground(new Color(17, 84, 228));
        LoginButton.setForeground(Color.WHITE);
        LoginButton.setFont(new Font("Times New Roman", Font.BOLD, 17));
        hContainer.add(LoginButton);

        appLabel.setBounds(150, 210, 350, 32);
        appLabel.setForeground(Color.WHITE);
        appLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
        hContainer.add(appLabel);

        homepageImage.setBounds(0, 0, 1000, 700);
        homepageImage.setHorizontalAlignment(SwingConstants.CENTER);
        homepageImage.setOpaque(true);
        hContainer.add(homepageImage);

    }

    public void addActionEvent() {
        LoginButton.addActionListener(this);
        RegistrationButton.addActionListener(this);
        HomeButton.addActionListener(this);
        WithdrawButton.addActionListener(this);
        DepositButton.addActionListener(this);
        TransferButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == LoginButton) {
            setVisible(false);
            LoginFrame lf = new LoginFrame();
            lf.setVisible(true);
        }
        if (e.getSource() == HomeButton) {
            setVisible(false);
            HomePageScreen lf = new HomePageScreen();
            lf.setVisible(true);
        }
        if (e.getSource() == RegistrationButton) {
            setVisible(false);
            CreateNewAccount ca = new CreateNewAccount();
            ca.setVisible(true);
        }
        if (e.getSource() == WithdrawButton) {
            JOptionPane.showMessageDialog(null, "Please Log-in before you take any action", "WARNING!!", JOptionPane.ERROR_MESSAGE);
        }
        if (e.getSource() == TransferButton) {
            JOptionPane.showMessageDialog(null, "Please Log-in before you take any action", "WARNING!!", JOptionPane.ERROR_MESSAGE);
        }
        if (e.getSource() == DepositButton) {
            JOptionPane.showMessageDialog(null, "Please Log-in before you take any action", "WARNING!!", JOptionPane.ERROR_MESSAGE);
        }

    }
}


