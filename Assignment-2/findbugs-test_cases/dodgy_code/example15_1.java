/*Redundant nullcheck
-------- Foo.java --------*/
class Foo {
   static class Bar {
      public String toString() {
         return null;
      }
   }

   public static void getString(Bar b) {
      if (b == null) {
         System.out.println("b is null");
      }
      else {
         String s = b.toString();
         if (s == null) {
            System.out.println("b.toString() is null");
         }
      }
   }

   public static void main(String[] args) {
      getString(new Bar());
   }
}

