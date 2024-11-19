package clases;

public class operacion {
	private double a;
	private double b;
	private double r;
	private String op;
	public operacion() {	
	}
	public operacion(int a, int b, double r, String op) {
		this.a = a;
		this.b = b;
		this.r = r;
		this.op = op;
	}
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double getR() {
		return r;
	}
	public void setR(double r) {
		this.r = r;
	}
	public String getOp() {
		return op;
	}
	public void setOp(String op) {
		this.op = op;
	}
	public void realizar_operacion() {
		double a=this.getA();
		double b=this.getB();
		switch (this.getOp()) {
		
		case "+": {
			this.setR(a+b);
			break;
		}
		case "-":{
			this.setR(a-b);
		}
		case "*":{
			this.setR(a*b);
		}
		case "/":{
			this.setR(a/b);
		}
		}
	}
	public void realizar_operacion(double a, double b) {		
		switch (this.getOp()) {
		case "+": {
			this.setR(a+b);
			break;
		}		
		case "-":{
			this.setR(a-b);
			break;
		}
		case "*":{
			this.setR(a*b);
			break;
		}
		case "/":{
			this.setR(a/b);
			break;
		}
		}
	}
}
