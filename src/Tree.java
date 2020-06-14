import java.util.ArrayList;
import java.util.List;

public class Tree<T> {

    private T data = null;
    private List<Tree<T>> children = new ArrayList<>();
    private Tree<T> parent = null;

    public Tree(T data) {
        this.data = data;
    }

    public Tree<T> getParent() {
        return parent;
    }

    public T getData() {
        return data;
    }

    public List<Tree<T>> getChildren() {
        return children;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setParent(Tree<T> parent) {
        this.parent = parent;
    }

    public void setChildren(List<Tree<T>> children) {
        this.children = children;
    }

    public Tree<T> addChild(Tree<T> child) {
        child.setParent(this);
        this.children.add(child);
        return child;
    }

    public void addChildren(List<Tree<T>> children) {
        children.forEach(each -> each.setParent(this));
        this.children.addAll(children);
    }

    public void printAllNodes(Tree<T> node, String appender) {
        System.out.println(appender + node.getData());
        node.getChildren().forEach(each -> printAllNodes(each, appender + appender));
    }

    public Tree<T> getRootNode(Tree<T> node) {
        if (node.getParent() == null)
            return this;
        return parent.getRootNode(parent);
    }

    public void deleteNode() {
        if (this.parent != null) {
            int index = this.parent.getChildren().indexOf(this);
            this.parent.getChildren().remove(this);
            for (Tree<T> node : getChildren()) {
                node.setParent(this.parent);
            }
            this.parent.getChildren().addAll(index, getChildren());
        } else
            this.deleteRootNode();
        this.getChildren().clear();
    }

    public Tree<T> deleteRootNode() {
        if (this.parent != null) {
            throw new IllegalStateException("deleteRootNode is called for non root");
        }
        final Tree<T> newParent = this.getChildren().get(0);
        newParent.setParent(null);
        this.getChildren().remove(0);
        this.getChildren().forEach(child -> child.setParent(newParent));
        newParent.getChildren().addAll(getChildren());
        this.getChildren().clear();
        return newParent;
    }
}