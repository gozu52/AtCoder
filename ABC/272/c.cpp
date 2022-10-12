#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int main() {
    int n;cin>>n;
    ll a[n];
    ll sumodds = 0, sumeven = 0;
    for(int i=0;i<n;i++){
        cin>>a[i];
        if(a[i]%2==0)sumeven = max(sumeven,a[i]);
        else sumodds = max(sumodds,a[i]);
    }
    sort(a,a+n);
    ll ans = -1;
    for(int i=n-1;i>=0;i--){
        if(a[i]!=sumeven&&a[i]%2==0)ans = max(ans,(sumeven+a[i]));
        if(a[i]!=sumodds&&a[i]%2!=0)ans = max(ans,(sumodds+a[i]));
    }
    cout<<ans<<endl;
}