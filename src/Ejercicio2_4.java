let anio = Number(prompt("Ingrese el año:"));

let bisiesto = (anio % 4 === 0 && anio % 100 !== 0) ||
               (anio % 400 === 0);

if (bisiesto) {
    console.log(anio + " es bisiesto");
} else {
    console.log(anio + " no es bisiesto");
}

let dia = Number(prompt("Ingrese un número del 1 al 7:"));
let nombreDia;

switch (dia) {
    case 1:
        nombreDia = "Lunes";
        break;
    case 2:
        nombreDia = "Martes";
        break;
    case 3:
        nombreDia = "Miércoles";
        break;
    case 4:
        nombreDia = "Jueves";
        break;
    case 5:
        nombreDia = "Viernes";
        break;
    case 6:
        nombreDia = "Sábado";
        break;
    case 7:
        nombreDia = "Domingo";
        break;
    default:
        console.log("Número fuera de rango");
}

if (nombreDia !== undefined) {
    console.log(nombreDia);
}