#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int main(){
    int n;cin>>n;
    ll k;cin>>k;
    ll a[n];
    ll mina=0, maxa=1e18;
    for(int i=0;i<n;i++){
        cin>>a[i];
    }
    ll mid;
    while(maxa-mina>1){
        mid = (mina+maxa)/2;
        ll sum = 0;
        for(int i=0;i<n;i++){
            sum += (a[i]-mid<=0?a[i]:mid);
        }
        if(sum<=k){
            mina = mid;
        }else if(sum>k){
            maxa = mid;
        }
    }
    for(int i=0;i<n;i++){
        k -= min(mina,a[i]);
        a[i] -= min(mina,a[i]);
    }
    for(int i=0;0<k;i++){
        if(a[i]>0){
            a[i]--;k--;
        }
    }
    for(int i=0;i<n;i++)cout<<a[i]<<" ";
    cout<<endl;
}