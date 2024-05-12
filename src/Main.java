import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Set<Integer> set1 =new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(3); //No duplicates in set

        System.out.println(set1);

        Set<Integer> set2 =new HashSet<>();

        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);

        System.out.println(set1.addAll(set2));

        set1.remove(3);
        System.out.println(set1);

        Set<Integer> set3 =new LinkedHashSet<>();

        set3.add(5);
        set3.add(4);
        set3.add(1);
        set3.add(2);
        set3.add(3);
        set3.add(3);

        for(int x:set3)
            System.out.println(x); //Insertion order is maintained. It comes how the elements were inserted

        List<StudentMarks> marks=new ArrayList<>();
        marks.add(new StudentMarks(99,51));
        marks.add(new StudentMarks(96,50));
        marks.add(new StudentMarks(95,53));
        marks.add(new StudentMarks(97,52));

        Set<StudentMarks> set4=new HashSet<>(marks);

        for(StudentMarks sm:set4)
            System.out.println(sm);


        //This will come as true because we have overridden the equals and the hashcode method. Else would have given faLSE as the compiler would have understood both as false because they would have had different hashcodes.
        System.out.println(set4.contains(new StudentMarks(95,53)));


        //here v r passing the comparator for printing in decreasing order
        //If v were not passing then it would have taken the comparable method from student marks class
        //If there was no comparable method in student marks, then it would have thrown a class cast exception
        Set<StudentMarks> treeset = new TreeSet<>((s1,s2) -> s2.getPhysics()-s2.getPhysics());
        treeset.add(new StudentMarks(99,51));
        treeset.add(new StudentMarks(96,50));
        treeset.add(new StudentMarks(95,53));
        treeset.add(new StudentMarks(97,52));

        for (StudentMarks x:treeset)
            System.out.println(x);;
    }
}