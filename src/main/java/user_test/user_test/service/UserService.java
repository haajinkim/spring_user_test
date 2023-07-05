package user_test.user_test.service;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import user_test.user_test.domain.User;
import user_test.user_test.dto.UserDTO;
import user_test.user_test.repository.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public ResponseEntity createUser(UserDTO userDTO) {
        try {
            User user = userDTO.toEntity();
            userRepository.save(user);
        } catch (Exception e) {
            Logger logger = LoggerFactory.getLogger(UserService.class);
            logger.error("Failed to create user.", e);

            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to create user. Please try again later.");
        }

        return ResponseEntity.ok("User created successfully.");
    }

}
