/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package fatec.ams.parkingBillCalculation.strategy;

import fatec.ams.parkingBillCalculation.vehicle.Vehicle;

/**
 *
 * @author Victor Hugo
 */
public interface CalculateBill {
    public double calculate(long period, Vehicle vehicle);
}
