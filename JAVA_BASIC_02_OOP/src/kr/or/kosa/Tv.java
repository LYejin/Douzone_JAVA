package kr.or.kosa;
/*
 Tv 설계도 요구사항정의
 Tv는 채널 정보를 가지고 있다. (예를 들면 1~200 값을 가질 수 있다) public
 Tv는 브랜드 이름을 가지고 있다. (예를 들면 엘지, 삼성) public
 Tv는 채널 전환 기능을 가지고 있다. (채널은 한 채널씩 이동이 가능하다)
 -> 채널을 증가 시키는 기능을 가지고 있다
 -> 채널을 감소 시키는 기능을 가지고 있다
 Tv는 채널 정보와 브랜드 이름을 볼 수 (출력) 있는 기능을 가지고 있다
 */
public class Tv {
	public int channel;
	public String brand;
	
	public void setChannel(int i) {
		channel = i;
	}
	
	public void setBrand(String str) {
		brand = str;
	}
	
	public int channelMovePlus() {
		return channel++;
	}
	
	public int channelMoveMinus() {
		return channel--;
	}
	
	public void print() {
		System.out.printf("채널 정보 : %d, 브랜드 이름 : %s \n", channel, brand);
	}
	
}
