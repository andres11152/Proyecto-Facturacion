package co.com.facturacion.controller;

import java.util.ArrayList;
import co.com.facturacion.model.Compra;

public class ControladorCompra {
	
	private ArrayList<Compra> compras;
	
	public ControladorCompra() {
		
		compras = new ArrayList<Compra>();
		
	}
	
    public void agregarCompra(Compra compra) {
        compras.add(compra);
    }

    public void eliminarCompra(Compra compra) {
        compras.remove(compra);
    }

    public Compra buscarCompraPorCodigo(int codigo) {
        for (Compra compra : compras) {
            if (compra.getCodigo() == codigo) {
                return compra;
            }
        }
        return null;
    }

}
