package tn.esprit.premierepr.repository;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.premierepr.domain.Client;



public interface ClientRepository extends CrudRepository<Client,Long> {
}
