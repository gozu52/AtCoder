#include <bits/stdc++.h>
using namespace std;

int n,m;
vector<int> a;
int main(){
    cin >> n>>m;
    for(int i=0;i<n;i++)a.push_back(0);
    for(int i=0;i<m-n;i++)a.push_back(1);
    do{
        for(int i=0;i<m;i++){
            if(a[i]==0)cout<<i+1<<" ";
        }
        cout<<endl;
    }while(next_permutation(a.begin(),a.end()));
}