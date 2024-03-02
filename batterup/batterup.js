let n = parseInt(readline());
let hits = readline().split(' ');
let sum = 0;
let walks = 0;
for(let i = 0; i < n; i++) {
    if(parseInt(hits[i]) === -1) {
        walks++;
    } else {
        sum += parseInt(hits[i]);
    }
}
print(sum / (n - walks));