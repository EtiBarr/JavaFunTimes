package INF111_funTimes.src.ExercicePOO;

public class ExerciceUn {
    int numReference;
    String designation;
    double prix;
    int quantite;


    public ExerciceUn(int reference){

        numReference = reference;
        designation = null;
        prix = 1;
        quantite = 0;

    }

    public ExerciceUn(int reference, String designe){
        numReference = reference;
        designation = designe;
        prix = 1;
        quantite = 0;
    }

    public ExerciceUn(int reference, String designe, double prixUni, int stock){

        numReference = reference;
        designation = designe;
        prix = prixUni;
        quantite = stock;

    }

    public  String toString(){
        return "the product id is " + numReference + " la designation est: " + designation + " le prix est a: " + prix + " et finalement, il en a " + quantite + " en stock" ;
    }

    public boolean estDisponible(int quantitee){

        return quantite > quantitee;
    }

    //public boolean estEgale(ExerciceUn prodUn, ExerciceUn prodDeux){
    //    return prodUn.equal(prodDeux);
    //}
    public static void main(String[] args){

        ExerciceUn produitUn = new ExerciceUn(2);
        ExerciceUn produitDeux = new ExerciceUn(2, "test");
        ExerciceUn produitTrois = new ExerciceUn(23, "yessir", 1.4, 3);


        System.out.println(produitUn);
        System.out.println(produitDeux);
        System.out.println(produitTrois);

        produitTrois.prix = 2.3;

        System.out.println(produitTrois.estDisponible(1));



    }
}
