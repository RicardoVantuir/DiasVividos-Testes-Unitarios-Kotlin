fun diasVividos(): Int{
   println("Qual seu ano de nascimento?")
   var anoNascimento = readln().toInt()
   println("Qual o ano atual?")
   var anoHoje = readln().toInt()
   var anoInicial = anoNascimento
   var contagemAnos: Int = 0
   var contagemAnoBi: Int = 0
   var totalDias: Int = 365
   var result = 0

   while (anoInicial < anoHoje){
      if((anoInicial % 400 == 0) || anoInicial % 4 == 0 && anoInicial % 100 != 0){
         contagemAnoBi++
      }
      contagemAnos++
      anoInicial++
   }
   result = (contagemAnos * totalDias) + contagemAnoBi
   return result
}