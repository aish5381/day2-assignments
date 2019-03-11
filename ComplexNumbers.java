public class ComplexNumbers{

	private double real;
	private double imaginary;

	public void setComplexNumber(double real,double imaginary){
	this.real=real;
	this.imaginary=imaginary;
	}

	public void displayComplexNumber(){
	System.out.println(real+ " +i" +imaginary);
	}

	public ComplexNumbers addComplex(ComplexNumbers c){
	ComplexNumbers c1=new ComplexNumbers();
	c1.real=this.real+c.real;
	c1.imaginary=this.imaginary+c.imaginary;
	return c1;
	}
}