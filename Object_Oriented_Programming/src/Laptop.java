
public class Laptop {
		int Id;
		String company;
		String configu;
		float price;
		

	public int getId() {
			return Id;
		}


		public void setId(int id) {
			Id = id;
		}


		public String getCompany() {
			return company;
		}


		public void setCompany(String company) {
			this.company = company;
		}


		public String getConfigu() {
			return configu;
		}


		public void setConfigu(String configu) {
			this.configu = configu;
		}


		public float getPrice() {
			return price;
		}


		public void setPrice(float price) {
			this.price = price;
		}
		


	public Laptop(int id, String company, String configu, float price) {
			super();
			Id = id;
			this.company = company;
			this.configu = configu;
			this.price = price;
		}
	


	@Override
	public String toString() {
		return "Laptop [Id=" + Id + ", company=" + company + ", configu=" + configu + ", price=" + price + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Laptop l1 = new Laptop(1,"vivo","123",500.5f);
			System.out.println(l1);
			}

}
