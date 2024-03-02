let first = readline();
let firsts = first.split(' ');
let n = parseInt(firsts[0]);
let w = parseInt(firsts[1]);
let h = parseInt(firsts[2]);
for(let i = 0; i < n; i++) {
    let num = parseInt(readline());
    let diagonal = Math.sqrt(w * w + h * h);
    if(num <= diagonal) print('DA');
    else print('NE');
}
