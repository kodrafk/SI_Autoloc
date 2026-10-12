package tn.esprit.autoloc.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.entities.Vehicule;
import tn.esprit.autoloc.repositories.VehiculeRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class VehiculeService implements VehiculeInterface {

    VehiculeRepository vehiculeRepo;

    @Override
    public Vehicule addVehicule(Vehicule v) {
        return vehiculeRepo.save(v);
    }

    @Override
    public Vehicule modifyVehicule(Vehicule v) {
        return vehiculeRepo.save(v);
    }

    @Override
    public void deleteVehicule(Long id) {
        vehiculeRepo.deleteById(id);
    }

    @Override
    public List<Vehicule> showVehicule() {
        return vehiculeRepo.findAll();
    }
}
