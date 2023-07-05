package user_test.user_test.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20, nullable = false)
    private String name;

    @Column(length = 255, nullable = false)
    private String password;

    @Column(length = 2, nullable = false)
    private Integer age;

    @Builder
    public User(String name, String password, Integer age) {
        this.name = name;
        this.password = password;
        this.age = age;
    }

}

