#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int n,a[200],b[200];
ll ans = 0;

int main() {
    cin>>n;
    for(int i=0;i<n;i++)cin>>a[i];
    for(int i=0;i<n;i++)cin>>b[i];
    sort(a,a+n);sort(b,b+n);reverse(b,b+n);
    for(int i=0;i<n;i++){
        ans += a[i]*b[i];
    }
    cout<<ans<<endl;
}