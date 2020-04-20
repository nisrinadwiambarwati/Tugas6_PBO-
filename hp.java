//superClass
class alatkomunikasi {
	String warna;
	
	// method untuk mengembalikan nilai variable warna
	String getWarna() {
		return warna;
	}
}

//subClass
class hp extends alatkomunikasi{
	public static void main(String[] args) {
		hp b = new hp();
		b.setWarna("biru");
		System.out.println(b.getWarna());
	}
	//method untuk set variabel warna
	void setWarna(String warna) {
		this.warna=warna;
	}
}
