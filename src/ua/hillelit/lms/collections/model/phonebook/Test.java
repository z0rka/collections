package ua.hillelit.lms.collections.model.phonebook;

public class Test {

  public static void main(String[] args) {

    Phonebook phonebook = new Phonebook();

    phonebook.add("Jack", "+38009374741");
    phonebook.add("Mike", "+38455151515");
    phonebook.add("Jack", "+38032355151");
    phonebook.add("Liana", "+380345141514");
    phonebook.add("Jack", "+38004941419419");

    Record record = phonebook.find("Liana");
    System.out.println(record.getName() + " : " + record.getPhoneNumber());
    System.out.println("-".repeat(20));
    System.out.println(phonebook.findAll("Jack"));


  }
}
