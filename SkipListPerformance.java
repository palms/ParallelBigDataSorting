/*
 *  Part 1. Implement the randomized Skip List data structure and analyze its performance.
 *  In particular, we proved probabilistic bounds on the height of the structure
 *  and the number of "skip forward" moves needed. Design experiments to analyze
 *  how closely your structure meets the theoretical performance.  
 */
import java.util.Random;

public class SkipListPerformance {

	public static void main(String []args) {

		int maxLevels = 100;
		Random rng = new Random(System.currentTimeMillis());


		//Height Test 1
		SkipList<Integer> h1 = new SkipList<Integer>(maxLevels);

		for (int i = 0; i < 999; i++) {
			h1.insert(rng.nextInt(101));
		}

		System.out.println("Height test 1: insert 1000 random elements between 1 - 100" +
				"\nHEIGHT = " + h1.height);

		System.out.println("Theoretical average height = " + (double)Math.round(Math.log(102)/Math.log(2)));
		System.out.println("Theoretical worst-case height = " + 1000);
		System.out.println("# of skips = " + h1.skips);
		System.out.println("# average skips = " + (h1.height*2*500));
		//System.out.println("# of drops = " + h1.drops);



		//Height Test 2
		SkipList<Integer> h2 = new SkipList<Integer>(maxLevels);

		for (int i = 0; i < 999; i++) {
			h2.insert(i);
		}
		System.out.println("\nHeight test 2: insert 1 - 1000"
				+ "\nHEIGHT = " + h2.height);

		System.out.println("Theoretical average height = " + (double)Math.round(Math.log(1000)/Math.log(2)));
		System.out.println("Theoretical worst-case height = " + 1000);
		System.out.println("# of skips = " + h2.skips);
		System.out.println("# average skips = " + (h2.height*2*1000));
		//System.out.println("# of drops = " + h2.drops);


		//Height Test 3
		SkipList<Integer> h3 = new SkipList<Integer>(maxLevels);

		for (int i = 0; i < 999; i++) {
			if (i % 2 == 0) {
				h3.insert(i);
			}
			else {
				h3.insert(53);
			}
		}
		System.out.println("\nHeight test 3: insert 1 - 1000, every even number is"
				+ " identical" + "\nHEIGHT = " + h3.height);

		System.out.println("Theoretical average height = " + (double)Math.round(Math.log(501)/Math.log(2)));
		System.out.println("Theoretical worst-case height = " + 1000);
		System.out.println("# of skips = " + h3.skips);
		System.out.println("# average skips = " + (h3.height*2*501));
		//System.out.println("# of drops = " + h3.drops);


		//Height Test 4
		SkipList<Integer> h4 = new SkipList<Integer>(maxLevels);

		for (int i = 0; i < 999999; i++) {
			h4.insert(rng.nextInt(1000001));	
		}
		System.out.println("\nHeight test 4: insert 1 - 1,000,000 random numbers"
				+ "\nHEIGHT = " + h4.height);

		System.out.println("Theoretical average height = " + (double)Math.round(Math.log(632270)/Math.log(2)));
		System.out.println("Theoretical worst-case height = " + 1000000);
		System.out.println("# of skips = " + h4.skips);
		System.out.println("# average skips = " + (h4.height*2*1000000));
		//System.out.println("# of drops = " + h4.drops);


		//Height Test 5
		SkipList<Integer> h5 = new SkipList<Integer>(maxLevels);

		for (int i = 0; i < 999999; i++) {
			h5.insert(i);
		}
		System.out.println("\nHeight test 5: insert 1 - 1,000,000\nHEIGHT = " + h5.height);

		System.out.println("Theoretical average height = " + (double)Math.round(Math.log(1000000)/Math.log(2)));
		System.out.println("Theoretical worst-case height = " + 1000000);
		System.out.println("# of skips = " + h5.skips);
		System.out.println("# average skips = " + (h5.height*2*1000000));
		//System.out.println("# of drops = " + h5.drops);


	}

}
