#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int n,k,a[200000],r[200000];

int main() {
    cin>>n>>k;
    for(int i=1;i<=n;i++)cin>>a[i];
    ll ans = 0;
    for(int i=1;i<n;i++){
        if(i==1)r[i]=1;
        else r[i]=r[i-1];
        while(r[i]<n&&a[r[i]+1]-a[i]<=k)r[i]++;
    }
    for(int i=1;i<n;i++)ans += (r[i]-i);
    cout<<ans<<endl;
}