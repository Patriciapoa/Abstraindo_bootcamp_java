import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso introdução à plataforma java");
        curso1.setDescricao("Conhecer a estrutura, a história de criação e evolução da linguagem Java, além de suas plataformas, instalação e utilização de IDEs para desenvolvimento.");
        curso1.setCargaHoraria(1);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso automação de testes com selenium webdriver e java");
        curso2.setDescricao("Conheça o Selenium WebDriver, a principal ferramenta de automação de páginas Web. Nesse contexto, explore a linguagem de programação Java e entenda como o Selenium automatiza as ações diretamente em seu browser.");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("Dominando Programação Orientada a Objetos com Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Gft Quality Assurance Para Mulheres");
        bootcamp.setDescricao("O bootcamp ideal para pessoas que se identificam como mulheres e que estão buscando uma primeira oportunidade no mercado de TI, migração de carreira ou até mesmo júniores em busca de crescimento profissional e uma maior oportunidade na GFT. Com o objetivo de ensinar e graduar até mesmo quem nunca viu nada sobre o assunto, o bootcamp chegou para ser uma excelente porta de entrada para quem deseja aprender de verdade e construir uma carreira na área de Quality Assurance.");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devGleyson = new Dev();
        devGleyson.setNome("Gleyson");
        devGleyson.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Gleyson:" + devGleyson.getConteudosInscritos());
        devGleyson.progredir();
        devGleyson.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Gleyson:" + devGleyson.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Gleyson:" + devGleyson.getConteudosConcluidos());
        System.out.println("XP:" + devGleyson.calcularTotalXp());

        System.out.println("-------");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

    }

}