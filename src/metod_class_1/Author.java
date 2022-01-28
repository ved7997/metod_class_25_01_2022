package metod_class_1;

public class Author {
  public  String autorfirstName;
  public String autorlastName;

   public  Author(String autorfirstName, String autorlastName) {
       this.autorfirstName = autorfirstName;
       this.autorlastName = autorlastName;
   }

   public String getuthorfirstName() {
        return autorfirstName +" " + autorlastName;
    }

}
