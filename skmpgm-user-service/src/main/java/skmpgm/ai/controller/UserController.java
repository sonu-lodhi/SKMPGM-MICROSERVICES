package skmpgm.ai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import skmpgm.ai.entities.User;
import skmpgm.ai.services.UserService;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/{userId}")
    public User getUser(@PathVariable("userId") Long userId){
        User user = userService.getUser(userId);
        List contacts = this.restTemplate.getForObject("http://skmpgm-contact-service/contact/user/"+user.getUserId(), List.class);
        user.setContacts(contacts);
        return user;
    }

}
