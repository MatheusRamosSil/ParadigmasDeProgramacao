# lê um vetor de 8 posições e, em seguida, 
# lê dois valores X e Y quaisquer correspondentes a duas posições no vetor. 
# O programa então imprime a soma dos valores encontrados nas respectivas posições X e Y.
#

def validatePositionVector(positionElementVectorX, positionElementVectorY):

   while (not (0<= positionElementVectorX <=8) or (0<= positionElementVectorY <= 8)):
        
        if ( not (0<= positionElementVectorX <=8)):
           print("Valor invalido para a posição X, valor valido entre 0 e 8\n")
           positionElementVectorX = int(input("Digite o valor de novamente X: "))
        
        if ( not(0<= positionElementVectorY <= 8)):
            print("Valor invalido para a posição Y, valor valido entre 0 e 8\n")
            positionElementVectorY = int(input("Digite o valor de novamente Y: "))
        
        
        
  
def main():

    vector = [0] * 8
    sizeVector = len(vector)
    for indice in range(0, sizeVector):
        vector[indice] = int(input("Digite um valor para a posição {}: ".format(indice)))

    positionElementVectorX = int(input("Digite o valor de X: "))
    positionElementVectorY = int(input("Digite o valor de Y: "))
    
    validatePositionVector(positionElementVectorX, positionElementVectorY)
    
    sumElementsVector = vector[positionElementVectorX] +vector[positionElementVectorY]
    mediaElementsVector = sumElementsVector / indice

    print("A soma dos valores encontrados nas respectivas posições {} e {} é igual a {}".format(positionElementVectorX, positionElementVectorY, sumElementsVector))
    print("A média dos elementos do vector{}".format(mediaElementsVector))

if __name__ == "__main__":
      main()