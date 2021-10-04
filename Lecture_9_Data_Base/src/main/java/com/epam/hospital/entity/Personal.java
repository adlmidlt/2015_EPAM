package com.epam.hospital.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "personal")
public class Personal implements Serializable {

    @Id
    @GeneratedValue
    private Long idPersonal;

    @Column(name = "specialization")
    private String specialization;

    @Column(name = "personal_role")
    private String personalRole;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "users_id")
    private Users users;

    @OneToMany(mappedBy = "personal", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Reception> receptions;
}
