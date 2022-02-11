# Maven Kata

Welcome to maven kata, as part of this exercise we will learn how to use maven to build projects and
generate artifacts/apps.

As part of exercises on this branch you can only change maven settings/configurations, simply
run `./mvnw` and solve issues that keep showing up.

# Expected understanding after the kata
1. Maven lifecycle
   1. Phases
   2. Goals
2. Maven dependency management
3. Maven plugins and usage

# Reading

1. https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html
2. https://maven.apache.org/guides/getting-started/index.html#What_is_Maven

# Exercise

1. Question
    1. How is your project being built invoking just by running `./mvnw`
        1. Hint:
2. Successfully build the project;
    1. Solve following problems one by one in order; without changing Java Code unless specified
       explicitly;
        1. ```shell
           [WARNING] Using platform encoding (UTF-8 actually) to copy filtered resources, i.e. build is platform dependent!
           ```
        2. ```shell
           [ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.1:testCompile (default-testCompile) on project katas: Compilation failure
            ```
            1. **Hint:** Java Version
        3. ```shell
           [ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.1:testCompile (default-testCompile) on project katas: Compilation failure: Compilation failure:
           [ERROR] <YOUR_REPO_PATH>/katas/src/test/java/pro/anuj/onboarding/kata/maven/GreeterTest.java:[3,36] package org.junit.jupiter.api does not exist
           [ERROR] <YOUR_REPO_PATH>/katas/src/test/java/pro/anuj/onboarding/kata/maven/GreeterTest.java:[5,29] package org.junit.jupiter.api does not exist
           [ERROR] <YOUR_REPO_PATH>/katas/src/test/java/pro/anuj/onboarding/kata/maven/GreeterTest.java:[11,4] cannot find symbol
           [ERROR]   symbol:   class Test
           [ERROR]   location: class GreeterTest
           [ERROR] <YOUR_REPO_PATH>/katas/src/test/java/pro/anuj/onboarding/kata/maven/GreeterTest.java:[13,5] cannot find symbol
           [ERROR]   symbol:   method assertEquals(java.lang.String,java.lang.String)
           [ERROR]   location: class GreeterTest
           [ERROR] -> [Help 1]
           ```
            1. **Hint:** JUnit5
            2. **Hint:** Maven dependency
               management (https://maven.apache.org/guides/introduction/introduction-to-dependency-mechanism.html#dependency-management)
        4. ```shell
           [ERROR] Failed to execute goal com.coveo:fmt-maven-plugin:2.13:check (default) on project katas: Found 1 non-complying files, failing build -> [Help 1]
           ```
            1. **Hint:** Needs Java code change
            2. **Hint:** Maven Plugins
            3. **Hint:** https://google.github.io/styleguide/javaguide.html
        5. ```shell
            [ERROR] Failed to execute goal org.apache.maven.plugins:maven-deploy-plugin:2.7:deploy (default-deploy) on project katas: Deployment failed: repository element was not specified in the POM inside distributionManagement element or in -DaltDeploymentRepository=id::layout::url parameter -> [Help 1]
           ```
            1. **Hint:** : [Maven build lifecycle](https://maven.apache.org/guides/introduction/introduction-to-the-lifecycle.html#a-build-lifecycle-is-made-up-of-phases)
3. There is a main class called `Application` within the repository, run the main class using maven.
    1. Hint: https://www.mojohaus.org/exec-maven-plugin/#
4. **Bonus** Generate docker image and run `Application` class in a docker container.
5. **Bonus** Delete `.mvn/jvm.config` and explain what is going on.