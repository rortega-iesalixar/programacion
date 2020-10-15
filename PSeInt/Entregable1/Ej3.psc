Proceso Ej3
	
	Definir altura Como Entero
	Definir alturamedia Como Real
	Definir x, i Como Entero
	
	Escribir "Por favor, introduzca la altura (número impar mayor o igual a 5):"
	leer altura
	alturamedia <- (altura + 1) / 2
	
	Si altura = 5 o altura > 5 Entonces
		Para x <- 1 Hasta altura Hacer
			
			Para i <- 1 Hasta 6 Hacer
				
				Si x = 1 Entonces
					Escribir Sin Saltar "M"
				FinSi
				
				Si x = alturamedia Entonces
					Escribir Sin Saltar "M"
				FinSi
				
				Si x = altura Entonces
					Escribir Sin Saltar "M"
				FinSi
				
				Si i = 1 Entonces
					Escribir Sin Saltar "M"
				FinSi
				
				
				
			FinPara		
			Escribir ""
		FinPara
	FinSi
	
		
FinProceso
