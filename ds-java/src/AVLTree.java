/**
 * Created by m.cheikhna on 16/11/2016.
 */
public class AVLTree {

    private Node root;

    private class Node {
        private int key;
        private int balance;
        private Node left, right, parent;

        Node(int k, Node p) {
            key = k;
            parent = p;
        }
    }

    public boolean insert(int key) {
        //TODO: implement
        return false;
    }

    public void delete(int delKey) {

    }

    private void rebalance(Node n) {

    }

    public static void main(String[] args) {
        AVLTree tree = new AVLTree();

        System.out.println("Inserting values 1 to 10");
        for (int i = 1; i < 10; i++)
            tree.insert(i);

        System.out.print("Printing balance: ");
        tree.printBalance();
    }

    private void printBalance() {
        printBalance(root);
    }

    private void printBalance(Node n) {
        printBalance(n.left);
        System.out.printf("Node has balance %s", n.balance);
        printBalance(n.right);
    }

}
