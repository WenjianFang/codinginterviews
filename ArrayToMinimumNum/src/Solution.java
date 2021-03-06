
import java.util.*;
public class Solution {
	public String transToMinNum(int[] array){
		String result="";
		if(array.length==0) return result;
		/*array trans to string list*/
		List<String> strs = new ArrayList<>();
		for(int i=0; i<array.length; i++){
			strs.add(Integer.toString(array[i]));
		}
		/*use collection to sort
		 * the comparator is designed
		 */
		Collections.sort(strs, new compareStr());
		
		for(int i=0; i<strs.size(); i++){
			result = result.concat(strs.get(i));
		}
		return result;
	}
	/*
	 * designed comparator
	 * mn>nm means m>n
	 * else m<n
	 */
	class compareStr implements Comparator<String>{

		@Override
		public int compare(String o1, String o2) {
			// TODO Auto-generated method stub
			String newStr1 = o1.concat(o2);
			String newStr2 = o2.concat(o1);
			
			return newStr1.compareTo(newStr2);
		}


		
	}
}
