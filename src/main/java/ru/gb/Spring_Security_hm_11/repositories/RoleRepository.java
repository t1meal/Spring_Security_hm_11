package ru.gb.Spring_Security_hm_11.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.gb.Spring_Security_hm_11.entities.Role;

public interface RoleRepository extends JpaRepository <Role,Long> {
}
