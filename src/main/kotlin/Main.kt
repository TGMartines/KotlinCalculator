fun soma(num1: Int, num2: Int): Int {
    return num1 + num2
}
fun subtracao(num1: Int, num2: Int): Int {
    return num1 - num2
}
fun multiplicacao(num1: Int, num2: Int): Int {
    return num1 * num2
}
fun divisao(num1: Int, num2: Int): Int {
    return (num1 / num2)
}


fun main() {
    var continuar = true
    while (continuar){
        println("1- Calcular a soma de dois números.\n2- Calcular a subtração de dois números.")
        println("3- Calcular a multiplicação de dois números.\n4- Calcular a divisão de dois números.\n5- Encerrar o atendimento.")

        var opcao = readLine()?.toIntOrNull() ?: 0
        when(opcao) {
            1, 2, 3, 4 -> {
            print("Digite um número: ")
            val num1 = readLine()?.toIntOrNull() ?: 0
            print("Digite outro número: ")
            val num2 = readLine()?.toIntOrNull() ?: 0

                when(opcao) {
                                1 -> println("O resultado da soma de $num1 e $num2 é: ${soma(num1, num2)}")
                                2 -> println("O resultado da subtração de $num1 e $num2 é: ${subtracao(num1, num2)}")
                                3 -> println("O resultado da multiplicação de $num1 e $num2 é: ${multiplicacao(num1, num2)}")
                                4 -> println("O resultado da divisão de $num1 e $num2 é: ${divisao(num1, num2)}")
                }
            }
            5 -> {
                println("Obrigado por utilizar nosso serviço. Volte Sempre!")
                continuar = false
            }
            else ->  println("Opção inválida!")
        }
    }
}