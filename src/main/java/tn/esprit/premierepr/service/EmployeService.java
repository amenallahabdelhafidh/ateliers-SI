package tn.esprit.premierepr.service;

import tn.esprit.premierepr.domain.Employe;
import tn.esprit.premierepr.repository.EmployeRepository;

import java.util.List;

public class EmployeService implements IEmployeInterface{
    EmployeRepository clRepo;
    @Override
    public List<Employe> retrieveAllEmployes() {
        return (List<Employe>) clRepo.findAll();
    }

    @Override
    public Employe addEmploye(Employe c) {
        return clRepo.save(c);
    }

    @Override
    public Employe updateEmploye(Employe c) {
        return clRepo.save(c);
    }

    @Override
    public Employe retrieveEmploye(Long idEmploye) {

        return clRepo.findById(idEmploye).orElse(null);

    }

    @Override
    public void removeEmploye(Long idEmploye) {
        clRepo.deleteById(idEmploye);

    }

    @Override
    public List<Employe> addEmployes(List<Employe> Employes) {
        return (List<Employe>) clRepo.saveAll(Employes);
    }
}
