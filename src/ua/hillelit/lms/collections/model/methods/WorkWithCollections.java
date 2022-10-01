package ua.hillelit.lms.collections.model.methods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ua.hillelit.lms.collections.model.methods.exeptions.IncorrectArrayExeption;

public class WorkWithCollections {

  public static int countOccurrence(List<String> arrayList, String object) {

    int counter = 0;

    for (String s : arrayList) {
      if (s.equals(object)) {
        counter++;
      }
    }

    return counter;
  }

  public static List<Integer> toList(int[] array) throws IncorrectArrayExeption {
    if (array == null) {
      throw new IncorrectArrayExeption("Incorrect array!");
    }

    List<Integer> integerList = new ArrayList<>();

    for (int j : array) {
      integerList.add(j);
    }

    return integerList;
  }

  public static List<Integer> findUnique(List<Integer> list) {
    List<Integer> list1 = new ArrayList<>();

    for (Integer integer : list) {
      if (!list1.contains(integer)) {
        list1.add(integer);
      }
    }

    Collections.sort(list1);

    return list1;
  }

  public static void calcOccurrence(List<String> list) throws IncorrectArrayExeption {
    if (list == null) {
      throw new IncorrectArrayExeption("Incorrect list!");
    }

    List<String> listForDelete = new ArrayList<>();
    int i = 0;
    int count;

    Collections.sort(list);

    while (list.size() != 0) {
      count = 0;

      for (String s : list) {
        if (s.equals(list.get(i))) {
          count++;
        }
      }

      System.out.println(list.get(i) + " : " + count);

      listForDelete.add(list.get(i));
      list.removeAll(listForDelete);
      listForDelete.clear();
    }
  }

  public static List<WordsList> findOccurrence(List<String> list) {
    List<WordsList> list1 = new ArrayList<>();

    for (String s : list) {
      if (!list1.contains(new WordsList(s))) {
        list1.add(new WordsList(s));
      }
    }

    for (WordsList wordsList : list1) {

      while (list.size() > 0) {

        if (list.contains(wordsList.getWord())) {
          wordsList.setAmount();
          list.remove(wordsList.getWord());

        } else {
          break;
        }
      }
    }

    return list1;
  }
}
