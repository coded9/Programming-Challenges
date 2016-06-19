Problem link--> [here](https://www.hackerearth.com/problem/algorithm/marut-and-strings-4/)
```
import java.io.BufferedReader;
import java.io.InputStreamReader;


class TestClass {
    public static void main(String args[] ) {
   try{     
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine(),lineC,lineS;
        boolean flag;
        
        int T = Integer.parseInt(line),count;
        if(T>0){
        for (int i = 0; i < T; i++) {
            flag = true;
            count = 0;
            line = br.readLine();
            if(line.length()>100)
               flag = false;
            line = line.replaceAll("[^A-Za-z]","");
            //System.out.println(line);
            
            if(line.length()>=1 && flag){
                 lineS = line.replaceAll("[A-Z]*","");
                 lineC = line.replaceAll("[a-z]*","");
              // System.out.println(lineS+" "+lineC);  
            System.out.println(lineS.length()>lineC.length()?lineS.length()>0?line.length()-lineS.length():0:lineC.length()>0?line.length()-lineC.length():0);
               
            }
            else{
                System.out.println("Invalid Input");
            }
        }
        }
        else{
        System.out.println("Invalid Test");	
        }
	}
	catch(Exception e){
	    System.out.println("Invalid Test");
	}
      
    }
}
```
