
public class Seaweed extends Topping {
	Sushi rice;
		
		public Seaweed( Sushi rice){
			this.rice = rice;
		}

		@Override
		public String getDescription() {
			// TODO Auto-generated method stub
			return rice.getDescription()+", Seaweed";
		}
	        public double cost(){
	        	return 3 + rice.cost();
	        }
	}