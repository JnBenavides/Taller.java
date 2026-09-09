let n = Number(prompt("¿Cuántos números desea ingresar?"));

let arreglo = [];

for (let i = 0; i < n; i++) {
    arreglo.push(Number(prompt("Ingrese el número " + (i + 1))));
}

console.log("Arreglo original:");
console.log(arreglo);

for (let i = 0; i < n / 2; i++) {

    let temp = arreglo[i];

    arreglo[i] = arreglo[n - 1 - i];

    arreglo[n - 1 - i] = temp;
}

console.log("Arreglo invertido:");
console.log(arreglo);