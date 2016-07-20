Problem link -->[here](https://www.hackerearth.com/problem/algorithm/furniture-transportation-2/)

```
/* IMPORTANT: Multiple classes and nested static classes are supported */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
      

       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line[] = br.readLine().split(" ");
        int N = Integer.parseInt(line[0]),i,j,k,arr[],count;
        long L = Long.parseLong(line[1]);
        int M = Integer.parseInt(line[2]);
        line = br.readLine().split(" ");
        arr = new int[N];
        for (i = 0; i < N; i++) {
           arr[i] = Integer.parseInt(line[i]);
        }
      
        i =0;count = 0;
        while(i<N&&arr[i]<=L){
        	j = 0;k=i;
        	while(k<N){
        	    if(j==M){
        	        break;
        	    }
        	    if(arr[k]<=L){
        	        j++;
        	        //System.out.println(arr[k]+" "+L+" "+j+" "+M);
        	        k++;
        	    }
        	    else{
        	        break;
        	    }
        	    
        	}
        	if(j==M){
        	        count++;
        	    }
        	i++;
        }
      System.out.println(count);
      
    }
}
```
