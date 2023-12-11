package kjw.cloud.project.controller;

import kjw.cloud.project.common.domain.ApiResponse;
import kjw.cloud.project.domain.User;
import kjw.cloud.project.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/cloud/users")
@RequiredArgsConstructor
@RestController
public class UserController {
    private final UserService userService;

    @PostMapping("")
    public ResponseEntity<ApiResponse<Object>> saveUser(@RequestBody User user){
        boolean flag = userService.save(user);
        if(flag) return ResponseEntity.ok(ApiResponse.builder()
                                .message("회원가입 완료")
                                .build());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ApiResponse.builder().message("회원가입 실패").build());
    }
}
