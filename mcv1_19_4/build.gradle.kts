/*
 * This file was generated by the Gradle 'init' task.
 *
 * This project uses @Incubating APIs which are subject to change.
 */

plugins {
    id("dev.geco.gsit.java-conventions")
    id("io.papermc.paperweight.userdev") version "1.5.11"
}

dependencies {
    api(project(":mcv1_19_3"))
    paperweight.paperDevBundle("1.19.4-R0.1-SNAPSHOT")
}

description = "mcv1_19_4"
