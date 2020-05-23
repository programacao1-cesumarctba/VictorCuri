package conversor;

public class Metro extends ConversorUnidade{
	
//	public float mt_cm() {
//		float x = getNum1() * 100;
//		return x;
//	}

	@Override
	public float conversorUnidade() {
		float x = getNum1() * 100;
		return x;
	}

}
