#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int x, y, n;
ll ans = 0;

void solve(){
    int div3y = y/3;
    if(x<=div3y){
        ans = x*n; 
    }else{
        ans = (n/3)*y;
        if(n%3!=0){
            ans+=(n%3)*x;
        }
    }
    cout<<ans<<endl;
}

int main(){
    cin>>x>>y>>n;
    solve();
}