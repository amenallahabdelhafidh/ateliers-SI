package tn.esprit.premierepr.repository;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.premierepr.domain.Paiement;

public interface PaiementRepository extends CrudRepository<Paiement,Long> {
}
