package co.project.proyecto.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.project.proyecto.models.User;
import co.project.proyecto.repository.UserRepository;
import co.project.proyecto.services.interfaces.IUserService;

@Service
public class UserService implements IUserService {

    private UserRepository userRepository;
    
    public UserService (UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public Optional<User> findById(Long id) {
        return userRepository.findUserById(id);
    }

    @Override
    public Iterable<User> findAll() {
        return userRepository.findAll();
    }


    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public void delete(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

}
