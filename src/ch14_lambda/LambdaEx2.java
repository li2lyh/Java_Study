package ch14_lambda;

@FunctionalInterface
interface MyFunction2 {
	void run(); // public abstract void run();
}

class LambdaEx1 {
	public static void main(String[] args) {
		MyFunction f = () -> {};
		Object obj = (MyFunction2)(()->{});
		String str = ((Object)(MyFunction2)(()->{})).toString();
		
		System.out.println(f);
		System.out.println(obj);
		System.out.println(str);		
		
//		System.out.println((()->{})); //람다식은 Object타입으로 형변환X
		System.out.println((MyFunction2)(()->{}));
//		System.out.println((MyFunction2)(()->{})).toString());
		System.out.println(((Object)(MyFunction2)(()->{})).toString());

	}
}
