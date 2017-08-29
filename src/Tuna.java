
public class Tuna extends Topping {
	Sushi rice;
	
	public Tuna(Sushi rice){
		this.rice = rice;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return rice.getDescription()+", Tuna";
	}
        public double cost(){
        	return 5 + rice.cost();
        }
}