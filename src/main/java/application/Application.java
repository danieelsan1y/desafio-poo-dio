package application;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Application {

    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("curso java");
        curso.setDescricao("descrição curso java");
        curso.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("mentoria de js");
        mentoria2.setDescricao("descrição mentoria js");
        mentoria2.setData(LocalDate.now());

        System.out.println(curso);
        System.out.println(curso2);

        System.out.println(mentoria);
        System.out.println(mentoria2);
    }
}
