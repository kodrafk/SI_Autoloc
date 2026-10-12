package tn.esprit.autoloc.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.entities.Employe;
import tn.esprit.autoloc.repositories.EmployeRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeService implements EmployeInterface {

    EmployeRepository employeRepo;

    @Override
    public Employe addEmploye(Employe e) {
        return employeRepo.save(e);
    }

    @Override
    public void deleteEmploye(Long id) {
        employeRepo.deleteById(id);
    }

    @Override
    public Employe modifyEmploye(Employe e) {
        return employeRepo.save(e);
    }

    @Override
    public List<Employe> showEmploye() {
        return employeRepo.findAll();
    }
}
