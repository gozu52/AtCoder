#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int cnt[200];

ll nCr(int num){
    ll sum = 1;
    for(int i=num-2;i<=num;i++)sum*=i;
    return sum/6;
}

int main() {
    int n,a;cin>>n;
    ll ans = 0;
    for(int i=0;i<n;i++){
        cin>>a;cnt[a]++;
    }
    for(int i=1;i<=100;i++){
        if(cnt[i]<3)continue;
        if(cnt[i]==3)ans += 1;
        else {
            ans += nCr(cnt[i]);
        }
    }
    cout<<ans<<endl;
}