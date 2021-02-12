class TV {

	public void tv(){

		System.out.println("TV");
	}

	public void ON(){
		System.out.println("ON...");
	}
}
class SmartTv extends TV {

	public void tv(){
		
		System.out.println("smart tv");
	}

	public void ON(){
		System.out.println("smart ON");
	}

	public void YouTube(){

		System.out.println("YouTube.....");
	}


	public static void main(String[]args) {

		TV t = new SmartTv();
		t.tv();//t having reference TV but value will be based on Object thats why child class object printed.
		t.ON();
		//t.YouTube();//[t.YouTube is not access Because of You are access using TV reference
			    //[And TV class does not contain YouTube]YouTube features having SmartTv not TV
	}
}

