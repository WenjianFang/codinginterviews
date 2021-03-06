import java.util.Arrays;

/*
 * reOrder an array, for example, odd number in the front part, 
 * and even number in the rear part.
 * this can use the partition method in quick sort
 * so the partition method in quick is really useful!
 */
public class Solution {
	/*
	 * this method would change the origin order
	 */
	/*public void reOrderArray(int[] array){
		if(array.length<=1) return;
		
		int i = 0;
		for(int j=0; j<array.length; j++){
			if(array[j]%2 != 0){
				if(i != j){
					swap(array, i, j);
				}
				i++;
			}
		}
	}
	private void swap(int[] array, int i, int j){
		int tmp = array[i];
		array[i] = array[j];
		array[j] = tmp;
	}
	*/
	/*
	 * this method would not change the origin order
	 */
	public void reOrderArray(int[] array){
		if(array.length<=1) return;
		int[] tmp = Arrays.copyOf(array, array.length);
		int j=0;
		for(int i=0; i<tmp.length; i++){
			if(tmp[i] % 2 != 0){
				array[j] = tmp[i];
				j++;
			}
		}
		for(int i=0; i<tmp.length; i++){
			if(tmp[i] % 2 == 0){
				array[j] = tmp[i];
				j++;
			}
		}
	}
	
}
