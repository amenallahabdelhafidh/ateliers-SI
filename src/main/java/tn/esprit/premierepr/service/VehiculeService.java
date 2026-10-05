package tn.esprit.premierepr.service;

import tn.esprit.premierepr.domain.Vehicule;
import tn.esprit.premierepr.repository.VehiculeRepository;

import java.util.List;

public class VehiculeService implements IVehiculeInterface{
    VehiculeRepository clRepo;
    @Override
    public List<Vehicule> retrieveAllVehicules() {
        return (List<Vehicule>) clRepo.findAll();
    }

    @Override
    public Vehicule addVehicule(Vehicule c) {
        return clRepo.save(c);
    }

    @Override
    public Vehicule updateVehicule(Vehicule c) {
        return clRepo.save(c);
    }

    @Override
    public Vehicule retrieveVehicule(Long idVehicule) {

        return clRepo.findById(idVehicule).orElse(null);

    }

    @Override
    public void removeVehicule(Long idVehicule) {
        clRepo.deleteById(idVehicule);

    }

    @Override
    public List<Vehicule> addVehicules(List<Vehicule> Vehicules) {
        return (List<Vehicule>) clRepo.saveAll(Vehicules);
    }
}
