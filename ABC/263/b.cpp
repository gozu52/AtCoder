#include <bits/stdc++.h>
using namespace std;

int n;
int p[51];

void solve(){
    int ans =0, pos = n;
    while(pos>1){
        pos = p[pos];
        ans++;
    }
    cout << ans << endl;
}

int main(){
    cin>>n;
    for(int i=2;i<=n;i++)cin>>p[i];
    solve();
}