Problem link -->[here](https://www.hackerearth.com/problem/algorithm/passing-the-parcel/description/)

```
import java.io.BufferedReader;
import java.io.InputStreamReader;


class TestClass {
    public static void main(String args[] ) throws Exception {
      

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine(),test,test2;
        int n = Integer.parseInt(line),i=1,j=0,temp;
        boolean arr[] = new boolean[1010];
        line = br.readLine();
        temp = n;
        
        while(n > 1){       // loop until there is only one person in the game

        for(j = 0; j < line.length(); j++, i++){

            if(i > temp) i = 1;         // you need to start again from beginning

            for(;;i++){

                if(i > temp) i = 1;
                if(arr[i]) continue;    // this person is already out of the game
                break;
            }

            if(line.charAt(j) == 'b'){

                n--;                // decrease the number of persons in the game
                arr[i] = true;      // mark this person as outside of the game
                if(n == 1) break;   // break condition
            }
        }
    }

    for(i = 1; i <= temp; i++) {

        if(!arr[i]){

            System.out.println(i);  // the winner (last person in the game)
            break;
        }
    }
    }
}
```
