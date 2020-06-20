public class BSTOperations {
    BST bst = null;

    public BSTOperations(int value) {
        bst = new BST(value);
    }

    public void insertNode(int value) {
        BST newNode = new BST(value);
        BST current = bst;
        BST parent = null;
        while (true) {
            parent = current;
            if (value < current.getData()) {
                current = current.getLeft();
                if (current == null) {
                    parent.setLeft(newNode);
                    return;
                }
            } else {
                current = current.getRight();
                if (current == null) {
                    parent.setRight(newNode);
                    return;
                }
            }
        }
    }

    public void printBST() {
        printNodes(bst);
        System.out.println();
    }

    public void printNodes(BST node) {
        if (node != null) {
            printNodes(node.getLeft());
            System.out.print(" " + node.getData() + " ");
            printNodes(node.getRight());
        }
    }
}