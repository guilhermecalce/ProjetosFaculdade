#Detran cobra 2,5% para carros fabricados antes de 2010.
#E uma taxa de 3,5% para carros fabricados em 2010 em diante.
#Exibir preço, ano e taxa do carro.
valor = float(input("Digite o valor do veículo : "))
print ("O valor do veículo é  : ", valor)
ano = int(input("Digite o ano do Veículo : "))
print ("O veículo é do ano de : ", ano)
if ano >= 2010:
 print("A taxa de 3,5% deverá ser aplicada, logo você terá de pagar um valor no total de  : ", valor*0.035)
else:
    print("A taxa de 2,5% deverá ser aplicada, logo você terá de pagar um valor no total de  : ", valor*0.025)
    
