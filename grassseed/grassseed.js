let cost = parseFloat(readline());
let lawns = parseInt(readline());
let total = 0;
for(let i = 0; i < lawns; i++) {
    let line = readline().split(' ');
    let w = parseFloat(line[0]);
    let h = parseFloat(line[1]);
    let m2 = w * h;
    let price = cost * m2;
    total += price;
}
print(total.toFixed(7));