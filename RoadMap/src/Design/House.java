package Design;


public class House {
	    
	 private String foundation;
	 private String structure;

	    
	 private boolean hasGarage;
	 private boolean hasSwimmingPool;
	 private boolean hasGarden;

	 private House(HouseBuilder builder) {
	      this.foundation = builder.foundation;
	      this.structure = builder.structure;
	      this.hasGarage = builder.hasGarage;
	      this.hasSwimmingPool = builder.hasSwimmingPool;
	      this.hasGarden = builder.hasGarden;
	    }

	    
	    public String toString() {
	        return "House with foundation: " + foundation + ", structure: " + structure +
	                ", Garage: " + (hasGarage ? "Yes" : "No") +
	                ", Swimming Pool: " + (hasSwimmingPool ? "Yes" : "No") +
	                ", Garden: " + (hasGarden ? "Yes" : "No");
	    }

	    // Static nested Builder class
	    public static class HouseBuilder {
	        private String foundation;
	        private String structure;

	        private boolean hasGarage = false;
	        private boolean hasSwimmingPool = false;
	        private boolean hasGarden = false;

	        public HouseBuilder(String foundation, String structure) {
	            this.foundation = foundation;
	            this.structure = structure;
	        }

	        public HouseBuilder setGarage(boolean hasGarage) {
	            this.hasGarage = hasGarage;
	            return this;
	        }

	        public HouseBuilder setSwimmingPool(boolean hasSwimmingPool) {
	            this.hasSwimmingPool = hasSwimmingPool;
	            return this;
	        }

	        public HouseBuilder setGarden(boolean hasGarden) {
	            this.hasGarden = hasGarden;
	            return this;
	        }

	        // Build method to create the final House object
	        public House build() {
	            return new House(this);
	        }
	    }
	}


	// Client code
class Mains {
	    public static void main(String[] args) {
	        // Using the builder to create a complex object
	        House house = new House.HouseBuilder("Concrete", "Wood")
	                .setGarage(true)
	                .setSwimmingPool(true)
	                .build();

	        System.out.println(house);
	    }
	}

