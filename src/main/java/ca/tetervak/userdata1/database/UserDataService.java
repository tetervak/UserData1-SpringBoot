package ca.tetervak.userdata1.database;


import ca.tetervak.userdata1.domain.User;

import java.util.List;

public interface UserDataService {
    List<User> getAllUsers();
}
