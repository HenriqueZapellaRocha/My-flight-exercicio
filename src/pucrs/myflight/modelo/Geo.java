package pucrs.myflight.modelo;


public class Geo {
	private double latitude;
	private double longitude;
	
	public Geo(double latitude, double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	public double getLatitude() {
		return latitude;
	}
	
	public double getLongitude() {
		return longitude;
	}

	public static double calculaDistancia(Geo aeroportoUm, Geo aeroportoDois) {

	
			return (2*6371) * Math.asin(Math.sqrt(Math.pow((Math.sin(Math.toRadians((aeroportoUm.getLatitude() - aeroportoDois.getLatitude()) / 2))), 2) + Math.pow((Math.sin(Math.toRadians((aeroportoUm.getLongitude() - aeroportoDois.getLongitude()) / 2))), 2) * (Math.cos(Math.toRadians(aeroportoUm.getLatitude()))) * (Math.cos(Math.toRadians(aeroportoDois.getLatitude()))) ));
	}
}
