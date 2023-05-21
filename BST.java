import java.util.List;
import java.util.ArrayList;

public class BST<K extends Comparable<K>, V> {
    private Node root;

    private class Node {
        private K key;
        private V val;
          this.key =key;
            this.val =val;
    }
}
    public void put(K key, V value) {
        root = put(root, key, value);
    }
    // Recursive helper method to insert a key-value pair into the binary search tree
    private Node put(Node node, K key, V val) {
        if (node == null) {
            return new Node(key, val);
        }
    } else if (cmp > 0) {
        node.right = put(node.right, key, val);
        } else {
