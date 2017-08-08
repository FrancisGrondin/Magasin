package magasin;

/**
 *
 * @author franc
 */
public class Chemise extends Vetement {

    public Chemise(){
        super("",0,"");
    }
    
    public Chemise(String codeBarre, double prix, String couleur){
        super(codeBarre, prix, couleur);
    }
    
    @Override
    public String toString(){
        return "*Vetement*= CODE : "+this.codeBarre+", PRIX : "+this.prix+", COULEUR : "+this.couleur+" TYPE : Chemise";
    }
    
}
