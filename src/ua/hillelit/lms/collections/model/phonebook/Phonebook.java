package ua.hillelit.lms.collections.model.phonebook;

import java.util.ArrayList;
import java.util.List;

public class Phonebook {

  private List<Record> list = new ArrayList<>();

  private void signInList(String name, String phoneNumber) {
    list.add(new Record(name, phoneNumber));
  }

  private Record findOneRecord(String name) {
    for (Record record : list) {
      if (record.getName().equals(name)) {
        return record;
      }
    }

    return null;
  }

  private List<String> findAllRecords(String name) {
    List<String> numbersList = new ArrayList<>();

    for (Record record : list) {
      if (record.getName().equals(name)) {
        numbersList.add(record.getPhoneNumber());
      }
    }

    return numbersList;
  }

  public Phonebook() {
  }

  public boolean add(String name, String phoneNumber) {
    signInList(name, phoneNumber);
    return true;
  }

  public Record find(String name) {
    return findOneRecord(name);
  }

  public List<String> findAll(String name) {
    return findAllRecords(name);
  }

}
