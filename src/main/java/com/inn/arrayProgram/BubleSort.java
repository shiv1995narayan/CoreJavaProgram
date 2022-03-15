package com.inn.arrayProgram;

public class BubleSort {
	public static void bubleSort(int []arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
			
	}
	
	private void selectionSort(int[] arr) {
	  	for(int i=0;i<arr.length;i++) {
	  		int min=i;
	  		
	  		for(int j=i+1;j<arr.length-1;j++) {
	  			if(arr[j]<arr[min]) {
	  			  min=arr[j]; 	
	  			}
	  		}
	  		int temp=arr[min];
	  		arr[min]=arr[i];
	  		arr[i]=temp;
	  	}
	}
	

private void margeSort(int[] arr,int l,int h) {
	int mid=l+h/2;
	while(l<h) {
		
	}
	
}
	public static void display(int []arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
  public static void main(String[] args) {
	int arr[]= {1,1,0,0,1,1,0,0};
	BubleSort bs=new BubleSort();
	System.out.println("Buble sort :");
	bs.bubleSort(arr);
	bs.display(arr);
	System.out.println("----------------");
	System.out.println("selection sort:");
	bs.selectionSort(arr);
	bs.display(arr);
	System.out.println("----------------");
	System.out.println("Marge sort:");
	bs.margeSort(arr,0,arr.length-1);
	bs.display(arr);
}


}
