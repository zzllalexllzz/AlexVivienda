
package Hogar;


public class Vivienda 
{
	private double precio;
    private  int numHabitaciones;
    private double superficie;
    private boolean parking;
    private String estado;
    private String propietario;
   
    /*-------------------------------------------------*/
    /**
	 * @param precio
	 * @param numHabitaciones
	 * @param superficie
	 * @param parking
	 * @param estado
	 * @param propietario
	 */
	public Vivienda(double precio, int numHabitaciones, double superficie, boolean parking, String estado,
			String propietario) {
		super();
		this.precio = precio;
		this.numHabitaciones = numHabitaciones;
		this.superficie = superficie;
		this.parking = parking;
		this.estado = estado;
		this.propietario = propietario;
	}
	/**
	 * ESTOS SON METODOS GETTERS Y SETTERS
	 * @return
	 */
    public double getPrecio() {
        return precio;
    }
    /**
     * 
     * @param precio 
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }
    /**
     * 
     * @param numHabitaciones 
     */
    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public double getSuperficie() {
        return superficie;
    }
    /**
     * 
     * @param superficie 
     */
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public boolean isParking() {
        return parking;
    }
    /**
     * 
     * @param parking 
     */
    public void setParking(boolean parking) {
        this.parking = parking;
    }

    public String getEstado() {
        return estado;
    }
    /**
     * 
     * @param estado 
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPropietario() {
        return propietario;
    }
    /**
     * 
     * @param propietario 
     */
    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }
    /*---------------------------------------------------*/
    public Vivienda (double precio)
    {
        this.precio = precio;
    }
    
    public void actualizarPrecio(double descuento)
    {
        precio = precio - precio *(descuento/0.05);
    }
    
    
    
}
