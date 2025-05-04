package Prestamo;

/**
 * Representa a un administrador del sistema de la biblioteca digital.
 * Los administradores tienen permisos para gestionar el catálogo, los usuarios,
 * los préstamos y generar reportes.
 *
 * @author Tu Nombre
 * @version 1.0
 * @since 1.0
 */
public class Administrador {
    /**
     * Identificador único del administrador.
     */
    private int id;
    /**
     * Nombre del administrador.
     */
    private String nombre;

    /**
     * Constructor por defecto de la clase Administrador.
     */
    public Administrador() {
    }

    /**
     * Obtiene el identificador único del administrador.
     *
     * @return El ID del administrador.
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el identificador único del administrador.
     *
     * @param id El nuevo ID del administrador.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre del administrador.
     *
     * @return El nombre del administrador.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del administrador.
     *
     * @param nombre El nuevo nombre del administrador.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Permite al administrador agregar un nuevo libro al catálogo.
     *
     * @param libro El libro a agregar.
     * @since 1.0
     */
    public void agregarLibro(Libro libro) {
        // No implementar ahora
    }

    /**
     * Permite al administrador editar la información de un libro existente en el catálogo.
     *
     * @param libro El libro con la información actualizada.
     * @since 1.0
     */
    public void editarLibro(Libro libro) {
        // No implementar ahora
    }

    /**
     * Permite al administrador suspender la cuenta de un usuario.
     *
     * @param usuario El usuario cuya cuenta se va a suspender.
     * @since 1.0
     */
    public void suspenderUsuario(Usuario usuario) {
        // No implementar ahora
    }
}