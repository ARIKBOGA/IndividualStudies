public class LinkedList_Practice {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void display(Node head) {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + "\n");
            n = n.next;
        }
    }

    public static Node reverse(Node head) {  // returns the reverse of the given LikedList
        Node prev = null, next;

        while (head != null) {
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        LinkedList_Practice list = new LinkedList_Practice();
        list.head = new Node(100);
        Node second = new Node(200);
        Node third = new Node(300);

        list.head.next = second;
        second.next = third;

        list.display(list.head);  // 100, 200, 300

        list.display(reverse(list.head)); // 300, 200, 100

    }
}
