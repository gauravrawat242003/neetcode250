#include<bits/stdc++.h>
using namespace std;

vector<vector<int>>sum(int arr[], int n,int target){
    sort(arr,arr+n);
    vector<vector<int>>res;

    for(int i=0 ;i< n ;i++){
        if(i>0 && arr[i] == arr[i-1])continue;
          for(int j=i+1;j<n;j++){
            if(j>i+1 && arr[j]==arr[j-1])continue;
           int  k = j+1 , l = n-1;

            while(k<l){
                long long sum = arr[i] + arr[j] + arr[k] +arr[l];
                if(sum < target){
                    k++;
                }else if(sum > target){
                    l--;
                }else{
                    vector<int>temp =  {arr[i],arr[j],arr[k],arr[l]};
                    res.push_back(temp);
                    k++;
                    l--;
                    while(k<l && arr[k]==arr[k-1])k++;
                    while(k<l && arr[l]==arr[l+1])l--;
                }
            }
          }
    }
    return res;
}

int main(){
    int n,target;
    cout<<"enter the number and target:";
    cin >> n >> target ;
    int arr[n];
    cout << "print array:" << endl;
    for(int i =0 ;i<n ;i++){
        cin >> arr[i];
    }
    cout<<"quadpuplets:\n";
    vector<vector<int>> res = sum(arr,n,target);
    for(auto it : res){
        cout << "[";
        for(auto el : it){
            cout << el;
        }
        cout << "]";
    }
    return 0;
}