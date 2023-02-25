package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal;
	private int precio;
	private boolean estado;
	private int volumen;
	private Control control;
	static int numTV;
	
	public TV(Marca marca, boolean encendido) {
		this.marca=marca;
		estado = encendido;
		canal = 1;
		volumen = 1;
		precio = 500;
	}
	
	public void setMarca(Marca marc) {
		marca = marc;
	}
	public void setEstado(boolean encendido){
		estado = encendido;
	}
	public void setControl(Control cont) {
		control = cont;
	}
	public void setPrecio(int pr) {
		precio = pr;
	}
	public void setVolumen(int vol) {
		volumen = vol;
	}
	public void setCanal(int can) {
		canal = can;
	}
	
	public void setNumTV(int num) {
		numTV = num;
	}
	
	public Marca getMarca() {
		return marca;
	}
	public Control getControl() {
		return control;
	}
	public int getCanal() {
		return canal;
	}
	public int getVolumen() {
		return volumen;
	}
	public int getPrecio() {
		return precio;
	}
	public boolean getEstado() {
		return estado;
	}
	public int getNumTV() {
		return numTV;
	}
	
	public void turnOn() {
		estado = true;
	}
	public void turnOf() {
		estado = false;
	}
	
	public void canalUp() {
		if(estado && 120 > canal)
			canal++;
	}
	public void canalDown() {
		if(estado && canal > 1 && 120 > canal)
		canal--;
	}
	public void volumenUp() {
		if(estado && 7 > volumen)
			volumen++;
	}
	public void volumenDown() {
		if(estado && volumen > 0)
			volumen--;
	}
	
}



