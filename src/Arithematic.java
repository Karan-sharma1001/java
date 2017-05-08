
public abstract class Arithematic {
	
	
				public int addition( int firstNo, int secondNo ) //– method to return addition of two integer numbers
				{
			return (firstNo+secondNo);
				}
			public int addition( int firstNo, int secondNo, int thridNo )// – method to return addition of three integer numbers
			{
				return (firstNo+secondNo+thridNo);
			}
			public double addition( double firstNo, double secondNo )// – method to return addition of two double numbers
			{
				return (firstNo+secondNo);
			}
			public double addition( int firstNo, double secondNo )// – method to return addition of an integer and double number
				{
				return (firstNo+secondNo);
			}
			public float addition( float firstNo, float secondNo, float thirdNo ) //– method to return addition of three float numbers
			{
				return (firstNo+secondNo+thirdNo);
			}

			public abstract int subtraction( int firstNo, int secondNo );// – method to return subtraction of two integer numbers

					public abstract int subtraction( int firstNo, int secondNo, int thridNo );// – method to return subtraction of three integer numbers

					public abstract double subtraction( double firstNo, double secondNo ) ;//– method to return subtraction of two double numbers

					public abstract double subtraction( int firstNo, double secondNo ); //– method to return subtraction of an integer and double number

					public abstract float subtraction( float firstNo, float secondNo, float thirdNo );// – method to return subtraction of three float numbers



}
