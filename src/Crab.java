
public class Crab extends Topping {
	Sushi rice;
	
	public Crab( Sushi rice){
		this.rice = rice;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return rice.getDescription()+", Crab";
	}
        public double cost(){
        	return 4 + rice.cost();
        }
}