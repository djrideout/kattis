let x = readline();
let n = readline();

let total = x * n;

let line;
while(line = readline()) {
    total -= parseInt(line);
}

let result = parseInt(total) + parseInt(x)
print(result);
