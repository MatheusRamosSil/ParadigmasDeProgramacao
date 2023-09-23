package exemples;

public class Vector {
    private int vector[];
  
    public Vector(int sizeVector) {
        this.vector = new int[sizeVector];
    }
    public int[] getVector(){
        return vector;
    }
    public int getVectorSize() {
        return vector.length;
    }

    public int getElementInVector(int index) {
        return vector[index];
    }

    public void setElementInVector(int value, int index) {
        this.vector[index] = value;
    }

    

    
}
