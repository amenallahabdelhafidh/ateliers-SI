package tn.esprit.premierepr.service;

import tn.esprit.premierepr.domain.Reservation;

import java.util.List;

public interface IReservationInterface {
    List<Reservation> retrieveAllReservations();
    Reservation addReservation(Reservation c);
    Reservation updateReservation(Reservation c);
    Reservation retrieveReservation(Long idReservation);
    void removeReservation(Long idReservation);
    List<Reservation> addReservations (List<Reservation> Reservations);
}
