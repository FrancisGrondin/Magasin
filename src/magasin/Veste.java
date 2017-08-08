package magasin;

/**
 *
 * @author franc
 */
public class Veste extends Vetement{
    
    public Veste(){
        super("",0,"");
    }
    
    public Veste(String codeBarre, double prix, String couleur){
        super(codeBarre, prix, couleur);
    }
    
    @Override
    public String toString(){
        return "*Vetement*= CODE : "+this.codeBarre+", PRIX : "+this.prix+", COULEUR : "+this.couleur+" TYPE : Veste";
    }
}
