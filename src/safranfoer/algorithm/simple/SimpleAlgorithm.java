package safranfoer.algorithm.simple;

public class SimpleAlgorithm 
{
	// Вычисляет число полных минут до ближайшего момента, в который стрелки совпадут
	public static int clock( int h, int m )
	{
		int t = ( 11 * ( 60 * h + m )	) % 720;
		if ( t != 0 )
		{
			t = 720 - t;
		}
		return t / 11;
	}
	
	// Вычисляет наибольший общий делитель
	public static int gcd( int p, int q )
	{
		if ( q == 0 ) return p;
		int r = p % q;
		return gcd( q, r );
	}
}
