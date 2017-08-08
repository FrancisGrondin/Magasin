package magasin;

/**
 *
 * @author franc
 */
public class Ordinateur extends Electronique {
    
    public Ordinateur(){
        super("",0,"");
    }
    
    public Ordinateur(String codeBarre, double prix, String fabriquant){
        super(codeBarre, prix, fabriquant);
    }
    
    @Override
    public String toString(){
        return "*Electronique*= CODE : "+this.codeBarre+", PRIX : "+this.prix+", FABRIQUANT : "+this.fabriquant+" TYPE : Ordinateur";
    }
}
