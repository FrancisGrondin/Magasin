package magasin;

/**
 *
 * @author franc
 */
public class Jupe extends Vetement{
    
    public Jupe(){
        super("",0,"");
    }
    
    public Jupe(String codeBarre, double prix, String couleur){
        super(codeBarre, prix, couleur);
    }
    
    @Override
    public String toString(){
        return "*Vetement*= CODE : "+this.codeBarre+", PRIX : "+this.prix+", COULEUR : "+this.couleur+" TYPE : Jupe";
    }
    
}
