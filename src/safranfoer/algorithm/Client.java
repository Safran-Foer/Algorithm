package safranfoer.algorithm;

import safranfoer.algorithm.simple.SimpleAlgorithm;

public class Client 
{

	public static void main(String[] args) 
	{
		int x = SimpleAlgorithm.clock( 1, 1 );
		System.out.print(x + "\n");
		int y = SimpleAlgorithm.gcd(18, 12);
		System.out.print(y + "\n");
	}

}
