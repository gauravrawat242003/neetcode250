#include<bits/stdc++.h>
using namespace std;

int lowerBound(int arr[], int n ,int k){
    int low = 0 ,high = n-1;
    int ans=n;

    while(low <= high){
        int mid = (low+high)/2;

        if(arr[mid] >= k){
            ans = mid;
            high = mid-1;
        }
        else low = mid+1;
    }
    return ans;
}
int main(){
    int n = 5;
    int k = 9;
    int arr[] = {3,5,8,15,19};

    int res = lowerBound(arr,n,k);
    cout << "answer:" << res ;
    return 0;
}