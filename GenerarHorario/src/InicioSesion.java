import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.util.Scanner;
public class InicioSesion {
    private List<Usuario> usuarios;

    public InicioSesion() {
        usuarios = new ArrayList<>();
    }

    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public Usuario iniciarSesion(String nombreUsuario, String contraseña) {
        for (Usuario usuario : usuarios) {
            if (usuario.nombreUsuario.equals(nombreUsuario) && usuario.verificarContraseña(contraseña)) {
                return usuario;
            }
        }
        return null; // No se encontró el usuario
    }

    public void mostrarMenu(Usuario usuario) {
        if (usuario instanceof Profesor) {

            System.out.println("Menu para Profesor");
            System.out.println("1=Crear Horario");
            System.out.println("2=Mostrar Horario");
        } else if (usuario instanceof Estudiante) {
            System.out.println("Menú para Estudiante");
            System.out.println("Seleccione");
            System.out.println("1- Ver Horario");

        } else if (usuario instanceof Coordinador) {
            System.out.println("Menú para Coordinador");
        }
    }
}