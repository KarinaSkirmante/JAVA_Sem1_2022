package service;

import java.util.Arrays;
import java.util.Random;

/**
 * Semināra Nr.1 uzdevumi, lai praktizētu JAVA
 * 
 * @author Karina Skirmante
 */

public class Excercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * skfjsdkljflksdjflskdjf ksjfksdjfklsd fdlfksdlfk;lsdkf;
		 */
		System.out.println("Sveiki!");
		float cena = 9.9976f;
		System.out.printf("Cena ir %.2f. Apsveicu!\n", cena);

		String[] names = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John", "James",
				"Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate" };// 16
		int[] times = { 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265 };// 15

		if (names.length == times.length) {
			for (int i = 0; i < names.length; i++) {
				System.out.println("[" + names[i] + ", " + times[i] + "]");
			}
		} else {
			System.out.println("Abi masīvi nav vienāi, līdz ar to dati var būt kļūdaini sasasitīti");
		}

		/*
		 * for(String temp : names) { System.out.println(temp); }
		 * 
		 * System.out.println(Arrays.toString(names));
		 */

		double result = positionCalc(9.81, 10, 100, 30);
		System.out.println("Bumbiņas pozīcija būs:" + result + "");
		
	}

	/**
	 * Funkcija, kas apreķina bumbiņas atrašanāš vietu
	 * 
	 * @param gravity
	 * @param initialVelocity
	 * @param initialPosition
	 * @param fallingTime
	 * @return double pozīciju
	 */
	public static double positionCalc(double gravity, double initialVelocity, double initialPosition,
			double fallingTime) {
		// x(t) = 0.5 × a*t^2 + v_0*t + x_0
		// double result = 0.5*gravity*Math.pow(fallingTime,
		// 2)+initialVelocity*fallingTime+initialPosition;
		return (0.5 * gravity * Math.pow(fallingTime, 2) + initialVelocity * fallingTime + initialPosition);
	}

	/**
	 * Aprēķina faktorialu ar for ciklu
	 * 
	 * @param N
	 * @return int apreķinātais faktoriāls
	 */

	public static int factorialForLoop(int N) {
		if (N >= 1) {
			int result = 1;
			for (int i = 1; i <= N; i++) // 1, 2, 3, 4, 5, 6, ... N
			{
				result = result * i;
			}

			return result;
		}

		return 0;

	}

	/**
	 * Aprēķina faktoriāli ar rekursiju
	 * 
	 * @param N
	 * @return int apreķinātais faktoriāls
	 */
	public static int factorialRecursive(int N) // 6!->6*5*4*3*2*1
	{
		if (N >= 1) {
			if (N > 1) {
				int result = N * factorialRecursive(N - 1); // 1.izsaukumā 6 * 5! 2. izsaukums 6 * 5 *4!
				return result;
			} else {
				return 1;
			}
		} else {
			return 0;
		}

	}

	/**
	 * Funkcija izveido 1D masīvu ar generētiem skaitļiem
	 * 
	 * @param N
	 * @param lower
	 * @param upper
	 * @return double tipa masīvs ar generetajiem skaitļiem
	 */
	public static double[] generateArray(int N, double lower, double upper) {
		
		if (N > 0) {
			Random rand = new Random();
			double[] result = new double[N];
			for (int i = 0; i < result.length; i++) {
				double genTemp = 0;
				//pārbaudīt vai lower ir mazak par upper
				if(lower<upper)
				{   // low-upp
					// [3 - 5) [10 - 33)
					// [0 - 1)*(5-3=2)->[0 - 2) +3 ->[3 - 5)
				 genTemp = rand.nextDouble()*(upper-lower)+lower;
				}
				else
				{
					genTemp = rand.nextDouble()*(lower-upper)+upper;
				}
				
				result[i] = genTemp;
			}

			return result;
		}

		return null;

	}

	/**
	 * APrēķina vidējo vērtību double 1D masīvā
	 * @param array
	 * @return double vidējo vērtību
	 */
	public static double getMean(double[] array) 
	{
		if(array!=null)
		{
			double sum = 0;
			/*for (int i = 0; i < array.length; i++) {
				sum = sum +array[i];
				//sum +=array[i];
			}*/
			
			for (double temp : array) {
				sum+=temp;
			}
			
			return (sum/array.length);
		}
		return 0;
	}

	/**
	 * Nsoakidro minimāļo vērtību double 1D masīvā
	 * @param array
	 * @return minimālo double vērtību
	 */
	public static double getMin(double[] array) //3 5 2 8 1 
	{
		if(array!=null)
		{
			double min = Double.MAX_VALUE; //100000000
			for (int i = 0; i < array.length; i++) {
				if(min > array[i])
				{
					min = array[i];
				}
			}
			return min;
		}
		return 0;
	}
	
	/**
	 * Nsoakidro maksimālo vērtību double 1D masīvā
	 * @param array
	 * @return maksimālo double vērtību
	 */
	public static double getMax(double[] array) //3 5 2 8 1 
	{
		if(array!=null)
		{
			double max = Double.MIN_VALUE; //-100000000
			for (int i = 0; i < array.length; i++) {
				if(max < array[i])
				{
					max = array[i];
				}
			}
			return max;
		}
		return 0;
	}
	
	/**
	 * Buble sort kāŗtošana
	 * @param array
	 * @return sakāŗtotais double 1D masīvs
	 */
	public static double[] arraySort(double[] array)
	{
		
		
		if(array!=null)
		{
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array.length; j++) {
					if(array[i] > array[j])
					{
						double temp = array[i];
						array[i] = array[j];
						array[j] = temp;
					}
				}
			}
			return array;
		}
		return null;
	}

	/**
	 * Uzgenerē 2D  double masīvu
	 * @param N
	 * @return generetasi 2D double masīvs
	 */
	public static double[][] generateMatrix(int N)
	{
		if(N>0)
		{
			double[][] result = new double[N][N];
			Random rand = new Random();
			for (int i = 0; i < result.length; i++) {
				for (int j = 0; j < result.length; j++) {
					result[i][j] = rand.nextDouble()*99 + 1;
				}
			}
						
			return result;
		}
		return (new double[0][0]);
	}
	
	/**
	 * Matricas reizinajums
	 * @param matrix
	 * @param i
	 * @param j
	 * @return reizinājums double
	 */
	public static double getProduct(double[][] matrix, int i, int j)
	{
		if(matrix!=null && i>=0 && j >= 0)
		{
			if(i < matrix.length && j < matrix[0].length)
			{
				double result = 0;
				for (int j2 = 0; j2 < matrix.length; j2++) {
					for (int k = 0; k < matrix.length; k++) {
						result+=matrix[i][j2]*matrix[k][j];
					}
				}
				return result;
			}
		}
		return 0;
	}
	
	/**
	 * generē monetas mešanu
	 * @param N
	 * @return masīvu ar 3 šūnām. 1-cik reizes gerbonis, 2 - ck reizes skaitlis, 3 - attieciba
	 */
	public static double[] coinFlip(int N)
	{
	//1. pārbaudam, vai N ir atbilstošs
		if(N>0)
		{
	//2. Izveidojam 3 šūnu result masīvu
			double[] result = new double[3];
	//3. izveidojam for ciklu, kas darbosies N reizes
			Random rand = new Random();
			for (int i = 0; i < N; i++) {
				int genTemp = rand.nextInt(2);//0 vai 1
				/*if(genTemp==0)
				{
					result[0] = result[0] + 1;
				}
				else
				{
					result[1] = result[1] + 1;
				}*/
				//result[genTemp] = result[genTemp] +1;
				result[genTemp]++;
			}
			result[2] = result[0]/result[1];
			return result;
	//4. Katra cikla iterācijā generejam ar random 0/1 vau arī true/false (kā velāmies)
	//5. Uzgenereto rezultātu glabājam result masīvā sekojoši:
	//5.1.element at index 0 - number of heads
	//5.2.element at index 1 - number of tails
	//5.3.element at index 2 - ratio: nheads/ntails
	//6. atgriest result masīvu
		}
		return new double[0];
	}
	//komentars
	public static int[] rollDice(int N)
	{
		if(N>0)
		{
			int[] result = new int[6];
			Random rand =  new Random();
			for (int i = 0; i < N; i++) {
				int genTemp = rand.nextInt(6);
				result[genTemp]++;
			}
			
			return result;
		}
		return new int[0];
	}

	/**
	 * Uztaisīt 6.uzdevumu
	 */
	//TODO 6. un 7. uzdevums

	
	
	
	
}
