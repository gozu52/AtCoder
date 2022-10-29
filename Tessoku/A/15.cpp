#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

vector<int>a,b;

int main() {
    int n;cin>>n;
    set<int> st;
    for(int i=0;i<n;i++){
        int tmp;cin>>tmp;
        a.push_back(tmp);
        st.insert(tmp);
    }
    for(int e:st)b.push_back(e);
    sort(b.begin(),b.end());
    b.erase(unique(b.begin(),b.end()),b.end());
    for(int i=0;i<n;i++){
        int ans = lower_bound(b.begin(),b.end(),a[i])-b.begin();
        cout<<ans+1<<" ";
    }
    cout<<endl;
}