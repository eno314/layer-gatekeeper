package jp.eno314

import org.gradle.api.Plugin
import org.gradle.api.Project

class PackageGatekeeperPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        project.task("helloPackageGatekeeperPlugin") {
            it.doLast {
                println("Hello, jp.eno314.PackageGatekeeperPlugin!")
            }
        }
    }
}
