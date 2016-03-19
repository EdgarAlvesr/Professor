package pkgProfessorAbstrato;

public class ProfessorAbstratoTeste {

    public static void main(String[] args) {

        //Não podem ser instanciados objetos de classes abstratas!!!
        //ProfessorAbstrato prof1 = new ProfessorAbstrato("João", "001", 50);	
        //System.out.println(prof1.imprimeDados());
        
        ProfessorAbstrato vet[] = new ProfessorAbstrato[2];

        ProfessorRegime prof2 = new ProfessorRegime("Maria", "002", 30, 2000);
        vet[0] = prof2;

        ProfessorHorista prof3 = new ProfessorHorista("Pedro", "003", 42, 30, 100);
        vet[1] = prof3;
        
        /**For each
        
        for(ProfessorAbstrato i: vet){
            System.out.println(i.retornaSalario());
        }
        */
        
        for (int i = 0; i <= 1; i++) {
            System.out.println(vet[i].retornaSalario());
        }

        ProfessorAbstrato prof = new ProfessorRegime("João", "004", 50, 3000);
        System.out.println(prof.imprimeDados());

    }

}
