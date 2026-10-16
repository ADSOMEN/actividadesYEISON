Algoritmo sin_titulo
	Definir base, altura,area,perimetro Como Real
	Escribir "digite la base"
	Leer base
	Escribir "digite la altura"
	Leer altura
	Si base>altura o altura>base Entonces
		area<-base*altura
		perimetro<-(base+altura)*2 
		Escribir "su area es ",area," su perimetro es ",perimetro;
	SiNo
		Escribir "no es un rectangulo"
	Fin Si
	
FinAlgoritmo