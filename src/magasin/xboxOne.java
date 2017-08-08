package magasin;

/**
 *
 * @author franc
 */
public class xboxOne extends Jeux{

    public xboxOne(){
        super("",0,"");
    }
    
    public xboxOne(String codeBarre, double prix, String nom){
        super(codeBarre, prix, nom);
    }
    
    @Override
    public String toString(){
        return "*Jeux*= CODE : "+this.codeBarre+", PRIX : "+this.prix+", NOM : "+this.nom+" TYPE : xboxOne";
    }
    
}
