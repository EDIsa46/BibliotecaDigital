package Prestamo;

import java.util.List;

/**
 * Representa a un usuario del sistema de la biblioteca digital.
 * Contiene información personal y preferencias de lectura.
 *
 * @author Tu Nombre
 * @version 1.0
 * @since 1.0
 */
public class Usuario {
    /**
     * Identificador único del usuario.
     */
    private int id;
    /**
     * Nombre completo del usuario.
     */
    private String nombre;
    /**
     * Dirección de correo electrónico del usuario, utilizada para el login y notificaciones.
     */
    private String email;
    /**
     * Contraseña del usuario, almacenada de forma segura.
     */
    private String contrasenia;
    /**
     * Lista de géneros de libros preferidos por el usuario.
     */
    private List<String> preferencias;
    /**
     * Indica si el usuario está registrado en el sistema.
     */
    private boolean registrado;

    /**
     * Constructor por defecto de la clase Usuario.
     */
    public Usuario() {
        this.registrado = false; // Inicializar como no registrado
    }

    /**
     * Obtiene el identificador único del usuario.
     *
     * @return El ID del usuario.
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el identificador único del usuario.
     *
     * @param id El nuevo ID del usuario.
     */
    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public List<String> getPreferencias() {
        return preferencias;
    }

    public void setPreferencias(List<String> preferencias) {
        this.preferencias = preferencias;
    }

    public boolean estaRegistrado() {
        return registrado;
    }

    /**
     * Registra un nuevo usuario en el sistema.
     *
     * @param nombre       Nombre completo del usuario.
     * @param email        Dirección de correo electrónico del usuario.
     * @param contrasenia  Contraseña elegida por el usuario.
     * @param preferencias Lista de géneros de libros preferidos.
     * @return {@code true} si el registro fue exitoso, {@code false} en caso contrario.
     * @since 1.0
     */
    public boolean registrarse(String nombre, String email, String contrasenia, List<String> preferencias) {
        if (nombre != null && !nombre.isEmpty() &&
                email != null && email.contains("@") &&
                contrasenia != null && contrasenia.length() >= 6) {
            this.nombre = nombre;
            this.email = email;
            this.contrasenia = contrasenia;
            this.preferencias = preferencias;
            this.registrado = true;
            return true;
        }
        return false;
    }

    /**
     * Permite a un usuario existente iniciar sesión en el sistema.
     *
     * @param email     Dirección de correo electrónico del usuario.
     * @param contrasenia Contraseña del usuario.
     * @return {@code true} si las credenciales son válidas, {@code false} en caso contrario.
     * @since 1.0
     */
    public boolean iniciarSesion(String email, String contrasenia) {
        // Por ahora, una verificación básica
        return this.email != null && this.email.equals(email) &&
                this.contrasenia != null && this.contrasenia.equals(contrasenia);
    }

    /**
     * Permite a un usuario actualizar su información de perfil.
     *
     * @param nombre       Nuevo nombre completo del usuario.
     * @param preferencias Nueva lista de géneros de libros preferidos.
     * @return {@code true} si la actualización fue exitosa, {@code false} en caso contrario.
     * @since 1.0
     */
    public boolean actualizarPerfil(String nombre, List<String> preferencias) {
        if (nombre != null && !nombre.isEmpty()) {
            this.nombre = nombre;
            this.preferencias = preferencias;
            return true;
        }
        return false;
    }
}