#include<bits/stdc++.h>
using namespace std;

vector<int> rearrange(vector<int>&arr){

    vector<int> result(arr.size(),0);
    int pos = 0 , neg = 1;

    for(int i =0 ;i<arr.size(); i++){
        if(arr[i]>0){
            result[pos] = arr[i];
            pos+=2;
        }else{
            result[neg] = arr[i];
            neg+=2;
        }
    }
    return result;
}

int main(){
    vector<int>arr = {1,-2,3,4,-2,-5};
    vector<int> result = rearrange(arr);

    for(int i=0;i<result.size();i++){
        cout << result[i] << " ";
    }
    return 0;
}