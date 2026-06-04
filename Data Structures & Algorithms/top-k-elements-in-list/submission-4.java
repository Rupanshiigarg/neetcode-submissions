class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer, Integer> map = new  HashMap<>();

for (int num : nums) {
          map.put(num, map.getOrDefault(num, 0) + 1);
        }
         List<int[]> ans = new ArrayList<>();

      for(Map.Entry<Integer, Integer> entry: map.entrySet()){
        ans.add(new int[]{ entry.getValue(), entry.getKey()}  );
      }
      ans.sort((a,b) -> b[0] - a[0]);
      int[] finalAns = new int[k];
      for(int i = 0; i<k; i++){
        finalAns[i] = ans.get(i)[1];
      } 
      return  finalAns;
    }
    }
