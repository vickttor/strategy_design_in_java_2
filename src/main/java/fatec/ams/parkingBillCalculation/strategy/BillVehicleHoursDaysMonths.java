/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fatec.ams.parkingBillCalculation.strategy;

import fatec.ams.parkingBillCalculation.utils.TimesInMilliseconds;
import fatec.ams.parkingBillCalculation.vehicle.Vehicle;

/**
 *
 * @author Victor Hugo
 */
public class BillVehicleHoursDaysMonths implements CalculateBill{
    
    @Override
    public double calculate(long period, Vehicle vehicle) {
        if(period < 12 * TimesInMilliseconds.HOUR) {
            return 2.0 * Math.ceil(period / TimesInMilliseconds.HOUR);
        }else if (period > 12 * TimesInMilliseconds.HOUR && period < 15 * TimesInMilliseconds.DAY) {
            return 26.0 * Math.ceil(period / TimesInMilliseconds.DAY) ;
        }else {
            return 300.0 * Math.ceil(period / TimesInMilliseconds.MONTH);
        }
    }
}
