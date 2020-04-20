class minuman {
	String nama="susu";
	
	String getNama() {
		return nama;
	}
}

class manis extends minuman{
	public static void main(String[] args) {
		manis m = new manis();
		System.out.println(m.getNama());
	}

}
