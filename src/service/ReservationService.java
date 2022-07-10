package service;

import model.*;

import java.util.*;

public class ReservationService {
    public static Map<String, IRoom> roomMap = new HashMap<String,IRoom>();
    public static Map<String, Collection<Reservation>> reservationsMap = new HashMap<String,Collection<Reservation>>();
    public static void addRoom(IRoom room){
      roomMap.put(room.getRoomNumber(),room);
    }
    public static IRoom getARoom(String roomID){
        return roomMap.get(roomID);
    }

    public static Collection<Reservation> customerReserv = new LinkedList<>();

    public static Reservation reserveAroom(Customer customer, IRoom room, Date checkInDate, Date checOutDate){
        Reservation reserve =new Reservation(customer,room,checkInDate,checOutDate);
        customerReserv.add(reserve);
        reservationsMap.put(customer.email,customerReserv);
        return reserve;
    }
   // public static Collection<IRoom> freeRoom = new LinkedList<>();
    public static Collection<IRoom> findrooms(Date checkin, Date checkout) {


//        if ((roomMap.get(checkin). checkin) && (roomMap.get(checkout) == checkout)) {
//            return roomMap.values();
//        }
    }

    public static Collection<Reservation> getCustomerReservation(Customer customer){
         return reservationsMap.containsValue new person.email()
    }
    public static void printAllReservations(){
        for(Reservation reserve:reservationMap.values())
            System.out.println(reserve);
    }

}
