public class WaterGlass{
	boolean isFull;
	int water_level;
	final int max_level= 10;
	WaterGlass()
	{
		isFull = false;
		water_level = 0;
	}
	// this is the class invariant. This always returns true
	public boolean invariant()
	{
		
		return ( (this.isFull == true && water_level==max_level)|| ( this.isFull == false && water_level<max_level));
				 
	}
	//this is the method pourWater
	public void pourWater()
	{
			// Pre Condition. we check that the glass is not full before going into the method.
			// If the glass is full, we print the message and stop the function execution.
			assert !this.isFull : "Glass is already full. cant fill in more water";
	
			int prev_level = this.water_level;
			this.water_level= this.water_level+1;
			if(this.water_level == max_level)
			{
				isFull=true;
			}
			System.out.println("the water level is " + this.water_level);
			
			// Post Condition. we check that whenever the pre condition is met, 
			// the new water level is always greater than the original water level
			
			assert this.water_level>prev_level;
	}
	public static void main(String[] args)
	{
		WaterGlass myGlass=new WaterGlass();
		
		for(int i=0;i<=10;i++)
		{
			myGlass.pourWater();
			System.out.println("invariant is " + myGlass.invariant());
		}
	}
}
