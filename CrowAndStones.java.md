```
import java.util.Arrays;

/**
 * There are N pots. Every pots have some water in it. They may be partially
 * filled. So there is a Overflow Number 0 associated with every pot which tell
 * how many minimum stone pieces are require for that pot to overflow. So if for
 * a pot 0-value is 5 it means minimum 5 stone pieces should be put in that pot
 * to make it overflow. Initially a crow watched those pots and by seeing the
 * water level he anticipated 0-value correctly for every pot ( that is he knew
 * 01 to On). But when he came back in evening he found that every pot is
 * painted from outside and he is not able to know which pot has what 0-value.
 * Crow wants some K pots to overflow so that he can serve his child
 * appropriately. For overflow of pots he need to search for stone in forest(
 * assume that every stone has same size). He wants to use minimum number of
 * stones required to overflow K pots. But only he know the 0-value of pots he
 * doesn't know now which pot has what 0-value. So the task is that in what
 * minimum number of stones he can make K pots overflow in worst case.
 *
 *
 * Input/Output Specifications
 *
 * Input Specification: 1) A array 0 corresponding
 * to 0-value of N pots {01, 02, On} 2) Number of pots 3) K -value ( number of
 * pots which the crow wants to overflow}
 *
 * Output Specification: Minimum number of stones required to make K pots
 * overflow in worst case. Or -1 if input is invalid
 *
 *
 * Example: Let say there are two pots pot 1 has 0 value of 5 , 01= 5 pot 2 has
 * 0 value of 58, 02= 58 Let say crow wants to make one of the pot to overflow.
 * If he know which pot has what 0-value he would simple search for 5 stones and
 * put then in pot 1 to make it overflow. But in real case he doesn't know which
 * pot has what 0-value so just 5 stones may not always work. However he does
 * know that one pot has 0-value S and other has 58. So even in worst case he
 * can make one of the pot overflow just by using 10 stones. He would put 5
 * stones in one pot if it doesn't overflow he would try the remaining 5 in the
 * other pot which would definitely overflow because one of the pot has 0-value
 * of 5. So the answer for above question is minimum 10 stones even in worst
 * case. Input : Input 1= {5,58} Input 2= 2 Input 3= 1 Output : 10
 *
 *
 */
public class CrowAndStones {
  public static int getMinStones(final int a[], final int k) {

    if ((a.length < k)) {
      return -1;
    }

    Arrays.sort(a);

    // approach 1:
    final int mid = a[k - 1];
    int res1 = (mid * (a.length - k));
    for (int i = 0; i < k; i++) {
      res1 += a[i];
    }

    // approach 2
    int res2 = 0;
    for (int i = a.length - 1; i > (a.length - k - 1); i--) {
      res2 += a[i];
    }
    System.out.println("Approach 1 = " + res1 + " Approach 2 = " + res2);
    return Math.min(res1, res2);
  }

  public static void main(final String[] args) {
    final int a[] = { 1, 2, 6, 6, 6, 6, 6, 6, 6, 10 };
    System.out.println(getMinStones(a, 2));
  }
}
```
