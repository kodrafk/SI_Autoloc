package tn.esprit.autoloc.services;



import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.entities.Reservation;
import tn.esprit.autoloc.repositories.ReservationRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ReservationService implements ReservationInterface {

    ReservationRepository reservationRepo;

    @Override
    public Reservation addReservation(Reservation r) {
        return reservationRepo.save(r);
    }

    @Override
    public Reservation modifyReservation(Reservation r) {
        return reservationRepo.save(r);
    }

    @Override
    public void deleteReservation(Long id) {
        reservationRepo.deleteById(id);
    }

    @Override
    public List<Reservation> showReservation() {
        return reservationRepo.findAll();
    }
}