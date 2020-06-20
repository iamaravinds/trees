public class BST {
    private int data;
    private BST left, right;

    public BST(int value) {
        this.data = value;
        this.left = null;
        this.right = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public BST getLeft() {
        return left;
    }

    public void setLeft(BST left) {
        this.left = left;
    }

    public BST getRight() {
        return right;
    }

    public void setRight(BST right) {
        this.right = right;
    }
}