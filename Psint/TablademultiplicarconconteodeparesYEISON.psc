Algoritmo TablademultiplicarconconteodeparesYEISON
	
	
		Definir N, i, resultado, contadorPares Como Entero
		
		Escribir "Ingrese un numero entero:"
		Leer N
		
		contadorPares <- 0
		
		Para i <- 1 Hasta 10 Hacer
			resultado <- N * i
			
			Escribir N, " x ", i, " = ", resultado
			
			Si resultado MOD 2 = 0 Entonces
				contadorPares <- contadorPares + 1
			FinSi
		FinPara
		
		Escribir "Cantidad de resultados pares: ", contadorPares
FinAlgoritmo
		
		
		
	

