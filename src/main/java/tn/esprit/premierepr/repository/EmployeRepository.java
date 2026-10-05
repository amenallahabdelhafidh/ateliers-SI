package tn.esprit.premierepr.repository;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.premierepr.domain.Employe;

public interface EmployeRepository extends CrudRepository<Employe,Long> {
}
