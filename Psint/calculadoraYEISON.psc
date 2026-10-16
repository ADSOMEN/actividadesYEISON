Algoritmo calculadoraYEISON
	Definir num1,num2,resultado Como Real
	Definir operacion Como Caracter
	resultado=0
	
	Escribir "digite el numero 1"
	Leer num1
	Escribir "digite el numero 2"
	Leer num2
	escribir "que operacion desea realizar"
	Leer operacion
	
		Segun operacion Hacer
			"suma":
				resultado=num1+num2
			"resta":
				resultado=num1-num2
			"multiplicacion":
				resultado=num1*num2
				"dividir":
				resultado=num1/num2
			De Otro Modo:
				escribir"operacion invalida"
		Fin Segun
		Escribir "su resultado es ",resultado
	
FinAlgoritmo
