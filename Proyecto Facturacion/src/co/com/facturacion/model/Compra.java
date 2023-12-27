package co.com.facturacion.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Compra {
    
    // Atributos
    private Cliente cliente;
    private Date fecha;
    private List<DetalleFactura> detalles;
    private double total;
    private int codigo;
    
    // Constructor
    public Compra(Cliente cliente) {
        this.cliente = cliente;
        this.fecha = new Date();
        this.detalles = new ArrayList<>();
        this.total = 0.0;
        this.codigo = 0;
    }
    
    
    
    public Compra(Cliente cliente, Date fecha, List<DetalleFactura> detalles, double total, int codigo) {
		super();
		this.cliente = cliente;
		this.fecha = fecha;
		this.detalles = detalles;
		this.total = total;
		this.codigo = codigo;
	}



	// Métodos
    
    // Agrega un detalle a la compra
    public void agregarDetalle(DetalleFactura detalle) {
        detalles.add(detalle);
        total += detalle.getSubtotal();
    }
    
    // Remueve un detalle de la compra
    public void removerDetalle(DetalleFactura detalle) {
        detalles.remove(detalle);
        total -= detalle.getSubtotal();
    }
    
    // Devuelve la lista de detalles de la compra
    public List<DetalleFactura> getDetalles() {
        return this.detalles;
    }
    
    // Devuelve el cliente que realizó la compra
    public Cliente getCliente() {
        return this.cliente;
    }
    
    // Devuelve la fecha de la compra
    public Date getFecha() {
        return this.fecha;
    }
    
    // Devuelve el total de la compra
    public double getTotal() {
        return this.total;
    }
    
    // Devuelve el código de la compra
    public int getCodigo() {
		return codigo;
	}

    // Establece código de la commpra
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	// Devuelve una representación en String de la compra
    @Override
    public String toString() {
        return "Compra[cliente=" + cliente.getNombre() + ", fecha=" + fecha + ", total=" + total + "]";
    }
    
}
