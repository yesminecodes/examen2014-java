public class Attraction {
    private String nom;
    private float cout;
    private ConditionAge condition;
    private int nppers=0;
    private float recette=0;
    public  Attraction(String nom, float cout, ConditionAge condition) {
        this.nom = nom;
        this.cout = cout;
        this.condition = condition;
    }
    public void affiche(){
        System.out.println("Nom : "+nom);
        System.out.println("Cout : "+cout);
        System.out.println("-------------------------------------------");
    }
    public void utilise(Personne p) throws AccesInterditException {
        if (!condition.accessPossible(p)) {
            throw new AccesInterditException(
                    "La personne " + p.getNom() + " n'a pas l'autorisation d'accéder à " + nom
            );
        }
        nppers++;
        recette += cout;
    }
    public float getRecette() {
        return recette;
    }
}
