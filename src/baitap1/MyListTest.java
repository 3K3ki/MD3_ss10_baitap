package baitap1;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myListTest = new MyList<>();
        myListTest.add(5);
        System.out.println(myListTest.size());
        System.out.println(myListTest.get(0));
        System.out.println(myListTest.indexOf(0));
        System.out.println(myListTest);
        System.out.println(myListTest.contains(5));
        System.out.println(myListTest.remove(5));
        System.out.println("--"+myListTest);
    }
}
