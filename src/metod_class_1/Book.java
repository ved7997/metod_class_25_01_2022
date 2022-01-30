package metod_class_1;
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
        return "Book{ " + titleBook + " " + yearRelease + " " + author + " }";
   }


}
