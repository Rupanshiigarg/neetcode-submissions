class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalCost = 0;
        int totalGas = 0;
        int currentCost = 0;
        int start = 0;
        for(int i=0; i<gas.length; i++){
            
            totalCost += cost[i];
            totalGas += gas[i];
           currentCost += gas[i] - cost[i];
        
        if(currentCost<0){
         start = i + 1;
         currentCost = 0;
        }
        }
        if(totalGas<totalCost){
            return -1;
        }
        
        return start;
    }
}
