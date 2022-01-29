package metod_class_1;
    public class Book {
        private int yearRelease;
        private String titleBook;

    public Book(String titleBook, int yearRelease) {
        this.titleBook = titleBook;
       this.yearRelease = yearRelease;
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

}
