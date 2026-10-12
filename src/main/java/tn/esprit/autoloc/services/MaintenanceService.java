package tn.esprit.autoloc.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.entities.Maintenance;
import tn.esprit.autoloc.repositories.MaintenanceRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class MaintenanceService implements MaintenanceInterface {

    MaintenanceRepository maintenanceRepo;

    @Override
    public Maintenance addMaintenance(Maintenance m) {
        return maintenanceRepo.save(m);
    }

    @Override
    public void deleteMaintenance(Long id) {
        maintenanceRepo.deleteById(id);
    }

    @Override
    public Maintenance modifyMaintenance(Maintenance m) {
        return maintenanceRepo.save(m);
    }

    @Override
    public List<Maintenance> showMaintenance() {
        return maintenanceRepo.findAll();
    }
}
