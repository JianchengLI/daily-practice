package perso.daily.jse.lambdas;

public class StaticOuter {
	private static int x = 24;

	static class StaticInner {
		public void printSomething() {
			System.out.println("The value of x in my outer is " + x);
		}
	}
}
