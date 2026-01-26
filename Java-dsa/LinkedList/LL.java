class LL{
    Node head; //“I want a variable called head that can store a reference to a Node object.”
    private int size;

    // Setter for private SIZE attribute
    LL(){
        this.size = 0;
    }

    // Class to create a NODE.
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    // Add - First
    public void addFirst(String data){
        Node newNode = new Node(data);

        // Checking if list have any NODE or not
        if(head == null){
            head = newNode;
            size++;
            return;
        }
        // If any NODE already exist then connect them
        newNode.next = head;
        head = newNode;
        size++;
    }

    // Add - Last
    public void addLast(String data){

        // Creating a NODE
        Node newNode = new Node(data);

        // Checking if list have any node or not
        if(head == null){
            head = newNode;
            size++;
            return; 
        }

        // If already exist then go to last using loop then add at last
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
        size++;
    }

    // Printing the LIST
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
    
    // Delete - First
    public void deleteFirst(){
        if (head == null){
            System.out.println("The list is empty.");
            return;
        }
        head = head.next;
        size--;
    }

    // Delete - Last
    public void deleteLast(){
        if (head == null){
            System.out.println("The list is empty.");
            return;
        }
        if (head.next == null){
            head = null;
            size--;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
        size--;
    }

    // Getter for private SIZE attribute
    public int getSize(){
        return size;
    }
}