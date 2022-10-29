#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int main() {
    int n,x;cin>>n>>x;
    int a[n];
    for(int i=0;i<n;i++)cin>>a[i];
    int ans = lower_bound(a,a+n-1,x)-a+1; 
    cout<<ans<<endl;
}