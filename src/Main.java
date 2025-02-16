// CSC 3130: Intro to Algorithms
// Assignment 3: Implementing Lists
// Jayden Cruz
public class Main {
    public static void main(String[] args) {
        // Test Array List (AList)
        AList<Song> aList = new AList<>();
        System.out.println(aList.toString());

        aList.addy(new Song("El Pibe De Mi Barrio", "Dr. Krapula", 2.47));
        aList.addy(new Song("505", "Arctic Monkeys", 4.14));
        aList.addy(new Song("NADIE", "Tito Double P", 3.17));
        aList.addy(new Song("DtMF", "Bad Bunny", 3.57));

        System.out.println("Songs AList:");
        System.out.println(aList);

        aList.removy(3);
        aList.removy(1);
        System.out.println("Songs AList after removing at indices 3 and 1:");
        System.out.println(aList);

        // Test Singly Linked List (SLList)
        SLList<Song> slList = new SLList<>();
        System.out.println(slList.toString());

        slList.addy(new Song("El Pibe De Mi Barrio", "Dr. Krapula", 2.47));
        slList.addy(new Song("505", "Arctic Monkeys", 4.14));
        slList.addy(new Song("NADIE", "Tito Double P", 3.17));
        slList.addy(new Song("DtMF", "Bad Bunny", 3.57));

        System.out.println("Songs SLList:");
        System.out.println(slList);

        slList.removy(3);
        slList.removy(1);
        System.out.println("Songs SLList after removing at indices 3 and 1:");
        System.out.println(slList);

        // Test Doubly Linked List (DLList)
        DLList<Song> dlList = new DLList<>();
        System.out.println(dlList.toString());

        dlList.addy(new Song("El Pibe De Mi Barrio", "Dr. Krapula", 2.47));
        dlList.addy(new Song("505", "Arctic Monkeys", 4.14));
        dlList.addy(new Song("NADIE", "Tito Double P", 3.17));
        dlList.addy(new Song("DtMF", "Bad Bunny", 3.57));

        System.out.println("Songs DLList:");
        System.out.println(dlList);

        dlList.removy(3);
        dlList.removy(1);
        System.out.println("Songs DLList after removing at indices 3 and 1:");
        System.out.println(dlList);
    }
}
