public class BinarySearchTree<T extends Comparable<T>> {

    private NodeType<T> root; 
    
    public void deleteNode(T item) {

    }
    
    public BinarySearchTree() {
        root = null;
    }

    void insert(T key) {

    }

    void delete(T key) {

    }

    boolean retrieve(T item) {
        return true;
    }

    void inOrder() {

    }

    void getSingleParent() {

    }

    void getNumLeafNodes() {
        int num = 0;
        if (root.left == null && root.right == null){
            num ++;
            System.out.println(num);
            return;
        }
    }

    void getCousins() {

    }
}
