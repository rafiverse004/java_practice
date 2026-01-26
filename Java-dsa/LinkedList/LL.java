class LL{
    Node head; //“I want a variable called head that can store a reference to a Node object.”
    private int size;

    LL(){
        this.size = 0;
    }

    // Class to create a Node.
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    // Add - First, Last
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            size++;
            return;
        }
        newNode.next = head;
        head = newNode;
        size++;
    }
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            size++;
            return; 
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
        size++;
    }

    public void PrintList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
    }
    
    // Deletefirst
    public void deleteFirst(){
        if (head == null){
            System.out.println("The list is empty.");
            return;
        }
        head = head.next;
        size--;
    }
    public void deleteLast(){
        if (head == null){
            System.out.println("The list is empty.");
            return;
        }
        size--;
        if (head.next == null){
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }
    public int getSize(){
        return size;
    }
}