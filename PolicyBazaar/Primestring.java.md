Problem link-->[here](https://www.hackerearth.com/problem/algorithm/primestring/)
```
/* IMPORTANT: Multiple classes and nested static classes are supported */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    static boolean isPrime(int n){
	         boolean flag = true;
	         if(n==1){
	             flag = false;
	         }
	         for(int j=2;j<=(int)Math.sqrt(n);j++){
	             if(n%j==0){
	                 flag =false;
	                 break;
	             }
	         }
	         return flag;
	     }
	public static void main (String[] args) throws java.lang.Exception
	{
	     
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        boolean flag;
        for (int i = 0; i < N; i++) {
         Set<Character> set = new HashSet<Character>();
         String input = br.readLine();
         flag = true;
         for(Character c:input.toCharArray()){
             set.add(c);
         }
         Map<Character,Integer> map = new HashMap<Character,Integer>();
         for(Character ch: input.toCharArray()){
             if(map.containsKey(ch)){
                 map.put(ch,map.get(ch)+1);
             }
             else{
                 map.put(ch,1);
             }
         }
         if(!isPrime(set.size())){
             flag = false;
         }
         else{
         for(Object key:map.keySet()){
             if(!isPrime(map.get(key))){
                 flag = false;
                 break;
             }
         }
         }
         System.out.println(flag?"YES":"NO");
        //System.out.println(map);
        }
       

	}
}

```
