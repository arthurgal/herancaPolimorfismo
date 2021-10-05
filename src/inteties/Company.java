package inteties;

public class Company extends TaxPayer {
	
	private Integer numberOfEmployeer;
	
	public Company(String name, Double anuallncome, Integer numberOfEmployeer) {
		super(name, anuallncome);
		this.numberOfEmployeer = numberOfEmployeer;
	}

	public Integer getNumberOfEmployeer() {
		return numberOfEmployeer;
	}

	public void setNumberOfEmployeer(Integer numberOfEmployeer) {
		this.numberOfEmployeer = numberOfEmployeer;
	}

	@Override
	public double tax() {
		double imposto = 0.0;
		if(this.numberOfEmployeer > 10) {
			imposto = this.getAnuallncome() * 0.14;
		}else {
			imposto = this.getAnuallncome() * 0.16;
		}
		return imposto;
	}

}
