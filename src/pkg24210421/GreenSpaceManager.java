/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg24210421;

/**
 *
 * @author TetianaPopova
 */
import java.util.*;

public class GreenSpaceManager implements GreenSpaceInterface {

    private ArrayList<GreenSpace> greenSpaces = new ArrayList<>();
    private Queue<String> sensorQueue = new LinkedList<>();

    @Override
    public void addGreenSpace(GreenSpace gs) {
        greenSpaces.add(gs);
    }

    @Override
    public void deleteGreenSpace(String name) {
        greenSpaces.removeIf(gs -> gs.getName().equals(name));
    }

    @Override
    public void displayAll() {
        for (GreenSpace gs : greenSpaces) {
            System.out.println("GreenSpace: " + gs.getName());
            gs.displaySensors();
        }
    }

    public void addSensorData(Sensor s) {
        sensorQueue.add(s.readData());
    }

    public void showQueue() {
        for (String data : sensorQueue) {
            System.out.println(data);
        }
    }
}
