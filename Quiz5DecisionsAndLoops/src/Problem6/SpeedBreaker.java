package Problem6;

import java.util.Scanner;

public class SpeedBreaker {

	public static int calculate(double m) {
		
		int v[] = {1,10,20,40};
		int r = 3;
		int ans = 0;
		double T = 60.0;
			
		for(int i=0; i<4; i++) {
			
			double at = m * (v[i]*v[i]) / r;
			if(at <= T) {
				ans = Math.max(ans, v[i]);
			}
		}
		
		System.out.println("The greatest speed is : " + ans);
		return ans;
	}

}
