package pkgProfessorAbstrato;

public class ProfessorRegime extends ProfessorAbstrato {

    protected double salario;

    public ProfessorRegime(String n, String m, int i, double vs) {
        super(n, m, i);
        if (vs > 0) {
            salario = vs;
        }
    }

    public double retornaSalario() {
        return salario - (salario * 0.16);
    }

    public String imprimeDados() {

        return super.imprimeDados() + "\nSalário: " + salario;

    }
}
