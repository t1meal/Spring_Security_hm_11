package ru.gb.Spring_Security_hm_11.entities;

import lombok.Data;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "privileges")
@Data
public class Privilege {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @ManyToMany (mappedBy = "privileges")
    private Collection<Role> roles;
}
