#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int main() {
    int d,n;cin>>d>>n;
    int sum[d]={};
    for(int i=0;i<d;i++)sum[i] = 1e9;
    int l,r,h;
    for(int i=0;i<n;i++){
        cin>>l>>r>>h;l--;r--;
        for(int j=l;j<=r;j++)sum[j] = min(sum[j],h);
    }
    int ans = 0;
    for(int i=0;i<d;i++)ans += (sum[i]==1e9?24:sum[i]);
    cout<<ans<<endl;
}