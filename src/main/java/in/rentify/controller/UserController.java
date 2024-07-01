package in.rentify.controller;

import in.rentify.dto.LoginDetails;
import in.rentify.dto.UserDTO;
import in.rentify.service.UserService;
import in.rentify.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "https://makanclient.onrender.com")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/signin")
    @CrossOrigin(origins = "https://makanclient.onrender.com")
    public UserDTO registerUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @PostMapping("/login")
    @CrossOrigin(origins = "https://makanclient.onrender.com")
    public ResponseEntity<UserDTO> loginUser(@RequestBody LoginDetails user) {
        UserDTO response = userService.authenticateUser(user.getEmail(), user.getPassword());
        return ResponseEntity.ok(response);
    }
    
    @PutMapping
    @CrossOrigin(origins = "https://makanclient.onrender.com")
    public ResponseEntity<User> updateUser(@RequestBody User user) {
        User updatedUser = userService.updateUser(user);
        return ResponseEntity.ok(updatedUser);
    }
    
    @GetMapping("/{id}")
    @CrossOrigin(origins = "https://makanclient.onrender.com")
    public User getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }
}


