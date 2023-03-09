package com.adi.se;

class Demo{  
	
	static void add(int ...arr){ 
		int sum=0;
		for(int a:arr) {
			sum += a;
		}
		System.out.println("Sum = "+sum);
	
	}
	
	static void add(int[] x,int ...arr){ 
		
		int anon=0;
		for(int b:x) {
			anon += b;
		}
		System.out.println("Anonymous Sum = "+anon);
		
		int sum=0;
		for(int a:arr) {
			sum += a;
		}
		System.out.println("Sum = "+sum);
	
	}
	
	static void min(int arr[]){  
	int min=arr[0];  
	for(int i=1;i<arr.length;i++)  
	 if(min>arr[i])  
	  min=arr[i];  
	  
	System.out.println(min);  
	}  
	  
	public static void main(String args[]){  
	int a[]={33,3,2,5};
	
	min(a); 
	add(2,3,456,6);
	add(new int[] {1,2,4,5},2,3,5,6);
	
	
	}
	}  