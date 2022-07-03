package ru.gb.Spring_Security_hm_11.repositories;

import ru.gb.Spring_Security_hm_11.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername (String username);

}
