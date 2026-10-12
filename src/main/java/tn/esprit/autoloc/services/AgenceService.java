package tn.esprit.autoloc.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.entities.Agence;
import tn.esprit.autoloc.repositories.AgenceRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class AgenceService implements AgenceInterface {

    AgenceRepository agenceRepo;

    @Override
    public Agence addAgence(Agence a) {
        return agenceRepo.save(a);
    }

    @Override
    public void deleteAgence(Long id) {
        agenceRepo.deleteById(id);
    }

    @Override
    public Agence modifyAgence(Agence a) {
        return agenceRepo.save(a);
    }

    @Override
    public List<Agence> showAgence() {
        return agenceRepo.findAll();
    }
}