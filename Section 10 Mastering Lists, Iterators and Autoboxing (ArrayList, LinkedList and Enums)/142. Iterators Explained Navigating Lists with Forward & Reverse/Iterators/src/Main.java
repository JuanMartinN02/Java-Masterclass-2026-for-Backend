import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.push(5);
        list.push(7);
        list.push(8);
        list.addLast(10);

        iterator(list);

        System.out.println(list.toString());

        iteratorDelete(list);
    }

    public static void iterator(LinkedList<Integer> list){
        Integer prev = list.getFirst();
        ListIterator<Integer> iterator = list.listIterator(1);

        while (iterator.hasNext()){
            var town = iterator.next();
            System.out.println(prev + " --> " + town);
            prev = town;
        }
    }

    public static void iteratorDelete(LinkedList<Integer> list){
        var iterator = list.iterator();

        while (iterator.hasNext()){
            if (iterator.next() == 5){
                iterator.remove();

                // This gives a concurrency error
                // list.remove()
            }
        }
        System.out.println(list.toString());
    }


}