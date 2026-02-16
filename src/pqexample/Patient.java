/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pqexample;

/**
 *
 * @author TetianaPopova
 */
public class Patient {
   String name;
   String symptom;
   int key;
   
   public Patient(){
       
   };
   
   
   public Patient(String name, String symptom, int key){
       this.name= name;
       this.symptom=symptom;
       this.key=key;
       
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "Patient{" + "name=" + name + ", symptom=" + symptom + ", key=" + key + '}';
    }
   
}
