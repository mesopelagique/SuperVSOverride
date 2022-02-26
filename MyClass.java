class Animal {
    String nom;
    public Animal(String nom) {
       this.nom = nom;
       this.parle();
    }
    
    public void parle() {
        System.out.println(this.nom + " fait du bruit.");
    }

}

class Chien extends Animal {
     public Chien(String nom) {
       super(nom);
    }
    public void parle() {
         System.out.println(this.nom + " aboie.");
    }
}
    
public class MyClass {
    public static void main(String args[]) {
      Chien chien = new Chien("Ida");
    }
}
