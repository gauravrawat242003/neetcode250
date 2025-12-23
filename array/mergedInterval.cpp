#include<bits/stdc++.h>
using namespace std;

vector<vector<int>>merge(vector<vector<int>>&intervals){
    sort(intervals.begin(), intervals.end());
    vector<vector<int>>ans;

    for(int i=0 ;i<intervals.size();i++){
        if(ans.empty() || ans.back()[1] < intervals[i][0]){
            ans.push_back(intervals[i]);
        }else{
            ans.back()[1] = max(ans.back()[1],intervals[i][1]);
        }
    }
    return ans;
}

int main(){
    int n;
    cout<< "enter the number of intervals:";
    cin>> n ;
    vector<vector<int>> intervals(n, vector<int>(2));

    cout<<"enter the intervals:";

    for(int i=0;i<n;i++){
        cin >> intervals[i][0] >> intervals[i][1];
    }

    vector<vector<int>>result = merge(intervals);
    
    cout<<"\nmerged intervals:";
    for(auto v : result){
        cout << "[" <<v[0] <<"," << v[1] << "]";
    }

    return 0;
}
