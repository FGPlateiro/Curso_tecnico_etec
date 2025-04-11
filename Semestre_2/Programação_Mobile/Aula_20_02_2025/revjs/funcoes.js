a = 7
b = 4

function somaSImples () {
    return a + b
}

function somaComParametros (n1, n2){
    return n1 + n2
}

// arrow function
const potencia = (n, e) => {
     console.log(`${a} elevado ${b} é ${Math.pow(n, e)} `)
}

potencia(a, b)
console.log(somaSImples())
console.log(somaComParametros(a, b))