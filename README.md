# UML-Editor - The UML/INTERLIS Editor

## License
The UML-Editor is licensed under the LGPL (Lesser GNU Public License).

##Status
umleditor branch master is in stable state.

## System Requirements
For the current version of UML editor, you will need a JAVA software development kit (JDK) version 1.6 or a more recent version must be installed on your system.
A free version of the JAVA software development kit (JDK) is available 
[here](http://www.oracle.com/technetwork/java/javase/downloads/index.html "Download Java Development Kit") .
Also required is the build tool ant. [Download](http://ant.apache.org "Download Apache Ant") and install it as documented there.

## Installation
In order to install the UML Editor, [Download](https://github.com/AgenciaImplementacion/umleditor/releases/download/v3.6.3/umleditor-3.6.3.zip "Download UML/Editor") choose a directory and extract the ZIP file.

## Development
Configure the IDE with UTF-8 as character encoding format to resolve possible errors when the project is opened

## How to compile it?
To compile the UML Editor, change to the newly created directory and enter the following command at the commandline prompt:

~~~
ant clean compile jar run
~~~

To build a binary distribution, use:
~~~
ant bindist
~~~





