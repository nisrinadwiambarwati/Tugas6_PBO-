class mamalia {
	int umur=50;
	
	int getUmur() {
		return umur;	
	}
}

class paus extends mamalia {
	
	int getUmur() {
		return 55;	
	}

	public static void main(String[] args){
		paus p = new paus();
		System.out.println(p.getUmur());	
	}
	

}
