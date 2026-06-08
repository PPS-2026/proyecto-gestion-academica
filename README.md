# Proyecto de Gestión Académica - PPS 2026

Este repositorio contiene el código base del sistema de gestión académica desarrollado durante la capacitación para las **PPS 2026**. El proyecto está estructurado como una aplicación **Full Stack** utilizando **Angular** (Frontend) y **Spring Boot** (Backend), con una BD de MySQL.

## Cómo utilizar este repositorio

Para facilitar el seguimiento de las guías de clase, este repositorio utiliza **Tags** (etiquetas) que marcan el estado final de cada guía. Podés acceder al código de cualquier etapa del curso siguiendo estos pasos:

### 1. Consultar las versiones disponibles
Para ver qué guías hay disponibles, entrá a la página del repositorio (https://github.com/PPS-2026/proyecto-gestion-academica) y clickeá donde dice "Tags".
Verás una lista de etiquetas como v1, v2, etc. Hay que apretar en los tres puntos que permiten ver el mensaje de commit, donde se indica a qué guía pertenece la versión.

Por ejemplo: v1 tiene el mensaje "Finalización Guía 1" asociado.

### 2. Clonar una guía específica
Dependiendo de la guía que necesites (ejemplo: v1, v2, v3), utilizá el siguiente comando cambiando la etiqueta correspondiente:

```bash
git clone --branch v1 https://github.com/PPS-2026/proyecto-gestion-academica.git
```

### 3. Entendiendo el estado "Detached HEAD"
Al clonar una versión específica (tag), Git te informará que estás en un estado llamado "detached HEAD".

Esto significa que estás en un punto fijo del historial (una foto del código en ese momento). Es un estado de solo lectura o exploración: podés compilar, ejecutar y estudiar el código sin miedo a romper nada.

Si hacés cambios aquí, no se guardarán en ninguna rama. Si necesitás trabajar sobre este código, simplemente creá una rama nueva con:

```bash
git switch -c mi-rama-de-trabajo
```

### 4. Moverse entre versiones

Si estás en una versión (ej.: v1) y querés moverte a otra, podés simplemente ejecutar el siguiente comando:

```bash
git checkout v2
```

### Estructura del proyecto
/backend: Proyecto Java con Spring Boot y Maven.
/frontend: Aplicación Angular.

### ¿Dudas?
Si necesitás volver a la versión más reciente del desarrollo (la rama principal), ejecutá:
```bash
git checkout main
```
