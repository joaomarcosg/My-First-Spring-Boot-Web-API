package dio.web.api.controller;

import dio.web.api.model.User;
import dio.web.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping()
    public List<User> listUsers() {
        return userRepository.findAll();
    }
    @GetMapping("/{userName}")
    public User getUser(@PathVariable("userName") String userName) {
        return userRepository.findByName(userName);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable("id") Integer id) {
        userRepository.deleteById(id);
    }
    @PostMapping()
    public void createUser(@RequestBody User user) {
        userRepository.save(user);
    }
    @PutMapping()
    public void updateUser(@RequestBody User user) {
        userRepository.save(user);
    }
}
