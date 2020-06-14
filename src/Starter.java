public class Starter {

    public static void main(String[] args) {
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

}