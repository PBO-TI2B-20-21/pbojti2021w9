class Ikan {
    
    public void swim(){
        System.out.println("Ikan Biasa Berenang");
    }
   }
   class Piranha extends Ikan{
       public void swim(){
           System.out.println("Piranha Bisa Makan Daging");
       }
   }
   public class Fish{
       public static void main(String[] args) {
           Ikan a = new Ikan();
           Ikan b = new Piranha();
           a.swim();
           b.swim();
       }
   }