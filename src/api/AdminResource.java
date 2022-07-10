package api;

import model.Customer;
import model.Room;
import model.RoomType;
import service.CustomerService;
import service.ReservationService;

public class AdminResource {
    public static Customer getCustomer(String email){
        return CustomerService.getCustomer(email);
    }
    public static void addRoom(String roomNumber, double price, RoomType enumeration, boolean isfree){
        ReservationService.addRoom(roomNumber,price,enumeration,isfree);
    }
    public static void getallrooms(){
        for(Room room:ReservationService.roomMap.values())
            System.out.println(room);

    }
    public static void  getAllCustomers(){
        CustomerService.getAllCustomers();

    }
    public static void displayallreservations(){
        ReservationService.printAllReservations();

    }
}
