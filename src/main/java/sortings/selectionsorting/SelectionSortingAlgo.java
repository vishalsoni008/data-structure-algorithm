package sortings.selectionsorting;

/*first element scan rest of the unsorted array
and swap with min element which is present in unsorted array
and then move to next index*/

public class SelectionSortingAlgo {
	
	public void sort(int[] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			
			//now find minimum element in un-sorted array
			int minUnsorted = i;
			for(int j=i+1;j<arr.length;j++) {
				
				//check if element is small 
				if(arr[j]<arr[minUnsorted]) {
					// set unsorted to j element
					minUnsorted = j;
					
					//swap number with first to minimum
					int temp = arr[i];
					arr[i] = arr[minUnsorted];
					arr[minUnsorted] = temp;
				}
			}
		}
	}
	
	public void print(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		int arr[] = new int[] {1,33,12,6,58};
		
		SelectionSortingAlgo algo= new SelectionSortingAlgo();
		algo.sort(arr);
		algo.print(arr);
		
	}

}
