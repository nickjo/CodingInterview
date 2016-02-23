package ch14;

@FunctionalInterface // 함수형 인터페이스 어노테이션
public interface MyFunction {
	public abstract int max(int a, int b);
	//public abstract double min(double a, double b);
}
