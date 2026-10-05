package tn.esprit.premierepr.repository;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.premierepr.domain.Reservation;

public interface ReservationRepository extends CrudRepository<Reservation,Long> {
}
