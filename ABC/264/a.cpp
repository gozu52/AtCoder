#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int l,r;

void solve(){
    string str = "atcoder";
    cout<<endl;
    cout<<str.substr(l,r-l)<<endl;
}

int main(){
    cin>>l>>r;
    l--;
    solve();
}