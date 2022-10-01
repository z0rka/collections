package ua.hillelit.lms.collections.model.methods;

import static ua.hillelit.lms.collections.model.methods.WorkWithCollections.calcOccurrence;
import static ua.hillelit.lms.collections.model.methods.WorkWithCollections.countOccurrence;
import static ua.hillelit.lms.collections.model.methods.WorkWithCollections.findOccurrence;
import static ua.hillelit.lms.collections.model.methods.WorkWithCollections.findUnique;
import static ua.hillelit.lms.collections.model.methods.WorkWithCollections.toList;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import ua.hillelit.lms.collections.model.methods.exeptions.IncorrectArrayExeption;

public class Test {

  public static void main(String[] args) {

    List<String> arrayList = new ArrayList<>();
    List<Integer> fromArrayToList = new ArrayList<>();
    List<Integer> forUniqueTask = new ArrayList<>();
    List<WordsList> listForWordsTask;

    int[] array = new int[10];

    //Заповнення потрібних масивів / колекцій
    fillStringList(arrayList);
    fillArray(array);
    fillIntegerList(forUniqueTask);

    //Тестування з виводом
    System.out.println("-".repeat(20));

    System.out.println(countOccurrence(arrayList, "cat"));

    System.out.println("-".repeat(20));

    try {
      fromArrayToList = toList(array);
    } catch (IncorrectArrayExeption e) {
      System.out.println(e.getMessage());
    }

    fromArrayToList.forEach(integer -> System.out.print(integer + " "));

    System.out.println();
    System.out.println("-".repeat(20));

    forUniqueTask = findUnique(forUniqueTask);
    forUniqueTask.forEach(integer -> System.out.print(integer + " "));

    System.out.println();
    System.out.println("-".repeat(20));

    try {
      calcOccurrence(arrayList);
    } catch (IncorrectArrayExeption e) {
      System.out.println(e.getMessage());
    }

    fillStringList(arrayList);

    listForWordsTask = findOccurrence(arrayList);

    System.out.println("-".repeat(20));

    for (WordsList wordsList : listForWordsTask) {
      System.out.println(wordsList.getWord() + ":" + wordsList.getAmount());
    }
  }

  private static void fillIntegerList(List<Integer> forUnique) {
    Random random = new Random();

    for (int i = 0; i < 40; i++) {
      forUnique.add(random.nextInt(100));
    }

    forUnique.add(0);
    forUnique.add(0);
    forUnique.add(0);
    forUnique.add(0);
  }

  private static void fillArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      array[i] = i;
    }
  }

  private static void fillStringList(List<String> arrayList) {
    for (int i = 0; i < 10; i++) {
      arrayList.add("bird");
    }

    arrayList.add("dog");
    arrayList.add("dog");
    arrayList.add("cat");
  }
}
