package tn.esprit.autoloc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloc.entities.Contrat;

public interface ContractRepository extends JpaRepository<Contrat,Long> {
}
