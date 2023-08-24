print("HOLA".lower()) #todo minuscula

print("hola".upper()) #todo mayuscula

print("hola".capitalize()) #solo primera mayuscula

# Sintaxis de la función

# definición : nombre(parametro)
def saludar(nombre):     
    """print("Hola bienvenido al juego de Cody" )"""
# codigo de la función
    return "Hola {} ! bienvenid@ al juego de Cody!!".format(nombre)

print("Ingresa tu nombre: ")
nombre = input()

# llamdo a la función
print (saludar(nombre))

# retorno de valor
"""
pueden o no retornar valor
puede o no tener parametros

"""
#corregir
def suma():
    a = 10
    b = 11
    resultado = int(a + b)
    return resultado

def resta(a,b):
    resultado = int(a - b)
    return resultado

    print(resultado)

    print(resta(3,13)) # aqui ingreso valores y pido que imprima