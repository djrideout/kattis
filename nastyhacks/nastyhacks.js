let n = parseInt(readline());
for(let i = 0; i < n; i++) {
    let linesplit = readline().split(' ');
    let r = parseInt(linesplit[0]);
    let e = parseInt(linesplit[1]);
    let c = parseInt(linesplit[2]);
    let delta = e - r;
    if(delta > c) print('advertise');
    else if(delta === c) print('does not matter');
    else print('do not advertise');
}