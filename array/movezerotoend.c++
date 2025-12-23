#include<bits/stdc++.h>
using namespace std;

void moveZeroes(int arr[],int n){
    int j = -1;

    for(int i=0;i<n;i++){
        if(arr[i]==0){
            j=i;
            break;
        }
    }

    if(j==-1)return;

    for(int i=j+1;i<n;i++){
        if(arr[i]!=0){
            swap(arr[i],arr[j]);
            j++;
        }
    }
}

int main(){
    int arr[] = {5,6,4,5,9,1,3};
    int n = sizeof(arr) / sizeof(arr[0]);
    moveZeroes(arr,n);
    for(int i=0;i<n;i++){
        cout << arr[i] << endl;
    }
}