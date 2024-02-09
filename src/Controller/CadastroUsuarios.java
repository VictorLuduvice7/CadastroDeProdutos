package Controller;
import Models.Usuario;

import java.util.ArrayList;

// parte de cadastro de usuario
public class CadastroUsuarios {
    private ArrayList<Usuario> usuarios;

    public CadastroUsuarios() {
        usuarios = new ArrayList<>();
    }

    public void cadastrarUsuario(String nome, String email) {
        usuarios.add(new Usuario(nome, email));
        System.out.println("Usuário cadastrado com sucesso!");
    }

    public <Usuario> void listarUsuarios() {
        if (usuarios.isEmpty()) {
            System.out.println("Não há usuários cadastrados.");
        } else {
            System.out.println("Usuários cadastrados:");
            for (Models.Usuario usuario : usuarios) {
                System.out.println(usuarios);
            }
        }
    }
}
