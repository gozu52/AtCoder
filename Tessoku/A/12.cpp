#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int main() {
    ll n,k;cin>>n>>k;
    ll a[n];for(int i=0;i<n;i++)cin>>a[i];
    ll l = 0, r = 1e9;
    while(r>l){
        ll mid = (l+r)/2;
        ll sum = 0;
        for(int i=0;i<n;i++)sum+=mid/a[i];
        if(sum>=k)r = mid;
        else l = mid+1;
    }
    cout<<l<<endl;
}