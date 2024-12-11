import os

files = [] # List of files to be compiled.

for file in os.listdir('./src/'):
    if file.endswith('.kt'):
        files.append('./src/' + file)

amount = len(files)
if amount > 0:
    echo = "Finished compiling " + str(amount) + " file"
    if amount > 1:
        echo += "s"
    cmd = 'kotlinc ' + ' '.join(files) + ' -include-runtime -d app.jar'
    os.system(cmd), print(echo)
