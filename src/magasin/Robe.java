package magasin;

/**
 *
 * @author franc
 */
public class Robe extends Vetement {
   
     public Robe(){
        super("",0,"");
    }
    
    public Robe(String codeBarre, double prix, String couleur){
        super(codeBarre, prix, couleur);
    }
    
    @Override
    public String toString(){
        return "*Vetement*= CODE : "+this.codeBarre+", PRIX : "+this.prix+", COULEUR : "+this.couleur+" TYPE : Robe";
    }
    
}
