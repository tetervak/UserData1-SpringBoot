package ca.tetervak.userdata1.database;

import ca.tetervak.userdata1.domain.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserDataServiceImpl implements UserDataService{

    private final UserRepository userRepository;

    public UserDataServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() {
        List<UserEntity> entities = userRepository.findAll();
        List<User> users = new ArrayList<User>();
        for(UserEntity entity: entities){
            users.add(
                    new User(
                            entity.toString(),
                            entity.getFirstName(),
                            entity.getLastName()
                    )
            );
        }

        return users;
    }
}
