/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg24210421;

/**
 *
 * @author TetianaPopova
 */
public class MoistureSensor extends Sensor {

    public MoistureSensor(String id, String location) {
        super(id, location);
    }

    @Override
    public String readData() {
        return "Moisture: " + (40 + Math.random() * 30) + " %";
    }
}
   

