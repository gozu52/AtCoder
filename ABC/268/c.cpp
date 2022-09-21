#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int n;

int main(){
    cin>>n;
    int p[n];
    for(int i=0;i<n;i++)cin>>p[i];
    int cnt[n] = {};
    for(int i=0;i<n;i++){
        for(int j=0;j<3;j++){
            cnt[(p[i]-1-i+j+n)%n]++;
        }
    }
    int ans = 0;
    for(int i=0;i<n;i++)ans = max(ans,cnt[i]);
    cout<<ans<<endl;
}