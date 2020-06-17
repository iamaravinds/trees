import java.util.ArrayList;
import java.util.List;

/**
 * Traversals
 */
public class BinaryTreeTraversals<T> {
    public void preorderTraversal(BinaryTree<T> node) {
        // System.out.println("Preorder traversal");
        if (node != null) {
            System.out.print(node.getData() + " ");
            preorderTraversal(node.getLeft());
            preorderTraversal(node.getRight());
        } else {
            return;
        }
    }

    public void inorderTraversal(BinaryTree<T> node) {
        // System.out.println("Inorder Traversal");
        if (node != null) {
            preorderTraversal(node.getLeft());
            System.out.print(node.getData() + " ");
            preorderTraversal(node.getRight());
        } else {
            return;
        }
    }

    public void postorderTraversal(BinaryTree<T> node) {
        // System.out.println("Postorder Traversal");
        if (node != null) {
            preorderTraversal(node.getLeft());
            preorderTraversal(node.getRight());
            System.out.print(node.getData() + " ");
        } else {
            return;
        }
    }

    public void printAllNodes(BinaryTree<T> node) {
        List<T> array = new ArrayList<>();
        printRecursively(node, 0, array);
    }

    public void printRecursively(BinaryTree<T> node, int length, List<T> array) {
        if (node == null) {
            return;
        }
        array.add(length, node.getData());
        length++;
        if (node.getLeft() == null && node.getRight() == null) {
            printPrintArray(length, array);
        }
        printRecursively(node.getLeft(), length, array);
        printRecursively(node.getRight(), length, array);
    }

    public void printPrintArray(int length, List<T> array) {
        for (int i = 0; i < length; i++) {
            System.out.print(array.get(i));
        }
        System.out.println("");
    }

    // Returns the tree height from the node given
    public int treeHeight(BinaryTree<T> treeRoot) {
        if (treeRoot == null)
            return 0;
        else {
            int leftHeight = treeHeight(treeRoot.getLeft());
            int rightHeight = treeHeight(treeRoot.getRight());
            if (leftHeight > rightHeight)
                return (leftHeight + 1);
            else
                return (rightHeight + 1);
        }
    }

    public void levelOrderTraversal(BinaryTree<T> treeRoot) {
        for (int i = 1; i <= treeHeight(treeRoot); i++) {
            levelOrderTraversalRunner(treeRoot, i);
        }
    }

    public void levelOrderTraversalRunner(BinaryTree<T> treeRoot, int height) {
        if (treeRoot == null)
            return;
        if (height == 1)
            System.out.print(treeRoot.getData() + " ");
        else if (height > 1) {
            levelOrderTraversalRunner(treeRoot.getLeft(), height - 1);
            levelOrderTraversalRunner(treeRoot.getRight(), height - 1);
        }
    }
}