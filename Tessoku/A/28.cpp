#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
const int mod = 10000;

int main() {
    int n;cin>>n;
    char t;int a,ans=0;
    for(int i=0;i<n;i++){
        cin>>t>>a;
        if(t=='+')ans += a;
        if(t=='-')ans -= a;
        if(t=='*')ans *= a;
        ans += mod;ans %= mod;
        cout<<ans<<endl;
    }
    return 0;
}