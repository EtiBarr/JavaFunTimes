package INF111_funTimes.src.SemaineCinque;

public class PartieUn {


    public String extraireSousChaine(String nomString, int indice, int length){

        if(length > nomString.length() - indice || indice < 0 ){
            return null;
        }

        return nomString.substring(indice, indice + length) ;
       // return subString(indice[, indiceFin])
    }

    public int[] fusion(int[] tab1, int[] tab2){

        int[] nouTab = new int[tab1.length + tab2.length];

        for(int i =0; i<nouTab.length; i++){
            int min = tab1[i];
            int max = tab2[i];

            if(tab2[i] < tab1[i]){
                min = tab2[i];
                max = tab1[i];
            }
            nouTab[i] = min;
        }

        return nouTab;
    }


    public static void main(String[] args){





}

}
