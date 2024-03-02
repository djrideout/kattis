let line = readline().split(' ');
let wcm = {};
let hasDupes = false;
for(let i = 0; i < line.length; i++) {
    if(wcm.hasOwnProperty(line[i])) {
        hasDupes = true;
        break;
    } else {
        wcm[line[i]] = 'hello';
    }
}
if(hasDupes) print('no');
else print('yes');