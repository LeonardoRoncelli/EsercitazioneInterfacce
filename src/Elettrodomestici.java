public class Elettrodomestici {
    private String grandezza;
    private boolean isEcosostenibile;
    public Elettrodomestici(String grandezza, boolean isEcosostenibile){
        this.grandezza=grandezza;
        this.isEcosostenibile=isEcosostenibile;
    }
    public void setGrandezza(String grandezza){
        this.grandezza=grandezza;
    }
    public String getGrandezza(){
        return grandezza;
    }
    public void setEcosostenibile(boolean isEcosostenibile){
        this.isEcosostenibile=isEcosostenibile;
    }
    public boolean getEcosostenibile(){
        return isEcosostenibile;
    }
}