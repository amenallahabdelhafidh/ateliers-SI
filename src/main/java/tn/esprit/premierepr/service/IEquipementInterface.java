package tn.esprit.premierepr.service;

import tn.esprit.premierepr.domain.Equipement;

import java.util.List;

public interface IEquipementInterface {
    List<Equipement> retrieveAllEquipements();
    Equipement addEquipement(Equipement c);
    Equipement updateEquipement(Equipement c);
    Equipement retrieveEquipement(Long idEquipement);
    void removeEquipement(Long idEquipement);
    List<Equipement> addEquipements (List<Equipement> Equipements);
}
