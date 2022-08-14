#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int r,c;

void solve(){
    if(max(abs(r-8),abs(c-8))%2==1)cout<<"black"<<endl;
    else cout<<"white"<<endl;
}

int main(){
    cin>>r>>c;
    solve();
}