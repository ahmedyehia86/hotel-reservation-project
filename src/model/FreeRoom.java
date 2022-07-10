package model;

public class FreeRoom extends Room{

    public FreeRoom(String roomNumber, double price, RoomType enumeration, boolean isfree) {
        super(roomNumber, price, enumeration, isfree);
        this.price=0;
    }
    @Override
    public String toString(){
        return "Room Number "+getRoomNumber()+" price is "+getRoomPrice()+" Room Type is "+getRoomType()+" Free Status"+isFree();
    }
}
