package Prestamo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear instancias de las clases
        Administrador admin = new Administrador();
        admin.setId(1);
        admin.setNombre("Sofía Gómez");

        Libro libro1 = new Libro("978-0321765723", "El Señor de los Anillos", "J.R.R. Tolkien", "Minotauro", 5);
        Libro libro2 = new Libro("978-0743273565", "El Gran Gatsby", "F. Scott Fitzgerald", "Debolsillo", 3);

        Usuario usuario1 = new Usuario();
        usuario1.setId(101);
        List<String> preferencias = new ArrayList<>();
        preferencias.add("Fantasía");
        preferencias.add("Aventura");
        usuario1.registrarse("Carlos Pérez", "carlos.perez@email.com", "secreto123", preferencias);

        Usuario usuario2 = new Usuario();
        usuario2.setId(102);
        List<String> preferencias1 = new ArrayList<>();
        preferencias1.add("Novela");
        preferencias1.add("Drama");
        usuario2.registrarse("Ana López", "ana.lopez@example.org", "claveSegura", preferencias1);

        Prestamo prestamo1 = new Prestamo();
        prestamo1.setId(201);
        prestamo1.setLibroId(libro1.getIsbn());
        prestamo1.setUsuarioId(usuario1.getId());
        prestamo1.setFechaInicio(new Date());
        prestamo1.setFechaFin(new Date(System.currentTimeMillis() + (14 * 24 * 60 * 60 * 1000))); // Préstamo por 14 días

        Reserva reserva1 = new Reserva();
        reserva1.setId(301);
        reserva1.setLibroId(libro2.getIsbn());
        reserva1.setUsuarioId(usuario2.getId());
        reserva1.setFechaReserva(new Date());

        // Simular algunas acciones

        // El administrador agrega un libro
        admin.agregarLibro(libro1);
        admin.agregarLibro(libro2);
        System.out.println("El administrador " + admin.getNombre() + " ha agregado libros al catálogo.");

        // Un usuario toma prestado un libro
        if (libro1.getCopiasDisponibles() > 0) {
            System.out.println("El usuario " + usuario1.getNombre() + " ha tomado prestado el libro: " + libro1.getTitulo());
            libro1.setCopiasDisponibles(libro1.getCopiasDisponibles() - 1);
        } else {
            System.out.println("No hay copias disponibles de " + libro1.getTitulo() + " para " + usuario1.getNombre() + ".");
        }

        // Mostrar detalles del préstamo
        System.out.println("Detalles del préstamo " + prestamo1.getId() + ": Libro ISBN " + prestamo1.getLibroId() + ", Usuario ID " + prestamo1.getUsuarioId() + ", Fecha fin: " + prestamo1.getFechaFin());

        // Un usuario reserva un libro
        System.out.println("El usuario " + usuario2.getNombre() + " ha reservado el libro: " + libro2.getTitulo() + " con fecha de reserva: " + reserva1.getFechaReserva());

        // Intentar renovar el préstamo
        if (prestamo1.renovar()) {
            System.out.println("El préstamo " + prestamo1.getId() + " ha sido renovado. Nueva fecha de fin: " + prestamo1.getFechaFin());
        } else {
            System.out.println("El préstamo " + prestamo1.getId() + " no se puede renovar.");
        }

        // Verificar si el préstamo está vencido
        if (prestamo1.estaVencido()) {
            System.out.println("El préstamo " + prestamo1.getId() + " está vencido.");
        } else {
            System.out.println("Al préstamo " + prestamo1.getId() + " le quedan " + prestamo1.obtenerDiasRestantes() + " días.");
        }

        // Simular la suspensión de un usuario por el administrador
        admin.suspenderUsuario(usuario2);
        System.out.println("El administrador " + admin.getNombre() + " ha suspendido la cuenta del usuario " + usuario2.getNombre() + ".");
    }
}