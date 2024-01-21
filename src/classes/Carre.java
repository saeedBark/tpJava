package classes;

public class Carre extends Rectangle {
    public Carre(int cote) {
        super(cote, cote);
    }
    public void affiche() {
        System.out.println("carré " + this.getLongueur());
    }
}

