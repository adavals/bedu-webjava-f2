# POSTWORK 1
## Construcción de proyectos con Gradle
### Objetivo
Compilar un archivo en lenguaje Markdown a HTML
### Instrucciones
Transforma [este ejemplo](http://www.unexpected-vortices.com/sw/rippledoc/quick-markdown-example.html) de Markdown en HTML a través de Gradle usando [Gradle Markdown Plugin](https://github.com/kordamp/markdown-gradle-plugin).
### Desarrollo
#### 1. Creación de carpetas de acuerdo a la documentación:
```
src/markdown
```
#### 2. Creación del archivo [quickMarkdownExample.md](https://github.com/adavals/bedu-webjava-f2/blob/master/postwork1/src/markdown/quickMarkdownExample.md) dentro de la carpeta anterior con el contenido del enlace en las instrucciones
```
An h1 header
============

Paragraphs are separated by a blank line.

2nd paragraph. *Italic*, **bold**, and `monospace`. Itemized lists
look like:

  * this one
  * that one
  * the other one

Note that --- not considering the asterisk --- the actual text
content starts at 4-columns in.
.
.
.
```
#### 3. Creación del archivo [build.gradle](https://github.com/adavals/bedu-webjava-f2/blob/master/postwork1/build.gradle)
```
buildscript {
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
    dependencies {
        classpath 'org.kordamp.gradle:markdown-gradle-plugin:2.2.0'
    }
}
apply plugin: 'org.kordamp.gradle.markdown'
```
#### 4. Ejecución del comando para que el plugin genere el archivo HTML a partir del archivo Markdown
```
gradle markdownToHtml
```
#### 5. Resultado
Archivo html generado: [quickMarkdownExample.html](https://github.com/adavals/bedu-webjava-f2/blob/master/postwork1/build/gen-html/quickMarkdownExample.html) en la carpeta build/gen-html
```
<h1>An h1 header</h1>
<p>Paragraphs are separated by a blank line.</p>
<p>2nd paragraph. <em>Italic</em>, <strong>bold</strong>, and <code>monospace</code>. Itemized lists look like:</p>
<ul>
  <li>this one</li>
  <li>that one</li>
  <li>the other one</li>
</ul>
<p>Note that --- not considering the asterisk --- the actual text content starts at 4-columns in.</p>
.
.
.
```
