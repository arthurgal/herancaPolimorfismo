package inteties;

public class Individual extends TaxPayer {
	private Double healthExpenditures;
	
	public Individual () {
		
	}

	public Individual(String name, Double anuallncome, Double healthExpenditures) {
		super(name, anuallncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}
	
	@Override
	public double tax() {
		double imposto = 0.0;
		if (this.getAnuallncome() < 20.000) {
			if(this.getHealthExpenditures() > 0.0) {
				imposto = this.getAnuallncome()*0.15 - this.getHealthExpenditures()*0.5;
			}else {
				imposto = this.getAnuallncome()*0.15;
			}
		}
		if (this.getAnuallncome() >= 20.000) {
			if(this.getHealthExpenditures() > 0.0) {
				imposto = this.getAnuallncome()*0.25 - this.getHealthExpenditures()*0.5;
			}else {
				imposto = this.getAnuallncome()*0.25;
			}
		}
		return imposto;
	}
}
