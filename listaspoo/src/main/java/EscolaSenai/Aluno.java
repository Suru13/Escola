package EscolaSenai;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aluno extends Pessoa{ //Classe base dos alunos da instituição

    //Criando lista para guardar cada aluno
    public static List<Aluno> listaDeAlunos = new ArrayList<Aluno>();



    // •--==> ATRITUBTOS
    private int alunoId=0;
    private String alunoMatricula; //Primary Key
    private LocalDate alunoDataAdmissao;//localDate
    private EnumStatusMatricula alunoStatus; //Enum (ativo, trancado, suspenso, concluído)
    private Endereco endereco; //Enum(endereco)


    // •--==> CONSTRUTOR base
    public Aluno(String nomeAl){        
        this.setId(alunoId);
        this.alunoMatricula = ("A-"+this.getId());
       // this.alunoDataAdmissao="Setembro";
        this.alunoStatus = EnumStatusMatricula.ATIVO;
        this.setNome(nomeAl);
        this.setDataNascimento("2007");
        this.setEmail("SenaiEscola."+nomeAl+"."+this.getAlunoMatricula()+".alunos@senai.com");
        this.setSenha(this.alunoMatricula);

    }

    // Construtor add endereco

    public void alunoEndereco(Endereco endereco){
        this.endereco = endereco;
    }

    // •--==> METODOS
    @Override
    public void imprimePessoa(){ //Metodo da Superclasse Pessoa ele liga o extends Pessoa no aluno
        //Dados da Pessoa
        System.out.println("•====================•");
        System.out.println("| DADOS   DE   ALUNO |");
        System.out.println("•====================•");
        System.out.println("Id:"+getId());
        System.out.println("Nome: "+getNome());
        System.out.println("Data Nascimento: "+getDataNascimento());
        System.out.println("Email: "+getEmail());
        System.out.println("Senha: "+getSenha());//temporario para debug

        //Dados de Aluno
        System.out.println("Matricula: "+getAlunoMatricula());
       // System.out.println("Data da Admissao: "+getAlunoDataAdmissao());
        System.out.println("Situação: "+getAlunoStatus());
        System.out.println("•====================•");
        
    }

    // Metodo para ser chamado no application para cadastrar aluno

public static void cadastrarAluno(){

    System.out.println("- CADASTRANDO NOVO ALUNO -");
    System.out.print("Nome: ");
    Scanner sc = new Scanner(System.in);
    String nome = sc.nextLine();
    Aluno aluno = new Aluno(nome);
   // aluno.setNome(nome);
    Aluno.listaDeAlunos.add(aluno);
    System.out.println("\n");
}

// Novo metodo imprimir aluno
public static void imprimeListaDeAluno(){
    // Se a lista está vazia
    if(!Aluno.listaDeAlunos.isEmpty()){
        System.out.println("Lista de alunos:");
        for(int i=0; i<Aluno.listaDeAlunos.size(); i++) {
            System.out.println( (i+1) + "- " + Aluno.listaDeAlunos.get(i).getNome());
        }
    } else {
        System.out.println("Não há aluno cadastrados.\n\n");
    }
}


    // •--==> GETTERs SETTERs

    public static List<Aluno> getListaDeAlunos() {
        return listaDeAlunos;
    }
    public static void setListaDeAlunos(List<Aluno> listaDeAlunos) {
        Aluno.listaDeAlunos = listaDeAlunos;
    }


    public String getAlunoMatricula() {
        return alunoMatricula;
    }

    public Endereco getEndereco() {
        return endereco;
    }
    
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }


    /*public String getAlunoDataAdmissao() {
        return alunoDataAdmissao;
    }

    public void setAlunoDataAdmissao(String alunoDataAdmissao) {
        this.alunoDataAdmissao = alunoDataAdmissao;
    }*/

    public EnumStatusMatricula getAlunoStatus() {
        return alunoStatus;
    }

    public void setAlunoStatus(EnumStatusMatricula alunoStatus) {
        this.alunoStatus = alunoStatus;
    }

}
