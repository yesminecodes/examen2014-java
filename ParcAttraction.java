public class ParcAttraction {
    private Attraction[] lesAttractions;
    private int taille;
    private String nom;
    private int nb_attraction;
    public ParcAttraction(String nom,int taille) {
        this.nom=nom;
        lesAttractions = new Attraction[taille];
        nb_attraction=0;
    }
    public void ajouteAttraction(Attraction a) {
        if (nb_attraction<taille){
            System.out.println("Erreur");
        }
        else{
            lesAttractions[nb_attraction++] = a;
        }
    }
    public float getRecette1(){
        float sum=0;
        for(int i=0;i<nb_attraction;i++){
            sum=sum+lesAttractions[i].getRecette();
        }
        return sum;
    }
    public void affiche(){
        for(int i=0;i<nb_attraction;i++){
            lesAttractions[i].affiche();
        }
    }
}
