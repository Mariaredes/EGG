lista_estudiante = []
lista_edad = []
lista_pais = []

nombre = input("Hola me indicas tu nombre porfavor: ")
edad = int(input("Perfecto me indicas tu edad: "))
pais = input("Por ultimo de que pais eres: ")

# una forma de ingresar datos en elementos... INSERT()
lista_estudiante.insert(0,nombre)
lista_edad.insert(0, edad)
lista_pais.insert(0, pais)

nombre = lista_estudiante
edad = lista_edad
pais = lista_pais

# print(nombre, edad, pais)  # ['Jorge'] [35] ['Argentina']

# Lo ingresado por el usuario se almacena en la posicion 0
print(lista_estudiante[0], lista_edad[0],lista_pais[0]) # Jorge 35 Argentina


lista2_estudiante = []
lista2_edad = []
lista2_pais = []

nombre = input("Hola me indicas tu nombre porfavor: ")
edad = int(input("Perfecto me indicas tu edad: "))
pais = input("Por ultimo de que pais eres: ")

# una forma de ingresar datos en elementos...APPEND()
lista2_estudiante.append(nombre)
lista2_edad.append(edad)
lista2_pais.append(pais)

# Lo ingresado por el usuario se almacena en la posicion 0
print(lista2_estudiante[0], lista2_edad[0],lista2_pais[0]) # Jorge 35 Argentina
