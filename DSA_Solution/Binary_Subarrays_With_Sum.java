class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
      Map<Integer, Integer> prefSumFreqMp = new HashMap<>();
      int prefSum = 0;
      prefSumFreqMp.put(0, 1);
      int subArrayCnt = 0;
      for(var num : nums){
          prefSum += num;
          if(prefSumFreqMp.containsKey(prefSum - goal)){
             subArrayCnt += prefSumFreqMp.get(prefSum - goal);
          }
          prefSumFreqMp.put(prefSum, prefSumFreqMp.getOrDefault(prefSum, 0)+1);
      }   
      return subArrayCnt;
    }
}
