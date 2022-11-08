#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

ll a,b,c,d,e,f;
ll mod = 998244353;

int main() {
    cin>>a>>b>>c>>d>>e>>f;
    a = (a%mod)*(b%mod)%mod*(c%mod)%mod;
    d = (d%mod)*(e%mod)%mod*(f%mod)%mod; 
    cout<<(a-d+mod)%mod<<endl;
}