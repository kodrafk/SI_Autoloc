package tn.esprit.autoloc.services;

import tn.esprit.autoloc.entities.Contrat;

import java.util.List;

public interface ContratInterface {

    public Contrat addContrat(Contrat c);

    public Contrat modifyContrat(Contrat c);

    public void deleteContrat(Long id);

    public List<Contrat> showContrat();
}