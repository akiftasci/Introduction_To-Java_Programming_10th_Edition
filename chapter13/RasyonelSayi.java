package chapter13;

public class RasyonelSayi extends Number implements Comparable<RasyonelSayi> {

	private long pay;
	private long payda;

	public RasyonelSayi(long pay, long payda) {
		long obeb = obeb(pay, payda);
		int isaret = pay * payda >= 0 ? 1 : -1;
		this.pay = Math.abs(pay) / obeb * isaret;
		this.payda = Math.abs(payda) / obeb;
	}

	private static long obeb(long pay, long payda) {
		long n1 = Math.abs(pay);
		long n2 = Math.abs(payda);
		int obeb = 1;

		for (int k = 1; k <= n1 && k <= n2; k++) {
			if (n1 % k == 0 && n2 % k == 0)
				obeb = k;
		}
		return obeb;
	}

	public RasyonelSayi ekle(RasyonelSayi ikinciRasyonelSayi) {
		long pay = this.pay * ikinciRasyonelSayi.payda 
				+ this.payda * ikinciRasyonelSayi.pay;
		long payda = this.payda * ikinciRasyonelSayi.payda;
		return new RasyonelSayi(pay, payda);
	}

	public RasyonelSayi cikart(RasyonelSayi ikinciRasyonelSayi) {
		long pay = this.pay * ikinciRasyonelSayi.payda 
				- this.payda * ikinciRasyonelSayi.pay;
		long payda = this.payda * ikinciRasyonelSayi.payda;
		return new RasyonelSayi(pay, payda);
	}

	public RasyonelSayi carp(RasyonelSayi ikinciRasyonelSayi) {
		long pay = this.pay * ikinciRasyonelSayi.pay;
		long payda = this.payda * ikinciRasyonelSayi.payda;
		return new RasyonelSayi(pay, payda);
	}

	public RasyonelSayi bol(RasyonelSayi ikinciRasyonelSayi) {
		long pay = this.pay * ikinciRasyonelSayi.payda;
		long payda = this.payda * ikinciRasyonelSayi.pay;
		return new RasyonelSayi(pay, payda);
	}

	@Override
	public int intValue() {
		return (int)doubleValue();
	}

	@Override
	public long longValue() {
		return (long)doubleValue();
	}

	@Override
	public float floatValue() {
		return (float)doubleValue();
	}

	@Override
	public double doubleValue() {
		return (double)pay / payda;
	}

	@Override
	public int compareTo(RasyonelSayi o) {
		if (this.cikart(o).pay > 0)
		      return 1;
		    else if (this.cikart(o).pay < 0)
		      return -1;
		    else
		      return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof RasyonelSayi))
			return false;
		if ((this.cikart((RasyonelSayi)(obj))).pay == 0)
		      return true;
		return false;
	}

	@Override
	public String toString() {
		if (payda == 1)
			return pay + "";
		else
			return pay + "/" + payda;
	}

	public long getPay() {
		return pay;
	}

	public long getPayda() {
		return payda;
	}

}
