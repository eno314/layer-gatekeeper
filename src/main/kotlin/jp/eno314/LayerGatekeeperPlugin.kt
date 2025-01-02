package jp.eno314

import org.gradle.api.Plugin
import org.gradle.api.Project

class LayerGatekeeperPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        project.task("helloLayerGatekeeperPlugin") {
            it.doLast {
                println("Hello, jp.eno314.LayerGatekeeperPlugin!")
            }
        }
    }
}
