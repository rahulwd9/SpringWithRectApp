package react.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import react.boot.model.User;


public interface UserRepository extends JpaRepository<User,Long> {

}
