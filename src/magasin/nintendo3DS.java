package magasin;

/**
 *
 * @author franc
 */
public class nintendo3DS extends Jeux{
    
    public nintendo3DS(){
        super("",0,"");
    }
    
    public nintendo3DS(String codeBarre, double prix, String nom){
        super(codeBarre, prix, nom);
    }
 
    @Override
    public String toString(){
        return "*Jeux*= CODE : "+this.codeBarre+", PRIX : "+this.prix+", NOM : "+this.nom+" TYPE : nintendo3DS";
    }
    
}
