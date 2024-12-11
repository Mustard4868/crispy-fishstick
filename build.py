import os

files = [] # List of files to be compiled.

for file in os.listdir('./src/'):
    if file.endswith('.kt'):
        files.append(file)

if len(files) > 0:
    cmd = 'kotlinc ' + ' '.join(files) + ' -include-runtime -d app.jar'
    print(cmd)