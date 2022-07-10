package api;

import model.Customer;
import service.CustomerService;
import service.Reservation;
import service.ReservationService;

import java.util.Date;

public class HotelResource {
    public static Customer getCustomer(String email){
       return CustomerService.getCustomer(email);
    }
    public static void createCustomer(String email,String firstName,String lastName){
        CustomerService.addCustomer(email,firstName,lastName);
    }
    public static String getRoom(String roomNumber){
        return String.valueOf(ReservationService.getAroom(roomNumber));
    }
    public static Reservation bookAroom(String email, String room, Date checkin, Date checkout){
        return ReservationService.reserveAroom(getCustomer(email),room,checkin,checkout);
    }
    public static Reservation getCustomerReservation(String email){
        return ReservationService.getCustomerReservation(getCustomer(email));
    }
    public static void findaroom(Date checkin,Date checkout){
        ReservationService.findrooms(checkin,checkout);
    }

}
