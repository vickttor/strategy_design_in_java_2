/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fatec.ams.parkingBillCalculation.strategy;

import fatec.ams.parkingBillCalculation.vehicle.Bus;
import fatec.ams.parkingBillCalculation.vehicle.Truck;
import fatec.ams.parkingBillCalculation.vehicle.Vehicle;

/**
 *
 * @author Victor Hugo
 * 
 * This is the Main Class of the Strategy Pattern version 
 */
public class Strategy {
    
    public static void execute() {
        
        // Vehicle
        Vehicle chevroletOnix = new Vehicle("QWE-1234", "hatchback", "Chevrolet", 2024);
        
        ParkingBill parkingBillVehicle = new ParkingBill(
            new BillVehicleHoursDaysMonths(), // Strategy
            chevroletOnix,
            1716202800000L,  // 2024-05-20 08:00:00
            1716289200000L // 2024-05-21 08:00:00
        );
        
        final double vehicleBillPrice = parkingBillVehicle.calculateBillPrice();
        System.out.println("Bill Vehicle Price: " + vehicleBillPrice);
        
        // Truck
        Truck volvoFMX = new Truck("XYZ-1234", "FMX", "Volvo", 2022, 3, 60.0);
        
        ParkingBill parkingBillTruck = new ParkingBill(
            new BillTruckHoursDaysMonths(), // Strategy
            volvoFMX,
            1716202800000L,  // 2024-05-20 08:00:00
            1716289200000L // 2024-05-21 08:00:00
        );
        
        final double truckBillPrice = parkingBillTruck.calculateBillPrice();
        System.out.println("Bill Truck Price: " + truckBillPrice);
        
        // Bus
        Bus scaniaKChassisHF = new Bus("ABC-4321", "K-Chassis HF", "Scania", 2023, 30);
       
        ParkingBill parkingBillBus = new ParkingBill(
            new BillBusHoursDaysMonths(), // Strategy
            scaniaKChassisHF,
            1716202800000L,  // 2024-05-20 08:00:00
            1716289200000L // 2024-05-21 08:00:00
        );
        
        final double busBillPrice = parkingBillBus.calculateBillPrice();
        System.out.println("Bill Bus Price: " + busBillPrice);
            
    }
}
