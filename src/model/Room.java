package model;

public class Room implements IRoom{
    String roomNumber;
    double price;
    boolean isfree;
    RoomType enumeration;
    public Room(String roomNumber, double price,RoomType enumeration,boolean isfree){
        this.roomNumber=roomNumber;
        this.price=price;
        this.enumeration=enumeration;
        this.isfree=isfree;
    }


    @Override
    public String getRoomNumber() {
        return roomNumber;
    }

    @Override
    public double getRoomPrice(){
        return price;
    }
    @Override
    public RoomType getRoomType() {
        return enumeration;
    }
    @Override
    public boolean isFree(){
        return isfree;
    }
    @Override
    public String toString(){
        return "Room Number "+ getRoomNumber()+" price is "+getRoomPrice()+" Room Type is "+getRoomType()+" Free Status"+isFree();
    }
}
