let n = Number(prompt("Ingrese un número:"));

console.log("Tabla del " + n);

for (let i = 1; i <= 12; i++) {
    console.log(n + " x " + i + " = " + (n * i));
}

console.log("\nCuadrícula:");

for (let fila = 1; fila <= n; fila++) {

    for (let columna = 1; columna <= 12; columna++) {
        console.log(fila + " x " + columna + " = " + (fila * columna));
    }

    console.log("----------------");
}