import java.util.ArrayList;
import java.util.List;

public class BinaryTree<T> {
    private T data = null;
    private BinaryTree<T> left, right = null;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public BinaryTree<T> getLeft() {
        return left;
    }

    public void setLeft(BinaryTree<T> left) {
        this.left = left;
    }

    public BinaryTree<T> getRight() {
        return right;
    }

    public void setRight(BinaryTree<T> right) {
        this.right = right;
    }

    BinaryTree(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}