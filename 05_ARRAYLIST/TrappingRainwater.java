
public class TrappingRainwater {
    public static int trap(int[] height) {
        if (height.length <= 2) {
            return 0;
        }

        int n = height.length;
        int width = 1;
        int totalTrap = 0;

        // Calculate Left Max Boundary - Auxiliary Array
        int[] leftMax = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // Calculate Right Max Boundary - Auxiliary Array
        int[] rightMax = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        // loop
        for (int i = 0; i < n; i++) {
            // calculate waterlevel
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            // totalwater trap
            totalTrap += (waterLevel - height[i]) * width;
        }

        return totalTrap;
    }

    public static void main(String args[]) {
        int height[] = { 9, 16, 8, 34 };
        System.out.println(trap(height));
    }
}