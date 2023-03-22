package baitap2;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> mylist = new MyLinkedList<>("hùng");
        mylist.add("Nam");
        mylist.add(1,"Thế Em");
        mylist.add("Mến Bơm");
        mylist.add("Tuấn Em");
        mylist.add("Minh");
        mylist.remove(2);
        mylist.printList();
        mylist.remove("Minh");
        mylist.printList();
        mylist.addFirst("Mít");
        mylist.printList();
    }
}
