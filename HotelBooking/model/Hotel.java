package model;
import java.util.ArrayList;
import java.util.List;

public class Hotel{
    private String hotelId;
    private String name;
    private List<Room> rooms;
    public Hotel(String hotelId, String name){
        this.hotelId = hotelId;
        this.name = name;
        this.rooms = new ArrayList<>();
    }
    public void addRoom(Room room){
        rooms.add(room);
    }
    public void removeRoome(Room room){
        rooms.remove(room);
    }
    public String getHotelId() {
        return hotelId;
    }
    public String getName() {
        return name;
    }
    public List<Room> getRooms(){
        return rooms;
    }
}