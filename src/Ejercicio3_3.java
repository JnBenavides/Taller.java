let secreto = Math.floor(Math.random() * 100) + 1;
let intentos = 0;
let numero;

do {
    numero = Number(prompt("Adivina el número (1 al 100):"));

    intentos++;

    if (numero > secreto) {
        console.log("El número es menor");
    } else if (numero < secreto) {
        console.log("El número es mayor");
    } else {
        console.log("¡Correcto! Lo lograste en " + intentos + " intentos");
    }

} while (numero !== secreto);