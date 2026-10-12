package tn.esprit.autoloc.services;

import tn.esprit.autoloc.entities.Paiement;
import java.util.List;

public interface PaiementInterface {

    public Paiement addPaiement(Paiement p);

    public void deletePaiement(Long id);

    public Paiement modifyPaiement(Paiement p);

    public List<Paiement> showPaiement();
}