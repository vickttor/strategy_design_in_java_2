/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fatec.ams.parkingBillCalculation.heritage;

import fatec.ams.parkingBillCalculation.vehicle.Bus;
import fatec.ams.parkingBillCalculation.vehicle.Truck;
import fatec.ams.parkingBillCalculation.vehicle.Vehicle;

/**
 *
 * @author Victor Hugo
 * 
 * This is the Main Class of the heritage version 
 */
public class Heritage {

    public static void execute() {

        // GENERIC VEHICLE 
        Vehicle chevroletOnix = new Vehicle("QWE-1234", "hatchback", "Chevrolet", 2024);
        
        BillVehicleHoursDaysMonths vehicleBill = new BillVehicleHoursDaysMonths(
            chevroletOnix, 
            1716202800000L,  // 2024-05-20 08:00:00
            1716289200000L // 2024-05-21 08:00:00
        );
        
        final double vehicleBillPrice = vehicleBill.calculateBillPrice();
        System.out.println("Bill Vehicle Price: " + vehicleBillPrice);
        
        
        // TRUCK  
        Truck volvoFMX = new Truck("XYZ-1234", "FMX", "Volvo", 2022, 3, 60.0);
        
        BillTruckHoursDaysMonths truckBill = new BillTruckHoursDaysMonths(
            volvoFMX, 
            1716202800000L,  // 2024-05-20 08:00:00
            1716289200000L // 2024-05-21 08:00:00
        );
        
        final double truckBillPrice = truckBill.calculateBillPrice();
        System.out.println("Bill Truck Price: " + truckBillPrice);
        
        
        // BUS
        Bus scaniaKChassisHF = new Bus("ABC-4321", "K-Chassis HF", "Scania", 2023, 30);
        
        BillBusHoursDaysMonths busBill = new BillBusHoursDaysMonths(
            scaniaKChassisHF, 
            1716202800000L,  // 2024-05-20 08:00:00
            1716289200000L // 2024-05-21 08:00:00
        );
        
        final double busBillPrice = busBill.calculateBillPrice();
        System.out.println("Bill Bus Price: " + busBillPrice);
    }
    
    
}
