import java.util.*;

public class SockMerchant {

    public static void main(String[] args) {

        List<Integer> ar = Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20);
        Set<Integer> colors = new HashSet<>();
        int pairs = 0;

        for(Integer i : ar){
            if(!colors.contains(i)){
                colors.add(i);
            }else {
                pairs++;
                colors.remove(i);
            }
        }
        System.out.println(pairs);
    }
}
