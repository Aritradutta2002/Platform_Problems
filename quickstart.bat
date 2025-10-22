@echo off
echo ========================================
echo   Platform Problems - Quick Start
echo ========================================
echo.

echo Checking Java installation...
java -version >nul 2>&1
if errorlevel 1 (
    echo [ERROR] Java not found. Please install JDK 17 or higher.
    pause
    exit /b 1
)
echo [OK] Java is installed
echo.

echo Checking Maven installation...
mvn -v >nul 2>&1
if errorlevel 1 (
    echo [ERROR] Maven not found. Please install Apache Maven 3.6+.
    pause
    exit /b 1
)
echo [OK] Maven is installed
echo.

echo Building project...
call mvn clean compile
if errorlevel 1 (
    echo [ERROR] Build failed. Please check the output above.
    pause
    exit /b 1
)
echo [OK] Build successful!
echo.

echo Running tests...
call mvn test
if errorlevel 1 (
    echo [ERROR] Some tests failed. Please check the output above.
    pause
    exit /b 1
)
echo [OK] All tests passed!
echo.

echo ========================================
echo   Setup Complete! Ready to code!
echo ========================================
echo.
echo Next steps:
echo   - Add your solutions to platform folders
echo   - Write unit tests for your solutions
echo   - Run 'mvn test' to verify solutions
echo   - Check README.md for more info
echo.
pause
