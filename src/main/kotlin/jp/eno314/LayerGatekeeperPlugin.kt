package jp.eno314

import org.gradle.api.Plugin
import org.gradle.api.Project

class LayerGatekeeperPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        val layerGatekeeper = project.extensions.create("layerGatekeeper", LayerGatekeeperPluginExtension::class.java)
        project.task("helloLayerGatekeeperPlugin") {
            it.doLast {
                layerGatekeeper.getDependencies().forEach { dependency ->
                    println("Dependency from ${dependency.from} to ${dependency.to}")
                }
            }
        }
    }
}
