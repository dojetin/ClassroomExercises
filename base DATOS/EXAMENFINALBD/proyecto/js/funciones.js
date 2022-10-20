var num1 = 0;
var num2 = 0;
var cuadrado = 0;
var circulo = 0;
var triangulo = 0;


function calcula() {

    num1 = document.getElementById("primer").value
    num2 = document.getElementById("segundo").value
    console.log(num1)
    console.log(num2)
    if (!isNaN(num1) && !isNaN(num2)) {
        document.getElementById("resultado").value = parseFloat(num1) + parseFloat(num2);
        console.log("son numeros")
    } else {
        document.getElementById("resultado").value = num1 + num2;
    }

    console.log(document.getElementById("resultado").value)

}

function cambiofoto() {
    document.getElementById("foto").src = "./imagenes/familia.jpg"

}

function cambiofotos() {
    document.getElementById("foto").src = "./imagenes/lisa.png"

}

function cambiofotoss() {
    document.getElementById("foto").src = "./imagenes/bart.jpg"

}

function sumacua() {
    cuadrado++;
    if (cuadrado > circulo && cuadrado > triangulo) {
        document.getElementById("resultado").value = "cuadrado";
    }
    console.log("El cuadrado ha sido pulsado " + cuadrado + " veces")
    console.log("El circulo ha sido pulsado " + circulo + " veces")
    console.log("El triangulo ha sido pulsado " + triangulo + " veces")
}

function sumacir() {
    circulo++;
    if (circulo > cuadrado && circulo > triangulo) {
        document.getElementById("resultado").value = "circulo";
    }
    console.log("El cuadrado ha sido pulsado " + cuadrado + " veces")
    console.log("El circulo ha sido pulsado " + circulo + " veces")
    console.log("El triangulo ha sido pulsado " + triangulo + " veces")
}

function sumatri() {
    triangulo++;
    if (triangulo > cuadrado && triangulo > circulo) {
        document.getElementById("resultado").value = "triangulo";
    }
    console.log("El cuadrado ha sido pulsado " + cuadrado + " veces")
    console.log("El circulo ha sido pulsado " + circulo + " veces")
    console.log("El triangulo ha sido pulsado " + triangulo + " veces")
}