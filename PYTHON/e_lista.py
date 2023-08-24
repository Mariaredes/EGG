# Listas = contenedores de datos mutables
# muchos elementos de igual o distinto tipo
# se conforma de elementos ordenados con una posicion llamada indice
# son dinamicas (redimensionales)
# se puede extraer un unico valor mediante indice
# Ej confirmacion en una lista de invitados

# Sintaxis =se utiliza corchete

# Declaraciones
        #     0        1       2      3    subindice adelante
courses = ['Python','Django','Ruby','Rust'] # Len = 4 
        #    -4       -3       -2    -1     subindice atras

# Declaracion con funcion list
#numbers = list [1,2,3,4,5]

lista_bool = [True, False, (-5 < 10)]

# Lista con diferentes tipos
lista = [10.3, 14,"hola","hola", True]
print (lista)

# Conocer el tamaño de la lista
print(len(lista))

# Conocer el indice de un elemento
print(lista.index("hola"))

# Cuantas veces se repite un elemento
print(lista.count("hola"))

# Modificar elemento de una lista
lista[2] = "mundo"

# Agregar elemento al ultimo de la lista
lista.append("Sabado")

# Agregar elemento mediante subindice se corre el prox elemento
lista.insert(2,44)

# Eliminar elementos mediante subindice
del lista[2]

# Elimina elemento conocido contenido en la lista
lista.remove("Sabado")

# Elimina el ultimo elemento y lo guarda por si queremos usarlo despues
ultimoElemento = lista.pop()


# Acceso a elementos mediante subindice
print(lista)
print("El ultimo elemento fue: ", ultimoElemento)
print(lista[2])
print(lista[-1])

# Ordenar la lista
numbers = [10,10,10,1,8,3,7]
original = numbers.copy() # copia la lista original
print(original)

numbers_asc = numbers.copy()
numbers_asc.sort() # ordena ascendente
print(numbers_asc)

numbers_desc = numbers.copy()
numbers_desc.sort(reverse=True) # ordena descendente
print(numbers_desc)

# Combinar listas
# Asignar calificaciones

alumnos = ['Jorge', 'Maria', 'Celeste']
apellidos = ['Diaz','Salto', 'Aredes']
calificaciones = [8,9,10]

print("Nombre completo del alumno: ", alumnos[1], apellidos[2], ".Calificacion: ",calificaciones[0])
alumnos.sort()
print(alumnos)

alumnos.reverse()
print(alumnos)

