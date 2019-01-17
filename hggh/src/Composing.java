import java.util.Arrays;
import java.util.Collections;

class Composing {

    public static String compose(String s1, String s2) {
        String[] arr2 = s2.split("\n"); int l = arr2.length;
        Collections.reverse(Arrays.asList(arr2));
        String[] arr1 = s1.split("\n");
        String res = "";
        for (int i = 0; i < l; i++)
            res += arr1[i].substring(0, i+1) + arr2[i].substring(0, l-i) + "\n";
        return res.substring(0,  res.length()-1);
    }
}