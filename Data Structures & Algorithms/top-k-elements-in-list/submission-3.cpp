class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        int n = nums.size() ; 
        map<int,int> mp ; 
        for(int i=0 ;i<n ;i++){
            mp[nums[i]]++ ;  
        }
        vector<pair<int,int>> ans ;
        for(auto it : mp) {
            ans.push_back({it.second, it.first}) ; 
        }
        sort(ans.rbegin(), ans.rend()) ;   
        vector<int> final_ans ;   
        for(int i =0 ;i<k ;i++) {
             final_ans.push_back(ans[i].second) ;  
        }
        return final_ans ;  
    }
};
