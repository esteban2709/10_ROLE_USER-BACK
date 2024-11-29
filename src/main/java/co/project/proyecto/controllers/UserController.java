package co.project.proyecto.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import co.project.proyecto.models.User;
import co.project.proyecto.services.UserService;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/users")
@CrossOrigin
public class UserController {

    private final UserService userService;

    public UserController (UserService userService){
        this.userService = userService;
    }

   
    @GetMapping("/user")
    public List<User> allUsers() {
        return (List<User>)userService.findAll();
    }
    @GetMapping("/user/{id}")
    public Optional<User> getUserById(@PathVariable Long id) {
        return userService.findById(id);
    }

    @PostMapping("/user")
    public User createUser(@RequestBody User user) {
        return userService.save(user);
    }

    @DeleteMapping("/user/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.delete(id);
    }

    @PutMapping("/user/{id}")
	public User updateProduct(@RequestBody User user, @PathVariable Long id) {
        user.setId(id);
		return userService.save(user);
	}

}
