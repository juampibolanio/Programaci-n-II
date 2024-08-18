package POO.Supermercado;

class Transaccion{
    private Producto producto;

    public Transaccion(Producto producto) {
        this.producto = producto;
    }

    public double PagarProducto(){
        double precioProducto = producto.getPrecio();
        int cantidad = producto.getCantidad();
        double precioTotal = precioProducto*cantidad;
        return precioTotal;
    }

    public void infoTransaccion(){
        String nombreProducto = producto.getNombre();
        System.out.println("Producto: "+ nombreProducto +" - Precio Unitario: $"+producto.getPrecio() + " - Cantidad: "+ producto.getCantidad());
    }
}

