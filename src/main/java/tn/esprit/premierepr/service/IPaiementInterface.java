package tn.esprit.premierepr.service;

import tn.esprit.premierepr.domain.Paiement;

import java.util.List;

public interface IPaiementInterface {
    List<Paiement> retrieveAllPaiements();
    Paiement addPaiement(Paiement c);
    Paiement updatePaiement(Paiement c);
    Paiement retrievePaiement(Long idPaiement);
    void removePaiement(Long idPaiement);
    List<Paiement> addPaiements (List<Paiement> Paiements);
}
