package user_test.user_test.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import user_test.user_test.domain.User;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private String name;
    private String password;
    private Integer age;

    public static UserDTO fromEntity(User user) {
        return new UserDTO(user.getName(), user.getPassword(), user.getAge());
    }

    public User toEntity() {
        return User.builder()
                .name(this.name)
                .password(this.password)
                .age(this.age)
                .build();
    }
}