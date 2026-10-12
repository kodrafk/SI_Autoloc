package tn.esprit.autoloc.services;

import tn.esprit.autoloc.entities.Employe;
import java.util.List;

public interface EmployeInterface {

    public Employe addEmploye(Employe e);

    public void deleteEmploye(Long id);

    public Employe modifyEmploye(Employe e);

    public List<Employe> showEmploye();
}
