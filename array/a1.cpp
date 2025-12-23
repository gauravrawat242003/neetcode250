#include<bits/stdc++.h>
using namespace std;

int secondLargest(int arr[] , int n){
    if(n<2)return -1;

    int largest = INT_MIN , secondLarge = INT_MIN;

    for(int i =0 ;i<n ;i++){
        if(arr[i] > largest){
            secondLarge = largest;
            largest = arr[i];
        }else if(secondLarge < arr[i] && arr[i]!=largest){
            secondLarge = arr[i];
        }
    }
    return secondLarge;
}

int main(){
    int arr[] = {5,6,4,5,9,1,3};
    int n = sizeof(arr) / sizeof(arr[0]);
    int slargest = secondLargest(arr,n);
    cout << "2nd largest:" << slargest << endl;
}