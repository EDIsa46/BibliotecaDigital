package Prestamo;

import java.util.Date;

/**
 * Representa la reserva de un libro por un usuario.
 * Contiene información sobre el libro, el usuario y la fecha de la reserva.
 *
 * @author Tu Nombre
 * @version 1.0
 * @since 1.0
 */
public class Reserva {
    /**
     * Identificador único de la reserva.
     */
    private int id;
    /**
     * ISBN del libro reservado.
     */
    private String libroId;
    /**
     * ID del usuario que realizó la reserva.
     */
    private int usuarioId;
    /**
     * Fecha en la que se realizó la reserva.
     */
    private Date fechaReserva;

    /**
     * Constructor por defecto de la clase Reserva.
     */
    public Reserva() {
    }

    /**
     * Obtiene el identificador único de la reserva.
     *
     * @return El ID de la reserva.
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el identificador único de la reserva.
     *
     * @param id El nuevo ID de la reserva.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene el ISBN del libro reservado.
     *
     * @return El ISBN del libro.
     */
    public String getLibroId() {
        return libroId;
    }

    /**
     * Establece el ISBN del libro reservado.
     *
     * @param libroId El ISBN del libro reservado.
     */
    public void setLibroId(String libroId) {
        this.libroId = libroId;
    }

    /**
     * Obtiene el ID del usuario que realizó la reserva.
     *
     * @return El ID del usuario.
     */
    public int getUsuarioId() {
        return usuarioId;
    }

    /**
     * Establece el ID del usuario que realizó la reserva.
     *
     * @param usuarioId El ID del usuario.
     */
    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    /**
     * Obtiene la fecha en la que se realizó la reserva.
     *
     * @return La fecha de la reserva.
     */
    public Date getFechaReserva() {
        return fechaReserva;
    }

    /**
     * Establece la fecha en la que se realizó la reserva.
     *
     * @param fechaReserva La nueva fecha de la reserva.
     */
    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    /**
     * Notifica al usuario que el libro reservado está disponible.
     *
     * @since 1.0
     */
    public void notificarDisponibilidad() {
        // No implementar ahora
    }
}