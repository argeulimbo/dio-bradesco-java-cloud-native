package dio.lint.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dio.lint.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
