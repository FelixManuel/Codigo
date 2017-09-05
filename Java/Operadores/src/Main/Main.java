package Main;

import List.List;
import Operators.Operators;

/**
 * @author Félix Manuel Mellado
 */
public class Main {
    
    public static void main(String args[]){
        Operators operators = new Operators();
        List list = new List();
        
        int[] vector = {5,7,2,2,6,9,77,5,3,22,23};
        int[] result = list.rotate(vector);
        
        for(int number:result){
            System.out.print(number + " ");
        }
    }
}
