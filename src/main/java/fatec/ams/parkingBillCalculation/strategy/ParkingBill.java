/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fatec.ams.parkingBillCalculation.strategy;

import fatec.ams.parkingBillCalculation.vehicle.Vehicle;

/**
 *
 * @author Victor Hugo
 */
public class ParkingBill {
    
    private final Vehicle vehicle;
    private final long start;
    private final long end;
    private final CalculateBill calculation;
    
    public ParkingBill(CalculateBill calculation, Vehicle vehicle, long start, long end) {
        this.calculation = calculation;
        this.vehicle = vehicle;
        this.start = start;
        this.end = end;
    }
    
    public double calculateBillPrice() {
        return this.calculation.calculate(end-start, vehicle);
    }
    
   
}
