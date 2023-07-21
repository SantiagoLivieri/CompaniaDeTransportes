package ar.unlam.edu.ar;

public class TransportePasajero extends MedioTransporte implements ITransportable{

	
	private Integer cantidadPasajerosTotal;

	public TransportePasajero(String patente, Integer cantidadPasajerosTotal) {
		super(patente);
		this.cantidadPasajerosTotal = cantidadPasajerosTotal;
	}

	@Override
	public Integer obtenerCantidadMaximaPesoPasajero() {
		Integer cantidadMaximaDePasajeros = 0;
		if(cantidadPasajerosTotal == cantidadMaximaDePasajeros) {
			return cantidadPasajerosTotal;
		}
		return cantidadMaximaDePasajeros;
	}
	
	
}
