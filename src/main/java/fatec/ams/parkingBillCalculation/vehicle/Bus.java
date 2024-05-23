/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fatec.ams.parkingBillCalculation.vehicle;

/**
 *
 * @author Victor Hugo
 */
public class Bus extends Vehicle {
    
    private int passengersAmount;
    
    public Bus(String licensePlate, String model, String brand, int year, int passengersAmount) {
        super(licensePlate, model, brand, year);
        this.passengersAmount = passengersAmount;
    }

    public int getPassengersAmount() {
        return passengersAmount;
    }

    public void setPassengersAmount(int passengersAmount) {
        this.passengersAmount = passengersAmount;
    }
    
    
}
