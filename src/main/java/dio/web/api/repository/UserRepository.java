package dio.web.api.repository;

import dio.web.api.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    public void save(User user) {

        if (user.getId() == null)
            System.out.println("SAVE - receiving the user at the repository layer");
        else
            System.out.println("UPDATE - receiving the user at the repository layer");

        System.out.println(user);
    }
    public void deleteById(Integer id) {
        System.out.println(String.format("DELETE/id - receiving the id: %d for delete an user", id));
        System.out.println(id);
    }
    public List<User> findAll() {
        System.out.println("LIST - listing all users");
        List<User> users = new ArrayList<>();
        users.add(new User("john", "password123"));
        users.add(new User("frank", "masterpass"));
        return users;
    }
    public User findById(Integer id) {
        System.out.println(String.format("FIND/id - receiving the id: %d for find user", id));
        return new User("john", "password123");
    }
}
