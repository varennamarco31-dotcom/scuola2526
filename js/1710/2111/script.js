let dado = [
    {tipo: "d6",facce: 6,punteggi: [1,2,3,4,5,6]},
    {tipo: "d4",facce: 4,punteggi: [1,2,3,4]},
    {tipo: "d8",facce: 8,punteggi: [1,2,3,4,5,6,7,8]}
];

console.log(dado[0].tipo);
console.log(dado[0].facce);
console.log(dado[0].punteggi);
let tot = 0;

function lanciaDado(d) {
    let talots = Math.floor(Math.random() * d.punteggi.length);
    console.log(d.punteggi[talots]);
    return d.punteggi[talots];
}

function mostraLancio(d, idd) {
    let val = lanciaDado(d);   
    tot += val;                

    let id = document.getElementById(idd);
    let html = "";
    html += "<p>Valore estratto: " + val +" --- Numero facce: " + d.facce + "</p>";
    html += "<p>Punteggio totale: " + tot + "</p>";
    id.innerHTML = html;
}

function azzeraCont(idd){
    tot = 0;
    let html = "";
    document.getElementById(idd).innerHTML = html;
}

function superTiro(idd){
    let val1 = lanciaDado(dado[0]); 
    let val2 = lanciaDado(dado[1]); 
    let val3 = lanciaDado(dado[2]);

    tot += val1 + val2 + val3;

    let id = document.getElementById(idd);

    let html = "";
    html += 
        "<table border='1'>" +
            "<thead>" +
                "<tr>" +
                    "<th></th>" + 
                    "<th>Dado 1</th>" +
                    "<th>Dado 2</th>" +
                    "<th>Dado 3</th>" +
                "</tr>" +
            "</thead>" +
            "<tbody>" +
                "<tr>" +
                    "<td><b>Punteggi:</b></td>" +
                    "<td>" + val1 + "</td>" +
                    "<td>" + val2 + "</td>" +
                    "<td>" + val3 + "</td>" +
                "</tr>" +
                "<tr>" +
                    "<td><b>Facce:</b></td>" +
                    "<td>" + dado[0].facce + "</td>" +
                    "<td>" + dado[1].facce + "</td>" +
                    "<td>" + dado[2].facce + "</td>" +
                "</tr>" +
            "</tbody>" +
        "</table>" +
        "<p>Totale: " + tot + "</p>";

    id.innerHTML = html;
}