public class MainProgram {

    public static void main(String[] args) {
        TreeClass theTree = new TreeClass();
        
        int[] valuesToInsert = {10, 11, 5, 1, 20, 7, 15};
        
        for (int value : valuesToInsert) {
            theTree.insertNode(new Node(value));
        }//for 
        
        theTree.outputTree();
    }//main 
}//MainProgram