package metod_class_1;

public class Author {
  private   String autorfirstName;
  private String autorlastName;

   public  Author(String autorfirstName, String autorlastName) {
       this.autorfirstName = autorfirstName;
       this.autorlastName = autorlastName;
   }

   public String getuthorfirstName() {
        return autorfirstName +" " + autorlastName;
    }

}
