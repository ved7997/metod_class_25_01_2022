package metod_class_1;

import java.util.Objects;

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
   @Override
   public String toString(){
       return  "Author { autorfirstName " + autorfirstName + "; autorlastName; " + autorlastName + "; }";
   }

   @Override
   public boolean equals(Object o){
       if (this == o) return true;
       if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(autorfirstName, author.autorfirstName) && Objects.equals(autorlastName, author.autorlastName);
   }

   @Override
    public int hashCode(){
       return Objects.hash(autorfirstName, autorlastName);
   }






}
