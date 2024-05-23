/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fatec.ams.parkingBillCalculation.strategy;

import fatec.ams.parkingBillCalculation.vehicle.Bus;
import fatec.ams.parkingBillCalculation.vehicle.Vehicle;
import fatec.ams.parkingBillCalculation.utils.TimesInMilliseconds;

/**
 *
 * @author Victor Hugo
 */
public class BillBusHoursDaysMonths implements CalculateBill {
    
    @Override
    public double calculate(long period, Vehicle vehicle) {
        Bus bus = (Bus) vehicle;
        
        if(period < 12 * TimesInMilliseconds.HOUR) {
            return 4.50 * bus.getPassengersAmount() * Math.ceil(period / TimesInMilliseconds.HOUR);
        }else if (period > 12 * TimesInMilliseconds.HOUR && period < 15 * TimesInMilliseconds.DAY) {
            return 15 * bus.getPassengersAmount() *  Math.ceil(period / TimesInMilliseconds.DAY);
        }else {
            return 120.0 * bus.getPassengersAmount() * Math.ceil(period / TimesInMilliseconds.MONTH);
        }
    }
    
}
