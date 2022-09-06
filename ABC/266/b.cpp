#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

ll n;
const ll mod = 998244353;

int main(){
    cin>>n;
    ll ans = n%mod;
    cout<<(ans>=0?ans:(ans+mod))<<endl;
}