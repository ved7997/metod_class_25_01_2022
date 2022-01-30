package metod_class_1;

public class Author {
  private   String autorfirstName;
  private String autorlastName;

   public  Author(String autorfirstName, String autorlastName) {
       this.autorfirstName = autorfirstName;
       this.autorlastName = autorlastName;
   }

   public String getAutorfirstName(){
       return autorfirstName;
   }
   public String getAutorlastName(){
       return autorlastName;
   }

   public String toString(){
       return  "Book{ " + autorfirstName + " " + autorlastName + " }";
   }






}
