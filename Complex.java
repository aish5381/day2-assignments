public class Complex{

	public static void main(String[] args){
		
		ComplexNumbers complexNumbers=new ComplexNumbers();
		ComplexNumbers complexNumbers1=new ComplexNumbers();
		ComplexNumbers complexNumbers2;

		complexNumbers.setComplexNumber(2.0,1.0);
		complexNumbers1.setComplexNumber(2.0,1.0);

		complexNumbers.displayComplexNumber();
		complexNumbers1.displayComplexNumber();
		
		complexNumbers2=complexNumbers.addComplex(complexNumbers1);
		complexNumbers2.displayComplexNumber();
	}
}