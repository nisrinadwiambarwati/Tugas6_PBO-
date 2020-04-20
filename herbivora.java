class hewan {
	int umur=40;
	
	int getUmur() {
		return umur;
	}
}

class  herbivora extends hewan{
	public static void main(String[] args) {
		herbivora h = new herbivora();
		System.out.println(h.getUmur());
	}

}

