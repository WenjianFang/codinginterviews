
public class Solution {
	public int basicForceCalc(int n){
		int times = 0;
		for(int i=1; i<=n; i++){
			times = times + timesOfN(i);
		}
		return times;
	}
	private int timesOfN(int n){
		int times = 0;
		int tmp = n;
		while(tmp != 0){
			if(tmp%10 == 1) times++;
			tmp = tmp/10;
		}
		return times;
	}
	
	
}
