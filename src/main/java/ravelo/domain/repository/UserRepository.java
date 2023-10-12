package ravelo.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ravelo.model.User;

public interface UserRepository extends JpaRepository<User,Long> {
    boolean existsByAccountNumber(String number);
}
