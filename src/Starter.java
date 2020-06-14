public class Starter {

    public static void main(String[] args) {
        Node<String> root = new Node<String>("root");
        // Children of root
        Node<String> child1 = root.addChild(new Node<String>("Child 1"));
        Node<String> child2 = root.addChild(new Node<String>("Child 2"));

        // Children of child1
        Node<String> child3 = child1.addChild(new Node<String>("Child 3"));
        Node<String> child4 = child1.addChild(new Node<String>("Child 4"));

        // Children of child2
        Node<String> child5 = child2.addChild(new Node<String>("Child 5"));
        Node<String> child6 = child2.addChild(new Node<String>("Child 6"));
        Node<String> child7 = child2.addChild(new Node<String>("Child 7"));
        Node<String> child8 = child2.addChild(new Node<String>("Child 8"));
        System.out.println("All nodes are added ...");
        System.out.println("Initiating Print ...");
        root.printAllNodes(root, "-");
    }

}