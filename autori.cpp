
#include <iostream>
#include<string.h>
using namespace std;

 int main() {
	string input, output;
	cin >> input;
	output += input[0];
	for (int i = 0; i < input.length(); ++i) {
		if (input[i] == '-') {
			output += input[i + 1];
		}
	}
	cout << output;
}