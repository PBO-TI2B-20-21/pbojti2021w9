package aula.praktikum;

/**
 *
 * @author Aulafz
 */
class Ikan {

    public void swim() {
        System.out.println("Ikan bisa berenang");
    }
}

class Piranha extends Ikan{

    @Override
    public void swim() {
        System.out.println("Piranha bisa makan daging");
    }
}

class Fish {
    public static void main(String[] args) {
            Ikan a = new Ikan();
            Ikan b = new Piranha ();
            a.swim();
            b.swim();
        }
}