package ar.unlam.edu.ar;

public class TransporteCarga  extends MedioTransporte implements iCargable{

	private Integer cantidadPasajerosTotal;
	private Double cargaMaxima;
	
	public TransporteCarga(String patente, Double cargaMaxima) {
		super(patente);
		this.cargaMaxima = cargaMaxima;
	}

	@Override
	public Integer obtenerCantidadMaximaPasajero() {
		Integer cantidadMaximaDePasajeros = 0;
		if(cantidadPasajerosTotal == cantidadMaximaDePasajeros) {
			return cantidadPasajerosTotal;
		}
		return cantidadMaximaDePasajeros;
	}	
	
}
