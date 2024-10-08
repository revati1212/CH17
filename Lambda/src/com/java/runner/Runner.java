package com.java.runner;
import java.util.function.*;

public class Runner {
	
	public static void main(String[] args) {
		Predicate<String> pre = (String string) -> {
			System.out.println(string);
			return true;
		};
		boolean display = pre.test("university");
		System.out.println("Result : " + display);
		System.out.println("--------------");
		
		ObjDoubleConsumer<String> objDouble = (pg, area) -> {
			System.out.println("pg : " + pg);
			System.out.println("area :" + area);
		};
		objDouble.accept("sophomore", 30);
		System.out.println("---------------");
 
		Consumer<Boolean> consumer = b -> {
		    System.out.println("Accept in Functional runner : " + b);
		};
		Function<Consumer<Boolean>, Void> func = new Function<Consumer<Boolean>, Void>() {
            @Override
            public Void apply(Consumer<Boolean> consumer) {
                consumer.accept(true);
                return null;
            }
        };
		func.apply(consumer);  
		System.out.println("---------------");
		
		BiConsumer<String, Integer> biConsumer = (company, number) -> {
			System.out.println("Company:" + company + " , " + "Number :" + number);
		};
		func.display(biConsumer);
		System.out.println("---------------");
	
		Supplier<Boolean> supplier = () -> {
			System.out.println("Supplier invoked");
			return false;
		};
		Boolean ref = supplier.get();
		System.out.println("Supplier: " + ref);
		System.out.println("--------------");
		
		Function<Integer, String> function = (i) -> {
			System.out.println("Received: " + i);
			return String.valueOf(i * 2);
		};
		String ref1 = function.apply(60);
		System.out.println("Result: " + ref1);
		System.out.println("---------------");
		
		BiFunction<Integer, Integer, String> biFun = (i, j) -> {
			System.out.println("Bi Function :" + i + " , " + j);
			return "Updated bill";
		};
		String ref2 = biFun.apply(300, 700);
		System.out.println(ref2);
		System.out.println("---------------");
		
		BiPredicate<Double, Double> biPredicate = (d, e) -> {
			System.out.println(d);
			System.out.println(e);
			return true;
		};
		boolean r = biPredicate.test(4.5, 90.1);
		System.out.println("Same value : " + r);
		System.out.println("---------------");
		
		UnaryOperator<Long> unaryOperation = (mobileNo) -> {
			System.out.println(mobileNo);
			return 1234567890L;
		};
		Long mobile = unaryOperation.apply(1234567890L);
		System.out.println(mobile);
		System.out.println("---------------");
		
		BinaryOperator<Integer> binaryOperator = (a, b) -> {
			System.out.println(a);
			System.out.println(b);
			return a + b;
		};
		int number = binaryOperator.apply(1000, 1500);
		System.out.println(number);
		System.out.println("---------------");
	
		IntConsumer consumer1 = (int value) -> {
			System.out.println("value: " + value);
		};
		func.isConsumer(consumer1);
		System.out.println("---------------");
		
		IntSupplier intSupplier = () -> {
			System.out.println("IntSupplier Method");
			return 75;
		};
		int value = intSupplier.getAsInt();
		System.out.println(value);
		System.out.println("---------------");
		
		IntFunction<String> intFunction = (val) -> {
			System.out.println("IntFunction method");
			String fun = "The new value is: " + val;
			return fun;
		};
		System.out.println(intFunction.apply(15)); 
		System.out.println("---------------");
		
		IntPredicate intPredicate = (int score) -> {
			System.out.println("intPredicate method");
			System.out.println(score);
			return score > 500;
		};
		boolean check = intPredicate.test(850);
		System.out.println(check);
		System.out.println("---------------");
		
		IntUnaryOperator intUnary = (int operand) -> {
			System.out.println("IntUnaryOperator method");
			System.out.println(operand);
			return operand + 1;
		};
		intUnary.applyAsInt(800);
		System.out.println("---------------");
		
		IntBinaryOperator intBinary = (left, right) -> {
			System.out.println("left value :" + left);
			System.out.println("right value :" + right);
			return left + right;
		};
		intBinary.applyAsInt(250, 350);
		System.out.println("---------------");
		
		LongConsumer longConsumer = (accountNo) -> {
			System.out.println("LongConsumer method");
			System.out.println("Account No: " + accountNo);
		};
		longConsumer.accept(12345678901L);
		System.out.println("--------------");
		
		LongSupplier longSupplier = () -> {
			System.out.println("LongSupplier method");
			return 9876543210L;
		};
		longSupplier.getAsLong();
		System.out.println("---------------");
		
		LongFunction<String> longFunction = (population) -> {
			System.out.println("LongFunction method");
			System.out.println("Maharashtra Population :" + population);
			return "Maharashtra";
		};
		longFunction.apply(1234567890L);
		System.out.println("--------------");
		
		LongPredicate longPredicate = (store) -> {
			System.out.println("Long predicate method");
			System.out.println("Stored Data :" + store);
			return true;
		};
		longPredicate.test(123456789L);
		System.out.println("----------------");
		
		LongUnaryOperator longUnaryOperator = (phone) -> {
			System.out.println("PhoneNo: " + phone);
			return phone + 1;
		};
		longUnaryOperator.applyAsLong(9998887777L);
		System.out.println("----------------");
		
		LongBinaryOperator longBinary = (binary, anotherBinary) -> {
			System.out.println(binary);
			System.out.println(anotherBinary);
			return binary + anotherBinary;
		};
		longBinary.applyAsLong(1234567890L, 9876543210L);
		System.out.println("-----------------");
		
		DoubleConsumer doubleConsumer = (price) -> {
			System.out.println("double Consumer method");
		};
		doubleConsumer.accept(2000);
		System.out.println("----------------");
		
		DoubleSupplier doubleSupplier = () -> {
			System.out.println("Double supplier method");
			return 2000.0;
		};
		doubleSupplier.getAsDouble();
		System.out.println("----------------");
		
		DoubleFunction<String> doubleFunction = value5 -> "Double value: " + value5 * 2;
		System.out.println(doubleFunction.apply(20.5));
		System.out.println("---------------");
	
		DoublePredicate doublePredicate = (double cost) -> {
			System.out.println(cost);
			return cost < 150;
		};
		doublePredicate.test(100);
		System.out.println("---------------");
		
		DoubleUnaryOperator doubleUnaryOperator = (operand) -> {
			System.out.println(operand);
			return operand + 50;
		};
		doubleUnaryOperator.applyAsDouble(1000);
		System.out.println("---------------");
		
		DoubleBinaryOperator doubleBinaryOperator = (a, b) -> a + b;
		System.out.println("DoubleBinaryOperator result: " + doubleBinaryOperator.applyAsDouble(3.0, 4.0));
		System.out.println("---------------");
		
		ToIntFunction<String> toIntFunction = str -> str.length();
		System.out.println("ToIntFunction length: " + toIntFunction.applyAsInt("Hello World"));
		System.out.println("---------------");
		
		ToDoubleFunction<String> toDoubleFunction = str -> str.length() * 1.5;
		System.out.println("ToDoubleFunction length: " + toDoubleFunction.applyAsDouble("Hello World"));
		System.out.println("---------------");
		
		ToLongFunction<String> toLongFunction = str -> str.length();
		System.out.println("ToLongFunction length: " + toLongFunction.applyAsLong("Hello World"));
		System.out.println("---------------");
		
		ToIntBiFunction<String, String> toIntBiFunction = (s1, s2) -> (s1 + s2).length();
		System.out.println("ToIntBiFunction combined length: " + toIntBiFunction.applyAsInt("Hello", "World"));
		System.out.println("---------------");
		
		ToDoubleBiFunction<Integer, Integer> toDoubleBiFunction = (a, b) -> (a + b) / 2.0;
		System.out.println("ToDoubleBiFunction average: " + toDoubleBiFunction.applyAsDouble(20, 30));
		System.out.println("---------------");
		
		ToLongBiFunction<Integer, Integer> toLongBiFunction = (a, b) -> a + b;
		System.out.println("ToLongBiFunction sum: " + toLongBiFunction.applyAsLong(30, 40));
		System.out.println("---------------");
		
		ObjIntConsumer<Integer> objInt = (size, quantity) -> {
			System.out.println("ObjIntConsumer method");
			System.out.println(size);
			System.out.println(quantity);
		};
	}}
