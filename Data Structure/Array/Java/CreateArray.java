import java.util.Random;

public class CreateArray {
    private int itemSize;
    private int bound;
    
    public CreateArray() {
    }

    public CreateArray(int itemSize, int bound) {
        this.itemSize = itemSize;
        this.bound = bound;
    }

    public int getItemSize() {
        return itemSize;
    }

    
    public void setItemSize(int itemSize) {
        this.itemSize = itemSize;
    }

    public int getBound() {
        return bound;
    }

    public void setBound(int bound) {
        this.bound = bound;
    }

    public int[] getArr(int itemNumber) {
        Random rn = new Random();
        int[] array = new int[itemNumber];
        for (int i = 0; i < array.length; i++) {
            array[i] = rn.nextInt(20);
        }
        return array;
    }

    public int[] getArray() {
        Random rn = new Random();
        int[] array = new int[this.itemSize];
        for (int i = 0; i < array.length; i++) {
            array[i] = rn.nextInt(bound);
        }
        return array;
    }
}
