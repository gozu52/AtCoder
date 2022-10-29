#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
const ll mod = 1e9+7;

int main() {
    ll a,b;cin>>a>>b;
    ll ans = 1;
    for(int i=0;i<30;i++){
        if(b/(1<<i)%2==1)ans = ans*a%mod;
        a = a*a%mod;
    }
    cout<<ans<<endl;
}