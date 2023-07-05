package user_test.user_test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import user_test.user_test.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
