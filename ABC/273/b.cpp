#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int num[100];

int main() {
    ll x,k;cin>>x>>k;
    int pos = 0;
    while(x>0){
        num[pos]=x%10;
        x/=10;
        pos++;
    }
    if(pos<k){
        cout<<0<<endl;
        return 0;
    }
    for(int i=0;i<k;i++){
        if(num[i]>=5)num[i+1]++;
        num[i] = 0;
    }
    bool flag = false;
    for(int i=0;i<=pos;i++){
        if(num[i]>=10){
            num[i+1]++;
            num[i] = 0;
        }
    }
    for(int i=pos;i>=0;i--){
        if(i==0&&!flag)cout<<0;
        if(!flag&&num[i]==0)continue;
        if(flag)cout<<num[i];
        if(!flag && num[i]>0){
            // if(num[i]>=10)num[i+1]++;
            // num[i]=0;
            flag = true;
            cout<<num[i];
        }
    }
    cout<<endl;
}