let edad = -1;

while (edad < 1 || edad > 120) {

    edad = Number(prompt("Ingrese su edad:"));

    if (edad < 1 || edad > 120) {
        console.log("Edad inválida, intenta de nuevo");
    }
}

let etapa;

if (edad <= 12) {
    etapa = "Niñez";
} else if (edad <= 17) {
    etapa = "Adolescencia";
} else if (edad <= 25) {
    etapa = "Juventud";
} else if (edad <= 59) {
    etapa = "Adultez";
} else {
    etapa = "Tercera edad";
}

console.log("Edad: " + edad);
console.log("Etapa: " + etapa);