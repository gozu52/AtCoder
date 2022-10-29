#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int n,a[100100],b[100100],dp[100100];
vector<int> ans;
deque<int> dq;

int main() {
    cin>>n;
    for(int i=2;i<=n;i++)cin>>a[i];
    for(int i=3;i<=n;i++)cin>>b[i];
    dp[2]=a[2];
    for(int i=3;i<=n;i++){
        dp[i] = min(dp[i-2]+b[i],dp[i-1]+a[i]);
    }
    int pos = n;
    while(true){
        dq.push_front(pos);
        if(pos==1)break;
        if(dp[pos]==dp[pos-1]+a[pos])pos--;
        else pos -= 2;
    }
    cout<<dq.size()<<endl;
    while(!dq.empty()){
        cout<<dq.front()<<" ";
        dq.pop_front();
    }
    cout<<endl;
}