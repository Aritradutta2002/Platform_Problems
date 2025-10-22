#!/usr/bin/env pwsh
# Quick Start Script for Platform Problems

Write-Host "🚀 Platform Problems - Quick Start" -ForegroundColor Cyan
Write-Host "===================================" -ForegroundColor Cyan
Write-Host ""

# Check Java version
Write-Host "Checking Java installation..." -ForegroundColor Yellow
try {
    $javaVersion = java -version 2>&1 | Select-String "version" | ForEach-Object { $_ -replace '.*version "([^"]+)".*', '$1' }
    Write-Host "✅ Java version: $javaVersion" -ForegroundColor Green
} catch {
    Write-Host "❌ Java not found. Please install JDK 17 or higher." -ForegroundColor Red
    exit 1
}

# Check Maven installation
Write-Host "Checking Maven installation..." -ForegroundColor Yellow
try {
    $mavenVersion = mvn -v 2>&1 | Select-String "Apache Maven" | ForEach-Object { $_ -replace 'Apache Maven ([^ ]+).*', '$1' }
    Write-Host "✅ Maven version: $mavenVersion" -ForegroundColor Green
} catch {
    Write-Host "❌ Maven not found. Please install Apache Maven 3.6+." -ForegroundColor Red
    exit 1
}

Write-Host ""
Write-Host "Building project..." -ForegroundColor Yellow
mvn clean compile

if ($LASTEXITCODE -eq 0) {
    Write-Host "✅ Build successful!" -ForegroundColor Green
    Write-Host ""
    Write-Host "Running tests..." -ForegroundColor Yellow
    mvn test
    
    if ($LASTEXITCODE -eq 0) {
        Write-Host ""
        Write-Host "✅ All tests passed!" -ForegroundColor Green
        Write-Host ""
        Write-Host "🎉 Setup complete! You're ready to start coding!" -ForegroundColor Cyan
        Write-Host ""
        Write-Host "Next steps:" -ForegroundColor Yellow
        Write-Host "  • Add your solutions to the appropriate platform folder" -ForegroundColor White
        Write-Host "  • Write unit tests for your solutions" -ForegroundColor White
        Write-Host "  • Run 'mvn test' to verify your solutions" -ForegroundColor White
        Write-Host "  • Check README.md for more information" -ForegroundColor White
    } else {
        Write-Host "❌ Some tests failed. Please check the output above." -ForegroundColor Red
    }
} else {
    Write-Host "❌ Build failed. Please check the output above." -ForegroundColor Red
}
