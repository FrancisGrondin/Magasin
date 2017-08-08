package magasin;

/**
 *
 * @author franc
 */
public class Telephone extends Electronique {
    
    public Telephone(){
        super("",0,"");
    }
    
    public Telephone(String codeBarre, double prix, String fabriquant){
        super(codeBarre, prix, fabriquant);
    }
    
    @Override
    public String toString(){
        return "*Electronique*= CODE : "+this.codeBarre+", PRIX : "+this.prix+", FABRIQUANT : "+this.fabriquant+" TYPE : Telephone";
    }
    
}
