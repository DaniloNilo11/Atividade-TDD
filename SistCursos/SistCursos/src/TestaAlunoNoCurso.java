import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAlunoNoCurso {

    public static void main(String[] args) {

        List<Curso> cursos = new ArrayList<>();

        Curso curso = new Curso("Programação Orientea a Objeto", "30 horas","a1");
        Curso curso1 = new Curso("Programação Procedural", "20 horas","a2");
        Curso curso2 = new Curso("Git e GitHub", "15 horas","a3");


        Set<Estudante> alunos = new HashSet<>();

        alunos.add(new Estudante("Elisangelo", 22113456,"03.01.2002","706 sul", "elisangelo@gmail.com"));
        alunos.add(new Estudante("Laudicéia", 98768987, "25/06/2003","104 Norte", "laudiceia@gmail.com"));
        alunos.add(new Estudante("Nickolas", 43252344,"12/03/2002", "807 Sul", "nikolas@gmail.com"));

        for (Estudante aluno : alunos) {
            curso.matriculas(aluno);
            curso2.matriculas(aluno);
            System.out.println(aluno);
        }


        curso.matriculas(new Estudante("Elisangelo", 22113456,"03.01.2002","706 sul", "elisangelo@gmail.com"));
        curso2.matriculas(new Estudante("Laudicéia", 98768987, "25/06/2003","104 Norte", "laudiceia@gmail.com"));
        curso1.matriculas(new Estudante("NIckolas", 43252344,"12/03/2002", "807 Sul", "nikolas@gmail.com"));
        System.out.println("=============== ");

        System.out.println(cursos.get(2).getMatriculas());

        for (Curso materia : cursos) {
            System.out.println("Cursos: " + materia);
            System.out.println("Alunos matriculados: " + materia.getMatriculas());

        }

    }

}