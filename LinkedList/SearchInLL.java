public class SearchInLL {
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
    

    public void addInLL(int data){

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
            System.out.println("Linked list is empty");
        }
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }System.out.println(" null");

    }
    public int itrsearch(int key){

        Node temp = head;
        int i=0;

        while(temp != null){
            if(temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;



    }
    public int helper(Node head,int key){
        if(head == null){
            return -1;
        }

        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }

    public int recsearch(int key){
        return helper(head, key);
    }
    public static void main(String[] args) {
        SearchInLL ll = new SearchInLL();
        ll.addInLL(1);
        ll.addInLL(2);
        ll.addInLL(3);
        ll.print();
        System.out.println("Search in linked list using Itr: "+ll.itrsearch(2));
        System.out.println("Search in linked list using Recursion: "+ll.recsearch(3));
        System.out.println("Search in linked list using Recursion: "+ll.recsearch(10));


    }
}
