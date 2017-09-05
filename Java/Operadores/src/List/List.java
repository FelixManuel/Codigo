package List;

/**
 * @author Felix Manuel Mellado
 */
public class List {
    
    public int[] rotate(int[] vector){
        int number = vector[0];
        return rotate(vector, 0, number);
    }
    
    private int[] rotate(int[] vector, int rotation, int number){
        if(vector.length-1 == rotation){
            vector[rotation] = number;
        }else{
            vector[rotation] = vector[rotation+1];
            rotate(vector, rotation+1, number);
        }
        return vector;
    }
}
