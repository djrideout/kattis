let numCases = parseInt(readline());
for(let i = 0; i < numCases; i++) {
    let numVisits = parseInt(readline());
    let uniqueCityVisits = 0;
    let cities = [];
    for(let j = 0; j < numVisits; j++) {
        let city = readline();
        if(cities[city] !== 5) {
            cities[city] = 5;
            uniqueCityVisits++;
        }
    }
    print(uniqueCityVisits);
}