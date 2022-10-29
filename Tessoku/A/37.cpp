#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int main() {
    ll n,m,b,a,c;cin>>n>>m>>b;
    ll sum = b*n*m;
    for(int i=0;i<n;i++){cin>>a;sum+=a*m;}
    for(int i=0;i<m;i++){cin>>c;sum+=c*n;}
    cout<<sum<<endl;
}