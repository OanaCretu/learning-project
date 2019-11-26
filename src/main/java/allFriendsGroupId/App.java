package allFriendsGroupId;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@RestController
public class App {
    EmailService emailService  = new EmailService("smtp.gmail.com", 587, "oana.dora@gmail.com", "somePassword-not the real one");

    public static void main(String[] args) {

        SpringApplication.run(App.class, args);

    }

    @RequestMapping(value = "/")
    String hello() {

        SecretSantaService sss = new SecretSantaService();
        Map<String, String> assignedNamesMap = sss.generateRandomFriend();

        EmailDTO emailDTO = new EmailDTO();
        assignedNamesMap.forEach((forFriendName, assignedFriend) -> {
            emailDTO.setForFriendName(forFriendName);
            emailDTO.setAssignedFriend(assignedFriend);
            emailDTO.setToEmailAddress(FriendEnum.valueOf(forFriendName).getEmail());
            emailService.sendMail(emailDTO);
        });

        return "Emails send! ....hopefully!";
    }


}