/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fatec.ams.parkingBillCalculation.heritage;

import fatec.ams.parkingBillCalculation.utils.TimesInMilliseconds;
import fatec.ams.parkingBillCalculation.vehicle.Vehicle;

/**
 *
 * @author Victor Hugo
 */
public abstract class ParkingBill {
    
    final long HOUR = TimesInMilliseconds.HOUR;
    final long DAY =  TimesInMilliseconds.DAY;
    final long MONTH = TimesInMilliseconds.MONTH;
    
    protected Vehicle vehicle;
    protected long start;
    protected long end;
            
    public double calculateBillPrice() {
        return 0.0;
    }
       
}
