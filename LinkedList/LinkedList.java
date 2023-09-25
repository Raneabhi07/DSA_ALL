
public class LinkedList {

    public static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        //create a new node
        Node newNode = new Node(data);
        size++;

        //if linkedlist is empty
        if(head == null){
            head = tail = newNode;
            return;
        }
        //point next of newnode to head
        newNode.next = head;
        //change the head
        head = newNode;
    }

    public void addLast(int data){
        //create a new node
        Node newNode = new Node(data);
        size++;
        //if linkedlist is empty
        if(head == null){
            head = tail = newNode;
        }
        //point tail's next to newNode
        tail.next = newNode;
        //make newNode as tail
        tail = newNode;
    }

    public void add(int idx, int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp  = head;
        int i=0;

        while(i < idx-1){
            temp = temp.next;
            i++;
        }
        //adding a newnode in the linkedlist -> pointing newnode.next towards temp.next
        newNode.next = temp.next;
        //pointing temp.next towards newNode
        temp.next = newNode;
    }

    public void removeFirst(){
        if(size == 0){
            System.out.println("ll is empty");
            return;
        }
        if(size == 1){
            head = tail = null;
            size = 0;
            return;
        }
        head = head.next;
        size--;
    }

    public void removeLast(){
        if(size == 0){
            System.out.println("LL is empty");
            return;
        }else if(size == 1){
            head = tail = null;
            size = 0;
            return;
        }
        //create a new temp node as prev
        Node prev = head;
        //to traverse -> using a loop
        for(int i=0;i<size-2;i++){
            prev = prev.next;
        }
        //pointing prev to null
        prev.next = null;
        tail = prev;
        size--;
    }

    public int search(int key){
        Node temp = head;
        int i=0;
        while(temp != null){
            if(temp.data == key){
                return i;
            }else{
                temp = temp.next;
                i++;
            }
        }
        return -1;
    }

    public int helper(Node head, int key){
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

    public int recSearch(int key){
        return helper(head, key);
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

    public void removeNthNodeFromEnd(int n){
        int sz = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }

        //if the nth node is head
        if(sz == n){
            head = head.next;
        }

        int i = 1;
        int itofind = sz-n;
        Node prev = head;
        while(i < itofind){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;

    }

    //to find a midnode of linkedlist
    public Node findMid(Node head){
        //slow-fast approach
        //slow increaments with +1
        //fast increament with +2
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean isPalindrome(){
        if(head == null || head.next == null){
            return true;
        }
        //step-1 : find a midnode
        Node midNode = findMid(head);
        //step-2 : reverse 2nd half of the linkedlist
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
        //step-3 : check if 1st half == 2nd half
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public void print(){
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " " + "->" + " ");
            temp = temp.next; 
        }
        System.out.println("null");
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
        //detect
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast != null && fast.next != null){
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

        //meeting point and track prev
        slow = head;
        Node prev = null;
        while(slow != fast){
            slow = slow.next;
            //last node in prev
            prev = fast;       
            fast = fast.next;
        }

        //point prev to null
        prev.next = null;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1); 
        ll.addLast(2);
        ll.addLast(1);  
        //ll.print();   
        
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = head.next;

        removeCycle();

        System.out.println(isCycle());
        

        //ll.add(2, 44);
        //ll.print();

        //System.out.println(ll.size);

        //ll.removeFirst();
        //ll.removeLast();
        //ll.print();

        //System.out.println("(Itr)Key is at: " + ll.search(22));
        //System.out.println("(Rec)Key is at index: " + ll.recSearch(3));

        //ll.reverse();
        //ll.print();

        //ll.removeNthNodeFromEnd(2);
        //ll.print();

        //System.out.println(ll.isPalindrome());



    }
    
}
