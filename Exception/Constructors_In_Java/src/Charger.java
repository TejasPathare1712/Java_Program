
public class Charger {
				String type;
				String company;
				float price;
				
	public String getType() {
					return type;
				}

				public void setType(String type) {
					this.type = type;
				}

				public String getCompany() {
					return company;
				}

				public void setCompany(String company) {
					this.company = company;
				}

				public float getPrice() {
					return price;
				}

				public void setPrice(float price) {
					this.price = price;
				}
				Charger(){
					System.out.println("Constructor called");
				}
				Charger(String type,String company,float price){
					this.type=type;
					this.company=company;
					this.price=price;
					System.out.println("Charger Type = "+type +" Charger Company = "+company+"Charger Price = "+price);
					
				}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Charger c1 = new Charger();
				Charger c2 = new Charger("C","Vivo",200.5f);
	}

}
