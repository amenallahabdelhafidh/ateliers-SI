package tn.esprit.premierepr.service;

import tn.esprit.premierepr.domain.Vehicule;

import java.util.List;

public interface IVehiculeInterface {
    List<Vehicule> retrieveAllVehicules();
    Vehicule addVehicule(Vehicule c);
    Vehicule updateVehicule(Vehicule c);
    Vehicule retrieveVehicule(Long idVehicule);
    void removeVehicule(Long idVehicule);
    List<Vehicule> addVehicules (List<Vehicule> Vehicules);
}
