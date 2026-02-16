/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pqexample;

import java.util.ArrayList;

/**
 *
 * @author TetianaPopova
 */
public class MyPQ implements PQInterface {
    
    private ArrayList<PQElement> myPQ;

    public MyPQ() {
        myPQ = new ArrayList<>();
    }
    
    
    private int findTheInsertPosition(int priorityKey){
        PQElement elem;
        int position=0;
        for(position=0; position<myPQ.size(); position++){
            elem=myPQ.get(position);
            if (elem.getPriorityKey()<priorityKey){
                break;    
            }
            
        }
        return position;
    }
   
 @Override   
    public void enqueue (int priorityKey, Patient newPatient){
        int index;
        PQElement elem = new PQElement(priorityKey, newPatient);
        index = findTheInsertPosition(priorityKey);
        
        if(index>size()){
            myPQ.add(elem);
        }else{
            myPQ.add(index,elem);
        }
        
    }
    public void enqueue(PQElement elem){
      int index;
      int priorityKey = elem.getPriorityKey();
      index = findTheInsertPosition(priorityKey);
        
        if(index>size()){
            myPQ.add(elem);
        }else{
            myPQ.add(index,elem);
        }
        
    }
    
  /*  private int findTheInsertPosition(priorityKey){
        PQElement elem;
        int position =0;
        for(position=0; position<myPQ.size(); position++){
            elem=myPQ.get(position);
            if (elem.getPriorityKey()<priorityKey){
                break;    
            }
            
        }
        return position;
    }
  */
@Override    
    public Object dequeue(){
    return myPQ.remove(0);
    }
    @Override
    public Object frontOfQueue(){
      return myPQ.get(0);
    }
 @Override
    public int size(){
        return myPQ.size();
    }
 @Override   
    public boolean isEmpty(){
        return myPQ.isEmpty();
    }

    public String printQ(){
        PQElement temp;
        StringBuilder strB = new StringBuilder();
        for(int i=0; i<size(); i++){
            temp = myPQ.get(i);
            strB.append(temp.toString()+"\n");
        }
        return strB.toString();
    }
}
