class Demo{
	public static void main(String[] args) {

		int mArr[]={4,5,6,6,34, 34, 45};

		for(int i=0;i<mArr.length;i++){
			boolean equal = true;
			
			for(int j=i+1;j<mArr.length;j++){

				if(mArr[i]==mArr[j]){
				   equal = false;
				   
			    } 
			}
			  if(equal==true)
				System.out.println(mArr[i]); 	
		}
	}
}
