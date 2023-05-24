public class Operario extends Funcionario {

    private double val_prod;
    public Operario(String nm, String dn, double vp)
    {
        super(nm, dn);
        val_prod = vp;
    }

    public double calculaSalario(int quant)
    {
        return this.val_prod * quant;
    }

    public double getVal_prod() {
        return val_prod;
    }

    public void setVal_prod(double val_prod) {
        this.val_prod = val_prod;
    }

    public String toString()
    {
        return "OPERARIO " + super.getNome() + " " + this.calculaSalario(1500);
    }
}