public class TreeClass {
    private Node[] tree = new Node[20];
    private int firstNode = -1;
    private int numberNodes = 0;

    public TreeClass() {
        for (int i = 0; i < tree.length; i++) {
            tree[i] = new Node(-1);
        }//for 
    }//TreeClass

    public void insertNode(Node newNode) {
        if (numberNodes == 0) {
            tree[numberNodes] = newNode;
            firstNode = 0;
        } else {
            // Insert logic for non-empty tree
            int currentIndex = firstNode;
            while (true) {
                if (newNode.getData() < tree[currentIndex].getData()) {
                    if (tree[currentIndex].getLeft() == -1) {
                        tree[currentIndex].setLeft(numberNodes);
                        break;
                    } else {
                        currentIndex = tree[currentIndex].getLeft();
                    }//if 
                } else {
                    if (tree[currentIndex].getRight() == -1) {
                        tree[currentIndex].setRight(numberNodes);
                        break;
                    } else {
                        currentIndex = tree[currentIndex].getRight();
                    }//if 
                }//if 
            }//while 
            tree[numberNodes] = newNode;
        }//if 
        numberNodes++;
    }//insertNode

    public void outputTree() {
        if (numberNodes == 0) {
            System.out.println("No nodes");
        } else {
            for (int i = 0; i < numberNodes; i++) {
                System.out.println("Node " + i + ": Left=" + tree[i].getLeft() +
                                   ", Data=" + tree[i].getData() +
                                   ", Right=" + tree[i].getRight());
            }//for 
        }//if 
    }//outputTree
}//TreeClass