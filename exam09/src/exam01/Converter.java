package exam01;

public interface Converter<F, T> {
	// F - from : 매개변수
	// T - to : 반환형
	T convert(F from);
}
