#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

ll n;
map<ll,ll> mp;

ll f(ll num){
    if(num==0)return 1;
    if(mp[num]!=0)return mp[num];
    mp[num] = f(num/2)+f(num/3);
    return mp[num];
}

int main() {
    cin>>n;
    cout<<f(n)<<endl;
}