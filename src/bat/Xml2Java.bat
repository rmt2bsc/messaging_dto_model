rem echo off
rem
rem In order to execute this file either include in OS Path or navigate to the directory 
rem where it resides and type at the command line prompt, xml_bind <return key>.
rem 

del /Q ..\java\main\org\rmt2\jaxb\*.*
xjc -extension -d ..\java\main -p org.rmt2.jaxb -b ..\..\resources\xml\schemas\bindings.xml ..\..\resources\xml\schemas\
rem copy C:\ProjectServer\RMT2WebServiceMessages\gen\com\bindings\xml\jaxb\*.* C:\ProjectServer\RMT2WebServiceMessages\resources\xml\schemas\bindings