
public class RemoveCycle {

    public static class Node{

        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;

    }
    public void print(){

        if(head == null){
            System.out.println("LL is Empty");
            return;
        }

        Node temp = head;

        while(temp != null){
            System.out.print(temp.data+"->");
            temp =  temp.next;

        }
        System.out.println("Null");
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

    public static void removeCycle(){
        
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while(fast != null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                cycle = true;
                break;

            }

        }

        if(cycle == false){
            return;

        }


        slow = head;
        Node prev = null;

        while(slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        prev.next = null;



    }
    public static void main(String[] args) {
        RemoveCycle ll = new RemoveCycle();
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.print();

        head = new Node(1);
        // Node temp = new Node(2);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = head.next;

      System.out.println(ll.isCycle());
      ll.removeCycle();
      System.out.println(ll.isCycle());


    }
}
