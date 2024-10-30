plugins {
  java
  checkstyle
  application
}

repositories {
  mavenCentral()
}

application {
    mainClass.set("IT.UNIBO.qa.Cat")
}
