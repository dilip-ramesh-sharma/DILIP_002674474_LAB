/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author 91730
 */
public class VitalSignHistory {
    ArrayList<Observation> vitalSignHHistory;
    
    public VitalSignHistory(){
        this.vitalSignHHistory = new ArrayList<Observation>();
    }

    public ArrayList<Observation> getVitalSignHHistory() {
        return vitalSignHHistory;
    }

    public void setVitalSignHHistory(ArrayList<Observation> vitalSignHHistory) {
        this.vitalSignHHistory = vitalSignHHistory;
    }
    
    //fetch or find obs based on ID
    public Observation findObservation(int id){
        for(Observation o: this.vitalSignHHistory){
            if(o.getObservationId() == id){
                return o;
            }
        }
        return null;
    }
    
    
    public Observation createObservation(int ObservationId, double bloodPressure, double temperature){
        Observation observation = new Observation();
        
        observation.setObservationId(ObservationId);
        observation.setBloodPressure(bloodPressure);
        observation.setTemperature(temperature);
        
        
        
        this.vitalSignHHistory.add(observation);
        return observation;
    }
    
    public Boolean checkObservationIdUnique(int id){
        for (Observation o: this.vitalSignHHistory){
            if(o.getObservationId() == id){
                return false;
            }
        }
        return true;
    }
}
