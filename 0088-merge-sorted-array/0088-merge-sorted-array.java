class Solution
{
    public void merge(int[]arr1 , int m , int[]arr2 , int n )
    {
        
    int left = m-1;
    int right= 0;
    while( left>=0 && right<n)
    {
        if(arr1[left] > arr2[right])
        {
           int  temp =  arr1[left] ;
            arr1[left] = arr2[right];
            arr2[right] = temp;
        
        }
        else{
            break;
        }
        Arrays.sort(arr1,0,m);
        Arrays.sort(arr2);
    }
    for(int i =0;i<n;i++)
    {
        arr1[m+i] = arr2[i];
    }
    }
}