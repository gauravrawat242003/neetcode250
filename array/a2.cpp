#include <bits/stdc++.h>
using namespace std;

void multiply(vector<int>&arr, int& size, int multiplier){
    int carry = 0;
    for(int i =0 ;i<size ; i++){
        int res = multiplier * arr[i];
        res = res + carry;
        arr[i] = res % 10;
        carry = res/10;
    }

    while(carry > 0){
        if(size == arr.size()) arr.push_back(0);
        arr[size] = carry % 10;
        size++;
        carry = carry/10;
    }
}

vector<int> factorial(int n){
    vector<int> arr(1000, 0);

    arr[0] = 1;

    int size = 1;

    for(int multiplier = 2; multiplier <=n ;multiplier++){
        multiply(arr, size , multiplier);
    }

    vector<int>result;

    for(int i = size-1 ; i>=0 ;i--){
        result.push_back(arr[i]);
    }
    return result;
}

int main(){
    int n = 5;
    vector<int> fac = factorial(n);
    
    for (int i = 0; i < fac.size(); i++){
    cout << fac[i];
    }
    cout << endl;
    return 0;
}