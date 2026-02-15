param(
    [string]$FilePath,
    [string]$WorkspaceRoot
)

# Remove extra quotes if present
$FilePath = $FilePath.Trim('"')
$WorkspaceRoot = $WorkspaceRoot.Trim('"')

# Compile the Java file
$binPath = Join-Path $WorkspaceRoot "bin"
javac -d $binPath $FilePath

if ($LASTEXITCODE -ne 0) {
    Write-Host "Compilation failed!" -ForegroundColor Red
    exit 1
}

# Extract package name from the file
$content = Get-Content -Raw $FilePath
$packageMatch = [regex]::Match($content, '^\s*package\s+([A-Za-z0-9_.]+)\s*;', [System.Text.RegularExpressions.RegexOptions]::Multiline)

# Get the class name (filename without extension)
$className = [System.IO.Path]::GetFileNameWithoutExtension($FilePath)

# Run the Java program
if ($packageMatch.Success) {
    $packageName = $packageMatch.Groups[1].Value
    $fullClassName = "$packageName.$className"
    java -cp $binPath $fullClassName
} else {
    java -cp $binPath $className
}
