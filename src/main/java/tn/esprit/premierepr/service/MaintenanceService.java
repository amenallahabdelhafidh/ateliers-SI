package tn.esprit.premierepr.service;

import tn.esprit.premierepr.domain.Maintenance;
import tn.esprit.premierepr.repository.MaintenanceRepository;

import java.util.List;

public class MaintenanceService implements IMaintenanceInterface{
    MaintenanceRepository clRepo;
    @Override
    public List<Maintenance> retrieveAllMaintenances() {
        return (List<Maintenance>) clRepo.findAll();
    }

    @Override
    public Maintenance addMaintenance(Maintenance c) {
        return clRepo.save(c);
    }

    @Override
    public Maintenance updateMaintenance(Maintenance c) {
        return clRepo.save(c);
    }

    @Override
    public Maintenance retrieveMaintenance(Long idMaintenance) {

        return clRepo.findById(idMaintenance).orElse(null);

    }

    @Override
    public void removeMaintenance(Long idMaintenance) {
        clRepo.deleteById(idMaintenance);

    }

    @Override
    public List<Maintenance> addMaintenances(List<Maintenance> Maintenances) {
        return (List<Maintenance>) clRepo.saveAll(Maintenances);
    }
}
