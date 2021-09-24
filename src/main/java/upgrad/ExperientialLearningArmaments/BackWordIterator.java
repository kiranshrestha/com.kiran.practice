package upgrad.ExperientialLearningArmaments;
import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

class BackWordIterator {

    public static void main(String[] args) {
        List<Float> random = new ArrayList<Float>();
        random.add(2f);
        random.add(4f);
        random.add(5f);
        random.add(10f);
        random.add(99.9f);
        random.add(101f);

        printList(random);
    }

    public static void printList(List<Float> arr) {
        ListIterator<Float> listIterator= arr.listIterator(arr.size());
        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
    }
}