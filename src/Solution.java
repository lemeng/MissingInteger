import java.util.HashMap;

import java.util.Map;


public class Solution {

	public static void main(String[] args) {
		
		int[] input = {2,3,-7,6,8,1,-10,15};
		int result = 0;
		result = solution(input);
		System.out.print(result);
	}

	public static int solution(int[] A) {
		
		Map<Integer, Integer> elementValueAsKey = 
				new HashMap<>();
		
		for (int i=0; i<A.length; i++) {
			Integer occurrence = elementValueAsKey.get(A[i]);
			if (occurrence == null) {
				elementValueAsKey.put(A[i],1);
			} else {
				elementValueAsKey.put(A[i],++occurrence);
			}
		}
		
		int missingInt = 1;
		
		while(missingInt>=1){
			if (elementValueAsKey.get(missingInt) != null) {
				missingInt++;
			} else {
				break;
			}
				
		}
		
		return missingInt;
	}

}
