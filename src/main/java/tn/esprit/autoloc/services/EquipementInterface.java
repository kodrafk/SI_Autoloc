package tn.esprit.autoloc.services;

import tn.esprit.autoloc.entities.Equipement;

import java.util.List;

public interface EquipementInterface {
    public Equipement addEquipe(Equipement e);
    public void deleteEquipe(Long id);
    public Equipement modifyEquipe(Equipement e);
    public List<Equipement> showEquipe(Equipement e);
}
