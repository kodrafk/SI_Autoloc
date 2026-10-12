package tn.esprit.autoloc.services;

import tn.esprit.autoloc.entities.Maintenance;
import java.util.List;

public interface MaintenanceInterface {

    public Maintenance addMaintenance(Maintenance m);

    public void deleteMaintenance(Long id);

    public Maintenance modifyMaintenance(Maintenance m);

    public List<Maintenance> showMaintenance();
}