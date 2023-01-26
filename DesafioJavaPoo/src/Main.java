import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main (String[] args){
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();

        curso1.setTitulo("Java");
        curso1.setDescricao("Descrição curso de java");
        curso1.setCargaHoraria(8);

        curso2.setTitulo("Js");
        curso2.setDescricao("Descrição curso de js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
        */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Bruno");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Bruno: " + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        dev1.progredir();
        System.out.println("Conteudos Concluidos Bruno: " + dev1.getConteudosConcluidos());
        System.out.println("Conteudos Inscritos Bruno: " + dev1.getConteudosInscritos());
        System.out.println("XP: " + dev1.calculaTotalXp());
        System.out.println("--------------------------------------------------------------");

        Dev dev2 = new Dev();
        dev2.setNome("Lucas");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Lucas: " + dev2.getConteudosInscritos());
        dev2.progredir();
        System.out.println("Conteudos Concluidos Lucas: " + dev2.getConteudosConcluidos());
        System.out.println("Conteudos Inscritos Lucas: " + dev2.getConteudosInscritos());
        System.out.println("XP: " + dev2.calculaTotalXp());

    }
}
