package exception01;
class Animal{};
class Dog extends Animal{};
class Cat extends Animal{};

public class _05_ClassCastException {
	public static void main(String[] args) {
		try {
		Dog dog = new Dog();
		Animal  ani = dog;
		Dog dog1 = (Dog)ani;
		System.out.println("Dog 타입으로 변경");
		
		Animal ani2 = new Animal();
		Cat cat = (Cat)ani2;
		System.out.println("Cat 타입으로 변경");
		
		}catch(ClassCastException e) {
			System.out.println("클래스 타입 변경 불가");
		}
		
//		Exception in thread "main" java.lang.ClassCastException: class exception01.Animal cannot be cast to class exception01.Cat (exception01.Animal and exception01.Cat are in unnamed module of loader 'app')
//		at exception01._05_ClassCastException.main(_05_ClassCastException.java:13)

	}


}
