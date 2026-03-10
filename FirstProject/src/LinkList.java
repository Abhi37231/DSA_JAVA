public class LinkList {

    public static class Node{

        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
        public static Node head;
        public static Node tail;

        public void addInFirst(int data){
            Node newNode = new Node(data);

            if(head == null){
                head = tail = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;

        }

        public void printLL(){

            if(head == null){
                System.out.println("LinkList is empty");
                return;
            }
            Node temp = head;

            while(temp != null){
                System.out.print(temp.data+"->");
                temp = temp.next;

            }
            System.out.println("Null");
        }
    }

    public static void main(String[] args) {
        LinkList ll = new LinkList();
            ll.addInFirst(5);
            ll.printLL();

    }




}
