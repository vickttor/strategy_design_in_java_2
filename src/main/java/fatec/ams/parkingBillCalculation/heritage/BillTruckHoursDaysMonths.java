/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fatec.ams.parkingBillCalculation.heritage;

import fatec.ams.parkingBillCalculation.vehicle.Truck;

/**
 *
 * @author Victor Hugo
 */
public class BillTruckHoursDaysMonths extends ParkingBill {
        
    public BillTruckHoursDaysMonths(Truck truck, long start, long end) {
        this.vehicle = truck;
        this.start = start;
        this.end = end;
    }
    
    @Override
    public double calculateBillPrice() {
        long period = end - start;
        Truck truck = (Truck) vehicle;
        
        if(period < 12 * HOUR) {
            return 2.0 * truck.getAxes() * Math.ceil(period / HOUR) + (0.03 * truck.getCharge());
        }else if (period > 12 * HOUR && period < 15 * DAY) {
            return 26.0 * truck.getAxes() *  Math.ceil(period / DAY) + (0.03 * truck.getCharge());
        }else {
            return 300.0 * truck.getAxes() * Math.ceil(period / MONTH) + (0.03 * truck.getCharge());
        }
    }
}
