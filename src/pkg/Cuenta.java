package pkg;

public class Cuenta {
	private double saldo;

	public Cuenta(double saldo) {
		super();
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void ingreso(double i) {
		this.saldo += i;
	}

	public void reintegro(double i) {
		if (this.saldo - i >= -500) {
			this.saldo -= i;
		} else {
			System.out.println(
					"Fondos insuficientes (saldo " + this.saldo + "€) en la cuenta para el reintegro de " + i + "€");
		}
	}
}
