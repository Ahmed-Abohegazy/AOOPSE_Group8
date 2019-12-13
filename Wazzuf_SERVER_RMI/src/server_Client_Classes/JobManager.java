/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server_Client_Classes;
import java.util.ArrayList;
import java.util.Observer;

/**
 *
 * @author Lenovo
 */
public class JobManager implements Observable {
    private ArrayList<Observer> observers = new ArrayList<Observer>();
    private Job JobMGR;
    public Job createJob(){
    return null;
    };
     public void create_job(){
         notifyObservers();
     
     }
     
    public void editJob(){};
    public void removeJob(){};
    public void applyForJob(int jobSeekerID){};

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer ob : observers) {
            System.out.println("Notifying Observers for new job");
            ob.update(null, ob);
        }
    }
}
