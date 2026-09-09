let tipo = Number(prompt("Ingrese el tipo de vehículo (1, 2 o 3):"));
let horas = Number(prompt("Ingrese las horas:"));

let primeraHora;
let horaAdicional;

switch (tipo) {
    case 1:
        primeraHora = 2000;
        horaAdicional = 1500;
        break;

    case 2:
        primeraHora = 4000;
        horaAdicional = 3000;
        break;

    case 3:
        primeraHora = 5000;
        horaAdicional = 4000;
        break;

    default:
        console.log("Tipo de vehículo no válido");
        break;
}

if (primeraHora !== undefined) {
    let total = primeraHora + horaAdicional * (horas - 1);
    console.log("Total a pagar: $" + total);
}