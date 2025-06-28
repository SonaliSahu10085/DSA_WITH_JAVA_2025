import java.util.*;

//To find maxium water(area)
public class ContainerWithMostWater {
    //Brute Force Approach - O(n^2)
    public static int approach1(ArrayList<Integer> height) {
        int maxWater = 0;

        for (int i = 0; i < height.size(); i++) {
            for (int j = i + 1; j < height.size(); j++) {
                int ht = Math.min(height.get(i), height.get(j));
                int wd = j - i;
                int currWater = ht * wd;
                maxWater = Math.max(maxWater, currWater);
            }
        }

        return maxWater;
    }

    // Two Pointer Approach - O(n)
    public static int approach2(ArrayList<Integer> height) {
        int lp = 0;
        int rp = height.size() - 1;
        int maxWater = 0;

        // condition
        while (lp < rp) {
            int ht = Math.min(height.get(lp), height.get(rp));
            int wd = rp - lp;
            int currWater = ht * wd;
            maxWater = Math.max(maxWater, currWater);

            // pointer updation
            if (lp < rp) {
                lp++;
            } else {
                rp--;
            }
        }

        return maxWater;
    }

    public static void main(String args[]) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println("height = " + height);
        System.out.println("approach1 = " + approach1(height));
        System.out.println("approach2 = " + approach2(height));

    }
}



