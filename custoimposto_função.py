#imposto
def soma (taxa, custo):
    return(0.01 * taxa) *custo + custo
#main
taxa = float(input("Digite o valor da taxa : "))
custo = float(input("Digite o valor do custo : "))


print("O resultado da soma da taxa com o imposto é de :", soma(taxa, custo))

    
