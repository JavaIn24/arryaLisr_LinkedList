package Task2;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        System.out.println(numbers);
        System.out.println(swapElement(numbers, 0 , numbers.size() -1 ));

    }
    public static LinkedList<Integer> swapElement (LinkedList<Integer> listexamp, int index1, int index2 ) {
        int numOne = listexamp.get(index1);
        int numTwo = listexamp.get(index2);
        listexamp.remove(index1);
        listexamp.add(index1,numTwo);
        listexamp.remove(index2);
        listexamp.add( index2, numOne);
        return listexamp;
    }

}
