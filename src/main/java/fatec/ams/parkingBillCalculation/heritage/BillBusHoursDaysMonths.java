/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fatec.ams.parkingBillCalculation.heritage;

import fatec.ams.parkingBillCalculation.vehicle.Bus;

/**
 *
 * @author Victor Hugo
 */
public class BillBusHoursDaysMonths extends ParkingBill {
    public BillBusHoursDaysMonths(Bus bus, long start, long end) {
        this.vehicle = bus;
        this.start = start;
        this.end = end;
    }
    
    @Override
    public double calculateBillPrice() {
        long period = end - start;
        Bus bus = (Bus) vehicle;
        
        if(period < 12 * HOUR) {
            return 4.50 * bus.getPassengersAmount() * Math.ceil(period / HOUR);
        }else if (period > 12 * HOUR && period < 15 * DAY) {
            return 15 * bus.getPassengersAmount() *  Math.ceil(period / DAY);
        }else {
            return 120.0 * bus.getPassengersAmount() * Math.ceil(period / MONTH);
        }
    }
}
