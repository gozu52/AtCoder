#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int n,q,a,b,c,d,h[200010];
string s;
ll Power100[200010];
const ll mod = 2147483647;

ll Hash_val(int l,int r){
    ll val = h[r]-(h[l-1]*Power100[r-l+1]%mod);
    return (val<0?(val+mod):val);
}

int main() {
    cin>>n>>q>>s;
    Power100[0]=1;
    for(int i=1;i<=n;i++)Power100[i] = 100LL*Power100[i-1]%mod;
    for(int i=1;i<=n;i++)h[i] = (100LL*h[i-1]+(s[i-1]-'b'))%mod;
    while(q-->0){
        cin>>a>>b>>c>>d;
        cout<<(Hash_val(a,b)==Hash_val(c,d)?"Yes":"No")<<endl;
    }
    return 0;
}