public class RemoveNth{

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data  = data;
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
            System.out.print("LL is Empty");
        }
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("Null");
        
    }

    public void deleteNthNode(int n){

        int sz = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;

        }


        if(n == sz){
            head = head.next;
            return;

        }

        int i = 1;
        int iToFind = sz-n;
        Node prev = head;
        while(i < iToFind){
            prev = prev.next;
            i++;

        }   
        prev.next = prev.next.next;
        return;


    }
    public Node findMid(Node head){

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next == null){
            slow = slow.next;
            fast = fast.next.next;

        }
        return slow;
    }


    public boolean checkPalindrome(){

        if(head == null || head.next != null){
            return true;

        }

        Node midNode = findMid(head);


        Node prev = null;
        Node curr = midNode;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;
        Node left = head;


        while(right != null){
            if(left.data != right.data){
                return false;

            }
            left = left.next;
            right = right.next;

        }
        return true;

    }

    public static void main(String[] args) {

        RemoveNth ll = new RemoveNth();

        ll.addInLL(1);
        ll.addInLL(2);
        ll.addInLL(2);
        ll.addInLL(1);
      
        ll.print();

        System.out.println(ll.checkPalindrome());
       
        
    }
}