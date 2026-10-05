package tn.esprit.premierepr.service;

import tn.esprit.premierepr.domain.Paiement;
import tn.esprit.premierepr.repository.PaiementRepository;

import java.util.List;

public class PaiementService implements IPaiementInterface{
    PaiementRepository clRepo;
    @Override
    public List<Paiement> retrieveAllPaiements() {
        return (List<Paiement>) clRepo.findAll();
    }

    @Override
    public Paiement addPaiement(Paiement c) {
        return clRepo.save(c);
    }

    @Override
    public Paiement updatePaiement(Paiement c) {
        return clRepo.save(c);
    }

    @Override
    public Paiement retrievePaiement(Long idPaiement) {

        return clRepo.findById(idPaiement).orElse(null);

    }

    @Override
    public void removePaiement(Long idPaiement) {
        clRepo.deleteById(idPaiement);

    }

    @Override
    public List<Paiement> addPaiements(List<Paiement> Paiements) {
        return (List<Paiement>) clRepo.saveAll(Paiements);
    }
}
