package model;

import enums.RoomType;

public class Room{
    private int roomno;
    private RoomType roomType;
    private boolean available;
    
    public Room(int roomno, RoomType roomType){
        this.roomno=roomno;
        this.roomType=roomType;
    }
    public int getRoomno() {
        return roomno;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available){
        this.available = available;
    }
}