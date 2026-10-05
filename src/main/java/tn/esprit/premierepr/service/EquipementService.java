package tn.esprit.premierepr.service;

import tn.esprit.premierepr.domain.Equipement;
import tn.esprit.premierepr.repository.EquipementRepository;

import java.util.List;

public class EquipementService implements IEquipementInterface{
    EquipementRepository clRepo;
    @Override
    public List<Equipement> retrieveAllEquipements() {
        return (List<Equipement>) clRepo.findAll();
    }

    @Override
    public Equipement addEquipement(Equipement c) {
        return clRepo.save(c);
    }

    @Override
    public Equipement updateEquipement(Equipement c) {
        return clRepo.save(c);
    }

    @Override
    public Equipement retrieveEquipement(Long idEquipement) {

        return clRepo.findById(idEquipement).orElse(null);

    }

    @Override
    public void removeEquipement(Long idEquipement) {
        clRepo.deleteById(idEquipement);

    }

    @Override
    public List<Equipement> addEquipements(List<Equipement> Equipements) {
        return (List<Equipement>) clRepo.saveAll(Equipements);
    }
}
