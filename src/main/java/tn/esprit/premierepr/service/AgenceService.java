package tn.esprit.premierepr.service;

import tn.esprit.premierepr.domain.Agence;
import tn.esprit.premierepr.repository.AgenceRepository;

import java.util.List;

public class AgenceService implements IAgenceInterface{
    AgenceRepository clRepo;
    @Override
    public List<Agence> retrieveAllAgences() {
        return (List<Agence>) clRepo.findAll();
    }

    @Override
    public Agence addAgence(Agence c) {
        return clRepo.save(c);
    }

    @Override
    public Agence updateAgence(Agence c) {
        return clRepo.save(c);
    }

    @Override
    public Agence retrieveAgence(Long idAgence) {

        return clRepo.findById(idAgence).orElse(null);

    }

    @Override
    public void removeAgence(Long idAgence) {
        clRepo.deleteById(idAgence);

    }

    @Override
    public List<Agence> addAgences(List<Agence> Agences) {
        return (List<Agence>) clRepo.saveAll(Agences);
    }
}
