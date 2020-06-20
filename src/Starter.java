public class Starter {

    public static void main(String[] args) {
        // initiateTree(); // Normal Tree
        initiateBinaryTree(); // Binary Tree
        initiateBinarySearchTree(); // Binary Search Tree

    }

    public static void initiateTree() {
        Tree<String> root = new Tree<String>("root");
        // Children of root
        Tree<String> child1 = root.addChild(new Tree<String>("Child 1"));
        Tree<String> child2 = root.addChild(new Tree<String>("Child 2"));

        // Children of child1
        Tree<String> child3 = child1.addChild(new Tree<String>("Child 3"));
        Tree<String> child4 = child1.addChild(new Tree<String>("Child 4"));

        // Children of child2
        Tree<String> child5 = child2.addChild(new Tree<String>("Child 5"));
        Tree<String> child6 = child2.addChild(new Tree<String>("Child 6"));
        Tree<String> child7 = child5.addChild(new Tree<String>("Child 7"));
        Tree<String> child8 = child5.addChild(new Tree<String>("Child 8"));
        System.out.println("All nodes are added ...");
        System.out.println("Initiating Print ...");
        root.printAllNodes(root, "-");
        // child1.printAllNodes(child1, "**");
        System.out.println(child8.getRootNode(child8).getData());
        System.out.println("Deleting Child 5 ....");
        child5.deleteNode();
        root.printAllNodes(root, "-");
    }

    private static void initiateBinaryTree() {
        System.out.println("\nBinary Tree Initiated");
        BinaryTree<Integer> root = new BinaryTree<>(1);
        BinaryTree<Integer> node2 = new BinaryTree<>(2);
        BinaryTree<Integer> node3 = new BinaryTree<>(3);
        BinaryTree<Integer> node4 = new BinaryTree<>(4);
        BinaryTree<Integer> node5 = new BinaryTree<>(5);
        BinaryTree<Integer> node6 = new BinaryTree<>(6);
        BinaryTree<Integer> node7 = new BinaryTree<>(7);
        BinaryTree<Integer> node8 = new BinaryTree<>(8);
        BinaryTree<Integer> node9 = new BinaryTree<>(9);

        System.out.println("Aligning nodes");
        root.setLeft(node2);
        root.setRight(node3);

        node2.setLeft(node4);
        node2.setRight(node5);

        node3.setLeft(node6);
        node3.setRight(node7);

        node4.setLeft(node8);
        node4.setRight(node9);

        System.out.println("Initiating Traversals\n");
        BinaryTreeTraversals<Integer> traverseTree = new BinaryTreeTraversals<Integer>();
        // traverseTree.printAllNodes(root);
        System.out.print("Breadth First Traversals:\n");
        System.out.print("Levelorder Traversal:\t");
        traverseTree.levelOrderTraversal(root);
        System.out.println();

        System.out.print("\nDepth First Traversals:\n");
        System.out.print("PreorderTraversal:\t");
        traverseTree.preorderTraversal(root);
        System.out.println();

        System.out.print("InorderTraversal:\t");
        traverseTree.inorderTraversal(root);
        System.out.println();

        System.out.print("PostorderTraversal:\t");
        traverseTree.postorderTraversal(root);
        System.out.println();

        System.out.print("Tree Height:\t\t");
        System.out.println(traverseTree.treeHeight(root));
        System.out.println();

    }

    public static void initiateBinarySearchTree() {
        System.out.println("Initiating Binary Search Tree");
        BSTOperations tree = new BSTOperations(5);

        System.out.println("Inserting Nodes");
        tree.insertNode(4);
        tree.insertNode(6);
        tree.insertNode(3);
        tree.insertNode(7);
        tree.insertNode(2);
        tree.insertNode(1);
        tree.insertNode(8);
        tree.insertNode(0);
        tree.insertNode(9);

        System.out.println("Printing Binary Search Tree");
        tree.printBST();
    }
}