public class Personne {
    private int Age;
    private int taille;
    private String nom;
    public Personne(int age, int taille, String nom) {
        this.Age = age;
        this.taille = taille;
        this.nom = nom;
    }
    public int getAge() {
        return Age;
    }
    public String getNom() {
        return nom;
    }
}
