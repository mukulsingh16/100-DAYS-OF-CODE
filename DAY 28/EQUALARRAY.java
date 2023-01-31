class Geeksarray 
{
	public static void main(String args[])
	{
	    int arr1[]={10,20,30,40,50};
	    int arr2[]={10,20,99,40,50};
	    int c2=arr1.length+arr2.length;

	    int arrc1[]=new int[c2];
        
        for(int i=0;i<arr1.length;i++)
        {
             arrc1[i]=arr1[i];
             System.out.print(arrc1[i]+" ");
        }

        for(int i=0;i<arr2.length;i++)
        {
        	arrc1[i+1]=arr2[i];
        	System.out.print(arrc1[i+1]+" ");
        }
        boolean result=false;
        if(arr1.length==arr2.length)
        {
        	for(int i=0;i<arr1.length;i++)
        	{
                if(arr1[i]!=arr2[i])
                {
                	result=true;
        	        
                }
            }
	    }
	    else
	    {
	    	result=false;
	    }

	    if(result==false)
	    {
	    	System.out.println("Both array are equal");
	    }

	    else
	    {
	    	System.out.println("both array are not equal");
	    }
 }
 }
