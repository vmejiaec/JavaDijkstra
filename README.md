# JavaDijkstra
Versión simple de Dijkstra para grafos ponderados
Dijkstra							
Grafo							
	Nodos						
		A					
		B					
		C					
		D					
		E					
		F					
	Vertices						
		A,B	7				
		A,C	9				
		A,D	14				
		B,D	10				
		B,E	15				
		C,D	2				
		C,F	11				
		D,E	6				
		D,F	9				
		E,F	4				
							
Estado 1	Nodo	d	visitado	camino			
	A	0	No				
	B	100	No				
	C	100	No				
	D	100	No				
	E	100	No				
	F	100	No				
							
Estado 2	Nodo	d	visitado	camino			
	A	0	Si				
					A,B	7	7
					A,C	9	9
					A,D	14	14
	B	7	No	A,B			
	C	9	No	A,C			
	D	14	No	A,D			
	E	100	No				
	F	100	No				
							
Estado 3	Nodo	d	visitado	camino			
	A	0	Si				
	B	7	Si	A,B			
					B,D	10	17
					B,E	15	22
	C	9	No	A,C			
	D	14	No	A,D			
	E	22	No	A,B-B,E			
	F	100	No				
							
Estado 3	Nodo	d	visitado	camino			
	A	0	Si				
	B	7	Si	A,B			
					B,D	10	17
					B,E	15	22
	C	9	Si	A,C			
					C,D	2	11
					C,F	11	20
	D	11	No	A,C - C, D			
	E	22	No	A,B - B,E			
	F	20	No	A,C - C,F			
							
Estado 4	Nodo	d	visitado	camino			
	A	0	Si				
	B	7	Si	A,B			
					B,D	10	17
					B,E	15	22
	C	9	Si	A,C			
					C,D	2	11
					C,F	11	20
	D	11	Si	A,C - C,D			
					D,E	6	17
					D,F	9	20
	E	17	No	A,C - C,D - D,E			
	F	20	No	A,C - C,F			
							
Estado 5	Nodo	d	visitado	camino			
	A	0	Si				
	B	7	Si	A,B			
					B,D	10	17
					B,E	15	22
	C	9	Si	A,C			
					C,D	2	11
					C,F	11	20
	D	11	Si	A,C - C,D			
					D,E	6	17
					D,F	9	20
	E	17	Si	A,C - C,D - D,E			
					E,F	4	21
	F	20	No	A,C - C,F			