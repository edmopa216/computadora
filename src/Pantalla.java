
public class Pantalla {
	private String color;
	private String marca;
	private String modelo;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Pantalla [color=" + color + ", marca=" + marca + ", modelo=" + modelo + "]";
	}
	
}
