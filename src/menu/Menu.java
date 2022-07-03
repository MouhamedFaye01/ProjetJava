package menu;
import java.util.Scanner;
import models.Pavillon;
import models.TypeChambre;
import service.IService;
import service.ServiceTableau;

public class Menu {
IService service = new ServiceTableau();
Scanner saisi= new Scanner(System.in);////-----pour saisir------////
private TypeChambre Chambre;

    

public void menu() {
    //------Affichage du menu--------//
    System.out.println("1-Ajouter un pavillon");
    System.out.println("2-Lister les pavillons");
    System.out.println("3-Ajouter une chambre");
    System.out.println("4-Lister les chambres");
}

public void choix(){

    System.out.println("Veuillez choisir une option");
    int valeur = saisi.nextInt();//--------permet de récupérer la valeur saisie------//


    switch(valeur){
        case 1:
            System.out.println("Donner le nombre d'étages");
            int val=saisi.nextInt();
            Pavillon pavillon=new Pavillon(val);
            service.addPavillon(pavillon);
        break;
        case 2:
           service.listerPavillon();
        break;
        case 3:
            System.out.println("Veuillez choisir le numéro de l'étage");
            int nbr = saisi.nextInt();
            System.out.println("Veuillez choisir le type de chambre que vous voulez");
            System.out.println("1-Chambre individuelle");
            System.out.println("2-Chambre double");
            int typeC = saisi.nextInt();
                switch(typeC){
                    case 1:
                    this.Chambre=TypeChambre.INDIVIDUEL;
                    
                    break;
                    case 2:
                    this.Chambre=TypeChambre.INDIVIDUEL;
                    
                    break;
                }
            service.listerPavillon();
            System.out.println("Veuillez choisir le pavillon");
            int pav = saisi.nextInt();



            







            
        break;
        
        }
}
}