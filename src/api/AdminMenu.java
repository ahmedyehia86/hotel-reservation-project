package api;

import model.RoomType;

import java.util.Scanner;

public class AdminMenu {
    public static void main() {
        Scanner x=new Scanner(System.in);
        System.out.println("1. See all Customers");
        System.out.println("2. See all rooms");
        System.out.println("3. see all reservations");
        System.out.println("4. add a room");
        System.out.println("5.back to main menu");
        int y=x.nextInt();
        switch (y){
            case 1:
                AdminResource.getAllCustomers();
                break;
            case 2:
                AdminResource.getallrooms();
                break;
            case 3:
                AdminResource.displayallreservations();
                break;
            case 4:
                System.out.println("please enter room number , type , price and status");
                String roomnumber=x.nextLine();
                RoomType type=RoomType.valueOf(x.nextLine());
                double price=x.nextDouble();
                boolean status=x.nextBoolean();
                AdminResource.addRoom(roomnumber,price,type,status);
                break;
            case 5:
                MainMenu.main();
                break;
        }
    }
}
