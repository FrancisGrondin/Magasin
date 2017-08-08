package magasin;

/**
 *
 * @author franc
 */
public class Article {
    
    protected String codeBarre;
    protected double prix;
    
    public Article(){
        setCodeBarre("");
        setPrix(0);
    }
    
    public Article(String codeBarre, double prix){
        setCodeBarre(codeBarre);
        setPrix(prix);
    }
    
    public void setCodeBarre(String codeBarre){
        this.codeBarre = codeBarre;
    }
    
    public void setPrix(double prix){
        this.prix = prix;
    }
    
    public String getCodeBarre(){
        return codeBarre;
    }
    
    public double getPrix(){
        return prix;
    }
    
    
    public boolean Equals( Object a_object ) {
        boolean isEqual = false;
        
        if( a_object instanceof Article ) {
            Article n = (Article) a_object;
            isEqual = prix == n.prix && codeBarre == n.codeBarre;
        }
        
        return isEqual;
    }

}




