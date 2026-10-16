Algoritmo SumaYPromedioYEISON
    Definir numero, suma, contador Como Real
    Definir promedio Como Real
	
    suma <- 0
    contador <- 0
	
    Escribir "Ingrese un numero (negativo para terminar):"
    Leer numero
	
    Mientras numero >= 0 Hacer
        suma <- suma + numero
        contador <- contador + 1
		
        Escribir "Ingrese otro numero (negativo para terminar):"
        Leer numero
    FinMientras
	
    Escribir "La suma total es: ", suma
	
    Si contador > 0 Entonces
        promedio <- suma / contador
        Escribir "El promedio es: ", promedio
    SiNo
        Escribir "No se ingresaron numeros validos."
    FinSi
FinAlgoritmo