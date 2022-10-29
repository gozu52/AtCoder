#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int main() {
    int n,q;cin>>n>>q;
    int sum[n+10] = {};sum[0] = 0;
    for(int i=0;i<n;i++){
        int a;cin>>a;
        sum[i+1] = sum[i]+a;
    }
    for(int i=0;i<q;i++){
        int l,r;cin>>l>>r;l--;
        cout<<sum[r]-sum[l]<<endl;
    }
}