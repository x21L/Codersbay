package sqlapplication;

public class Singleton {

   private static Singleton instance = new Singleton();

   private Singleton(){/*...*/}

   // Get the only object available
   public static Singleton getInstance(){
      return instance;
   }
}
