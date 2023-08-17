/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* getConcatenation(int* nums, int numsSize, int* returnSize){
     *returnSize = 2 * numsSize;
    int *ans;
    
    ans = (int *)malloc(sizeof(int) * (2 * numsSize));
    if (!ans)
        return (NULL);
    
    for (int i = 0; i < numsSize; i++)
    {
        ans[i] = nums[i];
        ans[i + numsSize] = nums[i];
    }
    return ans;
}