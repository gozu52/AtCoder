#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int main() {
    int n,k;cin>>n>>k;
    int ans = 0;
    for(int i=1;i<=n;i++)for(int j=1;j<=n;j++){
        if(k-(i+j)>=1 && k-(i+j)<=n)ans++;
    }
    cout<<ans<<endl;
}