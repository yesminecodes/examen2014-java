public class attractionTest {
    public static void main(String[] args) {
        ParcAttraction p1=new ParcAttraction("da7da7",6);

        ConditionAge c1=new ConditionAge(4);
        ConditionAge c2=new ConditionAge(10);
        ConditionAge c3=new ConditionAge(8);
        ConditionAge c4=new ConditionAge(15);

        Attraction a1=new Attraction("kisan",2,c1);
        Attraction a2=new Attraction("cinema 5D",10,c3);
        Attraction a3=new Attraction("grand huit",5,c4);
        Attraction a4=new Attraction("jsp",1,c2);

        Personne p2=new Personne(10,100,"Yassine");
        Personne p3=new Personne(20,200,"Tayeb");
        Personne p4=new Personne(2,10,"Eya");
        Personne p5=new Personne(8,50,"Nadia");

        try {
            a1.utilise(p2);
        } catch (AccesInterditException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("--------------------------------------------------");
        try {
            a2.utilise(p3);
        } catch (AccesInterditException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("--------------------------------------------------");
        try {
            a3.utilise(p4);
        } catch (AccesInterditException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("--------------------------------------------------");
        try {
            a4.utilise(p5);
        } catch (AccesInterditException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("--------------------------------------------------");

        p1.ajouteAttraction(a1);
        p1.ajouteAttraction(a2);
        p1.ajouteAttraction(a3);
        p1.ajouteAttraction(a4);

        p1.affiche();

        System.out.println("le total de la recette est "+p1.getRecette1()+" dt");
    }
}
