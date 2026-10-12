package tn.esprit.autoloc.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.entities.Contrat;
import tn.esprit.autoloc.repositories.ContractRepository;


import java.util.List;

@Service
@AllArgsConstructor
public class ContratService implements ContratInterface {

    ContractRepository contratRepo;

    @Override
    public Contrat addContrat(Contrat c) {
        return contratRepo.save(c);
    }

    @Override
    public Contrat modifyContrat(Contrat c) {
        return contratRepo.save(c);
    }

    @Override
    public void deleteContrat(Long id) {
        contratRepo.deleteById(id);
    }

    @Override
    public List<Contrat> showContrat() {
        return contratRepo.findAll();
    }
}