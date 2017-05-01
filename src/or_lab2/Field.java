/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package or_lab2;

/**
 *
 * @author andrei
 */
public class Field {
    private int experimentIndex;
    private int indexOfMaxIncome;
    private int forest;
    private int potato;
    private int grapes;
    private int experimentIncome;
    private int maxIncome;
    
            
    public Field() {
    }

    public Field(int forest, int potato, int grapes) {
        this.forest = forest;
        this.potato = potato;
        this.grapes = grapes;
        this.experimentIncome=0;
        this.indexOfMaxIncome=0;
    }

    public int getGrapes() {
        return grapes;
    }

    public void setGrapes(int grapes) {
        this.grapes = grapes;
    }

    public int getForest() {
        return forest;
    }

    public void setForest(int forest) {
        this.forest = forest;
    }

    public int getPotato() {
        return potato;
    }

    public void setPotato(int potato) {
        this.potato = potato;
    }

    public void setExperiemntIncome(int income){
        this.experimentIncome=income;
    }
    
    public int getExperiemntIncome(){
        return experimentIncome;
    }
      public int getExperimentIndex() {
        return experimentIndex;
    }

    public void setExperimentIndex(int experimentIndex) {
        this.experimentIndex = experimentIndex;
    }

    public int getIndexOfMaxIncome() {
        return indexOfMaxIncome;
    }

    public void setIndexOfMaxIncome(int indexOfMaxIncome) {
        this.indexOfMaxIncome = indexOfMaxIncome;
    }

    @Override
    public String toString() {
        return "Field{" + "experimentIndex=" + experimentIndex + ", forest=" + forest + ", potato=" + potato + ", grapes=" + grapes + ", experimentIncome=" + experimentIncome + ", indexOfMaxIncome=" + indexOfMaxIncome + '}';
    }


    public int getMaxIncome() {
        return maxIncome;
    }

    public void setMaxIncome(int maxIncome) {
        this.maxIncome = maxIncome;
    }
     
    
   
    
    
    
     public  boolean checkConditions(){
         if ((120*potato+580*grapes)<=1500){
             return true;
         } 
        return false;
    }

  
  
    
}
