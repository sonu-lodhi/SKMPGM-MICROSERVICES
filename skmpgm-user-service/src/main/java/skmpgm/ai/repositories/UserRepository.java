package skmpgm.ai.repositories;

import skmpgm.ai.entities.User;

public interface UserRepository {
    public User getUser(Long id);
}
