class Task1 {
    public static void main(String args[]){
        LL list = new LL();

        // Insert, Print, Delete, Size.

        list.addFirst("Islam");
        list.addFirst("Rafekul");
        list.PrintList();

        list.addLast("Bablu");
        list.PrintList();

        list.deleteFirst();
        list.PrintList();
        list.deleteLast();
        list.PrintList();

        System.err.println(list.getSize());
    }
}