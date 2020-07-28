import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class Solution {

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    	
    	int alice = 0;
    	int bob = 0;
    	for (int i=0;i<3;i++) {
    		if (a.get(i).intValue() > b.get(i).intValue()) {
    			alice = alice+1;
    		}else if (a.get(i).intValue() < b.get(i).intValue()) {
    			bob = bob +1;
    		}
    	}
    	List<Integer> result = new ArrayList<>();
    	result.add(alice);
    	result.add(bob);
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
       

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = compareTriplets(a, b);

        System.out.println(" Points for alice " + result.get(0));
        System.out.println(" Points for bob " + result.get(1));
        

        bufferedReader.close();
       
    }
}
