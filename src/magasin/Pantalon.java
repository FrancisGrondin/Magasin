package magasin;

/**
 *
 * @author franc
 */
public class Pantalon extends Vetement{
        
    public Pantalon(){
        super("",0,"");
    }
    
    public Pantalon(String codeBarre, double prix, String couleur){
        super(codeBarre, prix, couleur);
    }
    
    @Override
    public String toString(){
        return "*Vetement*= CODE : "+this.codeBarre+", PRIX : "+this.prix+", COULEUR : "+this.couleur+" TYPE : Pantalon";
    }
    
}
