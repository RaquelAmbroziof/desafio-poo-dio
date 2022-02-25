import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Conteudo curso1 = new Curso("Java1", "Descricao curso1 Java", 4, Nivel.BASICO);
        Conteudo curso2 = new Curso("Java2", "Descricao curso2 Java", 6, Nivel.INTERMEDIARIO);
        Conteudo curso3 = new Curso("Java3", "Descricao curso3 Java", 8, Nivel.AVANCADO);
        Conteudo curso4 = new Curso("Python2", "Descricao curso1 Python", 6, Nivel.INTERMEDIARIO);
        Conteudo mentoria1 = new Mentoria("Mentoria de java", "Descrição mentoria1 java", 2);

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(curso3);
        System.out.println(curso4);
        System.out.println(mentoria1);*/

        Set<Conteudo> conteudosBootcampJava = new LinkedHashSet<>(Arrays.asList(curso1, curso2, curso3, mentoria1));
        Bootcamp bootcamp = new Bootcamp("Java", "Descrição Bootcamp Java Developer", conteudosBootcampJava);
        //System.out.println(bootcamp);

        Dev dev1 = new Dev("Camila");
        dev1.matricularBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + dev1.getConteudosInscritos());
        dev1.progredir();
        System.out.println("Conteúdos Inscritos " + dev1.getNome() + ":" + dev1.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos " + dev1.getNome() + ":" + dev1.getConteudosConcluidos());
        System.out.println("XP " + dev1.getNome() + ":" +dev1.calcularTotalXp());

    }

}
