@file:Suppress("UnstableApiUsage")

pluginManagement {
    repositories {
        gradlePluginPortal()
        maven(url = "https://mirrors.cloud.tencent.com/nexus/repository/maven-public/")
        maven(url = "https://maven.aliyun.com/repository/public")
        mavenCentral()
    }
}

dependencyResolutionManagement {
    // 禁止其他模块单独声明仓库镜像源
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)

    repositories {
        maven(url = "https://mirrors.cloud.tencent.com/nexus/repository/maven-public/")
        maven(url = "https://maven.aliyun.com/repository/public")
        mavenCentral()
    }
}


rootProject.name = "sharefile"
