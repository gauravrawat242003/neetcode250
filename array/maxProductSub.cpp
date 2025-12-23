#include<bits/stdc++.h>
using namespace std;

int maxPro(int arr[] ,int n){
    int maxPro = INT_MIN;
    int prefix =1;
    int suff =1;
    

    for(int i=0;i<n;i++){
        if(prefix == 0)prefix =1;
        if(suff == 0)suff =1;

        prefix = prefix * arr[i];
        suff = suff * arr[n-i-1];

        maxPro = max(maxPro , max(prefix,suff));
    }
    return maxPro;
}

int main(){
    int n;
    cin >> n;
    int arr[n];
    cout << "print array:" << endl;
    for(int i =0 ;i<n ;i++){
        cin >> arr[i];
    }

    int res = maxPro(arr,n);
    cout<< res << endl;
    return 0;

}