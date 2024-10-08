data class Pais(var habitantes: Double, val taxaCrescimento: Double) {
    fun crescerPopulacaoAnual() { 
       habitantes *= (1 + taxaCrescimento / 100)
    }
  }
  
  fun main() {
    val habitantesPaisA = 100000!!.toDouble();
    val habitantesPaisB = 200000!!.toDouble();
    val paisA = Pais(habitantesPaisA, taxaCrescimento = 3.0)
    val paisB = Pais(habitantesPaisB, taxaCrescimento = 1.5)
    
    var quantidadeAnos = 0
    while (paisA.habitantes < paisB.habitantes) {
      paisA.crescerPopulacaoAnual()
      paisB.crescerPopulacaoAnual()
      quantidadeAnos++
    }
    
    println("$quantidadeAnos anos")
  }