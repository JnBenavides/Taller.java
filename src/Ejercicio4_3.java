let pacientes = [];

for (let i = 0; i < 8; i++) {
    let nombre = prompt("Ingrese el nombre del paciente " + (i + 1));
    pacientes.push(nombre);
}

let nombreBuscado = prompt("¿Qué nombre desea buscar?");

let posicion = -1;

for (let i = 0; i < 8; i++) {

    if (pacientes[i].toLowerCase() === nombreBuscado.toLowerCase()) {
        posicion = i;
        break;
    }
}

if (posicion !== -1) {
    console.log("Encontrado en la posición " + posicion);
} else {
    console.log("No encontrado");
}