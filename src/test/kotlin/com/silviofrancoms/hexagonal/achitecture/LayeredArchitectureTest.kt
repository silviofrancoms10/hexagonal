package com.silviofrancoms.hexagonal.achitecture

import com.tngtech.archunit.junit.AnalyzeClasses
import com.tngtech.archunit.junit.ArchTest
import com.tngtech.archunit.library.Architectures.layeredArchitecture

@AnalyzeClasses(packages = ["com.silviofrancoms.hexagonal"])
class LayeredArchitectureTest {

    @ArchTest
    val `layered architecure test` =  layeredArchitecture()
        .consideringAllDependencies()
        .layer("AdaptersIn").definedBy("..adapters.in..")
        .layer("AdaptersOut").definedBy("..adapters.out..")
        .layer("UseCase").definedBy("..application.core.usecase..")
        .layer("PortsIn").definedBy("..application.ports.in..")
        .layer("PortsOut").definedBy("..application.ports.out..")
        .layer("Config").definedBy("..config..")
        .whereLayer("AdaptersIn").mayOnlyBeAccessedByLayers("Config")
        .whereLayer("AdaptersOut").mayOnlyBeAccessedByLayers("Config")
        .whereLayer("UseCase").mayOnlyBeAccessedByLayers("Config")
        .whereLayer("PortsIn").mayOnlyBeAccessedByLayers("UseCase", "AdaptersIn")
        .whereLayer("PortsOut").mayOnlyBeAccessedByLayers("UseCase", "AdaptersOut")
        .whereLayer("Config").mayNotBeAccessedByAnyLayer()
}