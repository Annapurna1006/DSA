class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n =grid.length;
        int size = n*n;
        int[] cnt = new int[size+1];
        for(int i = 0 ;i< n;i++)
        {
            for(int j = 0 ;j<n;j++)
        {
            cnt[grid[i][j]]++;
        }
        }

        int repeat = -1;
        int miss = -1;
         for(int i = 1 ; i<= size ; i++ )
         {
            if(cnt[i]==2)
            {
                repeat = i;
            }
            else if(cnt[i]==0)
            {
                miss = i;
            }
         }
         return new int[]{repeat,miss};
       
    }
}