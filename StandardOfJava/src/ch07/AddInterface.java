package ch07;

public interface AddInterface {
	default int add(int a, int b){
		return a+b;
	}
}
