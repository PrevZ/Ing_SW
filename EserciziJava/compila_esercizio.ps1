param(
    [Parameter(Mandatory=$true)]
    [string]$Esercizio
)

Write-Host "Compilando ed eseguendo $Esercizio..." -ForegroundColor Green

$esercizioPath = "app\src\main\java\$Esercizio"

if (!(Test-Path $esercizioPath)) {
    Write-Host "Errore: La directory $esercizioPath non esiste!" -ForegroundColor Red
    exit 1
}

# Vai alla directory dell'esercizio
Push-Location $esercizioPath

try {
    # Compila tutti i file Java
    Write-Host "Compilando i file Java..." -ForegroundColor Yellow
    javac *.java
    
    if ($LASTEXITCODE -eq 0) {
        Write-Host "Compilazione completata con successo!" -ForegroundColor Green
        Write-Host "Eseguendo il programma..." -ForegroundColor Yellow
        Write-Host "=" * 50 -ForegroundColor Cyan
        
        # Esegui la classe Main
        java Main
        
        Write-Host "=" * 50 -ForegroundColor Cyan
        Write-Host "Esecuzione completata!" -ForegroundColor Green
    } else {
        Write-Host "Errore durante la compilazione!" -ForegroundColor Red
    }
} finally {
    # Torna alla directory originale
    Pop-Location
}
