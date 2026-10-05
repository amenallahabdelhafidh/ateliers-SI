package tn.esprit.premierepr.repository;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.premierepr.domain.Maintenance;

public interface MaintenanceRepository extends CrudRepository<Maintenance,Long> {
}
