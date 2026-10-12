package tn.esprit.autoloc.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.entities.Paiement;
import tn.esprit.autoloc.repositories.PaiementRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class PaiementService implements PaiementInterface {

    PaiementRepository paiementRepo;

    @Override
    public Paiement addPaiement(Paiement p) {
        return paiementRepo.save(p);
    }

    @Override
    public void deletePaiement(Long id) {
        paiementRepo.deleteById(id);
    }

    @Override
    public Paiement modifyPaiement(Paiement p) {
        return paiementRepo.save(p);
    }

    @Override
    public List<Paiement> showPaiement() {
        return paiementRepo.findAll();
    }
}