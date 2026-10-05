package tn.esprit.premierepr.service;

import tn.esprit.premierepr.domain.Employe;

import java.util.List;

public interface IEmployeInterface {
    List<Employe> retrieveAllEmployes();
    Employe addEmploye(Employe c);
    Employe updateEmploye(Employe c);
    Employe retrieveEmploye(Long idEmploye);
    void removeEmploye(Long idEmploye);
    List<Employe> addEmployes (List<Employe> Employes);
}
