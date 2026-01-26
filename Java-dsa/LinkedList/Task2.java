import java.util.*;

class Task2 {
    public static void main(String args[]){
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("Islam");
        list.addFirst("Rafekul");
        list.addFirst("Md");
        System.out.println(list);

        list.addLast("Bablu");
        System.out.println(list);

        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);

        System.err.println(list.size());

        // Iteration
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+ " -> ");
        }
        System.out.println("Null");

        // Searching
        if(list.contains("Islam")) {
            System.out.println("Found Islam!");
        } else {
            System.out.println("Islam not found.");
        }
    }
}