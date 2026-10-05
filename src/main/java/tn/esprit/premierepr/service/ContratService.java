package tn.esprit.premierepr.service;

import tn.esprit.premierepr.domain.Contrat;
import tn.esprit.premierepr.repository.ContratRepository;

import java.util.List;

public class ContratService implements IContratInterface{
    ContratRepository clRepo;
    @Override
    public List<Contrat> retrieveAllContrats() {
        return (List<Contrat>) clRepo.findAll();
    }

    @Override
    public Contrat addContrat(Contrat c) {
        return clRepo.save(c);
    }

    @Override
    public Contrat updateContrat(Contrat c) {
        return clRepo.save(c);
    }

    @Override
    public Contrat retrieveContrat(Long idContrat) {

        return clRepo.findById(idContrat).orElse(null);

    }

    @Override
    public void removeContrat(Long idContrat) {
        clRepo.deleteById(idContrat);

    }

    @Override
    public List<Contrat> addContrats(List<Contrat> Contrats) {
        return (List<Contrat>) clRepo.saveAll(Contrats);
    }
}
