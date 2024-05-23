/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package fatec.ams.parkingBillCalculation;

import fatec.ams.parkingBillCalculation.heritage.Heritage;
import fatec.ams.parkingBillCalculation.strategy.Strategy;

/**
 *
 * @author Victor Hugo
 */
public class ParkingBillCalculation {

    public static void main(String[] args) {
        System.out.println("\nAplicando Herança e Strategy Pattern!\n\n");
        
        System.out.println("HERANCA:\n");
        Heritage.execute();
        
        System.out.println("\nSTRATEGY:\n");
        Strategy.execute();
    }
}
