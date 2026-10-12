package tn.esprit.autoloc.services;

import tn.esprit.autoloc.entities.Vehicule;
import java.util.List;

public interface VehiculeInterface {

    public Vehicule addVehicule(Vehicule v);

    public Vehicule modifyVehicule(Vehicule v);

    public void deleteVehicule(Long id);

    public List<Vehicule> showVehicule();
}