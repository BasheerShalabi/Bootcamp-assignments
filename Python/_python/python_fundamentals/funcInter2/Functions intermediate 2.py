x = [ [5,2,3], [10,8,9] ] 
students = [
    {'first_name':  'Michael', 'last_name' : 'Jordan'},
    {'first_name' : 'John', 'last_name' : 'Rosales'}
]
sports_directory = {
    'basketball' : ['Kobe', 'Jordan', 'James', 'Curry'],
    'soccer' : ['Messi', 'Ronaldo', 'Rooney']
}
z = [ {'x': 10, 'y': 20} ]




x[1][0]=15

students[0]["last_name"] = "Bryant"

sports_directory['soccer'][0]="Andres"

z[0]['y']= 30

students = [
        {'first_name':  'Michael', 'last_name' : 'Jordan'},
        {'first_name' : 'John', 'last_name' : 'Rosales'},
        {'first_name' : 'Mark', 'last_name' : 'Guillen'},
        {'first_name' : 'KB', 'last_name' : 'Tonel'}
    ]

def iterateDictionary(dict):
    for i in range(len(dict)):
        print(f" first_name - {dict[i]['first_name']}, last_name - {dict[i]['last_name']} ")

def iterateDictionary2(key,dict):
    for i in range(len(dict)):
        print(dict[i][key])


iterateDictionary(students)

iterateDictionary2('first_name',students)
iterateDictionary2('last_name',students)


dojo = {
    'locations': ['San Jose', 'Seattle', 'Dallas', 'Chicago', 'Tulsa', 'DC', 'Burbank'],
    'instructors': ['Michael', 'Amy', 'Eduardo', 'Josh', 'Graham', 'Patrick', 'Minh', 'Devon']
}


def printInfo(dict):
    for i in dict.keys():
        print(len(dict[i]),i.upper())
        for j in dict[i]:
            print(j)
        print("\n")

printInfo(dojo)