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

    public Field(Field field) {
        this.experimentIndex=field.getExperimentIndex();
        this.forest = field.getForest();
        this.potato = field.getPotato();
        this.grapes = field.getGrapes();
        this.experimentIncome=field.getExperiemntIncome();
        this.indexOfMaxIncome=field.getIndexOfMaxIncome();
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
         switch(OR_Lab2.subproblem){
            case OR_Lab2.SUBPROBLEM_1:
                if ((120*potato+580*grapes)<=1500){   // 500 lei to collect + 80 lei for seeds
                    return true;
                }
                break;
//            case OR_Lab2.SUBPROBLEM_2:
//                if ((120*potato+500*grapes)<=1500){   // 500 lei to collect 
//                    return true;
//                }
//                break;
//            case OR_Lab2.SUBPROBLEM_3:
//                if ((120*potato+330*grapes)<=1500){   // 250 lei to collect + 80 lei for seeds
//                    return true;
//                }
//                break;
         }
         
        return false;
    }

  
  
    
}
