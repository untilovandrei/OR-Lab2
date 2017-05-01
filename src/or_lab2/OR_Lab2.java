/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package or_lab2;

import java.util.ArrayList;


public class OR_Lab2 {

    static int maxGrapes=7;
    static int maxPotatoes=7;
    static int maxForest=12;
    static int functionValue=0;
    
    
    public static void main(String[] args) {
        Field field=new Field(5,0,0);
    while ((field.getForest()+field.getPotato()+field.getGrapes())<=12){
        System.out.println(field + "   maxGrapes="+maxGrapes+"   maxPotatoes="+maxPotatoes);
//        if(field.getCost()==16000){
//            System.out.println("EVRICA "+field);
//            break;
//        }
        incrementFields(field);
        field.setExperimentIndex(field.getExperimentIndex()+1);
        if(field.checkConditions()==true){
           functionValue=800*field.getForest()+1600*field.getPotato()+2400*field.getGrapes();
           field.setExperiemntIncome(functionValue);
           if(functionValue>field.getMaxIncome()){
               field.setMaxIncome(functionValue);
               field.setIndexOfMaxIncome(field.getExperimentIndex());
           }
        }
        
    }
    
    
        
        
    }
    
    
   

    private static void incrementFields(Field field) {
        if(field.getGrapes()<maxGrapes ){
            field.setGrapes(field.getGrapes()+1);
        } else if(field.getPotato()<maxPotatoes){
           maxGrapes-=1;
           field.setGrapes(0);
           field.setPotato(field.getPotato()+1);
        } else {
           field.setForest(field.getForest()+1);
           field.setPotato(0);
           field.setGrapes(0);
           maxGrapes=maxForest-field.getForest();
           maxPotatoes=maxForest-field.getForest();
        }
    }
  
}
