object Dependencies {
  val apacheCommonsLang3 = "org.apache.commons:commons-lang3:3.11"
  val assertj = "org.assertj:assertj-core:3.20.2"
  val awsDynamodb = "com.amazonaws:aws-java-sdk-dynamodb:1.11.774"
  val aws2Dynamodb = "software.amazon.awssdk:dynamodb:2.16.99"
  val aws2DynamodbEnhanced = "software.amazon.awssdk:dynamodb-enhanced:2.16.99"
  val dokkaGradlePlugin = "org.jetbrains.dokka:dokka-gradle-plugin:1.5.0"
  val flywayGradleBuildscriptDep = "gradle.plugin.com.boxfuse.client:flyway-release:5.0.2"
  val guava = "com.google.guava:guava:31.0.1-jre"
  val guice = "com.google.inject:guice:5.1.0"
  val jCommander = "com.beust:jcommander:1.72"
  val jacksonDatabind = "com.fasterxml.jackson.core:jackson-databind:2.10.3"
  val jacksonDataformatYaml = "com.fasterxml.jackson.dataformat:jackson-dataformat-yaml:2.10.3"
  val jacksonJsr310 = "com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.10.3"
  val jacksonKotlin = "com.fasterxml.jackson.module:jackson-module-kotlin:2.10.3"
  val jettyServer = "org.eclipse.jetty:jetty-server:9.4.31.v20200723"
  val jettyServlet = "org.eclipse.jetty:jetty-servlet:9.4.31.v20200723"
  val jettyWebsocketServer = "org.eclipse.jetty.websocket:websocket-server:9.4.31.v20200723"
  val jettyWebsocketServlet = "org.eclipse.jetty.websocket:websocket-servlet:9.4.31.v20200723"
  val jooq = "org.jooq:jooq:${Versions.jooq}"
  val junitApi = "org.junit.jupiter:junit-jupiter-api:5.7.0"
  val junitEngine = "org.junit.jupiter:junit-jupiter-engine:5.7.0"
  val junitParams = "org.junit.jupiter:junit-jupiter-params:5.7.0"
  val kotlinAllOpenPlugin = "org.jetbrains.kotlin:kotlin-allopen:${Versions.kotlin}"
  val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
  val kotlinReflection = "org.jetbrains.kotlin:kotlin-reflect:${Versions.kotlin}"
  val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin}"
  val kotlinTest = "org.jetbrains.kotlin:kotlin-test:${Versions.kotlin}"
  val kotlinxCoroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.kotlinCoroutines}"
  val kotlinxCoroutinesLogging = "org.jetbrains.kotlinx:kotlinx-coroutines-slf4j:${Versions.kotlinCoroutines}"
  val kotlinxCoroutinesTest = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.kotlinCoroutines}"
  val loggingApi = "io.github.microutils:kotlin-logging:1.7.9"
  val mavenPublishGradlePlugin = "com.vanniktech:gradle-maven-publish-plugin:0.19.0"
  val metricsCore = "io.dropwizard.metrics:metrics-core:4.0.2"
  val metricsParent = "io.dropwizard.metrics:metrics-parent:4.0.2"
  val misk = "com.squareup.misk:misk:${Versions.misk}"
  val miskActions = "com.squareup.misk:misk-actions:${Versions.misk}"
  val miskAdmin = "com.squareup.misk:misk-admin:${Versions.misk}"
  val miskAwsDynamodb = "com.squareup.misk:misk-aws-dynamodb:${Versions.misk}"
  val miskAwsDynamodbTesting = "com.squareup.misk:misk-aws-dynamodb-testing:${Versions.misk}"
  val miskAws2Dynamodb = "com.squareup.misk:misk-aws2-dynamodb:${Versions.misk}"
  val miskAws2DynamodbTesting = "com.squareup.misk:misk-aws2-dynamodb-testing:${Versions.misk}"
  val miskCore = "com.squareup.misk:misk-core:${Versions.misk}"
  val miskHibernate = "com.squareup.misk:misk-hibernate:${Versions.misk}"
  val miskHibernateTesting = "com.squareup.misk:misk-hibernate-testing:${Versions.misk}"
  val miskJdbc = "com.squareup.misk:misk-jdbc:${Versions.misk}"
  val miskJdbcTesting = "com.squareup.misk:misk-jdbc-testing:${Versions.misk}"
  val miskInject = "com.squareup.misk:misk-inject:${Versions.misk}"
  val miskMetrics = "com.squareup.misk:misk-metrics:${Versions.misk}"
  val miskService = "com.squareup.misk:misk-service:${Versions.misk}"
  val miskSlack = "com.squareup.misk:misk-slack:${Versions.misk}"
  val miskTesting = "com.squareup.misk:misk-testing:${Versions.misk}"
  val moshiCore = "com.squareup.moshi:moshi:1.11.0"
  val moshiKotlin = "com.squareup.moshi:moshi-kotlin:1.11.0"
  val mysql = "mysql:mysql-connector-java:8.0.22"
  val okHttp = "com.squareup.okhttp3:okhttp:4.10.0-RC1"
  val okio = "com.squareup.okio:okio:2.9.0"
  val openTracing = "io.opentracing:opentracing-api:0.33.0"
  val openTracingMock = "io.opentracing:opentracing-mock:0.33.0"
  val openTracingOkHttp = "io.opentracing.contrib:opentracing-okhttp3:3.0.0"
  val retrofit = "com.squareup.retrofit2:retrofit:2.9.0"
  val retrofitGuavaAdapter = "com.squareup.retrofit2:adapter-guava:2.9.0"
  val retrofitMock = "com.squareup.retrofit2:retrofit-mock:2.9.0"
  val retrofitMoshi = "com.squareup.retrofit2:converter-moshi:2.9.0"
  val retrofitWire = "com.squareup.retrofit2:converter-wire:2.9.0"
  val shadowJarPlugin = "gradle.plugin.com.github.johnrengelman:shadow:7.1.2"
  val slf4jApi = "org.slf4j:slf4j-api:1.7.28"
  val spotlessPlugin = "com.diffplug.spotless:spotless-plugin-gradle:5.9.0"
  val tracingJaeger = "io.jaegertracing:jaeger-core:1.1.0"
  val wireCompiler = "com.squareup.wire:wire-compiler:${Versions.wire}"
  val wireGradlePlugin = "com.squareup.wire:wire-gradle-plugin:${Versions.wire}"
  val wireMoshiAdapter = "com.squareup.wire:wire-moshi-adapter:${Versions.wire}"
  val wireRuntime = "com.squareup.wire:wire-runtime:${Versions.wire}"
  val wireSchema = "com.squareup.wire:wire-schema:${Versions.wire}"
  val wispClient = "com.squareup.misk:wisp-client:${Versions.misk}"
  val wispConfig = "com.squareup.misk:wisp-config:${Versions.misk}"
  val wispDeployment = "com.squareup.misk:wisp-deployment:${Versions.misk}"
  val wispLogging = "com.squareup.misk:wisp-logging:${Versions.misk}"
}

object Versions {
  val flywayDBPlugin = "5.2.4"
  val jooqGenPlugin = "5.2"
  val jooq = "3.14.8"
  val kotlin = "1.5.31"
  val kotlinCoroutines = "1.5.2"
  val ktlint = "0.40.0"
  val misk = "0.24.0"
  val wire = "3.6.0"
}
