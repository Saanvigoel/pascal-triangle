import java.util.*;
class pascal_triangle_memoization 
{
    public List<List<Integer>> generate(int num) 
    {
        List<List<Integer>> cache = new ArrayList();
        List<Integer> nums;
        for(int i=0; i<num;i++)
        {
            nums = new ArrayList();
            for(int j=0;j<=i;j++)
            {
                if(j==0||(j==i))
                {
                    nums.add(1);
                }
                else
                {
                    if((i-1>0)&& (j-1>=0))
                    {
                        nums.add(cache.get(i-1).get(j) + cache.get(i-1).get(j -1));
                    }
                }

            }
            cache.add(nums);
        }
        return cache;
    }
}