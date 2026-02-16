/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pqexample;

/**
 *
 * @author TetianaPopova
 */
public interface PQInterface {
    public void enqueue (int priorityKey, Patient newPatient);
    public Object dequeue();
    public Object frontOfQueue();
    public int size();
    public boolean isEmpty();
    
}
