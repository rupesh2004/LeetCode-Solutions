class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int totalTime = 0;
        
        for (int i = 1; i < points.length; i++) {
            int x1 = points[i - 1][0];
            int y1 = points[i - 1][1];
            int x2 = points[i][0];
            int y2 = points[i][1];
            
            int dx = Math.abs(x2 - x1);
            int dy = Math.abs(y2 - y1);
            
            int timeToTravel = Math.max(dx, dy);
            
            totalTime += timeToTravel;
        }
        
        return totalTime;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[][] points1 = {{1,1},{3,4},{-1,0}};
        int result1 = solution.minTimeToVisitAllPoints(points1);
        System.out.println(result1); 
        
        int[][] points2 = {{3,2},{-2,2}};
        int result2 = solution.minTimeToVisitAllPoints(points2);
        System.out.println(result2);
    }
}
