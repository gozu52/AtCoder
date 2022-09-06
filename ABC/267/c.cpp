#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int n,m;

int main(){
    cin>>n>>m;
    vector<ll> a(n);
    vector<ll> cum(n+1);
    for(int i=0;i<n;i++)cin>>a[i];
    for(int i=0;i<n;i++)cum[i+1] = cum[i] + a[i];
    vector<ll> sum(n-m+1);
    ll pos = 0;
    for(int i=0;i<m;i++)pos += a[i]*(i+1);
    sum[0] = pos;
    for(int i=0;i<n-m;i++)sum[i+1] = sum[i]+m*a[m+i]-(cum[m+i]-cum[i]);
    cout<<endl;
    ll ans = -1e18;
    for(int i=0;i<n-m+1;i++)ans = max(ans,sum[i]);
    cout<<ans<<endl;
}