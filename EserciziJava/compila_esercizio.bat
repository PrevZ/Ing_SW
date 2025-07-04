@echo off
if "%1"=="" (
    echo Utilizzo: compila_esercizio.bat EsXX
    echo Esempio: compila_esercizio.bat Es01
    exit /b 1
)

echo Compilando ed eseguendo %1...
cd app\src\main\java\%1

if not exist "*.java" (
    echo Errore: Nessun file Java trovato in %1
    cd ..\..\..\..
    exit /b 1
)

echo Compilando i file Java...
javac *.java

if %errorlevel% equ 0 (
    echo Compilazione completata con successo!
    echo Eseguendo il programma...
    echo ==================================================
    java Main
    echo ==================================================
    echo Esecuzione completata!
) else (
    echo Errore durante la compilazione!
)

cd ..\..\..\..
