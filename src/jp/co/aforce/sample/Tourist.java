package jp.co.aforce.sample;

public class Tourist {
	private String city;
	private int domestic;
	private int foreign;

//	JAVADog
	
	
	/**
	 * 
	 * @param city 都市名
	 * @param domestic 国内の観光者数
	 * @param foreign 外国人の観光者数
	 */
	public Tourist(String city, int domestic, int foreign) {
		this.city = city;
		this.domestic = domestic;
		this.foreign = foreign;

	}
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getDomestic() {
		return domestic;
	}

	public void setDomestic(int domestic) {
		this.domestic = domestic;
	}

	public int getForeign() {
		return foreign;
	}

	public void setForeign(int foreign) {
		this.foreign = foreign;
	}

	public double calc() {
	return (double)this.getForeign()/((double)this.getDomestic()+(double)this.getForeign());
	}
}
