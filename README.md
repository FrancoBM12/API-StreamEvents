# API-StreamEvents
this repository only contains api methods, it is not the plugin code, so you will need to buy the [plugin](https://builtbybit.com/resources/streamevents-tiktok-more.32039/) to use it!

How to include the API with Maven:

```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
<dependencies>
    <dependency>
        <groupId>com.github.FrancoBM12</groupId>
        <artifactId>API-StreamEvents</artifactId>
        <version>LAST-VERSION</version>
        <scope>provided</scope>
    </dependency>
</dependencies>
```

How to include the API with Gradle:

```kotlin
repositories {
    maven { url 'https://jitpack.io' }
}
dependencies {
    compileOnly "com.github.FrancoBM12:API-StreamEvents:LAST-VERSION"
}
```
You can see the latest version [here](https://github.com/FrancoBM12/API-StreamEvents/releases/latest).
