
public class Automobile {
	private int anno, cilindrata, velocita, costo;
	public Automobile(int anno, int cilindrata, int velocita, int costo) {
		this.anno = anno;
		this.cilindrata = cilindrata;
		this.velocita = velocita;
		this.costo = costo;
	}
	public int getAnno() {
		return anno;
	}
	public int getCilindrata() {
		return cilindrata;
	}
	public int getVelocita() {
		return velocita;
	}
	public int getCosto() {
		return costo;
	}
	public void setAnno(int anno) {
		this.anno = anno;
	}
	public void setCilindrata(int cilindrata) {
		this.cilindrata = cilindrata;
	}
	public void setVelocita(int velocita) {
		this.velocita = velocita;
	}
	public void setCosto(int costo) {
		this.costo = costo;
	}
	public void stampaAttributi() {
		System.out.println("Anno automobile: " + getAnno());
		System.out.println("Cilindrata automobile: " + getCilindrata());
		System.out.println("Velocità automobile: " + getVelocita());
		System.out.println("Costo automobile: " + getCosto());
	}
}
