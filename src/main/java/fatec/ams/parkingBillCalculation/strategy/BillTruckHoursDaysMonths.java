package fatec.ams.parkingBillCalculation.strategy;

import fatec.ams.parkingBillCalculation.vehicle.Truck;
import fatec.ams.parkingBillCalculation.vehicle.Vehicle;
import fatec.ams.parkingBillCalculation.utils.TimesInMilliseconds;


/**
 *
 * @author Victor Hugo
 */
public class BillTruckHoursDaysMonths implements CalculateBill {
    
    @Override
    public double calculate(long period, Vehicle vehicle) {
        Truck truck = (Truck) vehicle;
        
        if(period < 12 * TimesInMilliseconds.HOUR) {
            return 2.0 * truck.getAxes() * Math.ceil(period / TimesInMilliseconds.HOUR) + (0.03 * truck.getCharge());
        }else if (period > 12 * TimesInMilliseconds.HOUR && period < 15 * TimesInMilliseconds.DAY) {
            return 26.0 * truck.getAxes() *  Math.ceil(period / TimesInMilliseconds.DAY) + (0.03 * truck.getCharge());
        }else {
            return 300.0 * truck.getAxes() * Math.ceil(period / TimesInMilliseconds.MONTH) + (0.03 * truck.getCharge());
        }
    }
    
}