public class CamaroteInferior extends VIP{
    private String local = "Camarote Inferior";

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void imprimeLocal()
    {
        System.out.println("Local: " + this.getLocal());
    }
}
