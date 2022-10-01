package ua.hillelit.lms.collections.model.methods;

import java.util.Objects;

public class WordsList {

  private String word;
  private int occurrence = 0;

  public WordsList(String word) {
    this.word = word;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WordsList wordsList = (WordsList) o;
    return occurrence == wordsList.occurrence && Objects.equals(word, wordsList.word);
  }

  @Override
  public int hashCode() {
    return Objects.hash(word, occurrence);
  }

  public void setAmount() {
    this.occurrence++;
  }

  public String getWord() {
    return word;
  }

  public int getAmount() {
    return occurrence;
  }
}
