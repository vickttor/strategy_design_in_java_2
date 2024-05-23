/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fatec.ams.parkingBillCalculation.heritage;

import fatec.ams.parkingBillCalculation.vehicle.Vehicle;


/**
 *
 * @author Victor Hugo
 */
public class BillVehicleHoursDaysMonths extends ParkingBill {
        
    public BillVehicleHoursDaysMonths(Vehicle vehicle, long start, long end) {
        this.vehicle = vehicle;
        this.start = start;
        this.end = end;
    }
    
    @Override
    public double calculateBillPrice() {
        long period = end - start;
        
        if(period < 12 * HOUR) {
            return 2.0 * Math.ceil(period / HOUR);
        }else if (period > 12 * HOUR && period < 15 * DAY) {
            return 26.0 * Math.ceil(period / DAY);
        }else {
            return 300.0 * Math.ceil(period / MONTH);
        }
    }
}
