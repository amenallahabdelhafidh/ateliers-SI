package tn.esprit.premierepr.service;

import tn.esprit.premierepr.domain.Agence;

import java.util.List;

public interface IAgenceInterface {
    List<Agence> retrieveAllAgences();
    Agence addAgence(Agence c);
    Agence updateAgence(Agence c);
    Agence retrieveAgence(Long idAgence);
    void removeAgence(Long idAgence);
    List<Agence> addAgences (List<Agence> Agences);
}
