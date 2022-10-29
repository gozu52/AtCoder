#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

ll sum[1000000];
pair<ll,ll> cnt;
ll lr[300001][2];
pair<int,int> mov[300010];

int main() {
    ll n,ans=1;cin>>n;
    int l,r;
    for(int i=0;i<n;i++){
        cin>>l>>r;
        mov[i].first=l;
        mov[i].second=r;
    }
    sort(mov,mov+n);
    cnt.first=mov[0].first;cnt.second=mov[0].second;
    for(int i=1;i<n;i++){
        if(mov[i].first>=cnt.second){
            ans++;
            cnt.first=mov[i].first;cnt.second=mov[i].second;
        }else{
            if(cnt.second>mov[i].second){
                cnt.first=mov[i].first;cnt.second=mov[i].second;
            }
        }
    }
    cout<<ans<<endl;
}