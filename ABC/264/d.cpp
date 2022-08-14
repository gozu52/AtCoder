#include <bits/stdc++.h>
using namespace std;
typedef long long ll;

string str;
vector<char> s;
int cnt = 0;

void swap(int num){
    char tmp = s[num];
    s[num] = s[num-1];
    s[num-1] = tmp;
}

int main(){
    cin>>str;
    for(int i=0;i<str.size();i++)s.push_back(str.at(i));
    // s = str;
    char t[] = {'a','t','c','o','d','e','r'};
    for(int i=0;i<7;i++){
        for(int j=0;j<s.size();j++){
            if(t[i]==s[j]){
                if(i==j)continue;
                while(i!=j){
                    swap(j);
                    j--;cnt++;
                }
            }
        }
    }
    cout<<cnt<<endl;
}