package kjw.cloud.project.service;

import kjw.cloud.project.domain.User;
import kjw.cloud.project.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserMapper userMapper;
    private final PasswordEncoder passwordEncoder;

    @Transactional
    public boolean save(User user){
       return userMapper.save(user) > 0;
    }
}
