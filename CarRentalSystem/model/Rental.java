package model;

public class Rental {
    private Customer customer;
    private Vehicle vehicle;
    private int days;
    private double price;

    public Rental(Customer customer,Vehicle vehicle,int days,double price){
        this.customer=customer;
        this.vehicle=vehicle;
        this.days = days;
        this.price=price;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public int getDays() {
        return days;
    }

    public double getPrice() {
        return price;
    }


}
