	// WAP to input electricity unit charges and calculate total electricity bill according to the given condition:
	//For first 50 units Rs. 0.50/unit
	//For next 100 units Rs. 0.75/unit
	//For next 100 units Rs. 1.20/unit
	//For unit above 250 Rs. 1.50/unit
	//An additional surcharge of 20% is added to the bill

	class Test
	{
	   public static void main(String args[])
	   {
	      int totalunits=300;

	      if(totalunits<=50)
	      {
	          float a=(totalunits*0.5f);
	         System.out.println("total electricity bill="+a);
	      }

	      else if(totalunits>50 && totalunits<=150)
	      {
	      	 totalunits=totalunits-50;
	      	 float b=(50*(0.5f))+(totalunits*0.75f);
             System.out.println("total electricity bill="+b);

	      }

	      else if(totalunits>150 && totalunits<=250)
	      {
	      	 totalunits=totalunits-150;
	      	 float c=(50*(0.5f))+(100*(0.75f))+(totalunits*1.20f);
	      	 System.out.println("total electricity bill="+c);
	      }

	      else
	      {
	      	 totalunits=totalunits-250;
	      	 float d=(50*(0.5f))+(100*(0.75f))+(100*(1.20f))+(totalunits*1.50f);
             System.out.println("total electricity bill="+d);
	      }
	   }
	}
