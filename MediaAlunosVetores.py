#pede 4 nota de 10 alunos, calcule, armazene num vetor a média de cada alumo e imprima o numero de alunos com média maior ou igual a 7
lista_media = []
def entrada():
    print("Digite 4 notas : ")
    for i in range (3):
        acum = 0
        print("Notas do aluno %d " %(i+1))
        for i in range (4):
            n = float(input())
            while n < 0  or n > 10:
                print("Nota fora do padrão, digite novamente")
                n = float(input())
            acum += n
            m = acum/4
        lista_media.append(m)

def aprovados ():
    ct = 0
    for x in lista_media:
        if x >= 7.0:

            ct += 1
    return ct

def saida(ap):
    print("Média dos alunos = ", lista_media)
    print("Quantidade de aprovados : ", ap)

def main ():
    entrada()
    ap = aprovados ()
    saida(ap)

main()
