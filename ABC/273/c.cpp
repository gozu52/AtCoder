#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

int main() {
    int n;cin>>n;
    int a[n],b[n]={};
    vector<int> c;
    set<int> st;
    for(int i=0;i<n;i++){
        cin>>a[i];
        st.insert(a[i]);
    }
    for(int e:st)c.push_back(e);
    sort(b,b+n);
    sort(c.begin(),c.end());
    for(int i=0;i<n;i++){
        int ans = upper_bound(c.begin(),c.end(),a[i])-c.begin();
        if(c[c.size()-1]==a[i])b[0]++;
        else b[c.size()-ans]++;
    }
    for(int i=0;i<n;i++)cout<<b[i]<<endl;
}