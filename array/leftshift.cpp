#include <bits/stdc++.h>
using namespace std;

void solve(int arr[], int n, int k){
    if(n==0)return ;

    k = k % n;

    int temp[k];
    for(int i=0;i<k;i++){
        temp[i] = arr[i];
    }

    for(int i=0;i<n-k;i++){
        arr[i] = arr[i+k];
    }

    for(int i=n-k ;i<n ;i++){
        arr[i] = temp[i-(n-k)];
    }
} 
// SECOND solution -

// reverse(0,k-1);
// reverse(k,n-1);
// reverse(0,n-1);

int main(){
    int arr[] = {1,2,3,4,5,6};
    int n = sizeof(arr) / sizeof(arr[0]);
    int k =2;
    solve(arr,n,k);

    for(int i=0;i<n;i++){
        cout << arr[i] <<" ";
    }
    return 0;
}
  