package kjw.cloud.project.domain;

import lombok.*;


@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String userId;
    private String password;
    private String userName;
    private String phoneNumber;
}
