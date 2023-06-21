package oop;
  public class phone {
      String name ;
      String colour;
      int ram;
      public void call()
          {
              System.out.println("take a calll from "+ name);
          }
      public void browse internet()
      {
          System.out.println("browse internet");

      }
      public static void main (String args[]) {
          phone phone1 = new phone();
          phone1.name = "samsung";
          phone1.colour = "black";
          phone1.call();

      }
  }
