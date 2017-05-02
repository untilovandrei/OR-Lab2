/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package or_lab2;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class OR_Lab2 {

    static int maxGrapes=7;
    static int maxPotatoes=7;
    static int maxForest=12;
    static int functionValue=0;
    static int subproblem=0;
    static final int SUBPROBLEM_1=1;
    static final int SUBPROBLEM_2=2;
    static final int SUBPROBLEM_3=3;
    static ArrayList<Field> possibleConfigurations=new ArrayList<>();
    
    public static void main(String[] args) {
        Field field=new Field(5,0,0);
       String answer=JOptionPane.showInputDialog(null,"Which subproblem do you want to solve ? ","Select subproblem",JOptionPane.INFORMATION_MESSAGE);
       subproblem=Integer.parseInt(answer);
        
        while ((field.getForest()+field.getPotato()+field.getGrapes())<=12){
        System.out.println(field + "   maxGrapes="+maxGrapes+"   maxPotatoes="+maxPotatoes);
        incrementFields(field);
        field.setExperimentIndex(field.getExperimentIndex()+1);
        
        if(field.checkConditions()==true){
            switchFunction(field);
           field.setExperiemntIncome(functionValue);
           if(functionValue>field.getMaxIncome()){
               field.setMaxIncome(functionValue);
               field.setIndexOfMaxIncome(field.getExperimentIndex());
           }
        }
        Field newField=new Field(field);
        possibleConfigurations.add(newField);
        
    }
       
       Field bestConf=possibleConfigurations.get(field.getIndexOfMaxIncome()-1);
        System.out.println(" Optimal solution is : \n FOREST = "+bestConf.getForest()+
                "\n POTATOES = "+bestConf.getPotato()+
                "\n GRAPES = "+bestConf.getGrapes()+
                "\n INCOME = "+bestConf.getExperiemntIncome());
    
    
        
        
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
    
    private static void switchFunction(Field field){
        switch(subproblem){
            case SUBPROBLEM_1:
               functionValue=800*field.getForest()+1600*field.getPotato()+2400*field.getGrapes();// 800*6lei/L - 2400 lei/0,1km^2 =2400 lei
               break;
            case SUBPROBLEM_2:
               functionValue=800*field.getForest()+1600*field.getPotato()+2480*field.getGrapes(); // grape seeds cost +80 lei per 0,1 km^2
               break;
            case SUBPROBLEM_3:
               functionValue=800*field.getForest()+1600*field.getPotato()+1800*field.getGrapes(); //(800-100L)*6lei/L - 2400 lei/0,1km^2 = 1800lei
               break;
        } 
        
   
    }
  
}
