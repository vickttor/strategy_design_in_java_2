/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fatec.ams.parkingBillCalculation.vehicle;

/**
 *
 * @author Victor Hugo
 */
public class Truck extends Vehicle {
    
    private int axes;
    private double charge;
    
    public Truck(String licensePlate, String model, String brand, int year, int axes, double charge) {
        super(licensePlate, model, brand, year);
        this.axes = axes;
        this.charge = charge;
    }

    public int getAxes() {
        return axes;
    }

    public void setAxes(int axes) {
        this.axes = axes;
    } 

    public double getCharge() {
        return charge;
    }

    public void setCharge(double charge) {
        this.charge = charge;
    }
    
    
}
