
public class AddInMiddle {

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
    public static int size;

    public void addFirst(int data) {
        // creating new Node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;

        head = newNode;

    }

    public void addLast(int data){
        //creating new node
        Node newNode = new Node(data);
        size++;

        if(head == null){
            head = tail = newNode;
            return;

        }
        tail.next= newNode;

        tail = newNode;

    }

    public void print(){
        if(head == null){
            System.out.println("Linklist is empty");
            return;
        }
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("Null");
    }
    public void add(int idx,int data){
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while(i < idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public int removeFirst(){

        if(size == 0){
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;

        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;

        }
        int val = head.data;
        head = head.next;
        size--;
        return val;

    }

    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;

            }

        }
        return false;

    }






    public static void main(String[] args) {
        AddInMiddle ll = new AddInMiddle();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();
        ll.add(2, 9);
        ll.print();
        System.out.println(ll.size);
        // ll.removeFirst();
        // ll.print();

        System.out.println(ll.isCycle());

    }

}
