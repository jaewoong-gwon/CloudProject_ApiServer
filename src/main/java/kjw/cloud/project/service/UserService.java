package kjw.cloud.project.service;

import kjw.cloud.project.domain.User;
import kjw.cloud.project.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    @Transactional
    public boolean save(User user){
        user.setPassword(passwordEncoder.encode(user.));
        return !userRepository.save(user).getUserId().isEmpty();
    }
}
