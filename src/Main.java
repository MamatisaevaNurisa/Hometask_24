import java.util.*;

public class Main {
    public static void main(String[] args) {

       // HashSet<Integer> integers = new HashSet<>();
//        Set<Integer> integers = new HashSet<>();
//        for (int i = 1 ; i < 100; i++) {
//            integers.add(i);
//        }
//
//        ArrayList<Integer> arrayList = new ArrayList<>(integers);
//        arrayList.addAll(integers);
//        System.out.println(arrayList.get(0));

//        integers.add(3);
//        integers.add(4);
//        integers.add(5);
//        integers.add(5);
//        integers.size();
        //       integers.remove(4);
        //       integers.clear();
//        System.out.println(integers);
//        System.out.println(integers.isEmpty());

//        for (Integer integer :integers){
//            System.out.println(integer);
//
//        }

//        Iterator<Integer> iterator = integers.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//

ArrayList<Integer> arrayList = new ArrayList<>();
Random random = new Random();
int summa = 0;
        for (int i = 0; i < 400; i++) {
           arrayList.add(random.nextInt(20));
           summa+=arrayList.get(i);
        }
        System.out.println(arrayList);
        System.out.println(summa);

        Set<Integer>hashSet = new HashSet<>();
        hashSet.addAll(arrayList);
        int hashsumma = 0;
        for (Integer integer :hashSet){
            hashsumma+= integer;
        }
        System.out.println(hashSet);
        System.out.println(hashsumma);









    }
}