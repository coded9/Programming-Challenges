https://www.hackerearth.com/problem/algorithm/cricket-rating-30/
Max Sub array 
Bruteforce approach

import java.io.BufferedReader;
import java.io.InputStreamReader;


class TestClass {
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running      */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        int arr[] = new int[N];
        int i,j,sum =0,maxsum=Integer.MIN_VALUE;
        if(N!=0){
        String str[] = br.readLine().split(" ");
        for (i = 0; i < N; i++) {
        	if(str[i].length()>0)
          arr[i] = Integer.parseInt(str[i]);
        }
        
        for(i=0;i<N;i++){
        
        	if(arr.length==1){
        		maxsum = arr[0];
        		break;
        	}
        	sum = arr[i];
       
        	
        	for(j=i+1;j<N;j++){
        		sum = sum + arr[j];
        	
        			if(sum>maxsum){
        			maxsum = sum;
        		
        		}
        		
        	}
        }
        }
        else 
        maxsum = 0;
        
         
  System.out.println(maxsum>=0?maxsum:0);

      
    }
}


