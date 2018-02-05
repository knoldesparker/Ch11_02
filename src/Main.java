import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = new LinkedList<>();
        List<Integer> list2 = new LinkedList<>();
        list1.add(1);list1.add(5);list1.add(4);list1.add(8);
        list2.add(3);list2.add(2);list2.add(6);list2.add(7);list2.add(6);list2.add(485);
        System.out.println(alternate(list1, list2));
    }

    public static List<Integer> alternate (List<Integer> list1, List<Integer> list2) {
        List<Integer> list = new LinkedList<>();
        Iterator<Integer> integerIterator1 = list1.iterator();
        Iterator<Integer> integerIteratorr2 = list2.iterator();

        while (integerIterator1.hasNext() || integerIteratorr2.hasNext())
        {
            if (integerIterator1.hasNext()){
                list.add(integerIterator1.next());
            }
            if (integerIteratorr2.hasNext()){
                list.add(integerIteratorr2.next());
            }
        }
        return list;
    }
}
