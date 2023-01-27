import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main (String[] args){
        Curso curso = new Curso();
        Curso curso1 = new Curso();
        Curso curso2 = new Curso();
        Curso curso3 = new Curso();
        Curso curso4 = new Curso();
        Curso curso5 = new Curso();


        curso.setTitulo("Java basico");
        curso.setDescricao("Descrição curso de java basico");
        curso.setCargaHoraria(8);

        curso1.setTitulo("Java POO");
        curso1.setDescricao("Descrição curso de java POO");
        curso1.setCargaHoraria(6);

        curso2.setTitulo("Spring boot");
        curso2.setDescricao("Descrição curso de Spring boot+");
        curso2.setCargaHoraria(4);

        curso3.setTitulo("HTML");
        curso3.setDescricao("Descrição curso de HTML");
        curso3.setCargaHoraria(8);

        curso4.setTitulo("CSS");
        curso4.setDescricao("Descrição curso de CSS");
        curso4.setCargaHoraria(6);

        curso5.setTitulo("Java Script");
        curso5.setDescricao("Descrição curso de java script");
        curso5.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        Mentoria mentoria1 = new Mentoria();
        Mentoria mentoria2 = new Mentoria();
        Mentoria mentoria3 = new Mentoria();

        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setData(LocalDate.now());

        mentoria1.setTitulo("Mentoria Java POO");
        mentoria1.setDescricao("Descrição mentoria java POO");
        mentoria1.setData(LocalDate.now());

        mentoria2.setTitulo("Mentoria HTML");
        mentoria2.setDescricao("Descrição mentoria HTML");
        mentoria2.setData(LocalDate.now());

        mentoria3.setTitulo("Mentoria CSS + JS");
        mentoria3.setDescricao("Descrição mentoria CSS+JS");
        mentoria3.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        Bootcamp bootcamp1 = new Bootcamp();

        bootcamp.setNome("Bootcamp Back-end");
        bootcamp.setDescricao("Descrição do Bootcamp de Back-end");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        bootcamp.getConteudos().add(mentoria1);

        bootcamp1.setNome("Bootcamp Front-end");
        bootcamp1.setDescricao("Descrição do Bootcamp de Back-end");
        bootcamp1.getConteudos().add(curso3);
        bootcamp1.getConteudos().add(curso4);
        bootcamp1.getConteudos().add(curso5);
        bootcamp1.getConteudos().add(mentoria2);
        bootcamp1.getConteudos().add(mentoria3);

        Dev dev1 = new Dev();
        dev1.setNome("Bruno");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println();
        System.out.println("Conteudos Inscritos Bruno: "  + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        dev1.progredir();
        System.out.println("Conteudos Concluidos Bruno: " + dev1.getConteudosConcluidos());
        System.out.println("Conteudos Inscritos Bruno: " + dev1.getConteudosInscritos());
        System.out.println("XP: " + dev1.calculaTotalXp());
        System.out.println("--------------------------------------------------------------");

        Dev dev2 = new Dev();
        dev2.setNome("Lucas");
        dev2.inscreverBootcamp(bootcamp1);
        System.out.println("Conteudos Inscritos Lucas: " + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("Conteudos Concluidos Lucas: " + dev2.getConteudosConcluidos());
        System.out.println("Conteudos Inscritos Lucas: " + dev2.getConteudosInscritos());
        System.out.println("XP: " + dev2.calculaTotalXp());


    }
}
