public class ProdottiAlimentari {
    private String deperibilita;
    private boolean isEcosostenibile;
    public ProdottiAlimentari(String deperibilita, boolean isEcosostenibile){
        this.deperibilita=deperibilita;
        this.isEcosostenibile=isEcosostenibile;
    }
    public void setDeperibilita(String deperibilita){
        this.deperibilita=deperibilita;
    }
    public String getDeperibilita(){
        return deperibilita;
    }
    public void setEcosostenibile(boolean isEcosostenibile){
        this.isEcosostenibile=isEcosostenibile;
    }
    public boolean getEcosostenibile(){
        return isEcosostenibile;
    }
}