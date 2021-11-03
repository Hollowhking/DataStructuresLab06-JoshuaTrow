public class Lab06 {
	public static int callCount=0;
	// YOUR CODE GOES HERE

	/* Towers of Hanoi */
	public static String move1(int source, int dest) {
		return "Move top ring from peg " + source + " to peg " + dest + ".\n";
	}

	public static void main(String[] args) {
		System.out.println("Fibonacci:");
		int n = 15;

		resetCallCount();
		int recursiveResult = fibonacciRec(n);
		int recursiveCalls = getCallCount();
		System.out.printf("Recursive result: %d (%d recursive calls)\n", recursiveResult, recursiveCalls);

		resetCallCount();
		int iterativeResult = fibonacciIter(n);
		int iterations = getCallCount();
		System.out.printf("Iterative result: %d (%d iterations)\n", iterativeResult, iterations);
		//p2:

		System.out.println("Towers of Hanoi:");
		String solution = solveHanoi(1, 3, 2, 3);
		System.out.print(solution);
	}

	private static String solveHanoi(int start, int end, int temp, int numrings) {
		String hanoi = "";
		if (numrings==1) {
			return move1(start,end);
		}
		hanoi+=solveHanoi(start,temp,end,numrings-1);
		hanoi+= move1(start,end);
		hanoi+=solveHanoi(temp,end,start,numrings-1);
		return hanoi;
	}

	private static int fibonacciIter(int n) {
		int prepre, pre = 0, curr = 1;
		for (int i = 1; i<n; i++) {
			prepre = pre;
			pre = curr;
			curr = prepre+pre;
			callCount+=1;
		}
		return curr;
	}

	private static int getCallCount() {
		return callCount;
	}

	private static int fibonacciRec(int n) {
	    callCount++;
	    if (n <= 1) {
	       return n;
	    }
	    return fibonacciRec(n-1) + fibonacciRec(n-2);
	}

	private static void resetCallCount() {
		callCount=0;
	}
}
