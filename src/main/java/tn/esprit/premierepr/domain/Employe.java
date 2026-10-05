package tn.esprit.premierepr.domain;

import jakarta.persistence.*;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Employe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmploye;
    @ManyToOne
    @Column(nullable = false, unique = true, length = 20)
    private Agence agence;
    @OneToMany
    @Column(nullable = false, unique = true, length = 20)
    private Set<Reservation>reservations;
    @Column(nullable = false, unique = true, length = 20)
    private String nom;
    @Column(nullable = false, unique = true, length = 20)
    private String ville;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private RoleEmploye role;
}
