package Operators;

/**
 * @author Félix Manuel Mellado
 */
public class Operators {
    
    public int recursiveAdd(int number1, int number2){
        if(number2 == 0){
            return number1;
        }else{
            return (recursiveAdd(number1, number2-1)) + 1;
        }
    }
    
    public long iterativeAdd(long number1, long number2){
        long result = number1;
        
        while(number2 > 0){
            result += 1;
            number2 -= 1;
        }
        
        return result;
    }
    
    public int recursiveSubtraction(int minuendo, int substracting){
        if(substracting == 0){
            return minuendo;
        }else{
            return(recursiveSubtraction(minuendo, substracting-1)) - 1;
        }
    }
}
