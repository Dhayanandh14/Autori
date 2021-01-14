s=input();
o = s[0];
for i in range(0,len(s)):
		if s[i] == '-' :
			o=o+ s[i + 1]
print (o)