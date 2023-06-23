import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        ArrayList<String> people = new ArrayList<>();
        Scanner iScanner = new Scanner(System.in);
        System.out.println("how many people?");
        int p = Integer.parseInt(iScanner.nextLine());
        for (int i = 0; i < p; i++) {
            System.out.println("family, name, surname:");
            String name = iScanner.nextLine();
            System.out.println("age, sex:");
            String age = iScanner.nextLine();
            people.add(name + " " + age);
        }
        System.out.println(people);
        iScanner.close();

        for (int i = 0; i < people.size(); i++) {
            String [] array = people.get(i).split(" ");
            System.out.println();
            System.out.println(array[0] + " " + array[1].toUpperCase().charAt(0) + "."
            + array[2].toUpperCase().charAt(0) + ". " + array[3]);
        }

        people.sort(new Comparator<String>() {
            @Override
            public int compare (String o1, String o2){
                return Integer.parseInt(o1.split(" ")[3]) - Integer.parseInt(o2.split(" ")[3]);
            }
        });
         for (int i = 0; i < people.size(); i++) {
            String [] array = people.get(i).split(" ");
            System.out.println("Отсортированный массив");
            System.out.println(array[0] + " " + array[1].toUpperCase().charAt(0) + "."
            + array[2].toUpperCase().charAt(0) + ". " + array[3]);
        }

    }
}
