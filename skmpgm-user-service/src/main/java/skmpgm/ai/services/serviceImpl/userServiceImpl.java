package skmpgm.ai.services.serviceImpl;

import org.springframework.stereotype.Service;
import skmpgm.ai.entities.User;
import skmpgm.ai.services.UserService;

import java.util.List;
@Service
public class userServiceImpl implements UserService {

    List<User> userList = List.of(
            new User(1211L, "Sonu Lodhi", "8821873527"),
            new User(1213L, "Monu Lodhi", "7987783566"),
            new User(1214L, "Krishan Pal Lodhi", "9098033732")
            );

    @Override
    public User getUser(Long id) {
        return userList.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}
