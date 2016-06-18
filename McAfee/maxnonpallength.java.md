Problem link --> [here](https://www.hackerearth.com/problem/algorithm/palindromes-3/)
```
import java.io.BufferedReader;
import java.io.InputStreamReader;


class TestClass {
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String temp="";
        int i,j,u;
        boolean flag = true;
        u = input.length();
        while(u!=0){
        	temp = input.substring(0,u);
        //	System.out.println(temp);
        	for(i=0,j=temp.length()-1;i<temp.length()/2;i++,j--){
        		if(temp.charAt(i)!=temp.charAt(j)){
        			flag = false;
        			break;
        		}
        	}
        	if(!flag){
        		break;
        	}
        	u--;
        }
      System.out.println(temp.length()>1?temp.length():0);
    }
}

```
