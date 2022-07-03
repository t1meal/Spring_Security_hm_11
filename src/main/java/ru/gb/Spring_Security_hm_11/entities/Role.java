package ru.gb.Spring_Security_hm_11.entities;

import lombok.Data;
import javax.persistence.*;
import java.util.Collection;

@Entity
@Table (name = "roles")
@Data
public class Role {
    @Id
    @Column (name = "id")
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "name")
    private String name;

    @ManyToMany
    @JoinTable(
            name = "roles_privileges",
            joinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn (name = "privilege_id", referencedColumnName = "id")
    )
    private Collection<Privilege> privileges;

}
