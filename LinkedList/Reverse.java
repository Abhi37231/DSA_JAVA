public class Reverse {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;

        }
    }

    public static Node head;
    public static Node tail;

    public void addInLL(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;

        }

        newNode.next = head;

        head = newNode;

    }

    public void print() {

        if (head == null) {
            System.out.println("LinkList is empty");
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;

        }
        System.out.println("Null");
    }

    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        head = prev;

        
    }

    public static void main(String[] args) {
        Reverse ll = new Reverse();

        ll.addInLL(1);

        ll.addInLL(2);
        ll.print();
        ll.reverse();
        ll.print();

    }
}
