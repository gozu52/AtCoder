#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
const ll mod = 1e9+7;

ll Power(ll a,ll b,ll m){
    ll sum = 1;
    for(int i=0;i<30;i++){
        if(b/(1<<i)%2==1)sum = sum*a%m;
        a = a*a%m;        
    }
    return sum;
}

ll Div(ll a, ll b, ll m){
    return a*Power(b,m-2,m)%m;
}

int main() {
    ll n,r;cin>>n>>r;
    ll chl=1,par=1;
    for(int i=1;i<=n;i++)chl = chl*i%mod;
    for(int i=1;i<=r;i++)par = par*i%mod;
    for(int i=1;i<=n-r;i++)par = par*i%mod;
    cout<<Div(chl,par,mod)<<endl;
}