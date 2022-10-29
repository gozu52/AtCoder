#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int g[1000010];

int main() {
    int n,x,y;cin>>n>>x>>y;
    int a[n];for(int i=0;i<n;i++)cin>>a[i];
    for(int i=0;i<=100000;i++){
        bool c[3] = {};
        if(i>=x)c[g[i-x]]=true;
        if(i>=y)c[g[i-y]]=true;
        if(!c[0])g[i]=0;
        else if(!c[1])g[i]=1;
        else g[i]=2;
    }
    int ans = 0;
    for(int i=0;i<n;i++)ans ^= g[a[i]];
    cout<<(ans!=0?"First":"Second")<<endl;
}