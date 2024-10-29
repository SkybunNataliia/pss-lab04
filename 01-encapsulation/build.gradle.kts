plugins {
  java
  checkstyle
  application
}

repositories {
  mavenCentral()
}

application {
    mainClass.set("it.unibo.encapsulation.TestAllClasses")
}