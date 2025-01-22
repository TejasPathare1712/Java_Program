
public class Cup {
		String type;
		int size;
		Cup(){
			this("glass",22);
		}
		
	public Cup(String type, int size) {
			super();
			this.type = type;
			this.size = size;
		}
	


	@Override
	public String toString() {
		return "Cup [type=" + type + ", size=" + size + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cup c1 = new Cup();
		System.out.println(c1);
	}

}
