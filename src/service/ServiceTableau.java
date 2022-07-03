package service;

import models.BoursiersLoges;
import models.Chambre;
import models.Etudiant;
import models.Pavillon;

public class ServiceTableau implements IService {

private final int TAILLE=10;



private Pavillon[] pavillons= new Pavillon[TAILLE];
private Chambre[] chambres= new Chambre[TAILLE];

private int indexPavillon;

    @Override
    public void addPavillon(Pavillon pavillon) {
        if(indexPavillon<TAILLE){
          pavillons[indexPavillon]=pavillon;
          indexPavillon++;
        }else{
            System.out.println("le tableau est plein");
        }
        
    }

    @Override
    public void supprimerPavillon(Pavillon pavillon) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void listerPavillon() {
        for (Pavillon p : pavillons) {
            if(p!=null){
                System.out.println(p); //----permet d'afficher àl'écran----//
            }
        }
        
    }


    @Override
    public Pavillon trouverPavillon(int id){
        // for (Pavillon p : pavillons) {
        //     if(p.id=pav){
        //         return Pavillon;
        //     }
        //       else{
        //       System.out.println("ce pavillon n'existe pas");
        //     }
        // }
    }

    @Override
    public void listerChambreDunPavillon(Pavillon pavillon) {
        // TODO Auto-generated method stub
        
    }

    private int indexChambre;

    @Override
    public void addChambre(Chambre chambre) {
        if(indexChambre<TAILLE){
            chambres[indexChambre]=chambre;
            indexChambre++;
          }else{
              System.out.println("le tableau est plein");
          }
          
        
    }

    @Override
    public void listerChambre() {
        for (Chambre c : chambres) {
            if(c!=null){
                System.out.println(c); //----permet d'afficher àl'écran----//
            }
        }
        
    }

    @Override
    public void archiverChambre(Chambre chambre) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void addEtudiant(Etudiant etudiant) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void listerEtudiantChambre(Chambre chambre) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void affecterChambrePavillon(Chambre chambre, Pavillon pavillon) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void affecterChambreBoursierLoge(Chambre chambre, BoursiersLoges BoursiersLoges) {
        // TODO Auto-generated method stub
        
    }
    
 
   
}
