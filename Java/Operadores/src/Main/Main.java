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
        
        int[] vector = {5,7,2,2,6,9,77,5};
        int result = list.josefo(vector, 2);
        
        System.out.println(result);
    }
}
