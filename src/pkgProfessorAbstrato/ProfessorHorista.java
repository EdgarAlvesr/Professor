package pkgProfessorAbstrato;

public class ProfessorHorista extends ProfessorAbstrato {

    protected double salario_hora;
    protected int total_horas;

    public ProfessorHorista(String n, String m, int i, int h, double vs) {
        super(n, m, i);
        if (h > 0) {
            total_horas = h;
        }
        if (vs > 0) {
            salario_hora = vs;
        }
    }

    public double retornaSalario() {
        double salario_base = salario_hora * total_horas;
        return salario_base - (salario_base * 0.16);
    }

    public String imprimeDados() {

        return super.imprimeDados() + "\nSalário Hora: " + salario_hora + "\nHorasTrabalhadas: " + total_horas + "\nSalário Total: " + retornaSalario();

    }

}
