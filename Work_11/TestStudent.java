package Work_11;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class TestStudent {  
    public static void main(String[] args) {
        List<Student> list1 = new ArrayList<>();
        List<Student> list2 = new ArrayList<>();

        LocalDate birthDate1 = LocalDate.of(1995, 5, 15);
        Student student1 = new Student("John", "Doe", 12345, 3.4, "Group A", "2nd Year", "Computer Science", birthDate1);

        LocalDate birthDate2 = LocalDate.of(1998, 7, 21);
        Student student2 = new Student("Alice", "Smith", 56789, 3.5, "Group B", "3rd Year", "Engineering", birthDate2);

        LocalDate birthDate3 = LocalDate.of(1997, 3, 10);
        Student student3 = new Student("Bob", "Johnson", 23456, 3.2, "Group A", "2nd Year", "Computer Science", birthDate3);

        LocalDate birthDate4 = LocalDate.of(1994, 12, 5);
        Student student4 = new Student("Eve", "Williams", 98765, 2.9, "Group C", "4th Year", "Mathematics", birthDate4);
        LocalDate birthDate5 = LocalDate.of(1999, 9, 30);
        Student student5 = new Student("Lev", "Brown", 95456, 4.0, "Group B", "3rd Year", "Engineering", birthDate5);

        list1.add(student1);
        list1.add(student2);
        list2.add(student3);
        list2.add(student4);
        list2.add(student5);

        // Сортировка списков
        insertionSortById(list1);
        quickSort(list2, 0, list2.size()-1);

        System.out.println("Сортировка по ID вставками");
        for (Student student : list1) {
            System.out.println(student);
        }

        //
        System.out.println("\nСортировка по GPA быстрой сортировкой");
        for (Student student : list2) {
            System.out.println(student);
        }
        System.out.println("\n");

        // Объединение и сортировка списков с использованием сортировки слиянием
        List<Student> mergedList = mergeSortedLists(list1, list2);

        // Вывод объединенного и отсортированного списка
        for (Student student : mergedList) {
            System.out.println(student);
        }
    }

    public static void quickSort(List<Student> students, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(students, low, high);
            quickSort(students, low, pivotIndex-1);
            quickSort(students, pivotIndex+1, high);
        }
    }

    private static int partition(List<Student> students, int low, int high) {
        Student pivot = students.get(high);
        int i = low-1;

        for (int j=low; j<high; j++) {
            if (students.get(j).compareTo(pivot) <= 0) {
                i++;
                Student temp = students.get(i);
                students.set(i, students.get(j));
                students.set(j, temp);
            }
        }

        Student temp = students.get(i+1);
        students.set(i+1, students.get(high));
        students.set(high, temp);

        return i+1;
    }

    public static void insertionSortById(List<Student> students) {
        int n = students.size();
        for (int i = 1; i < n; i++) {
            Student key = students.get(i);
            int j = i - 1;
            while (j >= 0 && students.get(j).getID() > key.getID()) {
                students.set(j + 1, students.get(j));
                j = j - 1;
            }
            students.set(j + 1, key);
        }
    }

    public static List<Student> mergeSortedLists(List<Student> list1, List<Student> list2) {
        List<Student> mergedList = new ArrayList<>();
        int i = 0, j = 0;

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i).compareTo(list2.get(j)) >= 0) {
                mergedList.add(list1.get(i));
                i++;
            } else {
                mergedList.add(list2.get(j));
                j++;
            }
        }

        while (i < list1.size()) {
            mergedList.add(list1.get(i));
            i++;
        }

        while (j < list2.size()) {
            mergedList.add(list2.get(j));
            j++;
        }

        return mergedList;
    }
}