package tn.esprit.premierepr.service;

import tn.esprit.premierepr.domain.Reservation;
import tn.esprit.premierepr.repository.ReservationRepository;

import java.util.List;

public class ReservationService implements IReservationInterface{
    ReservationRepository clRepo;
    @Override
    public List<Reservation> retrieveAllReservations() {
        return (List<Reservation>) clRepo.findAll();
    }

    @Override
    public Reservation addReservation(Reservation c) {
        return clRepo.save(c);
    }

    @Override
    public Reservation updateReservation(Reservation c) {
        return clRepo.save(c);
    }

    @Override
    public Reservation retrieveReservation(Long idReservation) {

        return clRepo.findById(idReservation).orElse(null);

    }

    @Override
    public void removeReservation(Long idReservation) {
        clRepo.deleteById(idReservation);

    }

    @Override
    public List<Reservation> addReservations(List<Reservation> Reservations) {
        return (List<Reservation>) clRepo.saveAll(Reservations);
    }
}
