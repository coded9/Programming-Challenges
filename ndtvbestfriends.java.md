Problem Statement:
Naren, and Herbal are best friends and also mutants. So, needless to say that both of them have super powers. But Herbal has an additional super power, that is, of being super lazy. He doesn't feel that it's important to remember the names of all the students he teaches in a mutant class, which is a good thing for him, but not for the students.
Let's say he has four students in his class: arjit, arpit, blackdeath and xsquare - he will remember only the first letter of their names, that is, a, a, d and x. So, now since he has two a's to remember, and he won't know which a refers to which person, he won't be able to know all the names of the students in his class.
You're given the strength and the names of the students in his various classes, you've to tell him if he'll be able to remember all the names.
Input Format:
The first line contains an integer TC, which denotes the number of test cases Herbal has to deal with. The next TC lines contain an integer N, denoting the number of students in that class. The next N lines will have a string on every line, denoting the names of all the students in the class.
Output Format:
You've to print YES or NO in capital case.
Constraints:
1 <= Number of test cases <= 1000
1 <= Number of students <= 1000
1 <= Length of the name of a student <= 1000
All the characters will be in lower case.
Sample I/O:
Input:
2
2
arjit
naren
3
arjit
naren
noman
Output:
YES
NO

```
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Stockroom
{
    	public static boolean distinctValues(String arr[]){
    for (int i = 0; i < arr.length-1; i++) {
        for (int j = i+1; j < arr.length; j++) {
             if (arr[i].equals(arr[j])) {
                 return false;
             }
        }
    }              
    return true;          
}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt(),i;
		for(i=0;i<tc;i++){
			int N = sc.nextInt();
			String firstChar[] = new String[N];
			sc.nextLine();
			for(int j=0;j<N;j++){
				String temp = sc.nextLine();
				firstChar[j] = temp.substring(0,1);
			//	System.out.println(Arrays.toString(firstChar));
			}
		if(distinctValues(firstChar)){
			System.out.println("YES");
		}
		else
		   System.out.println("NO");
		}
	}
}

```
- See more at: http://stockroom.io/user/prime/26#problemslist
