# Insomnia - Disable beds

Insomnia is a CB1060 server plugin that disables beds.

## Installation

Download the [latest release Insomnia.jar](https://github.com/obsidianlad/Insomnia/releases/latest) and put it in the `plugins/` folder of your CB1060 server.

## Permissions

Insomnia comes with a single permission, which is true by default:

```yml
permissions:
  insomnia.on:
    default: true
    description: Permission to never sleep.
```

## Building

To build from source you will need a CB1060 jar and Java 8.

Then, simply

```bash
$ javac -cp path/to/cb1060.jar:. Insomnia.java
```

This will give you a compiled Insomnia.class.

Lastly, pack your own Insomnia.jar with the following folder structure:

```
Insomnia.jar
├── lad/
│     └── obsidian/
│           └── insomnia/
│                 └── Insomnia.class
└── plugin.yml
```
