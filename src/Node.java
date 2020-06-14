import java.util.ArrayList;
import java.util.List;

public class Node<T> {

    private T data = null;
    private List<Node<T>> children = new ArrayList<>();
    private Node<T> parent = null;

    public Node(T data) {
        this.data = data;
    }

    public Node<T> getParent() {
        return parent;
    }

    public T getData() {
        return data;
    }

    public List<Node<T>> getChildren() {
        return children;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setParent(Node<T> parent) {
        this.parent = parent;
    }

    public void setChildren(List<Node<T>> children) {
        this.children = children;
    }

    public Node<T> addChild(Node<T> child) {
        child.setParent(this);
        this.children.add(child);
        return child;
    }

    public void addChildren(List<Node<T>> children) {
        children.forEach(each -> each.setParent(this));
        this.children.addAll(children);
    }

    public void printAllNodes(Node<T> node, String appender) {
        System.out.println(appender + node.getData());
        node.getChildren().forEach(each -> printAllNodes(each, appender + appender));
    }

    public Node<T> getRootNode(Node<T> node) {
        if (node.getParent() == null)
            return this;
        return parent.getRootNode(parent);
    }

    public void deleteNode() {
        if (this.parent != null) {
            int index = this.parent.getChildren().indexOf(this);
            this.parent.getChildren().remove(this);
            for (Node<T> node : getChildren()) {
                node.setParent(this.parent);
            }
            this.parent.getChildren().addAll(index, getChildren());
        } else
            this.deleteRootNode();
        this.getChildren().clear();
    }

    public Node<T> deleteRootNode() {
        if (this.parent != null) {
            throw new IllegalStateException("deleteRootNode is called for non root");
        }
        final Node<T> newParent = this.getChildren().get(0);
        newParent.setParent(null);
        this.getChildren().remove(0);
        this.getChildren().forEach(child -> child.setParent(newParent));
        newParent.getChildren().addAll(getChildren());
        this.getChildren().clear();
        return newParent;
    }
}