package models;

public class Chambre {
    private int id;
    private int numEtage;
    private String numChambre;
    private TypeChambre type;
    private Pavillon pavillon;
    private static int cpt=1;



   
    public Chambre(){
        
    }
    public Chambre(int numEtage,TypeChambre type){
        this.id=Chambre.cpt++;
        this.numEtage=numEtage;
        this.type=type;
    }

    


    public Pavillon getPavillon() {
        return pavillon;
    }

    public void setPavillon(Pavillon pavillon) {
        this.pavillon = pavillon;
    }

    public TypeChambre getType() {
        return type;
    }

    public void setType(TypeChambre type) {
        this.type = type;
    }

    public String getNumChambre() {
        return numChambre;
    }

    public void setNumChambre(String numChambre) {
        this.numChambre = numChambre;
    }

    public int getNumEtage() {
        return numEtage;
    }

    public void setNumEtage(int numEtage) {
        this.numEtage = numEtage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
