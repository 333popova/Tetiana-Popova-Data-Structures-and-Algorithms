/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg24210421;

/**
 *
 * @author TetianaPopova
 */
public class TemperatureSensor extends Sensor {

    public TemperatureSensor(String id, String location) {
        super(id, location);
    }

    @Override
    public String readData() {
        return "Temperature: " + (20 + Math.random() * 10) + " °C";
    }
}
   

