#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int a[100001],n,x,y;
int m = 10000;

int main() {
    cin>>n>>x>>y;
    for(int i=0;i<n;i++)cin>>a[i];
    bitset<20001> dp, ep;
    dp.set(m+a[0]);ep.set(m);
    for(int i=1;i<n;i++){
        if(i%2==0){
            dp = (dp<<a[i]) | (dp>>a[i]);
        }else{
            ep = (ep<<a[i]) | (ep>>a[i]);
        }
    }
    cout<<(dp[m+x]==1 && ep[m+y]==1?"Yes":"No")<<endl;
}