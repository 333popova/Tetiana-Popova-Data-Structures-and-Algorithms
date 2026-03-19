/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg24210421;

/**
 *
 * @author TetianaPopova
 *
 */ 
import java.util.LinkedList;

public class GreenSpace {
    private String name;
    private String location;
    private LinkedList<Sensor> sensors;

    public GreenSpace(String name, String location) {
        this.name = name;
        this.location = location;
        sensors = new LinkedList<>();
    }

    public String getLocation() {
        return location;
    }


    public LinkedList<Sensor> getSensors() {
        return sensors;
    }

    public void setSensors(LinkedList<Sensor> sensors) {
        this.sensors = sensors;
    }

    public void addSensor(Sensor s) {
        sensors.add(s);
    }

    public void displaySensors() {
        for (Sensor s : sensors) {
            System.out.println(s.readData()); // polymorphism works here
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "GreenSpace{" + "name=" + name + ", location=" + location + '}';
    }


    
}
   

