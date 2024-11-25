public class Node {
    private int leftPointer;
    private int data;
    private int rightPointer;

    public Node(int data) {
        this.data = data;
        this.leftPointer = -1;
        this.rightPointer = -1;
    }//Node

    public int getLeft() {
        return leftPointer;
    }//getLeft

    public int getRight() {
        return rightPointer;
    }//getRight

    public int getData() {
        return data;
    }//getData

    public void setLeft(int leftPointer) {
        this.leftPointer = leftPointer;
    }//setLeft

    public void setRight(int rightPointer) {
        this.rightPointer = rightPointer;
    }//setRight

    public void setData(int data) {
        this.data = data;
    }//setData
}//Node