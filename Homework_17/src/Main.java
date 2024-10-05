import inno.*;

public class Main {

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();

        arrayList.add("Hello!");
        arrayList.add("Bye!");
        arrayList.add("Fine!");
        arrayList.add("C++!");
        arrayList.add("PHP!");
        arrayList.add("Cobol!");

        System.out.println("Изначальная коллекция arrayList:");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        System.out.println("- removeAt(4) - ");
        arrayList.removeAt(4);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        System.out.println("- remove(\"PHP!\") - ");
        arrayList.remove("PHP!");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        System.out.println("- remove(\"Cobol!\") - ");
        arrayList.remove("Cobol!");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        System.out.println("---------------------");

        List<String> linkedList = new LinkedList<>();

        linkedList.add("Hello!");
        linkedList.add("Bye!");
        linkedList.add("Fine!");
        linkedList.add("C++!");
        linkedList.add("PHP!");
        linkedList.add("Cobol!");

        System.out.println("Изначальная коллекция linkedList:");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }

        System.out.println(" - removeAt(2) - ");
        linkedList.removeAt(2);
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
        System.out.println(" - remove(\"Fine!\") - ");
        linkedList.remove("Fine!");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
        System.out.println(" - remove(\"Bye!\") - ");
        linkedList.remove("Bye!");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
    }
}