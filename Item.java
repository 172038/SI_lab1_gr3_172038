class Item {
	int id;
	String name;
	double price;

	
	//TODO add variable.
	char tax;

	//TODO constructor
	public Item(int id, String name, double price, char tax) {
			this.id = id;
			this.name = name;
			this.price = price;
			this.tax = tax;
		}

	//TODO setters and getters
	public void setName(String name) {
			this.name = name;
		}

	public void setId(int id) {
			this.id = id;
		}

	public void setPrice(double price) {
			this.price = price;
		}
	public void setTax(char tax) {
		this.tax = tax;
	}
	public double getId() {
			return id;
		}

	public double getName() {
			return name;
		}

	public String getPrice() {
			return price;
		}
	public char getTax() {
		return tax;
	}

	double taxReturn () {
		//TODO
		double rt;
		switch(tax) {
			case 'A':
				rt = price * 0.18 * 0.15;
				break;
			case 'B':
				rt = price * 0.5 * 0.15;
				break;
			case 'C':
				rt = 0;
				break;
		}
		return rt;
	}
}
