Proceso U1T5
//	Definir pass Como Entero
//	
//	Escribir "Introduzca contraseña:"
//	Leer pass
//	
//	Mientras pass <> 1234 Hacer
//		Escribir "Contraseña erronea, vuelva a intentarlo:"
//		Leer pass
//	Fin Mientras
	//	Escribir "Contraseña correcta, bienbenido!"
	
//	Definir num1 Como Entero
//	Definir num2 Como Entero
//	
//	Escribir "Introduzca un número:"
//	Leer num1
//	Escribir "Introduzca otro número:"
//	Leer num2
//	
//	Mientras num1 <> 0 o num2 <> 0 Hacer
//		Escribir "La suma es: " num1 + num2
//		Escribir "Introduzca un número:"
//		Leer num1
//		Escribir "Introduzca otro número:"
//		Leer num2
//	FinMientras
//	
	//	Escribir "Fin de la suma."
	
	Definir num1 Como Entero
	Definir num2 Como Entero
	Definir total Como Entero
	Definir resp	Como Entero
	num1 <- Azar(101)
	num2 <- Azar(101)
	total <- num1 + num2
	
	Escribir "Suma: " num1 " + " num2 " = "
	Leer resp
	
	Mientras resp <> total Hacer
		num1 <- Azar(101)
		num2 <- Azar(101)
		total <- num1 + num2
		
		Escribir "Otra vez, suma: " num1 " + " num2 " = "
		Leer resp
	Fin Mientras
	
	Escribir "Correcto!"
	
	
FinProceso
