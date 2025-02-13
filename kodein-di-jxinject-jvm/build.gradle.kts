plugins {
    id("org.kodein.library.jvm")
}

dependencies {
    api(projects.kodeinDi)
    api(libs.javax.inject)

    testImplementation(project(":test-utils"))
}

kodeinUpload {
    name = "Kodein-JxInject"
    description = "Kodein extension that enables to auto-inject with JSR 330 javax.inject annotations"
}
