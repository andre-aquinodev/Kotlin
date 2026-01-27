package enums

/**
 * EXERCÍCIOS
 *
 * Crie 2 enums: Role (user, moderator, admin) e level (basic, medium, high). Cada role deve ter um level associado
 * e um método chamado canDelete(), que deve retornar um booleano indicando se o role tem permissão de exclusão
 * (apenas os admins têm essa permissão)
 */

fun main() {

    println(Role.ADMIN.level)
    println(Role.MODERATOR.canDelete())
    println(Role.ADMIN.canDelete())
}

enum class Role(val level: Level) {
    USER(Level.BASIC),
    MODERATOR(Level.MEDIUM),
    ADMIN(Level.HIGH);

    fun canDelete() = this == ADMIN

}

enum class Level {
    BASIC, MEDIUM, HIGH
}