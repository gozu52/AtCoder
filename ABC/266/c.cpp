#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int x[4], y[4];

void solve(){
    int fa = (x[1]-x[0])*(y[3]-y[0])-(x[3]-x[0])*(y[1]-y[0]);
    int fb = (x[3]-x[0])*(y[2]-y[0])-(x[2]-x[0])*(y[3]-y[0]);
    int fc = (x[3]-x[1])*(y[2]-y[1])-(x[2]-x[1])*(y[3]-y[1]);
    int fd = (x[2]-x[1])*(y[0]-y[1])-(x[0]-x[1])*(y[2]-y[1]);
    cout<<((fa*fb<0&&fc*fd<0)?"Yes":"No");  
}

int main(){
    for(int i=0;i<4;i++)cin>>x[i]>>y[i];
    solve();
}