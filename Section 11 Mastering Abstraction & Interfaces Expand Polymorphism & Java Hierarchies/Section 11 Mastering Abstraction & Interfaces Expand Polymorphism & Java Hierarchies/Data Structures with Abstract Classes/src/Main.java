//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Node node1 = new Node(3);
        Node node2 = new Node(5);
        Node node3 = new Node(1);
        Node node4 = new Node(4);

        MyLinkedList list = new MyLinkedList(node1);

//        list.addItem(node2);
//        list.addItem(node3);
//        list.traverse();
//        list.addItem(node4);
//        list.traverse();
//
//        System.out.println();
//        System.out.println(node1.next().value);

        SearchTree tree = new SearchTree(node1);

        tree.addItem(node2);
        tree.addItem(node3);
        tree.traverse();
        tree.addItem(node4);
        System.out.println();
        tree.traverse();
    }
}