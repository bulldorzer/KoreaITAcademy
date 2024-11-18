package exam02;

import java.lang.*;
public class Calcurator {
	
	private double Radius; // 반지름
	private double Celsius; // 섭씨
	private double Fahrenheit; // 화씨
	private final double PI = Math.PI;
	
//	getter setter 세팅
	public double getRadius() {
		return Radius;
	}
	public void setRadius(double radius) {
		Radius = radius;
	}
	public double getCelsius() {
		return Celsius;
	}
	public void setCelsius(double celsius) {
		Celsius = celsius;
	}
	public double getFahrenheit() {
		return Fahrenheit;
	}
	public void setFahrenheit(double fahrenheit) {
		Fahrenheit = fahrenheit;
	}
	
	
//	원의 넓이 구하는 기능 - circleArea
//	3.14*반지름*반지름
	public double circleArea(double Radius) {
		return PI*Radius*Radius;
	};
	
//	원의 둘레 구하는 기능 - circleRound
//	2*3.14*반지름
	public double circleRound(double Radius) {
		return PI*2*Radius;
	};
	
//	온도 : 섭씨->화씨 - celsiusToFahrenheit()
//	섭씨 = (화씨-32) /1.8
	public double celsiusToFahrenheit(double Fahrenheit) {
		return (Fahrenheit-32)/1.8;
	};
	
//	온도 : 화씨->섭씨 - fahrenheitTocelsius()
//	화씨 = (섭씨*1.8)+32
	public double fahrenheitTocelsius(double Celsius) {
		return Celsius*1.8+32;
	};
}
