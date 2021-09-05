<div align="center">

# Mango - Simple core JVM library.

</div>

## Why should I use it?

Mango provides new collection types and utility classes. To put it in short, it's only for your own Quality of Life.

## Deprecated features, how long until they're removed?!

Once a class or method has been deprecated, a label will be added indicating when it was deprecated in the version timeline. The feature will most likely be removed within the next 3-5 updates.

## Adding Mango to your project.
Mango's group is `xyz.deftu`, it's artifact name is `Mango` and the version is dependant on the latest release's tag.

### Maven:
```xml
<dependency>
    <groupId>xyz.deftu</groupId>
    <artifactId>Mango</artifactId>
    <version>VERSION</version>
</dependency>
```

### Gradle:
```gradle
repositories {
    maven {
        name = "JitPack"
        url = "https://jitpack.io/"
    }
}

dependencies {
    api('xyz.deftu:Mango:VERSION')
}
```