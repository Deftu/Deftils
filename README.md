<div align="center">

# [`Deftils`]
Simple core JVM library.

</div>
    
## Latest release
1.2.0

## Why should I use it?

Deftils provides new collection types and utility classes. To put it in short, it's only for your own Quality of Life.

## How long until deprecated objects will be removed?

Once a class or method has been deprecated, a label will be added indicating when it was deprecated in the version timeline. The feature will most likely be removed within the next 3-5 updates.

## Adding Deftils to your project.
Deftils' group is `xyz.deftu.deftils`, it's artifact name is `Deftils` and the version can be found at the top of this document.

<details>
    <summary>Maven</summary>
    
```xml
<repositories>
    <repository>
        <id>maven-central-1</id>
        <name>MavenCentral</name>
        <url>https://s01.oss.sonatype.org/repositories/releases/</url>
    </repository>
</repositories>

<dependency>
    <groupId>xyz.deftu.deftils</groupId>
    <artifactId>Deftils</artifactId>
    <version>VERSION</version>
</dependency>
```
</details>

<details>
    <summary>Gradle</summary>
    
```gradle
repositories {
    mavenCentral()
    maven {
        url = "https://s01.oss.sonatype.org/repositories/releases/"
    }
}

dependencies {
    api('xyz.deftu.deftils:Deftils:VERSION')
}
```
</details>
