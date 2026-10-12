package tn.esprit.autoloc.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.entities.Equipement;
import tn.esprit.autoloc.repositories.EquipementRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class EquipementService implements EquipementInterface {
    EquipementRepository equipementRepo;
    @Override
    public Equipement addEquipe(Equipement e) {
        return equipementRepo.save(e);
    }

    @Override
    public void deleteEquipe(Long id) {
        equipementRepo.deleteById(id);
    }

    @Override
    public Equipement modifyEquipe(Equipement e) {
        return equipementRepo.save(e);
    }

    @Override
    public List<Equipement> showEquipe(Equipement e) {
        return equipementRepo.findAll();

    }
}
