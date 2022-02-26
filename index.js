class Animal {
    constructor(nom) {
      this.nom = nom;
      this.parle();
    }
  
    parle() {
      console.log(`${this.nom} fait du bruit.`);
    }
}
  
class Chien extends Animal {
    constructor(nom) {
      super(nom);
    }
    parle() {
      console.log(`${this.nom} aboie.`);
    }
}

let dogo = new Chien('Ida');

