package DataStructure.Trees;
import java.util.Queue;
import java.util.LinkedList;
class Node {
    int key;
    Node left;
    Node right;
    Node(int key) {
        this.key = key;
        this.left = null;
        this.right = null;
    }
}
public class BST {
    Node root;

    BST() {
        root = null;
    }

    private Node inserRec(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }
        if (key < root.key) {
            root.left = inserRec(root.left, key);
        } else if (key > root.key) {
            root.right = inserRec(root.right, key);
        }
        return root;
    }

    public void insert(int key) {
        root = inserRec(root, key);
    }


    void DFS(Node root) {
        if (root == null) {
            return;
        }
        DFS(root.left);
        System.out.print(root.key + " ");
        DFS(root.right);
    }

    void BFS() {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            Node temp = q.poll();
            System.out.print(temp.key + " ");
            if (temp.left != null) {
                q.offer(temp.left);
            }
            if (temp.right != null) {
                q.offer(temp.right);
            }
        }

    }
}
    class Driver {
        public static void main(String[] args) {
            BST bst = new BST();
            bst.insert(100);
            bst.insert(50);
            bst.insert(180);
            bst.insert(30);
            bst.insert(80);
            bst.insert(60);
            bst.insert(150);
            bst.insert(200);
            bst.insert(120);
            bst.insert(170);
            System.out.print("BFS traversal:");
            bst.BFS();
            System.out.print("\nDFS traversal:");
            bst.DFS(bst.root);
    }
}
