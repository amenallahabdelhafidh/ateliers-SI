package tn.esprit.premierepr.domain;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Set;

@Entity
@Table(name = "Equipement")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Equipement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEquipement;
    @Column(nullable = false, unique = true, length = 20)
    private String libelle;
    @ManyToMany(mappedBy = "equipements")
    @Column(nullable = false, unique = true, length = 20)
    private Set<Vehicule> Vehicules;
}
