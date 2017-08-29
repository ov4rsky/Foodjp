
public class Salmonroe extends Topping {
	Sushi rice;
	
	public Salmonroe(Sushi rice){
		this.rice = rice;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return rice.getDescription()+", Salmonroe";
	}
        public double cost(){
        	return 5 + rice.cost();
        }
}