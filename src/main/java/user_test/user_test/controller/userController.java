package user_test.user_test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import user_test.user_test.dto.UserDTO;
import user_test.user_test.service.UserService;

@RestController
@RequestMapping("/user")
public class userController {
    private final UserService userService;

    @Autowired
    public userController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<String> createUser(@RequestBody UserDTO userDTO) {
        return userService.createUser(userDTO);
    }
}
