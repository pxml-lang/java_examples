plugins {
    application
}

dependencies {
    implementation ( files ( "lib/dev.pxml.core-0.8.0.jar" ) )
}

application {
    mainClass.set ( "dev.pxml.examples.Start" )
    // enable assertions
    applicationDefaultJvmArgs = listOf ( "-ea" )
}

java {
    toolchain {
        languageVersion.set ( JavaLanguageVersion.of(11) )
    }
}

tasks.withType<CreateStartScripts> {
    applicationName = "pxmlex";
}
