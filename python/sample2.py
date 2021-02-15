line = "lAbhishek kallia is cool As fuck"
line = line.lower()
lline = line.rstrip().split(" ")
dic = {}
mylist = []
for word in lline:
    for i in word:
        mylist.append(i)
for i in mylist:
    if i not in dic.keys():
        dic[i] = mylist.count(i)
k = list(dic.keys())
v = list(dic.values())
print(k[v.index(max(v))])