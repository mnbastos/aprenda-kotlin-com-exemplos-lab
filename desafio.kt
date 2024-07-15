// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(var nome: String, var nivel: Nivel)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("Usuário ${usuario.nome} matriculado com sucesso na formação ${nome}!")
    }
}

fun main() {
    val usuario1 = Usuario("João", Nivel.BASICO)
    val usuario2 = Usuario("Maria", Nivel.INTERMEDIARIO)
    val usuario3 = Usuario("Pedro", Nivel.DIFICIL)

    val conteudo1 = ConteudoEducacional("Introdução à Programação")
    val conteudo2 = ConteudoEducacional("Desenvolvimento Web", 90)
    val conteudo3 = ConteudoEducacional("Banco de Dados", 120)

    val formacao = Formacao("Desenvolvimento de Software", listOf(conteudo1, conteudo2, conteudo3))

    formacao.matricular(usuario1)
    formacao.matricular(usuario2)
    formacao.matricular(usuario3)

    println("Inscritos na formação ${formacao.nome}:")
    formacao.inscritos.forEach { println(it.nome) }
}
