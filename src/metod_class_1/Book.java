package metod_class_1;

import java.util.Objects;

public class Book {
        private int yearRelease;
        private String titleBook;
        public Author author;

    public Book(String titleBook, int yearRelease, Author author) {
        this.titleBook = titleBook;
        this.yearRelease = yearRelease;
        this.author = author;
    }
    public Book(){

    }

   public String getTitleBook(){
       return titleBook;
   }

   public int getYearRelease(){
       return yearRelease;
   }

   public void setYearRelease(int yearRelease){
        this.yearRelease = yearRelease;
   }

   @Override
   public String toString(){
        return "Book{ titleBook = " + titleBook + "; yearRelease = " + yearRelease + "; author = " + author + "; }";
   }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(titleBook, book.titleBook)  && Objects.equals(yearRelease, book.yearRelease) && Objects.equals(author, book.author);
    }

    @Override
   public int hashCode(){
        return Objects.hash(titleBook, yearRelease, author);
   }


}
