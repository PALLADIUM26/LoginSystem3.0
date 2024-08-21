/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.*;
import java.util.*; 
import javax.mail.*; 
import javax.mail.internet.*; 
import javax.activation.*; 
import javax.mail.Session; 
import javax.mail.Transport; 
//import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Resources {
    public String otpSend(String email) {
        String subject = "Warmth";
        long otp = (int)(Math.random()*900000) + 100000;
        String text = "Welcome to choose Shiftux, OTP: "+otp;
        String sender = "pranithdutta26@gmail.com";//change accordingly  
        String appPassword = "cxqbksqtaxxgqhsj"; //change accordingly

        //Set the Properties
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");
        
        Authenticator auth = new Authenticator() {
            public PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(sender, appPassword);
            }
        };
        
        Session session = Session.getInstance(properties, auth);
        
        //compose the message 
        try {
            MimeMessage message = new MimeMessage(session);  
            message.setFrom(new InternetAddress(sender));
            message.addRecipient(Message.RecipientType.TO,new InternetAddress(email));
            message.setSubject(subject);
            message.setText(text);
            
            // Send message 
            Transport.send(message);
            System.out.println("Mail successfully sent");
        } catch(Exception e) {
            System.out.println(e);
        }
        return otp+"";
    }
    
    public int workingWithMySQL(String uname, String email, String password) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:MySQL://localhost:3306/Sylvia", "root", "lolwa");
            Statement s = con.createStatement();
            System.out.println("Connection extablished Successfully!");

            String check = "select * from users;";
            ResultSet result = s.executeQuery(check);

            int flag = 0;
            while(result.next()) {
                if (result.getString("uname").equals(uname) || result.getString("email").equals(email)){
                    flag = 1;
                    break;
                }
            }
            
            if (flag == 0) {
                String query = "INSERT INTO users VALUES('"+uname+"','"+email+"','"+password+"')";
                s.executeUpdate(query);
                System.out.println("Data Inserted Successfully!");
            }
            
            con.close();
            return flag;

        } catch(Exception e) {
            e.printStackTrace();
            return 1;
        }
    }
    
    public int workingWithMySQL(int x, String id, String password) {
        try {                
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:MySQL://localhost:3306/Sylvia", "root", "lolwa");
            Statement s = con.createStatement();
            System.out.println("Connection extablished Successfully!");
            String query = "";

            if (x == 0) query = "select * from users where uname='"+id+"';";
            else if (x == 1) query = "select * from users where email='"+id+"';";
            ResultSet result = s.executeQuery(query);
            System.out.println("Data Fetched Successfully!");

            int flag = -1;
            while(result.next()) {
                if ((result.getString("uname").equals(id) && result.getString("password").equals(password)) || (result.getString("email").equals(id) && result.getString("password").equals(password))){
                    flag = 1;
                    break;
                }
            }

            con.close();

            return flag;



        } catch(Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
}
