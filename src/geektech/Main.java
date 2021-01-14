package geektech;

import java.util.*;

public class Main {

    public static void main(String[] args) {
       
        // Первый список A
        System.out.println("Ввод в первый лист А");
        ArrayList<String> namesA = new ArrayList<>();

        // Вводим значения первого листа A
        Scanner inputA = new Scanner(System.in);
        namesA.add((inputA.nextLine()));
        namesA.add((inputA.nextLine()));
        namesA.add((inputA.nextLine()));
        namesA.add((inputA.nextLine()));
        namesA.add((inputA.nextLine()));

        // Ввывод значений второго листа А
        Iterator<String> iterListA = namesA.iterator();
        while(iterListA.hasNext()) {
            System.out.println("[ " + iterListA.next() + " ]");
        }

        // Первый список B
        System.out.println("Ввод в второго листа B");
        ArrayList<String> namesB = new ArrayList<>();

        // Вводим значения Второго листа B
        Scanner inputB = new Scanner(System.in);
        namesB.add((inputB.nextLine()));
        namesB.add((inputB.nextLine()));
        namesB.add((inputB.nextLine()));
        namesB.add((inputB.nextLine()));
        namesB.add((inputB.nextLine()));

        // Ввывод значений второго листа B
        Iterator<String> iterListB = namesB.iterator();
        while(iterListB.hasNext()) {
            System.out.println("[ " + iterListB.next() + " ]");
        }

        // Первый список С
        System.out.println("Ввод в третьего листа C");
        Collections.reverse(namesB);
        ArrayList<String> namesC = new ArrayList<>();
        iterListA = namesA.iterator();
        iterListB = namesB.iterator();

        while(iterListA.hasNext() && iterListB.hasNext()){
            String a = iterListA.next();
            String b = iterListB.next();
            namesC.add(a);
            namesC.add(b);
        }

        // Вывод значений С
        Iterator<String> iterListC = namesC.iterator();
        while (iterListC.hasNext()) {
            System.out.println("[" + iterListC.next() + " ]");
        }
        namesC.sort(Comparator.comparing(String::length));
        System.out.println("Список отсортирован в С : ");
        iterListC = namesC.iterator();
        while (iterListC.hasNext()) {
            System.out.println("[ " + iterListC.next() + " ]");
        }

    }

}
