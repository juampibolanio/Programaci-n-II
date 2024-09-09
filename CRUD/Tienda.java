import java.util.ArrayList;

public class Tienda {
    ArrayList <Clientes> listaClientes = new ArrayList<>();

    //Método para agregar un cliente
    public void agregarCliente(Clientes cliente) {
        listaClientes.add(cliente);
    }

    //método para buscar un cliente
    public Clientes buscarCliente(int id) {
        for (Clientes clientes : listaClientes) {
            if (clientes.getId() == id) {
                return clientes;
            } 
        }
        return null;
    } 

    //actualizar los datos de un cliente
    public void actualizarDatos(int id, String nombre, String correo, String telefono) {
        Clientes cliente = buscarCliente(id);
        if (cliente != null) {
            cliente.setNombre(nombre);
            cliente.setCorreo(correo);
            cliente.setTelefono(telefono);
            System.out.println("Datos del cliente actualizados: " + cliente);
        } else {
            System.out.println("El cliente con la id " + id + " no fue encontrado.");
        }
    }
    //eliminar un cliente de la lista
    public void eliminarCliente(int id) {
        Clientes clienteAEliminar = this.buscarCliente(id);
        if (clienteAEliminar != null) {
            listaClientes.remove(clienteAEliminar);
            System.out.println("Cliente eliminado: " + clienteAEliminar.getNombre());
        } else {
            System.out.println("El cliente con la ID " + id + " no fue encontrado.");
        }
    }
    
    //listar los clientes
    public void mostrarClientes() {
        System.out.println("Lista de clientes: ");
        if (listaClientes.isEmpty()) {
            System.out.println("No hay clientes en la lista.");
        } else {
            System.out.println("Lista de clientes:");
            for (Clientes cliente : listaClientes) {
                System.out.println(cliente);
            }
        }
    }
}