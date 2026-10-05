package tn.esprit.premierepr.service;

import tn.esprit.premierepr.domain.Maintenance;

import java.util.List;

public interface IMaintenanceInterface {
    List<Maintenance> retrieveAllMaintenances();
    Maintenance addMaintenance(Maintenance c);
    Maintenance updateMaintenance(Maintenance c);
    Maintenance retrieveMaintenance(Long idMaintenance);
    void removeMaintenance(Long idMaintenance);
    List<Maintenance> addMaintenances (List<Maintenance> Maintenances);
}
