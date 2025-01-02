package jp.eno314

open class LayerGatekeeperPluginExtension {

    private val dependencies: MutableList<Dependency> = mutableListOf()

    fun getDependencies(): List<Dependency> = dependencies

    fun dependency(config: Map<String, String>) {
        val from = config["from"] ?: error("Missing 'from'")
        val to = config["to"] ?: error("Missing 'to'")
        dependencies.add(Dependency(from, to))
    }

    data class Dependency(
        val from: String,
        val to: String,
    )
}
