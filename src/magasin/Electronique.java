package magasin;

/**
 *
 * @author franc
 */
public class Electronique extends Article{
  
    protected String fabriquant;
    
    public Electronique(){
        super("",0);
        setFabriquant("");
    }
    
    public Electronique(String codeBarre, double prix, String fabriquant){
        super(codeBarre, prix);
        setFabriquant(fabriquant);
    }
    
    public void setFabriquant(String fabriquant){
        this.fabriquant = fabriquant;
    }
    
    public String getFabriquant(){
        return fabriquant;
    }
    
    
}
