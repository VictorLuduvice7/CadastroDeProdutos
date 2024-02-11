package Controller;
import Models.Usuario;

import java.util.ArrayList;

// parte de cadastro de usuario
public class CadastroUsuarios {
    private ArrayList<Usuario> usuarios;   //Aqui é declarada uma variável de instância privada chamada usuarios
    private String nome;
    // É uma instância da classe ArrayList que pode armazenar objetos do tipo Usuario.

    // constutor da classe de CadastroUsuarios
    public CadastroUsuarios() {
        usuarios = new ArrayList<>();
    }

    public void cadastrarUsuario(String nome, String email) {
        usuarios.add(new Usuario(nome, email)); // adiciona Novo objeto a lista de produtos usando "Add"
        System.out.println("Usuário cadastrado com sucesso!");
    }

    public <Usuario> void listarUsuarios() {
        if (usuarios.isEmpty()) { // coloquei o metodo isEmpty() para verificar se a lista esta vazia
            System.out.println("Não há usuários cadastrados.");
        } else {
            System.out.println("Usuários cadastrados:");
            for (Models.Usuario usuario : usuarios) {
                System.out.println(usuarios);
            }
        }
    }

    

    public void excluirUusuario(String nome) {
        for (int i = 0; i < usuarios.size(); i++){
            Usuario usuario = usuarios.get(i);
            if (usuario.getNome().equalsIgnoreCase(nome)){
                usuarios.remove(i);
                System.out.println("Usuário excluido com sucesso!");
                return;
            }
        }
        System.out.println("Usuário não encontrado.");
        
    }

}
