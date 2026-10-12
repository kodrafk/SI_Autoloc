package tn.esprit.autoloc.services;

import tn.esprit.autoloc.entities.Reservation;
import java.util.List;

public interface ReservationInterface {

    public Reservation addReservation(Reservation r);

    public Reservation modifyReservation(Reservation r);

    public void deleteReservation(Long id);

    public List<Reservation> showReservation();
}