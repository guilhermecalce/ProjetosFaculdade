#Obrigatório utilizar, if/els ; While/For ; Funções e Listas/Vetores.
#Se trata de um jogo educaional com o tema sobre a coleta seletiva.

import sys
print("--------------- JOGUE AGORA POR UM MUNDO MAIS VERDE ------------------")
print()

print("Regras do jogo : O jogo tem 10 etapas, para avançá-las você deverá acertar todas as perguntas. Se errar alguma pergunta, você perderá o jogo e sabera o quanto de pontuação conseguiu até chegar em tal fase do jogo. E se você avançar todas as etapas e salvar o jogo, uma premiação lhe será concedida!!! Boa Sorte!!!")
print()
nome = input("Usuário, por favor digite o seu nome : ")
print()
print("Bom dia,você acaba de iniciar sua jornada para ajudar o meio ambiente. O jogo tem como objetivo te auxiliar a fazer a escolha correta após consumir qualquer tipo de alimento ou utilizar qualquer tipo de material!!")
print()
print(nome, "você está preparado?")
print()
pgnt1 = input("Sim ou Não? ")
if pgnt1 == "sim":
    print("Ótimo, vamos lá!!")
elif pgnt1 == "Sim":
    print("Ótimo, vamos lá!!")
elif pgnt1 == "SIM":
    print("Ótimo, vamos lá!!")
else:

    print("jogo encerrado")
    sys.exit()

print()
print()
print("Antes de começar, daremos uma breve explicação sobre as cores da reciclagem que auxiliam a coleta seletiva.")
print()
print("A cor Azul se refere a materias que tem Papel como principal material na sua composição.")
print()
print("A cor Vermerlho o Plástico.")
print()
print("A cor Verde o Vidro.")
print()
print("A cor Amarelo o Metal.")
print()
print("A cor Laranja resíduos perigosos (que podem causar danos ao meio ambiente e aos seres humanos).")
print()
print("A cor Roxo resíduos radioativos.")
print()
print("A cor Marrom resíduos orgânicos.")
print()
print("E a cor Cinza resíduos gerais não reciclaveis.")
print()
print("Sabendo as cores da reciclagem de cada tipo de lixo, guarde essas informações para avançar de fase no jogo. Boa Sorte!!")
print()
print()
print()
print("Tudo pronto, vamos começar!!!")
print()
print("1) Vale 5 Pontos!! Boa Sorte!!")
print(nome, "você está na fila da cantina de sua escola com seus coleguinhas e ao chegar sua vez, você tem as seguintes opções de compras : ")
print()
lista = []
lista = ["Chocolate", "Refrigerante", "Suco", "Lanche"]
print(lista)
print()
print()
print("Os combos são : Chocolate e Suco (1) ; Chocolate e Refrigerante (2) ; Lanche e Suco (3) ; Lanche e Refrigerante (4)")
print()

def escolha (x):
    if x == 1:
        return "Você escolheu o combo 1, Chocolate e Suco!!"
    elif x == 2:
        return "Você o combo 2, Chocolate e Refrigerante!!"
    elif x == 3:
        return "Você escolheu o combo 3, Lanche e Suco !!"
    elif x == 4:
        return "Você escolheu o combo 4, Lanche e Refrigerante!!"
print()
    
def entrada ():
    print ("Escolha um desses combos para consumi-lo")
    print()
    n = int(input("Por favor digite o número do combo escolhido : "))
    while n < 1 or n > 4:
            print("Número fora do padrão, digite novamente por favor : ")
            n = int(input())
    return n
print()
print()
    
def main ():
    x = entrada()
    print(escolha(x))
    
    if x == 1:
        perguntau()
    elif x == 2:
        perguntad()
    elif x == 3:
        perguntat()
    elif x == 4:
        perguntaq()
print()

def perguntau():
        y = input("Sabendo que o chocolate tem a embalagem de plástico e o suco da marca Kapo com embalagem de papelão, em quais lixeiras coloridas você deve descartar as embalagens respectivamente?  ")
        if y == "vermelho e azul" or y == "vermelho e Azul" or y == "VERMELHO E AZUL":
            print("Resposta correta!!")
        else:
            print("Resposta errada, sua pontuação é de 0%")
def perguntad():
        y =input("Sabendo que o chocolate tem a embalagem de plástico e que o refrigerante é de latinha, em quais lixeiras coloridas você deve descartar as embalagens respectivamente?  ")
        if y == "vermelho e amarelo" or y ==  "Vermelho e Amarelo" or y == "VERMELHO E AMARELO":
            print("Resposta correta!!!")
        else:
            print("Resposta errada, sua pontuação foi de 0%")
def perguntat():
        y =input("Sabendo que o lanche vem acompanhado de guardanapos e que o suco da marca kapo tem uma embalagem de papelão, em quais das lixeiras coloridas você deve descartar as embalagens respectivamente?  ")
        if y == "Azul" or y == "azul" or y == "AZUL":
            print("Resposta correta!!")
        else:
            print("Resposta errada, sua pontuação foi de 0%")
def perguntaq():
        y = input("Sabendo que o lanche vem acompanhado de guardanapos e que o refrigente é de latinha, em quais das lixeiras coloridas você deve descartar as embalagens respectivamente?  ")
        if y == "Azul e Amarelo" or y == "azul e amarelo" or y == "AZUL E AMARELO":
            print("Resposta correta!!")
        else:
            print("Resposta errada, sua pontuação foi de 0%")
main()

           

def pergunta6():
    print ('''1) Se comprarmos uma latinha de coca-cola 300ml e um salgadinho com embalagem de plástico, em quais lixeiras coloridas deveremos descartar as embalagens respectivamente?
    a) Cinza e Azul
    b) Amarelo e Vermelho
    c) Verde e Amarelo
    d) Vermelho e Azul
    e) Amarelo e Azul
    ''')
    resp = input("Escolha a alternativa correta: ")
    if resp == "b" or resp == "B":
        print ("Você acertou")
    else:
        print (" você errou")


def pergunta7():
    print ('''02) Pedrinho decidiu ir ao mercado com a mãe, chegando lá ele comprou um Kapo e um Lanche Natural, chegando em casa ele tomou seu suco e não conseguiu comer o lanche inteiro, sabendo disso, em quais lixeiras coloridas Pedrinho deverá descartar o Kapo e o resto do lanche respectivamente?
    a) Verde e Vermelho
    b) Marrom e Azul
    c) Azul e Verde
    d) Azul e Marrom
    e) Amarelo e Azul
    ''')
    resp = input("Escolha a alternativa correta: ")
    if resp == "d" or resp == "D":
        print ("Você acertou")
    else:
        print (" você errou")
        
def pergunta8():
    print ('''03)Mário foi ao shopping com seus amigos, comprou uma caixa de bombom e uma coca-cola 600ml de vidro, ao consumir esses alimentos, em quais das lixeira coloridas Mário deve descartar as embalagens respectivamente?
    a) Azul e Verde 
    b) Verde e Amarelo
    c) Marrom e Verde 
    d) Azul e Vermelho 
    e) Verde e Azul
    ''')
    resp = input("Escolha a alternativa correta: ")
    if resp == "a" or resp == "A":
        print ("Você acertou")
    else:
        print (" você errou")

def pergunta9():
    print ('''4) Joãozinho estava limpando o seu quarto, e durante isso ele encontrou uma bateria que não funcionava mais de um de seus carrinhos. Ele pediu para que sua mãe guardasse para que ele descartasse corretamente aquela bateria. Sabendo disso, em qual lixeira colorida Joãozinho deve descartar a bateria?
    a) Azul
    b) Vermelho
    c) Laranja
    d) Verde
    e) Roxo''')
    resp = input("Escolha a alternativa correta: ")
    if resp == "c" or resp == "C":
        print ("Você acertou")
    else:
        print (" você errou")
        
def pergunta10():
    print ('''05) Gabriel estava separando alguns brinquedos seus que ele não brincava mais, com isso, ele achou dois carrinhos de madeira que ele não utilizava mais, a madeira estava podre e ele não queria doar para alguém com a madeira naquela situação. Em qual lixeira colorida Gabriel deverá descartar o seus carrinhos de madeira? 
    a) Roxo
    b) Amarelo
    c) Preto
    d) Verde
    e) Azul
    ''')
    resp = input("Escolha a alternativa correta: ")
    if resp == "c" or resp == "C":
        print ("Você acertou")
    else:
        print (" você errou")



pergunta6()
pergunta7()
pergunta8()
pergunta9()
pergunta10()
print("Parabéns!!!!! Você zerou o jogo, agora você tem um certificado digital de amigo da natureza!!! O Planeta te agradece!!!")


