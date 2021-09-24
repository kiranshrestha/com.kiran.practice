package upgrad.ExperientialLearningArmaments;

import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

class AlternateIterator{

    public static void main(String[] args) {
        /*List<Float> random = new ArrayList<Float>();
        random.add(2f);
        random.add(4f);
        random.add(5f);
        random.add(10f);
        random.add(99.9f);
        random.add(101f);

        iterateFwd(random);*/

        List<Integer> random = new ArrayList<>();
        random.add(1);
        random.add(2);
        random.add(3);
        random.add(4);
        iterateFwd(random);
        //iterate(random);
        //process(random);

    }

    public static void iterateFwd(List<Integer> num) {
        ListIterator<Integer> it = num.listIterator(1);
        while(it.hasNext()) {
            System.out.println(it.next());
            if(it.hasNext())
                it.next();
        }
    }

    public static void iterate (List<Integer> numberList) {
        ListIterator<Integer> it = numberList.listIterator(1);
        it.next();
        it.next();
        it.previous();
        System.out.println(it.next());
    }

    public static void process(List<Integer> numberList){
        numberList.add(2, 5);
        numberList.remove(1);
        System.out.println(numberList.get(3));
    }
}
