#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int main() {
    int n,s;cin>>n>>s;
    int a[n],b[n];
    bool ep[110][21010];
    for(int i=0;i<n;i++)cin>>a[i]>>b[i];
    ep[0][0] = true;
    for(int i=0;i<n;i++){
        for(int j=0;j<=s;j++){
            if(ep[i][j] && j+a[i]<=s)ep[i+1][j+a[i]] = true;
            if(ep[i][j] && j+b[i]<=s)ep[i+1][j+b[i]] = true;
        }
    }
    deque<string> ans;
    if(ep[n][s]){
        cout<<"Yes"<<endl;
        for(int i=n-1;i>=0;i--){
            if(s>=a[i] && ep[i][s-a[i]]){
                ans.push_back("H");
                s-=a[i];
            }else{
                ans.push_back("T");
                s-=b[i];
            }
        }
        for(int i=ans.size()-1;i>=0;i--)cout<<ans[i];
        cout<<endl;
        return 0;
    }
    cout<<"No"<<endl;
    return 0;
}