package Stragedy;

public class StrategyPatternDemo {
	public static void main(String[] args) {
		
		int a = 12;
		int b = 5;
		
		Context context = new Context(new OperationAdd());
		System.out.println(a + "+" + b + "= " + context.executeStrategy(a, b));
		context = new Context(new OperationSubstract());
		System.out.println(a + "-" + b + "= " + context.executeStrategy(a, b));
		context = new Context(new OperationMultiply());
		System.out.println(a + "*" + b + "= " + context.executeStrategy(a, b));
	}
}
