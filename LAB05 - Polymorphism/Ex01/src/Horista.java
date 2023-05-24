public class Horista extends Funcionario{
    private double val_hr;
    public Horista(String nm, String dn, double vh)
    {
        super(nm, dn);
        val_hr = vh;
    }

    public double calculaSalario(int horas)
    {
        return this.val_hr * horas;
    }

    public double getVal_hr() {
        return val_hr;
    }

    public void setVal_hr(double val_hr) {
        this.val_hr = val_hr;
    }

    public String toString()
    {
        return "HORISTA " + super.getNome() + " " + this.calculaSalario(220);
    }
}