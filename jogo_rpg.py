#jogo rpg
#objetivo do jogo: ajude o Zed a encontrar a Princesa Leona.
# A princesa foi sequestrada por um feroz lobo chamado Warwick, ajude o Zed a encontrá-la e devolve-lá para a realeza.

import sys
print ("Num belo dia, a princesa Leona foi capturada por um lobo chamado Warwick. Foi oferecida uma recompensa para quem conseguir recuperá-la. Você tem a missão de encontrá-la para receber a recompensa misteriosa")
nome = input("Guerreiro, digite o seu nome: ")
print (nome, "lembre-se que você está de frente para LESTE, e houve boatos de que o lobo foi para SUL com a princesa, sabendo disso, para qual direção você deverá ir para a direita, esquerda, para frente ou para trás?")
direc = input("Direção: ")
if direc=="direita":
    print("Você encontrou rastros do lobo, e percebeu que ele foi para OESTE, sabendo disso para qual direção você deverá ir? direita, esquerta, para frente ou para trás?")
else:
    print("Poxa que pena, você errou a direção e não irá conseguir encontrar a princensa =( ")
    print(nome,'você completou 20% do jogo')
    sys.exit()
direc2 = input("Direção: ")
if direc2=="direita":
    print("Você está cada vez mais próximo da princesa, ouviu gritos á LESTE, para qual lado você deve ir para salvar a princesa? direita, esquerda, para frente ou para trás?")
else:
    print("você errou a direção, caiu na armadilha do lobo e foi devorado =( . Você morreu")
    print(nome,'você completou 40% do jogo')
    sys.exit()
direc3 = input("Próxima direção: ")
if direc3=="trás" or direc3=="tras" or direc3=="para trás" or direc3=="para tras":
    print("Você encontrou uma caverna...")
else:
    print(nome, "você errou a direção, caiu na armadilha do lobo e foi devorado =( . Você morreu")
    print(nome,'você completou 60% do jogo')
    sys.exit()
entrar = input("Você deseja entrar na caverna para salvar a princesa, sim ou não: ")
if entrar=="sim" or entrar=="Sim":
    print("Ao entrar na caverna, você se depara com o lobo prestes a devorar a princesa Leona")
else:
    print("Seu covarde, você não salvou a princesa, e foi executado pela realeza")
    print(nome,'você completou 80% do jogo')
print("Você tem um arco e flecha, uma espada e um pedaço de pau, escolha sabiamente um desses acessórios para lutar com o lobo e salvar a princesa")
acess= input("Qual dos acessórios você deseja pegar: ")
if acess=="pedaço de pau":
    print("Você fez a escolha certa, você acertou um golpe fatal com o pedaço de pau, matou o lobo e resgatou a princesa")
    print("Ao chegar com a princesa na realeza, você recebeu o título de principe e teve o direito de se casar com a princesa!!")
    print("Você terminou o jogo, PARABÉNS!!!!")
elif acess=="arco e flecha":
    print("Você não teve força suficiente para impulsionar a flecha e ela não penetrou na pele do lobo, fazendo com que ele te atacasse e te devorasse")
    print('você completou 90% do jogo')
    sys.exit()
else:
    print("A espada está enferrujada e cega, com isso você não conseguiu matar o lobo e foi devorado =( ")
    print('você completou 90% do jogo')
    sys.exit()
