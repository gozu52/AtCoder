#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int n,h,pos,ans;

int main() {
    cin>>n;
    for(int i=0;i<n;i++){
        cin>>h;
        if(ans<h){
            pos = i+1;
            ans = h;
        }
    }
    cout<<pos<<endl;
}