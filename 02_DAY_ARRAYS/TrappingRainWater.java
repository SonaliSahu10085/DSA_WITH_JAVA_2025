public class TrappingRainWater {

    public static int trappedRainWater(int height[]) {
        int n = height.length;
        int width = 1;

        // calculate left max boundary - through aulixary/ helper array
        int leftMaxBound[] = new int[n];
        leftMaxBound[0] = height[0];

        for (int i = 1; i < n; i++) {
            leftMaxBound[i] = Math.max(height[i], leftMaxBound[i - 1]);
        }

        // calculate right max boundary
        int rightMaxBound[] = new int[n];
        rightMaxBound[n - 1] = height[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            rightMaxBound[i] = Math.max(height[i], rightMaxBound[i + 1]);
        }

        int trappedRainWater = 0;
        // loop to calculate for individual bar/ height
        for (int i = 0; i < n; i++) {
            // waterlevel = min(left max bound, right max bound)
            int waterLevel = Math.min(leftMaxBound[i], rightMaxBound[i]);

            // trapped rain water = (waterlevel - bar height) * bar width
            trappedRainWater += (waterLevel - height[i]) * width;

        }

        return trappedRainWater;
    }

    public static void main(String args[]) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        // calculate total trapped rain water (total area of rain water)
        System.out.println(trappedRainWater(height));
    }
}