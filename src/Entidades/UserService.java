package Entidades;
import java.util.ArrayList;

public class UsuarioService {

    ArrayList<Usuario> listaUsuarios = new ArrayList<>();
    Usuario novoUser = new Usuario();

    public void cadastrousuario(){
        novoUser.registroU();
        listaUsuarios.add(novoUser);
    }
}