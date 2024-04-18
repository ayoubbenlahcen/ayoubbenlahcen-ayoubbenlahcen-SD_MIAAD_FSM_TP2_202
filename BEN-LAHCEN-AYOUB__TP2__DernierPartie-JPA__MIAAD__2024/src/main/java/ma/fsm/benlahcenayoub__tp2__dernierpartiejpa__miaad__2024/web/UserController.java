package ma.fsm.benlahcenayoub__tp2__dernierpartiejpa__miaad__2024.web;


import ma.fsm.benlahcenayoub__tp2__dernierpartiejpa__miaad__2024.Service.UserService;
import ma.fsm.benlahcenayoub__tp2__dernierpartiejpa__miaad__2024.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/users/{username}")
    public User user(@PathVariable String username){
        User user = userService.findUserByUserName(username);
        return user;
    }
}
