package api;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MainMenu {
    public static void main() {

        String email = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Find and Reserve a Room");
        System.out.println("2. See my reservations");
        System.out.println("3.Create an account ");
        System.out.println("4. Admin");
        System.out.println("5. Exit");
        int x = sc.nextInt();
        Date checkin = null;
        Date checkout = null;
        switch (x) {
            case 1:
                System.out.println("enter email ,room ,checkin and checkout date please");
                 // try {
                    email = sc.nextLine();
                  //} catch (IllegalArgumentException ex) {
                   // System.out.println(ex.getLocalizedMessage());
                  // }
                 String room = sc.nextLine();
                  String checkin1 =sc.nextLine();
                  DateFormat formatter = new SimpleDateFormat("MM dd yyyy");

                  try {
                    checkin = formatter.parse(checkin1);
                   } catch (ParseException e) {
                    throw new RuntimeException(e);
                   }
                   String checkout1 =sc.nextLine();

                   try {
                    checkout = formatter.parse(checkout1);
                   } catch (ParseException e) {
                    throw new RuntimeException(e);
                   }
                HotelResource.bookAroom(email, room, checkin, checkout);
                break;
            case 2:
                AdminResource.displayallreservations();
                break;
            case 3:
                System.out.println("enter email ,first name and laste name please");
               // try {
                    email = sc.nextLine();
                //} catch (IllegalArgumentException ex) {
                  //  System.out.println(ex.getLocalizedMessage());}

                    String firstName = sc.nextLine();
                    String lastName = sc.nextLine();
                    HotelResource.createCustomer(email, firstName, lastName);
                    break;
            case 4:
                AdminMenu.main();
                break;
            case 5:
                System.exit(0);


                }


        }
    }
