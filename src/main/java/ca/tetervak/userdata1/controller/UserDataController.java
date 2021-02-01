package ca.tetervak.userdata1.controller;

import ca.tetervak.userdata1.database.UserDataService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserDataController {

    private final UserDataService userDataService;

    public UserDataController(UserDataService userDataService){
        this.userDataService = userDataService;
    }

    @GetMapping(value = {"/","/UserList"})
    public ModelAndView userList() {
        return new ModelAndView(
                "UserList",
                "users",
                userDataService.getAllUsers());
    }
}
