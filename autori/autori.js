let line = readline().split('-');
let abbr = '';
for(let i = 0; i < line.length; i++) {
    abbr += line[i].charAt(0);
}
print(abbr);