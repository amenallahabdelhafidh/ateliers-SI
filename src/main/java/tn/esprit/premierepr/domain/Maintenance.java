package tn.esprit.premierepr.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Maintenance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMaintenance;
    @ManyToOne
    @Column(nullable = false, unique = true, length = 20)
    private Vehicule vehicule;
    @Column(nullable = false, unique = true, length = 20)
    private Date dateDebut;
    @Column(nullable = false, unique = true, length = 20)
    private Date dateFin;
    @Column(nullable = false, unique = true, length = 20)
    private String description;
}
