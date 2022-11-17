package practice.implementing_list;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> integerMyList = new MyList<>();
        integerMyList.add(1);
        integerMyList.add(2);
        integerMyList.add(3);
        integerMyList.add(4);

        System.out.println("element 3: " + integerMyList.get(3));
        System.out.println("element 2: " + integerMyList.get(2));
        System.out.println("element 1: " + integerMyList.get(1));
        System.out.println("element 0: " + integerMyList.get(0));
        System.out.println("element -1: " + integerMyList.get(-1));

    }
}
