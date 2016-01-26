#Stair Case
For a given number n ,here 6

     #
    ##
   ###
  ####
 #####
######

```
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
public static void steps(int x,int n){
            String str = "";
        int z = x;
            while(n-x!=0){
                str = str + " ";
                    x++;
            }
            while(z!=0){
                str = str +"#";
                z--;
            }
            System.out.println(str);
        }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        for(int i=1;i<=n;i++){
            steps(i,n);
        }
        
    }
}
```
