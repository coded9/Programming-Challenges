After failing to stop pollution, and global warming - human race has been wiped out, and zombies have taken over the world. But, Little Bansal has somehow still managed to survive and inspite of being a partial-zombie, he's able to make sense of the world. So, he decides to rule the kingdom of zombies. There are N zombies in his army, and it's important to take care of them.
Now obviously, the zombies need something to eat (Read: humans!) and in this weird world, all Bansal can find to help his army of zombies out is a string of digits - a single string consisting of only digits. He also has information about the deadZombieCoffiencent, DZC. If a zombie consumes a string of value greater than DZC, he dies. So, Bansal is NOT going to let that happen at any cost. So, he takes the task upon himself, and decides to divide the string in a way that:
1. All the N zombies get food.
2. No one dies because of DZC.
3. Importantly, the sum of the N parts should be maximized.
If it is not possible to satisfy all the conditions, print the message "abort mission: food".
Input Format:
The first line contains an integer, TC, denoting the number of test cases. The first line for every test case contains 2 integers N and DZC. N denotes the number of men in his army, DZC denotes what has been mentioned in the statement. The second line contains the string to be divided, which consists of only digits.
Output Format:
Print the required answer.
Constraints:
1 <= TC <= 100
1 <= N <= 100
1 <= DZC <= 10^9
1 <= Length of the string <= 200
Sample I/O:
Input:
2
1 1
123456
2 98
1235

Output:
abort mission: food
47
```
/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int i=0;i<tc;i++){
			int size = sc.nextInt();
			int DZC = sc.nextInt();;
			sc.nextLine();
			String word = sc.nextLine();
				//String word = "1235";
			int n = word.length()/size; 
	        String[] array = new String[size];
            int strt = 0;
            int end = n;
            int sum =0;
            boolean flag = false;
          for (int j = 0; j < array.length; j++) {
    	
            	array[j] = word.substring(strt,end);
               if(Integer.parseInt(array[j])<DZC){
             	flag = true;
              //System.out.println(array[j]);
               strt = strt + n;
               end += n;
               sum = sum + Integer.parseInt(array[j]);
             }
           else{
        	flag = false;
        	break;
        }
        
        }
if(flag){
	System.out.println(sum);
}
else{
	System.out.println("abort mission:food");
}
       
			
		}

	}
}
```
