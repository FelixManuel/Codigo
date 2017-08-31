package Main;

import Operators.Operators;

/**
 * @author Félix Manuel Mellado
 */
public class Main {
    
    public static void main(String args[]){
        Operators operators = new Operators();
        
        System.out.println(operators.recursiveAdd(5, 5));
        System.out.println(operators.iterativeAdd(85763, 28395));
        System.out.println(operators.recursiveSubtraction(5, 4));
    }
}
