#include<bits/stdc++.h>
using namespace std;

vector<int> majority(int arr[], int n){
int cnt1 = 0, cnt2 = 0;
int el1 = INT_MIN, el2=INT_MIN;

int mini = (n/3)+1;

for(int i =0;i<n;i++){
    if(cnt1==0 && arr[i]!=el2){
        cnt1=1;
        el1=arr[i];
    }else if(cnt2==0 && arr[i] != el1){
        cnt2=1;
        el2=arr[i];
    }else if(arr[i]==el1)cnt1++;
    else if(arr[i]==el2)cnt2++;
    else cnt1--,cnt2--;
}

vector<int>res;
int cnt3=0 ,cnt4=0;
 for(int i=0 ;i<n;i++){
    if(arr[i]==el1)cnt3++;
    if(arr[i]==el2)cnt4++;
 }

 if(cnt3>=mini)res.push_back(el1);
 if(cnt4>=mini)res.push_back(el2);

 return res;
}
int main(){
    int n;
    cin >> n;
    int arr[n];
    cout << "print array:" << endl;
    for(int i =0 ;i<n ;i++){
        cin >> arr[i];
    }

    vector<int> res = majority(arr,n);
    for(int i=0;i<res.size();i++){
         cout<< res[i] << endl;
    }
    return 0;
}