class Demo1{
	public static void main (String args[ ] )
    {
        int n1 = Integer.parseInt(args[0]);
        		int arr[ ] = new int[5];
        arr[0]=15;arr[1]=20;arr[2]=30;arr[3]=40;arr[4]=50;
     int b=0;
    for (int i = 0; i < arr.length; i++) {
    			if (arr[i] == n1) 
    	{
    		System.out.println("BINGO");
			b=1;
		}
		
	}
    if (b==0)
    	System.out.println("Number not found");
    }
}
      
