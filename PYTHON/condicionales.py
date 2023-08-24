"""
Operadores de Comparacion
> mayor que
< menor que
>= mayor o igual que
<= menor o igual que
== igual que
!= diferente que
"""
"""
Operadores Lógicos
and
or
not
"""
"""
Estructura Condicional
if(expresion):
 'bloque 1'
elif(expresion):
 'bloque 2'   # se ejecuta si la exp anterior no se cumple
else:
    'bloque 3'
"""
print("Ingresa tu edad: ")
edad = int(input())

if edad <= 18:
    print("eres niño")
elif edad > 18 and edad <=30:
    print("eres joven")
elif edad > 30 and edad <=65:
    print("eres adulto")
else:
    print("eres jubilado")






