plugins {
    id("org.kodein.library.mpp")
}

kodein {
    kotlin {

        common {
            main.dependencies {
                api(projects.kodeinDi)
            }

            test.dependencies {
                implementation(project(":test-utils"))
            }
        }

        add(kodeinTargets.jvm.jvm) {
            target.setCompileClasspath()
        }

        add(kodeinTargets.js.js)

        add(kodeinTargets.native.allDarwin)

    }
}

kodeinUpload {
    name = "Kodein-JxInject"
    description = "Kodein that can be use with JSR-330: Using reflexivity to auto-inject"
}
