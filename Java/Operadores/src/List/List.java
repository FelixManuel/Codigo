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
    
    public int[] rotateBetweenPositions(int[] vector, int start, int end){
        int number = vector[start];
        return rotateBetweenPositions(vector, start, end, number);
    }
    
    private int[] rotateBetweenPositions(int[] vector, int start, int end, int number){
        if(start == end){
            vector[start] = number;
        }else{
            vector[start] = vector[start+1];
            rotateBetweenPositions(vector, start+1, end, number);
        }
        return vector;
    }
    
    public int[] rotateKElements(int[] vector, int elements){
        int number = vector[0];
        return rotateKElements(vector,0,vector.length-1,elements,number);
    }
    
    private int[] rotateKElements(int[] vector, int start, int end, int elements, int number){
        if(elements != 0){
            number = vector[start];
            vector = rotate(vector);
            vector = rotateKElements(vector, start, end, elements-1, number);
        }
        return vector;
    }
    
    public int josefo(int[] vector, int rotation){
        return josefo(vector,rotation,vector.length);
    }
    
    private int josefo(int[] vector, int rotation, int vectorLength){
        if(vectorLength == 1){
            return vector[0];
        }else{
            vector = rotateKElements(vector, 0, vectorLength, rotation, vector[0]);
            return josefo(vector, rotation, vectorLength-1);
        }
    }
}
