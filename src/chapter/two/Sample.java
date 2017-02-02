class Factorial {
	public static void main(String[] args){
		System.out.println(new Fac().computeFac(10));
	}
}

class Fac {
	public int computeFac(int num){
		int num_aux;
		if(num < 1)
			num_aux = 1;
		else
			num_aux = num * (this.computeFac(num-1));
		return num_aux;
	}
}
