#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int n, m, t;
int a[100001];
vector<int> b(100001,0);
vector<int> x(100001);
vector<int> y(100001);

void solve(){
    ll num = t+b[0];
    bool check = true;
    for(int i=0;i<n-1;i++){
        if(num<=a[i]){
            check = false;
        }
        num -= a[i];
        num += b[i+1];
    }
    if(check)cout<<"Yes"<<endl;
    else cout<<"No"<<endl;
}

int main(){
    cin>>n>>m>>t;
    for(int i=0;i<n-1;i++)cin>>a[i];
    for(int i=0;i<m;i++){
        int tmpx = 0, tmpy = 0;
        cin>>tmpx>>tmpy;
        tmpx--;
        b[tmpx] += tmpy;
    }
    solve();
}