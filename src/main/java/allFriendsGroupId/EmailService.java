package allFriendsGroupId;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.util.Properties;

public class EmailService {

    private String host = "";
    private int port = 0;
    private String username = "";
    private String password = "";



    public EmailService(String host, int port, String username, String password) {

        this.host = host;
        this.port = port;
        this.username = username;
        this.password = password;
    }

    public void sendMail(EmailDTO emailDTO) {

        Properties prop = new Properties();
        prop.put("mail.smtp.auth", true);
        prop.put("mail.smtp.starttls.enable", "true");
        prop.put("mail.smtp.host", host);
        prop.put("mail.smtp.port", port);
        prop.put("mail.smtp.ssl.trust", host);

        Session session = Session.getInstance(prop, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("oana.dora@gmail.com"));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(emailDTO.getToEmailAddress()));
            message.setSubject("Secret Santa!");

      String msg =
          "Ho! Ho! Ho! \nDraga "
              + emailDTO.getForFriendName()
              + "!\n"
              + "Ai onoarea sa fii Mos Craciun pentru: "
              + emailDTO.getAssignedFriend()
              + ".\n"
              + " Enjoy! \n With love, some compiled code! \nXOXO";

            MimeBodyPart mimeBodyPart = new MimeBodyPart();
            mimeBodyPart.setContent(msg, "text/plain");

            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(mimeBodyPart);

            message.setContent(multipart);

            Transport.send(message);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
